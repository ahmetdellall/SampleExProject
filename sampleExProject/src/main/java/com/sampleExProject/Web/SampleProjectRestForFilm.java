package com.sampleExProject.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(method = RequestMethod.GET,value = "/films/{id}")
	ResponseEntity<Film> getFilmById(@PathVariable("id")int id) {
		 return ResponseEntity.ok(filmService.findByIdFilm(id));
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/film/{id}")
	public ResponseEntity<List<Film>> getRequestLenghtAndLanguageGetFilm(@RequestParam("ln")int lenght,@PathVariable("id") int id){
		List<Film>films = filmService.requestLenghtAndLanguageGetFilm(lenght, id);
		
		return ResponseEntity.ok(films);
	}
	
}
