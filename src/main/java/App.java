public class App {
    public static void main(String[] args) {
// Bai 2b: Mảng có phải là mảng toàn là số nguyên tố
        System.out.println("Nhập số phần tử mảng muốn tạo: ");
        int n = BaiTH5.inputNumInt();
        System.out.println("Nhập phần tử mảng nhỏ nhất: ");
        int min = BaiTH5.inputNumInt();
        System.out.println("Nhập phần tử mảng lớn nhất: ");
        int max = BaiTH5.inputNumInt();
        int[] arr = BaiTH5.generateArr(n, min, max);
        BaiTH5.printArr(arr);
        if (BaiTH5.checkPrimeArr(arr)) {
            System.out.println("Tất cả phần tử của mảng đều là số nguyên tố");
        } else {
            System.out.println("Mảng có chứa phần tử không phải số nguyên tố");
        }

//// Bài 2c: Mảng có phải là mảng tăng dần
//        if (BaiTH5.checkAscArr(arr)) {
//            System.out.println("Mảng tăng dần");
//        } else {
//            System.out.println("Mảng không tăng dần");
//        }
//
//// Bài 3a: Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
//        int count = BaiTH5.count3a(arr);
//        System.out.format("Có %d số chia hết cho 4 nhưng không chia hết cho 5", count);
//        System.out.println();
//
//// Bài 3b: Tổng các số nguyên tố trong mảng
//        int sum = BaiTH5.sumPrimeArr(arr);
//        System.out.format("Tổng các số nguyên tố trong mảng là %d",sum);


        // Bài
        int maxNum = BaiTH5.findMax(arr);
        System.out.println("Phần tử max của mảng: "+maxNum);

        int minNum = BaiTH5.findMin(arr);
        System.out.println("Phần tử min của mảng: "+minNum);

        int maxNumIndex = BaiTH5.findMaxIndex(arr);
        System.out.format("Max = %d, Index = % d ",maxNum,maxNumIndex);
        System.out.println();

        int negativeIndex = BaiTH5.findFirstNegativeIndex(arr);
        if (negativeIndex >= 0) {
            System.out.format("FirstNegativeIndex = %d", negativeIndex);
            System.out.println();
        } else {
            System.out.println("Không có phần tử âm");
        }

        int positiveIndex = BaiTH5.findLastPositiveIndex(arr);
        if (positiveIndex >= 0) {
            System.out.format("LastPositiveIndex = %d", positiveIndex);
            System.out.println();
        } else {
            System.out.println("Không có phần tử dương");
        }


        int minPosInx = BaiTH5.findMinPositiveIndex(arr);
        if (minPosInx >= 0) {
            System.out.format("MinPositiveIndex = %d", minPosInx);
            System.out.println();
        } else {
            System.out.println("Không có phần tử dương");
        }

        int maxNegInx = BaiTH5.findMaxNegativeIndex(arr);
        if (maxNegInx >= 0) {
            System.out.format("MaxNegativeIndex = %d", maxNegInx);
            System.out.println();
        } else {
            System.out.println("Không có phần tử âm");
        }




    }
}
