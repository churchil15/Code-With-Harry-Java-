package com.company;

abstract class Parent{    // Abstract ek aisi class hai jisne ek standard set krdiya hai baaki ki derived classes ke liye.
    public Parent(){
        System.out.println("Mai Parent class ka constructor hoon");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();      // Abstract method ki wajah se class bhi abstract ho jayegi.
    abstract public void greet2();     // Another Abstract method
}

class Child extends Parent{      // Iss class ne Parent class ke saare abstract methods ki implementation bta di hai to isko abstract declare nhi krenge.
    public void greet(){              // Abstract method jisko hm define krrhe hai Child class me.
        System.out.println("Good Morning");
    }

    public void greet2(){            // Another Abstract method jisko define kreehe hai Child class me
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{     // Ye class parent class ke abstract method ko implement nhi krrhi hai isliye isko hme abstract declare krna padega
    public void timePass(){
        System.out.println("TimePass Karo");
    }
}

// From here starts Interfaces -->

interface Bicycle{         // Interface is a group of related methods
    int a = 45;                          // Interfaces ke andar attributes bhi ho skte hai, lekin inko change nhi krskte.
    void applyBreak(int decrement);      // Inn attributes aur properties ko change krskte hai lekin class me (pr usually change nhi kiya jaata hai)
    void speedUp(int increment);
}

interface HornBicycle{
    int b = 47;
    void HornIronMan();
    void HornThor();
}

class AvonCycle implements Bicycle, HornBicycle{       // Iss class me apan interface ke abstract methods ko implement krenge.
    int speed = 7;                                     // Multiple Interfaces ko implement kiya gya hai iss class me.

    public void applyBreak(int d) {      // Interface methods should be declared public
        speed = speed - d;
    }

    public void speedUp(int i) {
        speed = speed + i;
    }

    public void HornIronMan(){
        System.out.println("IronMan Horn");
    }

    public void HornThor(){
        System.out.println("Thor Horn");
    }
}

class MyCellPhone{                         // Parent Class
    public void callNumber(long number){
        System.out.println("Calling " + number);
    }

    public void pickCall(long number){
        System.out.println("Connecting " + number);
    }
}

interface MyCamera{     // By default Interfaces ke methods public hote hai.
    void takeSnap();
    void recordVideo();
    private void greet(){    // Private method, hence it cannot be used by the classes implementing this interface nor it can be accessed directly outside the class using dot operator.
        System.out.println("Good Morning");
    }
    default void record4K(){     // Ye ek default method hai jisko class me implement krne ki koi zaroorat nhi padegi.
        System.out.println("Recording in 4K...");
        greet();
    }
}

interface MyWifi{
    String [] getNetworks();     // This method need to created in such a way that it returns a String array.
    void connectNetwork(int network);
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{    // Child class also implementing Camera and Wifi interfaces
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo(){
        System.out.println("Recording Video");
    }

    public String [] getNetworks(){
        System.out.println("\nPrinting Networks:");
        String[] networkList = {"Churchil4G", "Deepak5G", "Raghav3G", "Pradumn2G", "Lohan2G"};
        return networkList;
    }

    public void connectNetwork(int network) {
        System.out.println("Connecting " + network);
    }

//    public void record4K(){
//        System.out.println("4K me record krrhe hai.....");
//    }
}

interface Interface1{
    void meth1();
    void meth2();
}

interface Interface2 extends Interface1{    // Inheritance in Interfaces.
    void meth3();
    void meth4();
}

class Class implements Interface2{
    public void meth1(){
        System.out.println("This is method 1");
    }

    public void meth2(){
        System.out.println("This is method 2");
    }

    public void meth3(){
        System.out.println("This is method 3");
    }

    public void meth4(){
        System.out.println("This is method 4");
    }
}

public class Abstract_and_Interfaces {
    public static void main(String[] args) {
//        System.out.println("Welcome to Abstract Classes and Interfaces!!");


//        Child ch = new Child();
//        ch.greet();

//        Parent p;      // Abstract Class ka reference create kiya jaa skta hai lekin object nhi create krskte.
//        Child2 ch2;

//        Parent p1 = new Child();    // Abstract class ka reference deke concrete subclass ka object create krskte hai (Dynamic Method Dispatch)

        AvonCycle cy = new AvonCycle();
        cy.speed = 123;
//        System.out.println(cy.speed);
//        System.out.println(cy.a);     // You can create attributes in interfaces
//        cy.a = 14;  // Shows Error --> You cannot modify an attribute of the interface because they are final.
//      You can modify the attributes in interface inside the class that is implementing them.

//        cy.HornIronMan();
//        cy.HornThor();


        MySmartPhone sp = new MySmartPhone();
        sp.callNumber(7999072851l);
        sp.pickCall(7999072851l);

//        sp.takeSnap();
//        sp.recordVideo();
//        sp.connectNetwork(5);
//        sp.record4K();

//        String [] arr = sp.getNetworks();
//        for (int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] + "  ");
//        }

//        sp.greet();  --> Shows Error
//        Private methods cannot be directly accessed outside the class using dot operator


//        Class c = new Class();
//        c.meth1();
//        c.meth2();
//        c.meth3();
//        c.meth4();

        MyCamera c = new MySmartPhone();   // Object to SmartPhone hi hai, lekin reference MyCamera Interface ka diya hua hai, too methods bhi sirf MyCamera Interface ke use ho payenge.
        c.record4K();
        c.takeSnap();
        c.recordVideo();
//        c.getNetworks();  --> Shows Error, because we can only use the methods and attributes of MyCamera Interface



    }
}

/*
Note --> Abstract Class ko extend krke(inheritance) hm ya to aur Child Abstract Classes bna skte hai jisme abstract methods ka implementation nhi hoga, ya phir
         Abstract Class ko extend krke hm concrete ya real classes bna skte hai jisme parent class ke saare abstract methods ka implementation hoga.

Note --> Interfaces me saare methods abstracts hi hote hai. Hm unko declare krdete hai, define nhi.
         Interfaces me saare methods aapas me related hote hai jinko apan aage kisi class me implement krskte hai.
         Interface ka reference ban skta hai lekin objects nhi.

         Interface force krta hai baaki ki classes ko jo ise implement krengi, ki vo classes inn abstract methods ko define kre.
         Jb Interface ke methods ko implement krte hai tb unko public bnana padta hai.
         Interface methods, attributes and properties are public by default.

         Default methods ko implement krne ki zaroorat nhi padti hai class me kyuki unko apan interface ke andar hi define krskte hai.
         But if needed we can override (re-define) default methods of interface in class too (which is implementing the interface).
*/
