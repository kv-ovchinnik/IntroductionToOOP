public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point();  //Объявление переменной 'A' типа 'Point'
                                //Создание объекта (экземпляра) 'A' класса 'Point'
       // A.x = 2;
        //A.y = 3;
        A.setX(2);
        A.setY(3);
        /*System.out.println("X = " + A.getX());
        System.out.println("Y = " + A.getY());*/
        //Object
        A.print();


        Point B = new Point();
        B.setX(7);
        B.setY(8);
       /* System.out.println("X = %f".formatted(B.getX()));
        System.out.println("Y = %f".formatted(B.getY()));*/
        B.print();gi


        System.out.println("Расстояние от точки А до Б: %f".formatted(A.distance(B)));
        System.out.println("Расстояние между точками А и Б: %f".formatted(Point.distance(A, B)));
    }
}
 class Point {
     private double x;
     private double y;

     public double getX() {
         return x;
     }

     public double getY() {
         return y;
     }

     public void setX(double x) {
         this.x = x;
     }

     public void setY(double y) {
         this.y = y;
     }


     public double distance(Point other) {
         double xdist = this.x - other.x;
         double ydist = this.y - other.y;
         double distance = Math.sqrt(xdist * xdist + ydist * ydist);
         return distance;

     }
     public  static double distance( Point A, Point B){
         double xdist = A.x - B.x;
         double ydist = A.y - B.y;
         double distance = Math.sqrt(xdist * xdist + ydist * ydist);
         return  distance;
     }
public void print(){
    System.out.println("X = %f, Y = %f".formatted(x, y));
}
 }

