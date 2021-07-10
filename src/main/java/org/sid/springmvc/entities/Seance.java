package org.sid.springmvc.entities;

import java.util.Date;

import javax.persistence.*;


import lombok.*;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Seance {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Temporal(TemporalType.TIMESTAMP)
private Date heureDebut;
}

