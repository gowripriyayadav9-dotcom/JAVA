import java.util.Scanner;
class Binary_Search{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int num = sc.nextInt();
        System.out.println("Enter the array : ");
        int [] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr [i] = sc.nextInt();
        }
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        int low = 0; int high = num-1;
        int result = -1;
        while (low <= high){
            int mid = (low+ high) /2;
        if(arr[mid] == target){
            result = mid;
            break;
          }
          else if (arr[mid] <= target){
            low = mid+1;
          }
          else {
            high = mid-1;
          }
        }
        if(result == -1){
            System.out.println("no,the target not found");
        }
        else{
            System.out.println("yes,the ttarget is found at index " + result);
        }
    }
}