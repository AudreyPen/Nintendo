package test;

import java.time.LocalDate;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse ("1","rue de Paris","Paris");
		Boutique b1 = new Boutique("MaBoutique",a1);
		Console c1= new Console("Switch",250.99,LocalDate.parse("2016-10-12"));
		
		Jeu j1= new Jeu("Mario Kart",c1);
		Jeu j2= new Jeu("Animal crossing",c1);
		Jeu j3= new Jeu("Just dance",c1);
		Jeu j4= new Jeu("Splatoon",c1);
		Jeu j5 = new Jeu("Pikmin",c1);

		Client client1 = new Client("Abid","Jordan");
		Client client2 = new Client("Doe","John");

	}

}
