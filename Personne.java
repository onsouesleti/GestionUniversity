public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int age;

    // Constructeur
    public Personne(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Getter et Setter pour id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter et Setter pour nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et Setter pour prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getter et Setter pour age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Validation optionnelle pour éviter les âges négatifs
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    // Méthode toString pour afficher les informations de l'objet
    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}
