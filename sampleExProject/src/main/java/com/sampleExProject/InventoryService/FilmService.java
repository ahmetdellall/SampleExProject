package com.sampleExProject.InventoryService;

import java.util.List;

import com.sampleExProject.DomainInventoryData.Film;

public interface FilmService {

	List<Film> findAllByFilms();

	Film findByIdFilm(int id);

	void createFilm(Film film);

	void deletefilmById(int id);

	List<Film> findRequestLanguageById(int id);

	List<Film> requestLenghtAndLanguageGetFilm(int lenght, int id);
}
