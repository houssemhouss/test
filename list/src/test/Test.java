
package test;


public class Test {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant(5, "Benjeddou", "houcem");
        Etudiant e2 = new Etudiant(3, "Kchaou", "yesmine");
        Etudiant e3 = new Etudiant(15, "Hosni", "Houssem");
        Etudiant e4 = new Etudiant(6, "Lipa", "Dua");
        Etudiant e5 = new Etudiant(2, "Bellingham", "jude");

        EspritArrayList esp = new EspritArrayList();

        esp.ajouterEtudiant(e1);
        esp.ajouterEtudiant(e2);
        esp.ajouterEtudiant(e3);
        esp.ajouterEtudiant(e4);

        System.out.println("******************************");
        esp.displayEtudiants();
        System.out.println("******************************");

        System.out.println("recherche de e2 :" + esp.rechercherEtudiant(e2));
        System.out.println("recherche de e5 :" + esp.rechercherEtudiant(e5));
        System.out.println("******************************");

        System.out.println("recherche du nom Laporte:" + esp.rechercherEtudiant("Laporte"));
        System.out.println("recherche du nom  Absi :" + esp.rechercherEtudiant("Absi"));
        System.out.println("******************************");

        esp.trierEtudiantsParId();
        esp.displayEtudiants();
        System.out.println("******************************");
        esp.trierEtudiantsParNom();
        esp.displayEtudiants();
        System.out.println("******************************");

        esp.supprimerEtudiant(e3);
        esp.displayEtudiants();
        System.out.println("******************************");

    }

}
    

