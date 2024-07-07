public class Main {
    public static void main(String[] args) {

        Employee employee1=new Employee("Sümeyye",60000.0,25,2025);
        Employee employee2=new Employee("Tayyip",45000.0,35,2030);

        employee1.printEmployee();
        employee1.raiseSalary();
        employee1.tax();
        System.out.println("===================");
        employee2.printEmployee();
        employee2.raiseSalary();
        employee2.tax();






    }

}
