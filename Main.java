public class Main {
    public static void main(String[] args) {
        GestionUniversity gestionUniversity = new GestionUniversity();


        Etudiant etudiant1 = new Etudiant(1, "ali", "ala");
        Etudiant etudiant2 = new Etudiant(2, "slim", "nour");
        Etudiant etudiant3 = new Etudiant(3, "med", "karim");


        gestionUniversity.ajouterEtudiant(etudiant1);
        gestionUniversity.ajouterEtudiant(etudiant2);
        gestionUniversity.ajouterEtudiant(etudiant3);


        System.out.println("Liste des étudiants :");
        gestionUniversity.displayEtudiants();


        System.out.println("\nRecherche de l'étudiant 1 : " + gestionUniversity.rechercherEtudiant(etudiant1));


        System.out.println("\nRecherche de l'étudiant avec le nom 'Martin' : " + gestionUniversity.rechercherEtudiant("Martin"));


        System.out.println("\nListe des étudiants triée par ID :");
        gestionUniversity.trierEtudiantsParId();
        gestionUniversity.displayEtudiants();


        System.out.println("\nListe des étudiants triée par nom :");
        gestionUniversity.trierEtudiantsParNom();
        gestionUniversity.displayEtudiants();


        gestionUniversity.supprimerEtudiant(etudiant2);
        System.out.println("\nListe des étudiants après suppression de 'Martin' :");
        gestionUniversity.displayEtudiants();
    }
}
