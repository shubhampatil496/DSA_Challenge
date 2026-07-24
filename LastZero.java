import java.util.*;

public class LastZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < n){
            arr[index] = 0;
            index++;
        }

        System.out.println("After : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}