/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author crism
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr = new int [16];
        
       for(int i = 0; i < arr.length; i++){
           Random rand = new Random();
           arr[i] = rand.nextInt(100);
       }
       
       quicksort(arr, 0, arr.length-1);
    }
        public static void quicksort(int [] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot);
            quicksort(arr, pivot+1, high);
        }
    }

    public static int partition(int [] arr, int low, int high){
        int i = low;
        int j = high;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];
        
        while(i < j){
            while(i < j && arr[i] < pivot) i++;
            while(i < j && arr[j] > pivot) j--;
            
            if(i < j){
                swap(arr, i, j);
//                i++;
//                j--;
            }
        }
        return j;
    }
    
    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
