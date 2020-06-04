package Selenium;

/* same Method name in all the classes (Parent and child both), system overrides the parent method
and uses the method of the child.
Not like inheritance as child automatically inherits the method of the parent.
*/

class Add{
    int a=2;
    int b=3;
    void ad1(){
      int c= a+b;
        System.out.println(c + " This is addition");

    }
}

class Sub extends Add{
    int c= a-b;
    void ad1(){
        System.out.println(c + " This is subtraction");

    }
}
public class MethodOverriding {

public static void main(String args[]){

 //Add A1=new Add();
 Sub S1=new Sub();

 S1.ad1();


}

}
