package org.sid.springmvc;

import org.sid.springmvc.entities.Film;
import org.sid.springmvc.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {
	@Autowired private ICinemaInitService cinemaInitService;
	@Autowired private RepositoryRestConfiguration restConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	restConfiguration.exposeIdsFor(Film.class);
	cinemaInitService.initVilles(); cinemaInitService.initCinemas();
	cinemaInitService.initSalles(); cinemaInitService.initPalces();
	cinemaInitService.initSeances(); cinemaInitService.initCategories();
	cinemaInitService.initFilms();cinemaInitService.initProjections();
	cinemaInitService.initTickets();
	}


}
