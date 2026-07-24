// Dynamic Array (Size not fixed)

import java.util.*;

public class DynamicArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter -1  for exit");
        while(true){
            int input = sc.nextInt();

            if(input == -1){
                break;
            }
            arr.add(input);
        }
        System.out.println("Elements in array are : " +arr);
    }
}