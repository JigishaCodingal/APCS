class Counter {
    static int number = 10; // Shared 'number' among all objects

    void increment() {
        number = number + 1; // Increment the shared 'number'
    }

    public static void main(String[] args) {
        // Create three Counter objects
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        // Call increment for each object
        obj1.increment();
        System.out.println("Value in obj2: " + obj1.number);
        obj2.increment();
        System.out.println("Value in obj2: " + obj2.number);
        obj3.increment();        
        System.out.println("Value in obj3: " + obj3.number);
    }
}
