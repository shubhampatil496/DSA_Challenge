public class SecondMax{
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int firstMax = arr[0];
        int secondMax = arr[1];

        if (secondMax > firstMax) {
            int temp = firstMax;
            firstMax = secondMax;
            secondMax = temp;
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Maximum = " + firstMax);
        System.out.println("Second Maximum = " + secondMax);
    }
}