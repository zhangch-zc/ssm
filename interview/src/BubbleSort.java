import java.util.Arrays;

/**
 * Author：zhangch
 * Expression:冒泡排序
 * 2022/11/9
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,2,7,4,1,3,8,9};
        bubble(a);
        System.out.println("---------------------");
        System.out.println(Arrays.toString(a));
    }

    private static void bubble(int[] a) {
        int n = a.length - 1;
        while (true){
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > a[i + 1]){
                    Utils.swap(a, i, i+1);
                    last = i;
                }
            }
            System.out.println(Arrays.toString(a));
            n = last;
            if (n == 0){
                break;
            }
        }
    }


}
