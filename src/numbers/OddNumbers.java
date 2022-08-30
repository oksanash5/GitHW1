package numbers;

public class OddNumbers {
    public static void main(String[] args) {
        //print odd numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}