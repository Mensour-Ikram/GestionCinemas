package org.sid.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.sid.springmvc.entities.*;

@RepositoryRestResource
public interface FilmRepository extends
JpaRepository<Film,Long> {
}

