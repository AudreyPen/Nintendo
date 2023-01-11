package test;

import model.Adresse;
import model.Boutique;

import model.Client;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse ("1","rue de Paris","Paris");
		Boutique b1 = new Boutique("MaBoutique",a1);
		Console c1= New Console ("Switch");
		
		Jeu j1= New Jeu ("Mario Kart",c1);
		Jeu j2= New Jeu ("Animal crossing",c1);
		Jeu j3= New Jeu ("Just dance",c1);
		Jeu j4= New Jeu ("Splatoon",c1);
		Jeu j5 = New jeu ("Pikmin",c1);

		Client client1 = new Client("Abid","Jordan");
		Client client2 = new Client("Doe","John");

	}

}
