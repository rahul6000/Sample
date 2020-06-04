package Selenium;

public class IfelseIfStatment {
     int a = 5;
    int b = 5;

    public void compare() {
        if (a < b) {
            System.out.println("Print");
        } else if(a>b){
            System.out.println("P");
        } else {
            System.out.println("A");
        }

        }

    public static void main(String[] args) {
        IfelseIfStatment obj = new IfelseIfStatment();
        obj.compare();
    }
}
