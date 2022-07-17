package com.company;

class Employee{          // Custom Class
    int id;
    int salary;
    String name;
    public void details(){
        System.out.println("Hello, My name is " + name + " and my id is " + id);
    }

    public int getSalary(){
        return salary;
    }
}

class Circle2{
    private int radius;

    public void setRadius(int r){
        radius = r;
    }
    public void getAreaPeri(){
        System.out.println("Area of the circle is: " + 3.14f*radius*radius);
        System.out.println("Perimeter of the circle is: " + 2*3.14f*radius);
    }
}


class Employee3{
    private int id;
    private String name;
    int salary;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }

    public Employee3(){             // Constructor with zero arguments.
        id = 45;                    // This will be called when we create an object of the class without giving any parameters.
        name = "Full-Form";
    }

    public Employee3(String n, int i){             // Constructor Method (whose name is same as our class name) with 2 arguments.
        id = i;                                    // Constructors are used to initialize the object at creation. It has no return value.
        name = n;
    }

    public Employee3(int s){
        salary = s;
    }
}

class Phone{
    public void time(){
        System.out.println("Showing Time");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }

    @Override
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}

class Circle3{
    int radius;

    public void area_cir(){
        System.out.println("Area of the circle is: " + Math.PI*radius*radius);
        System.out.println("Circumference of the circle is: " + 2*Math.PI*radius);
    }
}

class Cylinder3 extends Circle3{
    int height;

    public void area_vol(){
        System.out.println("Area of the Cylinder is: " + 2*Math.PI*radius*(height + radius));
        System.out.println("Volume of the Cylinder is: " + Math.PI*radius*radius*height);
    }
}

class Rectangle2{
    private int length, breadth;

    public void setLength(int l){
        length = l;
    }
    public int getLength(){
        return length;
    }

    public void setBreadth(int b){
        breadth = b;
    }
    public int getBreadth(){
        return breadth;
    }

    public void area_peri(){
        System.out.println("Area of the Rectangle is: " + length*breadth);
        System.out.println("Perimeter of the Rectangle is: " + 2*(length + breadth));
    }
}

class Cuboid2 extends Rectangle2{
    private int width;

    public void setWidth(int w){
        width = w;
    }
    public int getWidth(){
        return width;
    }

    public void area_vol(){
        System.out.println("Area of the Cuboid is: " + 12*(getLength() + getBreadth()));
        System.out.println("Volume of the Cuboid is: " + getLength()*getBreadth()*width);
    }
}

public class Oops {      // Ek java program me sirf ek public class ho skti hai
    public static void main(String[] args) {
//        System.out.println("Welcome to OOPS!!");

        Employee church = new Employee();    // Hmari custom class ka ek object create kiya hai (instantiating a new Employee class object)
        Employee harry = new Employee();

        church.id = 14293;                   // Attributes ko set krdiya (inside our main method of main class)
        church.name = "Churchil";
        church.salary = 600000;
        harry.id = 12345;
        harry.name = "Harry";
        harry.salary = 800000;

//        System.out.println(church.id);
//        System.out.println(church.name);
//        System.out.println(church.salary);
//        System.out.println(harry.salary);

//        church.details();
//        harry.details();
//        System.out.println("Salary of " + church.name + " is " + church.getSalary());
//        System.out.println("Salary of " + church.name + " is " + church.salary);


//        Circle2 c = new Circle2();
//
//        c.setRadius(3);
//        c.getAreaPeri();


//        Employee3 lol = new Employee3("LaughOutLoud", 14293);
//        Employee3 rofl = new Employee3("RollingOnFloorLaughing", 32156);
//        Employee3 lmao = new Employee3();
//        Employee3 af = new Employee3(10000);

//        lol.id = 4932001;               // Private access modifiers, hence they cannot be accessed directly.
//        lol.name = "LaughOutLoud";

//        lol.setName("LaughOutLoud");
//        System.out.println("Name is: " + lol.getName());

//        lol.setId(452001);
//        System.out.println("ID is: " + lol.getId());

//        System.out.println(lol.getId());
//        System.out.println(lol.getName());

//        System.out.println(lmao.getId());
//        System.out.println(lmao.getName());
//
//        af.setName("AsFuck");
//        System.out.println("Salary of " + af.getName() + " is: " + af.salary);


        // Dynamic Method Dispatch from here -->>
//        Phone nokia = new Phone();
//        SmartPhone apple = new SmartPhone();

//        nokia.name();
//        apple.name();

//        Phone nokia = new SmartPhone();  // Mene Phone class ka reference diya hai lekin object bnaya hai SmartPhone class ka.
//        SmartPhone apple = new Phone();  // Shows Error

//        nokia.on();  // Aap sirf superclass ke methods ko hi call krskte ho. Iss case me superclass ka method subclass me override ho rha hai, isliye overridden method run hoga.
//        nokia.music();  // superclass ke reference ke through subclass ke method ko run nhi krskta.
//        nokia.time();

        Cylinder3 cy = new Cylinder3();
        cy.radius = 5;
        cy.height = 10;

        cy.area_cir();
        cy.area_vol();

        Cuboid2 cu = new Cuboid2();
//        cu.length = 4;
//        cu.breadth = 5;
//        cu.width = 6;

        cu.setLength(4);
        System.out.println("Length is: " + cu.getLength());
        cu.setBreadth(5);
        System.out.println("Breadth is: " + cu.getBreadth());
        cu.setWidth(6);
        System.out.println("Width is: " + cu.getWidth());


        cu.area_peri();
        cu.area_vol();

        Phone p = new Phone();
        p.on();

    }
}
