package com.sampleExProject.DomainInventoryData;

import java.sql.Timestamp;

public class FilmCategory {

	private int filmCategoryId;
	private int filmId;
	private Timestamp lastUpdate;

	public int getFilmCategoryId() {
		return filmCategoryId;
	}

	public void setFilmCategoryId(int filmCategoryId) {
		this.filmCategoryId = filmCategoryId;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "FilmCategory [filmCategoryId=" + filmCategoryId + ", filmId=" + filmId + ", lastUpdate=" + lastUpdate
				+ "]";
	}

}
