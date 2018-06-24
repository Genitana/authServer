package com.robert.test.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] arr){
        qsort(arr, 0, arr.length-1);
    }
    private static void qsort(int[] arr, int low, int high){
        if (low < high){                          //数组长度大于等于2就继续分，否则跳出递归
            int pivot=partition(arr, low, high);        //将数组分为两部分
            qsort(arr, low, pivot-1);                   //递归排序左子数组
            qsort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }
    private static int partition(int[] arr, int low, int high){
        int key = arr[low];     //枢轴记录
        while (low<high){
            while (low<high && arr[high]>=key) --high;
            arr[low]=arr[high];             //交换比枢轴小的记录到左端
            while (low<high && arr[low]<=key) ++low;
            arr[high] = arr[low];           //交换比枢轴大的记录到右端
        }
        //扫描完成，枢轴到位
        arr[low] = key;
        //返回的是枢轴的位置
        return low;
    }

    public static void main(String[] args){
         int[] num={3,5,3,5,7,3,6,8,3,7,4,7,3,8,2,4};
         quickSort(num);
         System.out.println(Arrays.toString(num));
    }
}
