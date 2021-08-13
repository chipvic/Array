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

    public static boolean isPrimeNum(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static boolean checkPrimeArr(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrimeNum(arr[i])) {
                check = false;
                break;
            }
        }
        return check;

    }

    public static boolean checkAscArr(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static int count3a(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 4 == 0) && (arr[i] % 5 != 0)) {
                count += 1;
            }
        }
        return count;
    }

    public static int sumPrimeArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNum(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;

    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
    public static int findMaxIndex(int[] arr){
        int maxIndex =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]){
                maxIndex =i;
            }

        }
        return maxIndex;
    }

    public static int findFirstNegativeIndex(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                return i;
            }
        }
        return -1; // mảng không có phần tử nào bé hơn 0 => Không có phần tử Negative
    }

    public static int findLastPositiveIndex(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]>0){
                return i;
            }
        }
        return -1;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min=arr[i];
            }

        }
        return min;
    }

    public static int findMinPositiveIndex(int[] arr){
        int lastPosInx = findLastPositiveIndex(arr);
        if (lastPosInx<0) {
            return -1;
        }
    int minPosInx = lastPosInx;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 && arr[i]<arr[minPosInx]){
                minPosInx =i;
            }

        }

        return minPosInx;

    }

    public static int findMaxNegativeIndex(int[] arr){
        int maxNegInx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0 && (maxNegInx==-1 || arr[i]>arr[maxNegInx])){
                maxNegInx =i;
            }

        }
        return maxNegInx;

    }


}
