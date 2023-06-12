public class Main {

    public static void main(String[] args) {
        numbersDivisibleBy5();
    }

    public static void numbersDivisibleBy5() {

        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for( int i = 0; i < arr.length; i++) {
            if ((arr[i] % 5) == 0 && (arr[i] <= 150)) {
                System.out.println(arr[i]);
            }
        }


    }
}