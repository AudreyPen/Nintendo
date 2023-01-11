package test;

import model.Adresse;
import model.Boutique;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse ("1","rue de Paris","Paris");
		Boutique b1 = new Boutique("MaBoutique",a1);

	}

}
