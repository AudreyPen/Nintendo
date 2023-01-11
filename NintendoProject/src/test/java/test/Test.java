package test;

import model.Adresse;
import model.Boutique;

import model.Client;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse ("1","rue de Paris","Paris");
		Boutique b1 = new Boutique("MaBoutique",a1);

		Client client1 = new Client("Abid","Jordan");
		Client client2 = new Client("Doe","John");

	}

}
