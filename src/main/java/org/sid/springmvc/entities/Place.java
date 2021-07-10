package org.sid.springmvc.entities;

import java.util.Collection;

import javax.persistence.*;


import lombok.*;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Place {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private int numero;
private double longitude,latidude,altitude;
@ManyToOne
private Salle salle;
@OneToMany(mappedBy="place")
private Collection<Ticket> tickets;
}