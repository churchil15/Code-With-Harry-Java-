package com.company;

// Creating Thread by extending Thread Class --
class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0;i<100;){
            System.out.println("Churchil");
//            System.out.println("I am Happy");
            try{
                Thread.sleep(500);      // in sleep mode for 500 milliseconds.
            }
            catch (Exception e){
                System.out.println(e);
            }


        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0;i<100;){
            System.out.println("Vidit");
//            System.out.println("I am Sad");
        }
    }
}

// Creating Thread by implementing Runnable Interface --
class MyThread3 implements Runnable{
    public void run(){
        for (int i = 0;i<200;i++){
            System.out.println("I am a Thread3 not a Threat 3");
        }
    }
}

class MyThread4 implements Runnable{
    public void run(){
        for (int i = 0;i<200;i++) {
            System.out.println("I am Thread4 not a Threat 4");
        }
    }
}

// Constructors in Thread CLass
class MyThread5 extends Thread{
    public MyThread5(String name){     // String name hmare Thread ko ek naam deti hai aur iss naam ko use krke hm baad me thread ko refer krskte hai
        super(name);    // Superclass ka vo wala constructor call krrhe hai jo ki ek String leta hai as parameter.
    }

    public void run(){
        for (int i = 0;i<200;){
            System.out.println("I am Thread " + getName());
        }
    }
}

// Practice Set Questions Starts here -->

class PS1 extends Thread{
    public void run(){
        for (int i = 0;i<200;){
            System.out.println("Good Morning");
        }
    }
}

class PS2 extends Thread{
    public void run(){
        for (int i = 0;i<100;){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class PS3 extends Thread{
    public void run(){
        for (int i = 0;i<200;){
            System.out.println("Churchil");
        }
    }
}

class PS5 extends Thread{
    public PS5(String name){
        super(name);
    }

    public void run(){
        System.out.println("Practice set Question 5");
    }
}

public class Multithreading {
    public static void main(String[] args) {
//        System.out.println("Welcome to Multithreading!!!");     // Different Processes within a Process (within a process when you do multitasking it's called multithreading)
                                                                  // Ek Process ke andar aur kaafi saare processes invoke kridye hai (This is called Multithreading)
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();

//        t1.start();    // Ek Thread ko start krne ke liye hme start() method chalana padta hai
//        t2.start();    // start() method Thread class ka method hai. mtlb start() method t1 aur t2 dono ko time de rha hai



//        MyThread3 t3 = new MyThread3();     // Jab bhi hm Runnable Interface ko implement krte hai to hm start() method ko directly nhi use krskte
//        Thread th3 = new Thread(t3);        // Hm Thread class ka object create krte hai aur creation ke time pr hi hm parenthesis me uss class ka object pass kr dete hai
//                                            // jo ki Runnable interface ko implement krrhi hoti hai
//        MyThread4 t4 = new MyThread4();     // Aisa isliye krna padta hai kyuki start() method Thread class ke andar hi hai,
//        Thread th4 = new Thread(t4);        // uss class ke andar nhi jisne Runnable Interface ko implement kiya hai

//        th3.start();
//        th4.start();

//        MyThread5 t5 = new MyThread5("churchil");   // hmne hmari thread ka name set krdiya hai
//        t5.start();
//        System.out.println(t5.getId());
//        System.out.println(t5.getName());

//        MyThread5 t6 = new MyThread5("monty");
//        t6.start();
//        System.out.println(t6.getId());
//        System.out.println(t6.getName());

//        MyThread3 t3 = new MyThread3();
//        Thread th3 = new Thread(t3, "rajpal");   // Thread class ka vo waala constructor call hoga jo ki ek runnable le rha hoga aur ek string le rha hoga as parameters
//        th3.start();
//        System.out.println(th3.getName());
//        System.out.println(th3.getId());

//        MyThread5 t1 = new MyThread5("Churchil (most important)");
//        MyThread5 t2 = new MyThread5("Vidit");
//        MyThread5 t3 = new MyThread5("Lohan");
//        MyThread5 t4 = new MyThread5("Pradumn");
//        MyThread5 t5 = new MyThread5("Kamal");

//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MIN_PRIORITY);
//        t5.setPriority(Thread.MIN_PRIORITY);

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();

//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();

//        t1.start();
//        try {
//            t1.join();     // join() means that we want t1 thread to execute completely first and then the remaining threads to start.
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

//        t2.start();



//        PS2 t2 = new PS2();


//        PS1 t1 = new PS1();
//        PS3 t3 = new PS3();


//        t3.setPriority(Thread.MAX_PRIORITY);       // prints "Churchil"
//        t1.setPriority(Thread.MIN_PRIORITY);       // prints "Good Morning"
//        t1.start();
//        t3.start();
//        t2.start();
//        System.out.println(t1.getPriority());
//        System.out.println(t3.getPriority());

        PS5 t5 = new PS5("Pradumn");
//        t5.start();


        System.out.println(t5.getName());

        System.out.println(t5.getId());

        System.out.println(t5.getState());

        t5.start();
        System.out.println(t5.getState());

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());


    }
}
