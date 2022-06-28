package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean continua = true;
		
		do {
			System.out.println("Premi \n1 per rettangolo \n2 per quadrato \n3 per uscire");
			String sceltaUtente = scan.nextLine();
			switch (sceltaUtente) {
			case "1":
				System.out.print("Inserisci la base del rettangolo: ");
				double baseRettangolo = Double.parseDouble(scan.nextLine());
				System.out.print("Inserisci l'altezza del rettangolo: ");
				double altezzaRettangolo = Double.parseDouble(scan.nextLine());

				Rettangolo nuovoRettangolo = null;
				try {
					nuovoRettangolo = new Rettangolo(baseRettangolo, altezzaRettangolo);
				} catch (IllegalArgumentException e) {
					System.out.println("Valori non validi:");
					System.out.println(e.getMessage());
				}

				System.out.println("L'area del rettangolo é: " + nuovoRettangolo.calcolaArea());
				System.out.println("Il perimetro del rettangolo é: " + nuovoRettangolo.calcolaPerimetro());
				break;
			case "2":
				System.out.print("Inserisci il lato del quadrato:");
				double latoQuadrato = Double.parseDouble(scan.nextLine());

				Quadrato nuovoQuadrato = null;
				try {
					nuovoQuadrato = new Quadrato(latoQuadrato);
				} catch (IllegalArgumentException e) {
					System.out.println("Valori non validi:");
					System.out.println(e.getMessage());
				}
				
				System.out.println("L'area del quadrato é: " + nuovoQuadrato.calcolaArea());
				System.out.println("Il perimetro del quadrato é: " + nuovoQuadrato.calcolaPerimetro());
				break;
			case "3":
				continua = false;
				System.out.println("Arrivederci!");
				break;
			default:
				System.out.println("Selezione non valida. Riprova.");
			}
		} while (continua);
		
		
		
		scan.close();
	}

}
