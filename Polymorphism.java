/*
Polymorphism:

It is an OOP concept which means that a child class can overload and/or override
the methods created in the SuperClass through inheritance.

Polymorphism is useful when child classes can use the same methods implemented in the superclass

Inheritance is done by using the keyword "extends nameOfSuperClass" in all child classes.

Keywords:

*"extends" - used to inherit properties of the superclass

*"super.methodOfSuperClass" - refers to the parent class
*/
public class PolyMain {
    public static void main(String[] args) {

        Computer pc = new Computer();
        Phone phn = new Phone();
        Tablet tbt = new Tablet();
        Notebook ntb = new Notebook();
        TV tv = new TV();

        pc.start();
        phn.start();
        tbt.start();
        ntb.start();
        tv.start();
    }
}
class Electronics {
    //Superclass
    public void start(){
        System.out.println("starting device");
    }
}

class TV extends Electronics{
    //Child Class
    @Override
    public void start() {
        System.out.print("TV: ");
        super.start();
    }
}
class Phone extends Electronics{
    //Child Class
    @Override
    public void start() {
        System.out.print("Phone: ");
        super.start();
    }
}
class Notebook extends Electronics{
    //Child Class
    @Override
    public void start() {
        System.out.print("Notebook: ");
        super.start();
    }
}
class Computer extends Electronics{
    //Child Class
    @Override
    public void start() {
        System.out.print("Computer: ");
        super.start();
    }
}
class Tablet extends Electronics {
    //Child Class
    @Override
    public void start() {
        System.out.print("Tablet: ");
        super.start();
    }
}



