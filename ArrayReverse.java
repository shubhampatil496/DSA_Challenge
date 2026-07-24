import java.util.*;

public class ArrayReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements are : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Array After Reverse : ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}