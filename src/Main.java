public class Main {
    public static void main(String[] args) {
        int priceOfTicket = 15465;
        int rublesForMile = 20;

        int bonusMiles = priceOfTicket / rublesForMile;

        System.out.println("Бонусные мили: " + bonusMiles);

    }
}