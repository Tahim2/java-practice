import java.sql.SQLOutput;

class Employee {
    private int var;
    private float cgpa;
    public Employee(){
        this.var = 10;
        this.cgpa=3.5f;
    }
    public Employee(int num, float cgpa){
        this.var = num;
        this.cgpa = cgpa;
    }
    public int getValue(){
        return var;
    }
    public float getValue2(){
        return cgpa;
    }
    public static void main(String args[]){
        Employee obj = new Employee();
        Employee obj2 = new Employee(100, 3.75f);
        System.out.println("id is:"+obj.getValue()+" & cgpa is "+obj.getValue2());
        System.out.println("id is:"+obj2.getValue()+" & cgpa is "+obj2.getValue2());
    }

}
