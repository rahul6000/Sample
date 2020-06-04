package Selenium;

class Car {

    int plate;
    String colour;
    String model;
    int wheels;
    int doors;

    Car(int p, String c, String m, int w, int d) { // constructor for class car

        this.plate = p;
        this.colour = c;
        this.model = m;
        this.wheels = w;
        this.doors= d;
    }
}

class Bmw{

    String Sports;
    String Sunroof;
    int doors1;

    Car C1 ;  // reference object for the class car, which is a global variable for Bmw class

    Bmw(String S, String S1, Car C2, int d1){

        this.Sports= S;
        this.Sunroof= S1;
        this.doors1= d1;
        this.C1= C2; // constructor for variable C1
    }

}
public class Aggregation {

    public static void main(String args[]){

        Car obj3= new Car(3,"black","VW",4, 5);
        Bmw obj4= new Bmw("Sports","yes",obj3,2);

        System.out.println(obj4.Sports);
        System.out.println(obj4.Sunroof);
        System.out.println(obj4.C1.colour);
        System.out.println(obj4.C1.model);
        System.out.println(obj4.C1.plate);
        System.out.println(obj4.C1.wheels);
        System.out.println(obj4.doors1);

}
}
