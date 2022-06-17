package cocktail;

import java.util.Scanner;

public class Controller {
	// zone attributs
	public static String[] personnes = new String[6];
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choix;
		do {
			// je met des commentaires
			System.out.println("---------------------------");
			System.out.println("-------    COCKTAIL    ----");
			System.out.println("---------------------------");
			System.out.println("1 : ajouter une Personne");
			System.out.println("2 : enlever une Personne");
			System.out.println("3 : afficher");
			System.out.println("4 : quitter");
			System.out.println("---------------------------");
			System.out.println("Choix :");
			choix = sc.nextInt();
			switch (choix) {
			case 1:
				ajouter();
				break;
			case 2:
				enlever();
				break;
			case 3:
				afficher();
				break;
			}
		} while (choix != 4);
		System.out.println(" FIN !");
	}

	public static void ajouter() {
		sc.nextLine(); // bug du sc.nextLine() APRES sc.nexInt()
		System.out.println("Saisir nom :");
		String nom = sc.nextLine(); // lecture du nom
		// ajouter dans le tableau
		// parcourrir le tableau
		for (int i = 0; i < personnes.length; i++) {
			// si emplacement vide
			// if (personnes[i].equals("jean"))
			if (personnes[i] == null) {
				personnes[i] = nom; // je met la personne ds le tab
				break; // je sort de la bcl for
			}
		}

	}

	public static void enlever() {
		afficher();
		System.out.println("Enlever numero :");
		int i = sc.nextInt(); //lecture de l'indice
		personnes[i] =null; // je passe la valeur à null
	}

	public static void afficher() {
		System.out.println("\n########################");
		for (int i = 0; i < personnes.length; i++) {
			if (personnes[i] != null) {
				System.out.println("    "+i+" : "+personnes[i]);
			}
		}
		System.out.println("########################\n");
	}
}


