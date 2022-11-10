import java.util.Arrays;

/**
 * Author：zhangch
 * Expression:
 * 2022/11/10
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,1,9,8,4};
        selectionSort(a);
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Utils.swap(a, i, minIndex);
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
