package com.sampleExProject.DomainCustomerData;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "customer")
@XmlRootElement // kayıtların xml dönüşmesi icin justb anotasyonu
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customerSeq")
	@SequenceGenerator(name = "customerSeq", sequenceName ="customer_seq")
	private int customerID;
	private String firstName;
	private String lastName;
	private String email;
	private boolean active;
	private Date dateTime;
	private Timestamp lastUpdate;
	
	@OneToOne
	private int addressId;
	@OneToOne
	private int storeId;

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", active=" + active + ", dateTime=" + dateTime + ", lastUpdate=" + lastUpdate
				+ ", addressId=" + addressId + ", storeId=" + storeId + "]";
	}

}
