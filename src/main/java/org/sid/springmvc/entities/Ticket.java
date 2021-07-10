package org.sid.springmvc.entities;


import javax.persistence.*;

import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ticket {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nomClient;
private double prix;
@Column(unique=true,nullable=true)
private Integer codePayement;
private boolean reserve;
@ManyToOne
private Place place;
@ManyToOne
private Projection projection;
}
