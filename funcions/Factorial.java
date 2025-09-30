import java.util.Scanner;
public class Factorial {
    public static int fact(){
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter ur desired number to find the fatorial : ");
        int n = sc.nextInt();
        sc.close();
        if (n < 0){
            System.out.println("it is not a factorial");
        }
        int fact = 1;
        for(int i = 2 ; i<=n ; i++){
            fact *= i;
        }
        return fact;
    }
public static void main (String[]args){
    int facto = fact ();
    if (facto != -1){
 System.out.println(facto);
}
}
}
