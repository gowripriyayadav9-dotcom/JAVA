import java.util.Scanner;
class Max_sub {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array u want : ");
        int n = sc.nextInt();
        System.out.println("Enter the array " + n + "numbers : ");
        int [] arr  = new int[n];
        for (int i = 0;i < n;i++){
        arr[i] = sc.nextInt(); 
        }
        int max_num = arr[0];
        int cur_num = arr[0];
        for (int i = 0;i < arr.length;i++){
            cur_num = Math.max(arr[i],cur_num + arr[i]);
            max_num = Math.max(cur_num,max_num);
        }
        System.out.println("the maximum sub array  is  : " + max_num);
        }
    }