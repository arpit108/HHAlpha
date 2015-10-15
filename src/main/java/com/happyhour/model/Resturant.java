package com.happyhour.model;

import java.util.Date;

/**
 * For creating the Resturant
 * 
 * @author Mohit Bansal
 */
public class Resturant {

	private int id;
	private String restName;
	private String restAddress;
	private int restPincode;
	private int restPhoneNum;
	private String restEmail;
	private String restLoginId;
	private String restPassword;
	private int restTypeId;
	private Date createdDate;
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public String getRestAddress() {
		return restAddress;
	}

	public void setRestAddress(String restAddress) {
		this.restAddress = restAddress;
	}

	public int getRestPincode() {
		return restPincode;
	}

	public void setRestPincode(int restPincode) {
		this.restPincode = restPincode;
	}

	public int getRestPhoneNum() {
		return restPhoneNum;
	}

	public void setRestPhoneNum(int restPhoneNum) {
		this.restPhoneNum = restPhoneNum;
	}

	public String getRestEmail() {
		return restEmail;
	}

	public void setRestEmail(String restEmail) {
		this.restEmail = restEmail;
	}

	public String getRestLoginId() {
		return restLoginId;
	}

	public void setRestLoginId(String restLoginId) {
		this.restLoginId = restLoginId;
	}

	public String getRestPassword() {
		return restPassword;
	}

	public void setRestPassword(String restPassword) {
		this.restPassword = restPassword;
	}

	public int getRestTypeId() {
		return restTypeId;
	}

	public void setRestTypeId(int restTypeId) {
		this.restTypeId = restTypeId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((restLoginId == null) ? 0 : restLoginId.hashCode());
		result = prime * result + restPhoneNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resturant other = (Resturant) obj;
		if (id != other.id)
			return false;
		if (restLoginId == null) {
			if (other.restLoginId != null)
				return false;
		} else if (!restLoginId.equals(other.restLoginId))
			return false;
		if (restPhoneNum != other.restPhoneNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Resturant [id=" + id + ", restName=" + restName
				+ ", restAddress=" + restAddress + ", restPincode="
				+ restPincode + ", restPhoneNum=" + restPhoneNum
				+ ", restEmail=" + restEmail + ", restLoginId=" + restLoginId
				+ ", restPassword=" + restPassword + ", restTypeId="
				+ restTypeId + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
