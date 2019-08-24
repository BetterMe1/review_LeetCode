package exercise.review_Leetcode;


public class Solution {
    public static void main(String[] args) {
        /*int[] arr = {2, 3, 1, 0, 2, 5};
        int[] dup = new int[1];
        System.out.println(duplicate(arr,arr.length,dup));
        System.out.println(dup[0]);*/

        /*int[][] arr = {{1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                    {18, 21, 23, 26, 30}};
        System.out.println(find(arr,13));
        System.out.println(find(arr,19));*/

        String str = "AB C d eue  e   hfb ";
        System.out.println(replace(str));
    }
    //数组中重复的数字
    //时间复杂度：O（n)
    /**
     * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
     * 请找出数组中任意一个重复的数字。
     * @param arr
     * @param length
     * @param dup
     * @return
     */
    public static boolean duplicate(int[] arr, int length, int[] dup){
        if(arr == null ||arr.length == 0){
            return false;
        }
        for(int i=0; i<length; i++){
            while(arr[i] != i){
                if(arr[i] == arr[arr[i]]){
                    dup[0] = arr[i];
                    return true;
                }
                swap(arr,i,arr[i]);
            }
        }
        return false;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    //二维数组中的查找
    /**
     * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
     * 时间复杂度：O（M+N）
     */
    public static boolean find(int[][] arr,int num){
        if(arr == null ||arr.length == 0 || arr[0].length == 0){
            return false;
        }
        int r = 0;
        int c = arr[0].length-1;
        while (r<arr.length && c>=0 ){
            if(num==arr[r][c]){
                return true;
            }else if(num <arr[r][c]){
                c--;
            }else {
                r++;
            }
        }
        return false;
    }
    public static String replace(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == ' '){
                sb.replace(i,i+1,"%20");
                i+=2;
            }
        }
        return sb.toString();
    }

}

