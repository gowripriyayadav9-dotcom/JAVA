import java.util.Scanner;
class Twosum {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the target number : ");
    int target = sc.nextInt();
    System.out.println("Enter the desired number to take the length of an array :");
    int n = sc.nextInt();
    System.out.println("Enter the " + n + "array list : ");
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++){
       arr[i] = sc.nextInt();
    }
    boolean is_found = false;
    for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
        if(arr[i] + arr[j] == target){
            System.out.println(" arr["+ i +"] = " + arr[i] +  ", arr["+ j +"]  "+ arr[j]   + " = " + target);
            is_found = true;
        }
       }
    }
    if(!is_found){
       System.out.println("The target is not found in the array");
    }
}
}
