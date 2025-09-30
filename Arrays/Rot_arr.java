import java.util.Scanner;
class Rot_arr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the value at how many iterations to stop the loop : ");
        int k = sc.nextInt();
        System.out.print("Enter the " + n + "array : ");
        int[]arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        k = k%n;
        int [] temp = new int [n];
        for(int i = 0;i<n-k;i++){
           temp[i] = arr[i+k];
           }
           for(int i = 0;i<k;i++){
            temp[n-k+i] = arr[i];
           }
           for(int i = 0;i<n;i++){
            arr[i] = temp[i];
           }
           System.out.println("the rotate array is : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}