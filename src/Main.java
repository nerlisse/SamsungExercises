public class Main {
    public static void main(String[] args) {

        Game game = new Game();


        Unit unit1 = new Unit("Lee Know");
        Unit unit2 = new Unit("Han");

/*        System.out.println(unit1);
        System.out.println(unit2);
        unit1.attack(unit2);
        System.out.println(unit1);
        System.out.println(unit2);
        unit2.attack(unit1);
        System.out.println(unit1);
        System.out.println(unit2);*/

//        unit1.print();
//        unit2.print("Value of: ");

        Game game2 = new Game();

        Wizard wizard1 = new Wizard("Felix");
        Wizard wizard2 = new Wizard("Changbin");

//        System.out.println(wizard1);
//        System.out.println(wizard2);
//        wizard1.attack(wizard2);
//        System.out.println(wizard1);
//        System.out.println(wizard2);
//        wizard2.attack(wizard1);
//        System.out.println(wizard1);
//        System.out.println(wizard2);

        Game.print();
    }
}