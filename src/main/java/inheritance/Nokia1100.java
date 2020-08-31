package inheritance;

public class Nokia1100 extends PreNokia1100 {


    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */
    public String nameOfTheClass;

    public Nokia1100(){
       System.out.println("I am default constructor");

    }

    public Nokia1100(int x){
       System.out.println("I am parametriezed constructor I get value "+x);
    }

    public void setName(String nameOfTheClass){
       this.nameOfTheClass = nameOfTheClass;
    }

    public void photoGallery(){
       System.out.println("Welcome to gallery");
    }

   @Override
   public void makeCall() {
      System.out.println("I am calling");
   }

   @Override
   public void display() {
       System.out.println("I am colourful");

   }

   public static void main(String[] args){
      Nokia1100 nokia=new Nokia1100();
      Nokia1100 nokia2=new Nokia1100(3);
      nokia.makeCall();
      nokia.sendText();
      nokia.display();


   }
}
