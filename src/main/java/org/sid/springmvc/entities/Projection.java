package org.sid.springmvc.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Projection {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private Date dateProjection;
private double prix;
@ManyToOne
private Salle salle;
@ManyToOne
private Film film;
@OneToMany(mappedBy="projection")
private Collection<Ticket> tickets;
@ManyToOne
private Seance seance;
}