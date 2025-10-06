import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bg = new Scanner(System.in);
        int choix;

        do {

            do {
                System.out.println("1 : Frais Kilometriques");
                System.out.println("2 : Consommation electrique");
                System.out.println("3 : Somme des N premiers nombres");
                System.out.println("4 : Factorielle");
                System.out.println("5 : Lignes d'etoile");
                System.out.println("6 : Rectangles d'etoile");
                System.out.println("7 : Table de Multiplication");
                System.out.println("8 : Jeu de la Fourchette");
                System.out.println("0 : Aurevoir!! ");
                System.out.println("Faite votre Choix ");
                choix = bg.nextInt();
            } while (choix < 0 || choix > 8);

            switch (choix) {
                case 1:
                    int kilometre;
                    double fraisKilo;
                    do {
                        System.out.println("Nombre de Kilometre parcourus ? : ");
                        kilometre = bg.nextInt();
                    }while (kilometre <= 0);
                    if (kilometre < 25000){
                        fraisKilo = kilometre * 0.32;
                    }else {
                        fraisKilo = kilometre * 0.22;
                    }
                    System.out.println("Vos frais Kilometriques sont de : "+ fraisKilo);
                    break;
                case 2:
                    int anReleve;
                    int nvReleve;
                    int conso;
                    double facture = 0;

                    do {
                        System.out.print("Votre Ancien relevé : ");
                        anReleve = bg.nextInt();
                    } while (anReleve < 0);

                    do{
                        System.out.print("Votre Nouveau relevé : ");
                        nvReleve = bg.nextInt();
                    }while (nvReleve < anReleve);

                    conso = nvReleve - anReleve;

                    if (conso <= 100) {
                        facture = conso * 0.083;
                    } else if (conso <= 200) {
                        facture = (100 * 0.083) + ((conso - 100) * 0.076);
                    } else {
                        facture = (100 * 0.083) + (100 * 0.076) + ((conso - 200) * 0.06);
                    }

                    System.out.println("Votre consommation est de : " + conso + " kWh");
                    System.out.println("Votre facture est de : " + (facture) + " $");
                    break;
                case 3:
                    int n;
                    int somme = 0;
                    do {
                        System.out.println("Entrer un entier : ");
                        n = bg.nextInt();
                    }while (n <= 0);

                        for (int i = 1; i <= n; i++) { // Boucle connue
                            somme = somme + i;
                        }
                        System.out.println("La somme de 1 à " + n + " est : " + somme);
                    break;
                case 4:
                    int n2;
                    do {
                        System.out.print("Votre nombre : ");
                        n2 = bg.nextInt();
                    } while (n2 < 0);

                    int fact = 1;
                    for (int i = 1; i <= n2; i++) {
                        fact *= i;
                    }

                    System.out.println("La factorielle est de : " + fact);
                    break;
                case 5:
                    int nbEtoile;
                    do {
                        System.out.print("Nombre d'étoiles : ");
                        nbEtoile = bg.nextInt();
                    } while (nbEtoile <= 0);

                    for (int i = 0; i < nbEtoile; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                case 6:
                    int lignes, colonnes;

                    do {
                        System.out.print("Nombre de lignes : ");
                        lignes = bg.nextInt();
                    } while (lignes <= 0);

                    do {
                        System.out.print("Nombre de colonnes : ");
                        colonnes = bg.nextInt();
                    } while (colonnes <= 0);

                    for (int i = 0; i < lignes; i++) {
                        for (int j = 0; j < colonnes; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Exo7");
                    break;
                case 8:
                    System.out.println("Exo8");
                    break;
            }
        }while (choix != 0); // Tant que choix n'est pas 0

    }
}
