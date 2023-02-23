public class Encapsulation {
    public static void main(String[] args){
        Employee e1 = new Employee("Mack", 221, 62000.00);

        System.out.println("Name: "+e1.getName());
        System.out.println("age: "+e1.age);
        System.out.println("ID: "+e1.getId());
        System.out.println("Salary: "+e1.getSalary());
    }
}
