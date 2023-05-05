// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Woman woman = new Woman("Lida", "Klayton", 42);

        Man man = new Man("Pol", "Dafn", 68);


        woman.setPartner(man);
        woman.getPartner();
        woman.registerPartnership(man);
        System.out.println(woman.getLastName());
        System.out.println(woman.isRetired());
        System.out.println(man.isRetired());

        woman.deregisterPartnership(true);


        System.out.println(woman.getLastName());

        woman.deregisterPartnership(false);



    }
}