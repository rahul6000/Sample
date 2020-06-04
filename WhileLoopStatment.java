package Selenium;

public class WhileLoopStatment {
    int a = 1;
    //int b = 5;

    public void compare() {
        while (a<=10){
            System.out.println(a);
        a++;
        }

    }

    public static void main(String[] args) {
        WhileLoopStatment obj = new WhileLoopStatment();
        obj.compare();
    }
}

