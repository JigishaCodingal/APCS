// Interface 1
interface Animal {
    void eat(); // abstract method
}

// Interface 2
interface Bird {
    void fly(); // abstract method
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("Bat can fly using its wings.");
    }
}

// Main class
public class ExtraMultipleInheritanceExample {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat();
        b.fly();
    }
}
