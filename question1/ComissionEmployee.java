package question1;

public class ComissionEmployee extends Employee {
    private double comissionRate;
    private double grossSales;

    public ComissionEmployee(String firstName, String lastName, String SSN, double comissionRate, double grossSales) {
        super(firstName, lastName, SSN);
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return "ComissionEmployee [" + super.toString() + "comissionRate: " + comissionRate + "%, grossSales: $" + grossSales + "]";
    }

}
