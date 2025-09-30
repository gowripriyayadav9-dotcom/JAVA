import java.util.Scanner;
public class Maj_ele {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of an array : ");
    int n = sc.nextInt();
    System.out.println("Enter the " + n + " of numbers : ");
    int []arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int count = 0;
    int sam = 0;
    for(int i = 0;i<arr.length;i++){
       if (count == 0){
       sam = arr[i];
       }
       if(i == sam){
        count++;
       }
       else{
        count--;
       }
    }
    System.out.println("the majority element : " + sam );
    }
}
