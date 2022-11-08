/**
 * Author：zhangch
 * Expression:
 * 2022/11/8
 */
public class BinarySearch {
    public static void main(String[] args) {
//        int[] array = {1,5,8,11,19,22,31,35,40,45,48,49,50};
        int[] array = {1,2,3,4};
        int target = 4;
        int index = binarySearch(array,target);
        System.out.println(index);
    }

    private static int binarySearch(int[] array, int target) {
        int L = 0,R = array.length - 1,M;
        int times = 0;
        while (L <= R){
//            M = L + (R - L) / 2;
            M = (L + R) >>> 1;
            times++;
            if (target == array[M]){
                System.out.println("times = " + times);
                return M;
            }else if (target < array[M]){
                R = M - 1;
            }else{
                L = M + 1;
            }
        }
        return -1;
    }
}
