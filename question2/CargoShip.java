package question2;

public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip(String name, String buildDate, int tonnage) {
        super(name, buildDate);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Maximum tonnage: " + tonnage;
    }

}
