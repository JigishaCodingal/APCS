class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Optional: toString for debugging
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age); // Call Person constructor
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", major='" + major + "'}";
    }
   
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "Computer Science");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
    }

}