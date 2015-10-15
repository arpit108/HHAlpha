package com.happyhour.model;

/**
 * @author arpit.bhargava
 *
 */
public class OrderTable {

	private long id;
	private long orderId;
	private long restId;
	private long custId;
	private long offerId;
	private String location;
	private Double discountTaken;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getRestId() {
		return restId;
	}
	public void setRestId(long restId) {
		this.restId = restId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getDiscountTaken() {
		return discountTaken;
	}
	public void setDiscountTaken(Double discountTaken) {
		this.discountTaken = discountTaken;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (custId ^ (custId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (offerId ^ (offerId >>> 32));
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		result = prime * result + (int) (restId ^ (restId >>> 32));
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
		OrderTable other = (OrderTable) obj;
		if (custId != other.custId)
			return false;
		if (id != other.id)
			return false;
		if (offerId != other.offerId)
			return false;
		if (orderId != other.orderId)
			return false;
		if (restId != other.restId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderTable [id=" + id + ", orderId=" + orderId + ", restId="
				+ restId + ", custId=" + custId + ", offerId=" + offerId
				+ ", location=" + location + ", discountTaken=" + discountTaken
				+ "]";
	}
	
	
	
	
}
