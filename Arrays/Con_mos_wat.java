import java.util.Scanner;
public class Con_mos_wat {
    //private static String water;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the height : ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " of the number  : ");
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxwater = 0;
        int height1 = 0 , height2 = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<i+1;j++){
                int height =  Math.min(arr[i],arr[j]);
                int width = j-i;
                int water = width * height; 
                if (water > maxwater){
                maxwater = water;
                height1 = arr[i];
                height2 = arr[j];
                }
            }
        }
           System.out.println("The max water contained is : " + maxwater);
        System.out.println("Formed between heights " + height1 + " and " + height2);
    }
}
