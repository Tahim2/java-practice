public class Box {
    public int heigth;
    public int width;
    public int length;

    public static void Calculate_area(int heigth, int width, int length){


        System.out.println(heigth * width * length);
    }
    public static void Calculate_area(int heigth, int width){



        System.out.println(heigth * width );
    }

    public void display(){
        System.out.println(heigth+ " "+width+" "+length);
    }


    public static void main(String[] args){

        Box box1 = new Box();
        box1.heigth = 3;
        box1.width = 5;
        box1.length = 2;
        box1.Calculate_area(box1.heigth, box1.width, box1.length);
        box1.Calculate_area(box1.heigth, box1.width);


        box1.display();
    }
}