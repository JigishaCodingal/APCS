class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("=============Guess the Answers===========");

        System.out.println("Unary Operator" + (a++));
        //                                    10
        //a=11
        /*a++           and             ++a
        x=3                             x=3
        y=x++                           y=++x

        x =4                            x=4
        y=3                             y=4
        */
        System.out.println("Unary Operator" + (++b));
        //                                     6
        System.out.println("Binary Operator");
        System.out.println("1+2 " + 1 + 2);
        System.out.println("1+2 " + (1 + 2));
        System.out.println(1 + 2 + " =3");
        int increment = ++a * b++;
        //              12 * 6=72
        // b=7
        System.out.println(increment);
        // uncomment the next lines to know the values
        // System.out.println("Current Value of a: " +a);
        // System.out.println("Current Value of b: " +b);
        System.out.println("Ternary Operator");
        int largestNumber = (a > b) ? a : b;
        int y=2000;
        String s = (y%4==0) ? "Leap Year" : "Not Leap Year";
        System.out.println("Largest of 2 numbers: " + largestNumber);

    }
}
