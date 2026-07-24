import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = 6;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Elements are : " + arr[i] + " and " + arr[j]);
                    System.out.println("Indices are : " + i + " and " + j);

                    return;
                }
            }
        }
        System.out.println("NO pair found");
    }
}