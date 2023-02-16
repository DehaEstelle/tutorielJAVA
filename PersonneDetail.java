public class PersonneDetail {
    private String nom;
    private String prenom;
    private int age;

    public PersonneDetail(String lname, String fname) {
        nom = lname;
        prenom = fname;
    }

    public PersonneDetail() {
        nom = "toto";
        prenom = "momo";
        age = 20;
    }
     public void anniversaire() {
        int ageAct;
        ageAct = this.age + 1;
        System.out.println(ageAct);
     }

    public static void main(String[] args) {
        PersonneDetail Personne = new PersonneDetail("John", "Doe");

        PersonneDetail personneObj = new PersonneDetail();

        System.out.println(personneObj.nom +" "+ personneObj.prenom +" "+ personneObj.age +"ans");

        personneObj.anniversaire();

        System.out.println("Nom: "+ Personne.nom + "\nPrenom: "+ Personne.prenom);

    }
}
