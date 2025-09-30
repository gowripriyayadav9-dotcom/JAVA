import java.util.Scanner;
public class Except_self {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the "+ n +"number : ");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            int product = 1;
            for (int j=i+1;j<n;j++){
                product *= arr[j];
        }
        System.out.println(product);
       }
    }
}
