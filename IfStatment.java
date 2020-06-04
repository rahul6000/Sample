package Selenium;

public class IfStatment {

     int a=15;
     int b=5;

     public void compare(){
                if (a<=b) {
                        System.out.println("Print");

                }
        }
        public void compare1(){
     if (a>=b) {
             System.out.println("P");
     }
        }

 public static void main(String[]args) {
      IfStatment obj= new IfStatment();
      obj.compare();
     IfStatment obj1= new IfStatment();
     obj1.compare1();
        }
 }


