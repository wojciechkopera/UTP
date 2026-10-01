// TODO: Musimy dodac brakujace klasy!

// Okej ja dodam 'Adder', a Maciej Pielech z Lubina s35719 doda 'Subtractor'

public class Main {

    static void main(String[] args){

        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(6,3));

    }

}
