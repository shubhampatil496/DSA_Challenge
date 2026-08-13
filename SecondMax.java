import java.util.*;

public class SecondMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Start Entering The Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            if(arr[i] >= firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] >= secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("Second Max is : " + secondMax);
    }
}