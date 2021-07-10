package org.sid.springmvc.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


import lombok.*;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy="categorie")
	private Collection<Film> films;
	
}
