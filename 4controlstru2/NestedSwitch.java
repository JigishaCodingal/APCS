public class NestedSwitch {
    public static void main(String[] args) {
        String subject = "Math";
        int marks = 85;
        char section = 'A';

        switch (subject) {
            case "Math":
                switch (marks / 10) {
                    case 10:
                    case 9:
                        switch (section) {
                            case 'A':
                                System.out.println("Math-A: Perfect! Prize: $100");
                                break;
                            case 'B':
                                System.out.println("Math-B: Excellent! Prize: $75");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Math: Very Good - Certificate");
                        break;
                    default:
                        System.out.println("Math: Keep practicing!");
                }
                break;

            case "Science":
                switch (marks / 10) {
                    case 10:
                    case 9:
                        switch (section) {
                            case 'A':
                                System.out.println("Science-A: Outstanding! Lab Access");
                                break;
                            case 'B':
                                System.out.println("Science-B: Great! Study Material");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Science: Good effort!");
                }
                break;

            default:
                System.out.println("Subject not found!");
        }
    }
}