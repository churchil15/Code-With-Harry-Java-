package com.company;

class superClass{
    int x;

    public void printMe(){
        System.out.println("I am a custom method");
    }

    public void setX(int a){
        System.out.println("I am in SuperClass and setting x attribute");
        x = a;
    }

    public int getX(){
        return x;
    }
}

class subClass extends superClass{         // Inheritance, subClass ko inherit kiya gya hai superClass se.
    int y;                                 // subClass ne extend krdiya superClass ko.

    public void setY(int a){
        y = a;
    }

    public int getY(){
        return y;
    }

}

class Animal{
    String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void walk(){
        System.out.println("Walking");
    }
    public void run(){
        System.out.println("Running");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
    public void pee(){
        System.out.println("Peeing");
    }
}
// Constructors during constructors overloading -->
class Base{
    int x;
    public Base(){
        System.out.println("Mai ek Constructor hoon Base class ka");
    }

    public Base(int a){
        System.out.println("Mai ek overloaded Constructor hoon Base class ka jisme 'a' ki value hai " + a);
    }

}

class Derived extends Base{
    int y;
    public Derived(){
//        super(12);        // super keyword likhne se ye hoga ki base class ka vo constructor call ho jayega jo ki ek argument le rha hoga as parameter.
        System.out.println("Mai ek constructor hoon Derived class ka");
    }

    public Derived(int a, int b){
        super(a);
        System.out.println("Mai ek overloaded constructor hoon Derived class ka jisme 'b' ki value hai " + b);
    }
}

class ChildOfDerived extends Derived{
    int z;
    public ChildOfDerived(){
        System.out.println("Mai ek constructor hoon childOfDerived class ka");
    }

    public ChildOfDerived(int a, int b, int c){
        super(a, b);
        System.out.println("Mai ek overloaded constructor hoon ChildOfDerived class ka jisme 'c' ki value hai " + c);
    }
}

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    public int return1(){
        return 1;
    }

    public EkClass(){
        System.out.println("Me ek constructor hoon EkClass ka");
    }

    public EkClass(int a){
        this.a = a;
    }
}

class DoClass extends EkClass{
    public DoClass(int b){
        super(12);
        System.out.println("Me ek constructor hoon DoClass ka jisme 'b' ki value hai: " + b);
    }
}

class A{
    int a;
    public int meth1(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override                   // Recommended to put Override annotations in order to remind us that overriding is being done.
    public void meth2(){        // Redefining of method 2 of parent class (Method Overriding)
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        System.out.println("Welcome to Inheritance...!!!");

//        superClass sp = new superClass();
//        sp.setX(122);
//        System.out.println(sp.getX());

//        subClass sb = new subClass();
//        sb.x = 142;
//        System.out.println(sb.x);

//        sb.setX(142);                     // Accessing methods and attributes of superclass through subclass object.
//        System.out.println(sb.getX());

//        sb.y = 321;
//        System.out.println(sb.y);
//        sb.setY(321);
//        System.out.println(sb.getY());

//        Animal an = new Animal();
//        Dog dg = new Dog();
//        dg.run();
//        dg.walk();

//        dg.setName("Bruno");
//        System.out.println(dg.getName());

//        Base b = new Base();
//        Derived d = new Derived();
//        Derived d2 = new Derived(14,9);
//        ChildOfDerived c = new ChildOfDerived();
        ChildOfDerived c1 = new ChildOfDerived(12,13,15);

//        EkClass e = new EkClass(65);
//        System.out.println(e.getA());
//        System.out.println(e.return1());

//        DoClass d = new DoClass(5);

//        A a = new A();
//        System.out.println(a.meth1());
//        a.meth2();             // A class ke object ke liye A class ka method 2 hi run hoga.
//
//        B b = new B();
//        b.meth2();             // B class ke object ke liye redefined method 2 class B ka run hoga.
    }
}

/*
Note--> superclass ke object ke through me subclass ke methods, properties ya attributes ko access nhi krskta,
        lekin subclass ke objects ke through me superclass ke methods, properties ya attributes ko access krskta hoon
        kyuki subclass ko bnaya hi superclass se gya hai. (superclass ko extend krke subclass bani hai).

        Agar Derived class ka apna khud ka constructor nhi banaya hai to vo base class ke constructor ko call krlega.
        Lekin agar hmne derived class ka bhi constructor bana rhkha hai, to sabse phele base class ka constructor run hoga phir derived class ka
        constructor hoga.
*/
