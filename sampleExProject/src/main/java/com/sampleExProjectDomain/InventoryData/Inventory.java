package com.sampleExProjectDomain.InventoryData;

import java.sql.Timestamp;

public class Inventory {

	private int inventoryId;
	private int filmId;
	private int storeId;
	private Timestamp lastUpdate;

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", filmId=" + filmId + ", storeId=" + storeId + ", lastUpdate="
				+ lastUpdate + "]";
	}

}
