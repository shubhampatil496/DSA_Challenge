import java.util.*;

public class Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Start Entering Elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before Sorting : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("After Sorting : ");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}