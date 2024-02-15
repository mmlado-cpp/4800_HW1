package question2;

public class ShipDriver {
    public static void main(String[] args) {
        Ship ship1 = new Ship("Mayflower", "1600");
        CruiseShip ship2 = new CruiseShip("Titanic", "1984", 1000);
        CargoShip ship3 = new CargoShip("USS Arizona", "2000", 500);

        Ship[] myShips = { ship1, ship2, ship3 };

        for (int i = 0; i < myShips.length; i++) {
            System.out.println(myShips[i]);
        }
    }

}
