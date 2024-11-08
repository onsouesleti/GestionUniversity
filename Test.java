import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("test");
        list.add(2.5);
        list.add(3.66);
        list.add(4);
        list.add(5);
        list.add("test");
        list.add(7);

        System.out.println(list);
        System.out.println(list.size());


        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne(1, "ali", "mouhamed", 30));
        personnes.add(new Personne(2, "slim", "mariem", 25));
        personnes.add(new Personne(3, "slimen", "nour", 40));

        for (Personne personne : personnes) {
            System.out.println(personne);
        }

    }





    }
