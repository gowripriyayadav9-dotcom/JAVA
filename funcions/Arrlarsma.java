import java.util.Scanner;
public class Arrlarsma {
    public static void find (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter ur desird number : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MIN_VALUE;
        for (int i = 0 ; i <n ; i++){
            System.out.println ("Enter element "+(i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            if (arr[i] > highest){
                highest = arr[i];
            }
            if (arr[i] < lowest){
                lowest = arr[i];
            }
        }
            System.out.println("Highest_value : " + highest);
            System.out.println("lowest_value : " + lowest);
        }
        public static void main (String[]args){
           find ();
        }
    }
