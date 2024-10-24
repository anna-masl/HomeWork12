package app;

public class MainSolutionHomeWork12 {

    public static void main(String[] args) {


        Employee employee = new Employee("Pavel", "student",
                "pavel.pul@gmail.com", "+38055345671", 24);

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee profession: " + employee.getProfession());
        System.out.println("Employee email: " + employee.getEmail());
        System.out.println("Employee telephone: " + employee.getTelephone());
        System.out.println("Employee age: " + employee.getAge());

        Car car = new Car();
        car.start();

    }

}
