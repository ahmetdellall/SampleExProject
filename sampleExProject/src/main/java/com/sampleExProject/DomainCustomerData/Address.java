package com.sampleExProject.DomainCustomerData;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "table")
@XmlRootElement
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customerSeq")
	@SequenceGenerator(name = "customerSeq", sequenceName ="customer_seq")
	private int addressId;
	private String address;
	private String addressTwo;
	private String distcrit;
	private int cityId;
	private String postalCode;
	private String phone;
	private Timestamp lastUpdate;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getDistcrit() {
		return distcrit;
	}

	public void setDistcrit(String distcrit) {
		this.distcrit = distcrit;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", addressTwo=" + addressTwo + ", distcrit="
				+ distcrit + ", cityId=" + cityId + ", postalCode=" + postalCode + ", phone=" + phone + ", lastUpdate="
				+ lastUpdate + "]";
	}

}
