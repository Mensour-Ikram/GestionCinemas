package org.sid.springmvc.dao;
import org.sid.springmvc.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface CinemaRepository extends
JpaRepository<Cinema,Long> {
}