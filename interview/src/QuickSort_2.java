/**
 * Author：zhangch
 * Expression:
 * 2022/11/16
 */
public class QuickSort_2 {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,9,8,1,4};
        quick(a,0,a.length - 1);
        Utils.printArray(a);
    }

    private static void quick(int[] a, int s, int e) {
        if (s >= e){
            return;
        }
        int base = partition(a,s,e);
        quick(a, s, base - 1);
        quick(a, base + 1, e);
    }

    private static int partition(int[] a, int s, int e) {
        int pv = a[s];
        int i = s;
        int j = e;
        while (i < j){
            while (a[j] >= pv && i < j){
                j--;
            }
            while (a[i] <= pv && i < j){
                i++;
            }
            Utils.swap(a, i, j);
        }
        Utils.swap(a, s, j);
        return j;
    }
}
