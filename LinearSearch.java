import java.util.*;

public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Start Entering the elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements are : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        int target = 5;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                System.out.println("Target Found : " + arr[i]);
                return;
            }
        }
        System.out.println("Target not found!");
    }
}