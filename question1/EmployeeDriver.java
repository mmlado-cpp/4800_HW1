package question1;

public class EmployeeDriver {
    public static void main(String[] args) {
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500); 
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        ComissionEmployee nicoleDior = new ComissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555",1700);
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        ComissionEmployee mahnazVaziri = new ComissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        Employee[] employees = {joeJones, stephanieSmith, maryQuinn,nicoleDior, renwaChanel, mikeDavenport, mahnazVaziri};

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }





    }
}
