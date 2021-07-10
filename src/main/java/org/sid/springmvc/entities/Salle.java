package org.sid.springmvc.entities;


import java.util.Collection;

import javax.persistence.*;


import lombok.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Salle {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private int nombrePlace;
@ManyToOne
private Cinema cinema;
@OneToMany(mappedBy="salle")
private Collection<Place> places;
@OneToMany(mappedBy="salle")
private Collection<Projection> projections;
}
