public class Main {

    public static void main(String[] args) {
        largestNumberOfArray();
    }

    public static void largestNumberOfArray() {

        int[] arr = {50, 15, 30, 5, 95, 200, 52};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}