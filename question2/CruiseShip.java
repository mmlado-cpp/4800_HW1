package question2;

public class CruiseShip extends Ship {
    private int maxCapacity;

    public CruiseShip(String name, String buildDate, int maxCapacity) {
        super(name, buildDate);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Maximum passengers allowed: " + maxCapacity;
    }

}