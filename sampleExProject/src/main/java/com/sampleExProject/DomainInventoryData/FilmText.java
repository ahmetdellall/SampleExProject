package com.sampleExProject.DomainInventoryData;

import java.sql.Timestamp;

public class FilmText {

	private int filmId;
	private int categoryId;
	private Timestamp lastUpdate;

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "FilmText [filmId=" + filmId + ", categoryId=" + categoryId + ", lastUpdate=" + lastUpdate + "]";
	}

}
