import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Carte c1 = new Carte(98765,"Aurelia","Ionescu Ion",2001, true);
		Carte c2 = new Carte(12435,"Geografie","Popescu Ioana",1970, true);
		Carte c3 = new Carte(43678,"Harry Potter","J.K. Rownling",1999, false);
		Carte c4 = new Carte(87123,"Matematica","Patrascu Andrei",2010, false);
		
		Cititor cit1 = new Cititor("Ionescu", "Andreea", 12, "01-08-2018");
		Cititor cit2 = new Cititor("Vasilescu", "Monica", 18, "01-08-2017");
		Cititor cit3 = new Cititor("Georgescu", "Ionela", 12, "01-10-2019");

	}

}
