package com.sampleExProject.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampleExProject.DomainInventoryData.Film;
import com.sampleExProject.InventoryService.FilmService;

@RestController
@RequestMapping("/rest")
public class SampleProjectRestForFilm {

	@Autowired
	private FilmService filmService;

	@RequestMapping(method = RequestMethod.GET, value = "/films")
	ResponseEntity<List<Film>> getFilms() {
		List<Film> films = filmService.findAllByFilms();
		return ResponseEntity.ok(films);
	}
}
