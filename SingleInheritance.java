package Selenium;

class Parent{
    int a=5;
    int b=50000;

}



    class child extends Parent {
            int c = a + b;

        }

    public class SingleInheritance {
    public static void main (String[]args){
    child obj=new child();
    System.out.println(obj.c);

}
    }