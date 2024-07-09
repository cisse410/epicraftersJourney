package ej;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String text = "Hello world";
		System.out.println(text);
		displayText();
		displayTextWithParam(text);
		int resultAddition = Main.addition(15, 15);
		System.out.println("Le resultat de l'addition est: "+ resultAddition);
		sayHello("Moustapha");
		Main.decompte(10);
		commenteMeteo("soleil");
		System.out.println(categorieFilm("Star Wars"));
		System.out.println(categorieFilm("Blanche neige"));
		System.out.println(categorieFilm("Indiana jones"));
		System.out.println(categorieFilm("La petite sirene"));
		System.out.println(categorieFilm("Star WarS"));
		System.out.println(categorieFilm("Star WarS"));
		boucleDoWhile();
		boucleForWithList();
		ExerciceBoucle();
		Exercice();
	}
	
	public static void displayText() {
		System.out.println("Une fonction en java a été exécutée");
	}
	
	public static void displayTextWithParam(String text) {
		System.out.println(text);
	}
	
	public static int addition(final int entier1, final int entier2) {
		return entier1 + entier2;
	}
	
	public static void decompte(final int valeur) {
		if (valeur >= 0) {
			System.out.println(valeur);
			decompte(valeur - 1);
		}
	}
	
	public static void sayHello(String name) {
		System.out.println("Bonjour " + name);
	}
	
	public static void chiffre(final int valeur) {
		if (valeur == 0) {
			System.out.println("L'entier passe en parametre vaut 0");
		} else {
			System.out.println("L'entier passe en parametre est different de 0");
		}
	}
	
	public static void meteo(final boolean beauTemps) {
		if (beauTemps) {
			System.out.println("Je vais a la plage");
		} else {
			System.out.println("Je vais au cinema");
		}
	}
	public static void meteoStringTime(final String temps) {
//		Comparaison de deux chaines de caracteres
		if (temps.equals("soleil")) {
			System.out.println("Je vais a la plage");
		}
	}
	
	public static void commenteMeteo(final String meteo) {
		switch (meteo) {
			case "soleil" -> System.out.println("Beau temps");
			case "nuage" -> System.out.println("couvert");
			case "pluie" -> System.out.println("Mauvais temps");
			default -> System.out.println("Je ne sais pas");
		}
	}
	
	public static String categorieFilm(String film) {
		var result = switch (film) {
		case "Star Wars" -> "Science fiction";
		case "Blanche neige", "La petite sirene" -> "Disney";
		case "Indiana jones" -> {
			String category = "Aventure";
			yield category;
		}
		default -> "Inconnu";
		};
		return result;
	}
	
	public static void boucleWhile() {
		int chiffre = 0;
		while (chiffre < 0) {
			System.out.println(chiffre);
			chiffre ++;
		}
	}

	public static void boucleDoWhile() {
		int chiffre = 0;
		do {
			System.out.println(chiffre);
			chiffre ++;
		}while (chiffre ==1);
	}
	
	public static void boucleFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void boucleForWithList() {
		List<String> nomLangages = Arrays.asList("Java", "PHP", "Dart", "TypeScript");
		for(String nomDUnLangage : nomLangages) {
			String langageUpper = nomDUnLangage.toUpperCase();
			System.out.println(langageUpper);
		}
	}
	
	public static void Exercice() {
		int[] tableauEntier = {14, 150, 169, 29, 0, 141};
		int cpt = 0;
		for (int i = 0; i < tableauEntier.length; i ++) {
			if (tableauEntier[i] == 0) {
				cpt ++;
			}
		}
		System.out.println(cpt);
	}
	
	public static void ExerciceBoucle() {
		List<Integer> tableauEntier = Arrays.asList(12, 15, 19, 43, 14, 0, 19);
		int cpt = 0;
		for (int entier : tableauEntier) {
			if (entier == 0) {
				cpt ++;
			}
		}
		System.out.println(cpt);
	}
}
