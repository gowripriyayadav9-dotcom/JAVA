import java.util.Scanner;
public class Three_sum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of arrays u want ;  ");
        int n = sc.nextInt();
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        System.out.println("Enter the " + n + "number : ");
        int [] arr = new int[n];
        boolean is_found = false;
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                    System.out.println("found arr["+ i +"] +" + arr[i] + "+arr[" + j + "]" + arr[j] + "arr[" + k + "]" + arr[k] + "=" + target);
                    is_found = true;    
                }
                }
            }
        }
        if (!is_found){
        System.out.println("is_found");
        }
        sc.close();
    }
}
