package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc;
            sc = new Scanner(System.in);
        System.out.println("请输入待排序的数组长度：");
        int m=sc.nextInt();
                int[] number=new int[m];
                System.out.println("请输入待排序的数组：");
                for(int i=0;i<m;i++){
                    number[i]=sc.nextInt();
                }
                insertSort(number);
                System.out.println("插入排序结果：");
                System.out.println(Arrays.toString(number));

        }
    public static void insertSort(int [] arr){
        for(int sortedIndex=0;sortedIndex<arr.length;sortedIndex++){
            int currentSortIndex=sortedIndex+1;
            int i=sortedIndex;
            for(int j=currentSortIndex;j<arr.length&&j>=0&&i>=0;j--){
                if(arr[j]<arr[i]){
                    swap(arr,i--,j);
                }else {
                    break;
                }
            }
        }
    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
