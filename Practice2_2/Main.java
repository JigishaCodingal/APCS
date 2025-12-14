public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        
        System.out.println("Radius: %.2f\n", circle.getRadius());
        System.out.println("Area: %.2f\n", circle.area());
        System.out.println("Circumference: %.2f\n", circle.circumference());
    }
}