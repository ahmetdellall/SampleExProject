package com.sampleExProject.InventoryJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sampleExProject.DAOInventory.FilmRepository;
import com.sampleExProject.DomainInventoryData.Film;

public class FilmJdbcImpl implements FilmRepository{

	@Autowired
	JdbcTemplate jdbTemplate;
	
	RowMapper<Film> rowMapper = new RowMapper<Film>() {

		@Override
		public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
			Film film = new Film();
			film.setFilmId(rs.getInt("film_id"));
			film.setLanguageId(rs.getInt("language_id"));
			film.setLastUpdate(rs.getTimestamp("last_update"));
			film.setLength(rs.getInt("lenght"));
			film.setOriginalLanguageId(rs.getInt("original_language_id"));
			film.setRating(rs.getString("rating"));
			film.setRentalDuration(rs.getInt("rental_duration"));
			film.setRentaRate(rs.getDouble("rental_rate"));
			film.setReplacementCost(rs.getDouble("replacement_cost"));
			film.setSpecialFeatures(rs.getString("special_features"));
			film.setTitle(rs.getString("title"));
			
			return film;
		}
	};

	@Override
	public List<Film> findAllByFilms() {
		String sql ="selecet * from film";
		return jdbTemplate.query(sql, rowMapper);
	}

	@Override
	public Film findByIdFilm(int id) {
		String sql ="selecet * from film where film_id = ?";
		return DataAccessUtils.singleResult(jdbTemplate.query(sql, rowMapper,id));
	}

	@Override
	public void createFilm(Film film) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletefilmById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Film> findRequestLanguageById(int id) {
		String sql ="select * from film where language_id =?";
		return jdbTemplate.query(sql, rowMapper,id);
	}

	@Override
	public List<Film> requestLenghtAndLanguageGetFilm(int lenght, int id) {
		String sql  ="selecet * from film where lenght =? and id =?";
		return jdbTemplate.query(sql, rowMapper,lenght,id);
	}
	
	
}
