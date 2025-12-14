public class acp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),a=0,b=1,c;
        


        for (int i = 3; i <= n; i++) {
            c=a+b;
            
            a=b;
            b=c;
        }

        
    }
}
