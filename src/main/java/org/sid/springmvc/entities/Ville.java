package org.sid.springmvc.entities;

import java.util.Collection;

import javax.persistence.*;


import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ville {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private double longitude,latidude,altitude;
@OneToMany(mappedBy="ville")
private Collection<Cinema> cinemas;
}
