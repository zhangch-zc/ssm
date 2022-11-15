/**
 * Author：zhangch
 * Expression:
 * 2022/11/15
 */
public class QuickSort_1 {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,9,8,1,4};
        quickSort(a, 0, a.length - 1);
        Utils.printArray(a);
    }

    private static void quickSort(int[] a, int s, int e){
        if (s >= e){
            return;
        }
        int base = partition(a,s,e);
        quickSort(a,s,base-1);
        quickSort(a,base+1,e);
    }

    private static int partition(int[] a, int s, int e) {
        int i = s;
        for (int j = i; j < e; j++) {
            if (a[j] < a[e]){
                Utils.swap(a, i, j);
                i++;
            }
        }
        Utils.swap(a, i, e);
        return i;
    }
}
