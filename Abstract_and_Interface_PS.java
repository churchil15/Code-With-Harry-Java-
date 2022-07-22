package com.company;

abstract class Pen{
    abstract public void write();
    abstract public void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing....");
    }
    public void refill(){
        System.out.println("Refilling....");
    }
    public void changeNib(){
        System.out.println("Changing Nib....");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }

    public void dance(){
        System.out.println("DANCING...");
    }
    public void cook(){
        System.out.println("COOKING...");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("RINGING...");
    }
    public void lift(){
        System.out.println("LIFTING...");
    }
    public void disconnect(){
        System.out.println("DISCONNECTING...");
    }

    public void internet(){
        System.out.println("ACCESS TO INTERNET...");
    }
}

interface TvRemote{
    void changeChannels();
    void increaseVolume();
    void decreaseVolume();
}

interface SmartTvRemote extends TvRemote{
    void internet();
    void record();
}

class TV implements TvRemote{
    public void changeChannels(){
        System.out.println("Change the Channel");
    }
    public void increaseVolume(){
        System.out.println("Increasing the Volume");
    }
    public void decreaseVolume(){
        System.out.println("Decreasing the Volume");
    }
    public void watch(){
        System.out.println("Watching");
    }
}

public class Abstract_and_Interface_PS {
    public static void main(String[] args) {
//        System.out.println("Welcome to Abstract and Interface Practice Set");

//        FountainPen f = new FountainPen();
//        f.changeNib();
//        f.write();
//        f.refill();

//        Human h = new Human();
//        h.jump();
//        h.bite();
//        h.dance();
//        h.cook();
//        h.eat();
//        h.sleep();

//        BasicAnimal bs = new Human();  // Reference BasicAnimal Interface ka hai too methods bhi sirf iske hi chalenge
//        bs.eat();
//        bs.sleep();

//        Monkey m = new Human();        // Reference Monkey class ka hai too methods bhi sirf iske hi chalenge
//        m.jump();
//        m.bite();

//        SmartTelephone st = new SmartTelephone();
//        st.internet();
//        st.ring();
//        st.lift();
//        st.disconnect();

        TV t = new TV();
        t.watch();
        t.changeChannels();
        t.increaseVolume();
        t.decreaseVolume();

    }
}
