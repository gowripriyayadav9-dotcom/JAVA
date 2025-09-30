import java.util.Scanner;
class Besttime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur size of an array : ");
        int arr_siz = sc.nextInt();
        System.out.println("Enter the " + arr_siz + "number in array : ");
        int [] arr = new int [arr_siz];
        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int pro = Integer.MAX_VALUE;
    int profit = 0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]<pro){
                pro = arr[i];
            }
            else if(arr[i]-pro>profit){
                profit = arr[i]-pro;
                }
            }
        }
            System.out.println("profit : " + profit);
    }
}