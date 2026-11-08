public class Main {

    public static void main(String[] args) {

        Livre livre1 = new Livre("L'enfant Noir", "Camara Laye", 240, 200);
        Livre livre2 = new Livre("Le Petit Prince", "Saint-Exupéry", 96, 45);
        Livre livre3 = new Livre("Les Misérables", "Victor Hugo", 1900, 120);

        livre1.afficher();
        livre2.afficher();
        livre3.afficher();

        livre1.appliquerRemise(10);
        livre3.appliquerRemise(80);

        System.out.println("Après avoir appliqué les remises :");

        livre1.afficher();
        livre2.afficher();
        livre3.afficher();
    }
}
