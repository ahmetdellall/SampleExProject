package com.sampleExProject.DAOInventory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sampleExProject.DomainInventoryData.Film;

public interface FilmRepository {

	List<Film> findAllByFilms();

	Film findByIdFilm(int id);

	void createFilm(Film film);

	void deletefilmById(int id);

	List<Film> findRequestLanguageById(int id);

	List<Film> requestLenghtAndLanguageGetFilm(int lenght, int id);

}
