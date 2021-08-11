import java.util.Scanner;

public class BaiTH5 {

    public static int inputNumInt() {
        Scanner myInt = new Scanner(System.in);
        int numInt = myInt.nextInt();
        return numInt;

    }

    public static int[] generateArr(int n, int min, int max) {
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return ret;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d ,", arr[i]);
        }
        System.out.println();
    }

    static boolean isPrimeNum(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    static boolean checkPrimeArr(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrimeNum(arr[i])) {
                check = false;
                break;
            }
        }
        return check;

    }

    static boolean checkAscArr(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int count3a(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 4 == 0) && (arr[i] % 5 != 0)) {
                count += 1;
            }
        }
        return count;
    }

    static int sumPrimeArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNum(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;

    }


}
