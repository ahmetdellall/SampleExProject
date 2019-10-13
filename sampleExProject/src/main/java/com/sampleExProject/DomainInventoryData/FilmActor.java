package com.sampleExProject.DomainInventoryData;

import java.sql.Timestamp;

public class FilmActor {

	private int actorId;
	private int filmId;
	private Timestamp lastUpdate;

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
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
		return "FilmActor [actorId=" + actorId + ", filmId=" + filmId + ", lastUpdate=" + lastUpdate + "]";
	}

}
