package com.happyhour.model;

/**
 * @author arpit.bhargava
 *
 */
public class MerchantResturant {

	private long merchantId;
	private long restId;
	public long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}
	public long getRestId() {
		return restId;
	}
	public void setRestId(long restId) {
		this.restId = restId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (merchantId ^ (merchantId >>> 32));
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
		MerchantResturant other = (MerchantResturant) obj;
		if (merchantId != other.merchantId)
			return false;
		if (restId != other.restId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MerchantResturant [merchantId=" + merchantId + ", restId="
				+ restId + "]";
	}
	
	
}
