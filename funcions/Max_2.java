import java.util.Scanner;
class Max_2 {
    public static int max(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter ur desired number");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0 ; i < n ; i++){
            System.out.println ("Enter the "+ (i+1) + "number");
            arr[i] = sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0 ; i <n ;i++) {
            if (arr[i] > first){
            second = first;
            first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
        }   
        }
        System.out.println("Largest number: " + first);
        System.out.println("Second largest number: " + second);
        return first; 
    }
        public static void main (String[]args){
            int largest = max();
        System.out.println("Returned largest number: " + largest);
    }
}