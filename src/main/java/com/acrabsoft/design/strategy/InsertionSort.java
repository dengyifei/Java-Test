package com.acrabsoft.design.strategy;

public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];

                } else
                    break;
            }
            arr[j] = temp;
        }
        System.out.println("插入排序");
        return arr;
	}

}
