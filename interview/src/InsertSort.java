/**
 * Author：zhangch
 * Expression:
 * 2022/11/10
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {9,3,7,2,5,8,1,4};
        insetSort(a);
        System.out.println("----------------------------");
        Utils.printArray(a);
    }

    private static void insetSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int min = a[i];
            int j = i - 1;
            while (j >= 0){
                if (a[j] > min){
                    a[j + 1] = a[j];
                }else {
                    break;
                }
                j--;
            }
            a[j + 1] = min;
            Utils.printArray(a);
        }
    }
}
