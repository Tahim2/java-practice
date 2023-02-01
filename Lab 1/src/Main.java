public class Main {
    public static void main(String[] args) {
        //Factorial part
        int result = fact(5);
        System.out.println("factorial of "+ 5 +" = " + result);


       //Employee part
        Employee e1 = new Employee();
        e1.name = "Abid";
        e1.salary=35000;
        e1.display();

        //Box part
        Box box1 = new Box();
        box1.height=10;
        box1.width=20;
        box1.length=40;
        box1.calculateArea();

}
        public static int fact( int n) {

            if (n == 0)
                return 1;
            else
                return n * fact(n - 1);
        }







}