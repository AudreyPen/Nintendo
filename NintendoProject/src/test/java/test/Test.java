package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Hybride;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse ("1","rue de Paris","Paris");
		Boutique b1 = new Boutique("MaBoutique",a1);
		Console c1= new Hybride("Switch",250.99,LocalDate.parse("2016-10-12"));
		
		List<Jeu> listeAchats = new ArrayList();
		List<Jeu> listeAchats2 = new ArrayList();
		
		Jeu j1= new Jeu("Mario Kart",c1,b1);
		Jeu j2= new Jeu("Animal crossing",c1,b1);
		Jeu j3= new Jeu("Just dance",c1,b1);
		Jeu j4= new Jeu("Splatoon",c1,b1);
		Jeu j5 = new Jeu("Pikmin",c1,b1);

		Collections.addAll(listeAchats, j1,j2,j3);
		Collections.addAll(listeAchats2, j4,j5);
		
		Client client1 = new Client("Abid","Jordan",listeAchats);
		Client client2 = new Client("Doe","John",listeAchats2);

	}

}
