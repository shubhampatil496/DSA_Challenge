import java.util.*;

public class RemoveZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int Original[] = new int[n];
         for(int i=0; i<n; i++){
            Original[i] = sc.nextInt();
         }

         int count = 0;
         for(int i=0; i<n; i++){
            if(Original[i] != 0){
                count++;
            }
         }
         int NewArr[] = new int[count];

         int index = 0;
         for(int i=0; i<n; i++){
            if(Original[i] != 0){
                NewArr[index] = Original[i];
                index++;
            }
         }
         System.out.println("Aray After removing zero : ");
         for(int i=0; i<NewArr.length; i++){
            System.out.println(NewArr[i]);
         }

    }
}