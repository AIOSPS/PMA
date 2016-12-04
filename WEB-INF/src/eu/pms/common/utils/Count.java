package eu.pms.common.utils;

/**
 * This class can be used as a Value Object for
 * sending the count of any entity.
*/

public class Count implements java.io.Serializable {
	/**
	* Stores the count
	*/

	private long count;

	public Count() {

	}

	public Count(Integer count) {
		this.count = count;
	}

	public Count(long count) {
		this.count = count;
	}

	/**
	 * Gets the count value
	 * @return The count
	*/

	public long getCount() {
		return this.count;
	}

	/**
	 * Sets the count value
	 * @param count The new Count value
	*/

	public void setCount(long count) {
		this.count = count;
	}
}
