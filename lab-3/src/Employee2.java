public class Employee2 {

        private double salary;
        private String name;
        public Employee2(){
            this.salary = 10;
            this.name = "Jack";
        }
        public Employee2(double salary, String name){
            this.salary =salary;
            this.name = name;
        }

        public double getValue(){
            return salary;
        }
    public String getValue2(){
        return name ;
    }
        public static void main(String args[]){
            Employee2 obj = new Employee2();
            Employee2 obj2 = new Employee2(1000, "Jackly");
            System.out.println("Employee1 is:"+obj.getValue2()+" & "+"salary is:"+obj.getValue());
            System.out.println("Employee2 is:"+obj2.getValue2()+" & "+"salary is:"+obj2.getValue());

        }



}
