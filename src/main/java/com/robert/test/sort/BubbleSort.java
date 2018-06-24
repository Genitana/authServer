package com.robert.test.sort;

import java.util.Arrays;

public class BubbleSort {



    /**
     * 冒泡排序 ，从小到大
     * @param num
     * @return
     */
    public static int[]  bubble2(int[] num){
        int temp ;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length -i -1 ;j++){
                //始终把大的往最后放，i=0的第一遍就会把最大的数放到最后面
                if(num[j]>num[j+1]){
                    temp = num[j];
                    num[j]= num[j+1];
                    num[j+1]=temp ;
                }
            }
        }
        return num;
    }



    public static void main(String[] args) {
        int[] a = {2, 7, 8, 2, 2, 4, 6, 5};
        int[] sort = bubble2(a);

            System.out.println(Arrays.toString(sort));
    }
}
