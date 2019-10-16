package com.sampleExProject.InventoryService;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sampleExProject.DAOInventory.FilmRepository;
import com.sampleExProject.DomainInventoryData.Film;

@Service
@Transactional
public class FilmServiceInventory implements FilmService {


	private FilmRepository filmRepository;
	
	
	@Autowired
	public void setFilmRepository(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}
	
	
	@Override
	public List<Film> findAllByFilms() {
		
		return filmRepository.findAllByFilms();
	}

	

	@Override
	public void createFilm(Film film) {
			filmRepository.createFilm(film);
		
	}

	@Override
	public void deletefilmById(int id) {
		filmRepository.deletefilmById(id);
		
	}

	@Override
	public List<Film> findRequestLanguageById(int id) {
		
		return filmRepository.findRequestLanguageById(id);
	}

	@Override
	public List<Film> requestLenghtAndLanguageGetFilm(int lenght, int id) {
		
		return filmRepository.requestLenghtAndLanguageGetFilm(lenght, id);
	}


	@Override
	public Film findByIdFilm(int id) {
		return filmRepository.findByIdFilm(id);
	}

}
