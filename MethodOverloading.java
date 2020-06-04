package Selenium;

class Add1 {
    //int a = 2;
    //int b = 3;
    //int d = 4;
    //int e = 5;
    //double F = 5.5;

    void ad1(int a,int b) {
        //int c = a + b;
        System.out.println("This is method 1");
    }

    void ad1(int a, int b, int d) {
        //int g = a + b + d;
        System.out.println(" This is method 2");
    }

    void ad1(int a, int b, int d,int e) {
        //int h = a + b + d + e;
        System.out.println("This is method 3");
    }

    void ad1(int a, int b, int d,int e , float f) {
        //int c = a + b;
        System.out.println("This is Method 4");
    }

}


public class MethodOverloading {
public static void main(String args[]){
Add1 obj2=new Add1();
obj2.ad1(2,3,4,6);

}
}
