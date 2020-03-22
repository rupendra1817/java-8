package in.tecmentor.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) {
		try {
			// Create an object
			Customer customer = new Customer(101L, "Rahul sharma");
			FileOutputStream fout = new FileOutputStream("customer.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(customer);
			out.flush();
			// Close the stream
			out.close();
			System.out.println("Successfully serialized.");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
