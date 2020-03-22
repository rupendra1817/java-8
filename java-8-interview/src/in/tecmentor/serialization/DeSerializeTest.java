package in.tecmentor.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeTest {

	public static void main(String[] args) {
		try {
			// Create an object
			FileInputStream fin = new FileInputStream("customer.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			Customer customer = (Customer) in.readObject();
			// Close the stream
			in.close();
			System.out.println(customer);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
