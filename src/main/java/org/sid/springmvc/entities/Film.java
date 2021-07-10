package org.sid.springmvc.entities;

import java.util.Collection;
import java.util.Date;


import javax.persistence.*;


import lombok.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Film {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String titre;
private String decription;
private String realisateur;
private Date dateSortie;
private double duree;
private String photo;
@OneToMany(mappedBy="film")
private Collection<Projection> projections;
@ManyToOne
private Categorie categorie;
}