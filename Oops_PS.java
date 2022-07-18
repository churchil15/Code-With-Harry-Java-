package com.company;

class Employee2{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing.....");
    }

    public void vibrating(){
        System.out.println("Vibrating.....");
    }
}

class Square{
    int side;

    public void setSide(int a){
        side = a;
    }

    public void area_peri(){
        System.out.println("Area of the square is: " + side*side);
        System.out.println("Perimeter of the square is: " + 4*side);
        System.out.println();
    }
}

class Rectangle{
    int length, breadth;

    public void area_peri(){
        System.out.println("Area of the Rectangle is: " + length*breadth);
        System.out.println("Perimeter of the Rectangle is: " + 2*(length+breadth));
        System.out.println();
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public Rectangle(){
        length = 1;
        breadth = 2;
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting.....!!!");
    }
    public void run(){
        System.out.println("Running.....!!!");
    }
    public void fire(){
        System.out.println("Firing.....!!!");
    }
}

class Circle{
    public void initialize(int radius){
        System.out.println("Area of the Circle is: " + 3.14f*radius*radius);
        System.out.println("Circumference of the Circle is: " + 2*3.14f*radius);
    }
}

class Cylinder{
    private int radius, height;

    public void setRadius(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }

    public int getHeight(){
        return height;
    }

    public void area_volume(){
        System.out.println("Area of the Cylinder is: " + ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius)));
        System.out.println("Volume of the Cylinder is " + (Math.PI*radius*radius*height));
    }

    public Cylinder(int r, int h){
        radius = r;
        height = h;
    }
}

class Sphere{
    private int radius, height;

    public void setRadius(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }

    public int getHeight(){
        return height;
    }
}

// Main Class starts here
public class Oops_PS {
    public static void main(String[] args) {
//        System.out.println("This is the Practice sheet for OOPS in JAVA");

        Employee2 obj1 = new Employee2();
        Employee2 obj2 = new Employee2();

        obj1.salary = 50;
        obj1.name = "Vidit";
        obj2.salary = 100;
        obj2.name = "Pradumn";

//        System.out.println(obj1.getName());
//        System.out.println(obj1.getSalary());
//        System.out.println(obj2.getName());
//        System.out.println(obj2.getSalary());

//        obj1.setName("Churchil");           // Updating the name of the Employee obj1.
//        System.out.println(obj1.name);
//        System.out.println(obj1.getName());


        CellPhone c1 = new CellPhone();
        CellPhone c2 = new CellPhone();

//        c1.ringing();
//        c1.vibrating();

        Square sq = new Square();
        Square sq2 = new Square();
//        sq.setSide(4);
//        System.out.println(sq.side);
//        sq.area_peri();
//
//        sq2.setSide(5);
//        System.out.println(sq2.side);
//        sq2.area_peri();

        Rectangle rec = new Rectangle(5, 6);
        Rectangle rec2 = new Rectangle();

        System.out.println(rec.length);
        System.out.println(rec.breadth);

//        rec.length = 5;
//        rec.breadth = 6;
//        rec2.length = 1;
//        rec2.breadth = 2;

//        System.out.println(rec.length);
//        System.out.println(rec.breadth);
//        rec.area_peri();

        System.out.println(rec2.length);
        System.out.println(rec2.breadth);
//        rec2.area_peri();


        TommyVecetti man = new TommyVecetti();
        TommyVecetti man2 = new TommyVecetti();

//        man.fire();
//        man.run();
//        man.hit();

        Circle cir = new Circle();
        Circle cir2 = new Circle();

//        cir.initialize(1);
//        cir2.initialize(3);

        Cylinder cy = new Cylinder(5, 10);

//        cy.setRadius(9);
//        System.out.println("Radius is: " + cy.getRadius());
//        cy.setHeight(12);
//        System.out.println("Height is: " + cy.getHeight());

//        cy.area_volume();

        Sphere sp = new Sphere();

        sp.setRadius(5);
        System.out.println("Radius of the Sphere is: " + sp.getRadius());
        sp.setHeight(10);
        System.out.println("Height of the Sphere is: " +sp.getHeight());
    }
}
