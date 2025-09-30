import java.util.Scanner;
class Max_pro_sub {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array u want : ");
        int n = sc.nextInt();
        System.out.println("Enter the array " + n + "numbers : ");
        int [] arr  = new int[n];
        for (int i = 0;i < n;i++){
        arr[i] = sc.nextInt(); 
        }
        int temp_max = arr[0];
        int temp_min = arr[0];
        int result = arr[0];
        for (int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int new_max = Math.max(curr,Math.max(curr*temp_max,curr*temp_min));  
            int new_min = Math.min(curr,Math.min(curr*temp_max,curr*temp_min));
            temp_max = new_max;
            temp_min = new_min;
        } 
        result = Math.max(result,temp_max);
        System.out.println("the maximum sub array  is  : " + result);
        }
    }