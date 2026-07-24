import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,4,5,7,8,9};
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length-1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target){
                System.out.println("Target is found : " + mid);
                return;
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}