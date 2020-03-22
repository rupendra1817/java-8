package in.tecmentor.serialization;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private long customerId;
	private String name;

	public Customer(long customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[customerId=").append(customerId).append(", name=").append(name).append("]");
		return builder.toString();
	}
}
