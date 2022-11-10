import java.util.Arrays;

/**
 * Author：zhangch
 * Expression:
 * 2022/11/10
 */
public class Utils {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
