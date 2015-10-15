package com.happyhour.model;

import java.util.Date;

public class RestOffer {

	private long id;
	private long merchantId;
	private long restid;
	private Date creationDate;
	private Double startTime;
	private Double endTime;
	private Double discount;
	private long offerId;
	private long offerCount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}
	public long getRestid() {
		return restid;
	}
	public void setRestid(long restid) {
		this.restid = restid;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Double getStartTime() {
		return startTime;
	}
	public void setStartTime(Double startTime) {
		this.startTime = startTime;
	}
	public Double getEndTime() {
		return endTime;
	}
	public void setEndTime(Double endTime) {
		this.endTime = endTime;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public long getOfferId() {
		return offerId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (merchantId ^ (merchantId >>> 32));
		result = prime * result + (int) (offerId ^ (offerId >>> 32));
		result = prime * result + (int) (restid ^ (restid >>> 32));
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
		RestOffer other = (RestOffer) obj;
		if (id != other.id)
			return false;
		if (merchantId != other.merchantId)
			return false;
		if (offerId != other.offerId)
			return false;
		if (restid != other.restid)
			return false;
		return true;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public long getOfferCount() {
		return offerCount;
	}
	public void setOfferCount(long offerCount) {
		this.offerCount = offerCount;
	}
	@Override
	public String toString() {
		return "RestOffer [id=" + id + ", merchantId=" + merchantId
				+ ", restid=" + restid + ", creationDate=" + creationDate
				+ ", startTime=" + startTime + ", endTime=" + endTime
				+ ", discount=" + discount + ", offerId=" + offerId
				+ ", offerCount=" + offerCount + "]";
	}
	
	
	
}
