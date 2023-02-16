/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ritik;

import java.io.*;
import java.util.*;
public class minSwap {
	public int minSwaps(int[] arr, int N)
	{
		int ans = 0;
		int[] temp = Arrays.copyOfRange(arr, 0, N);
		Arrays.sort(temp);
		for (int i = 0; i < N; i++) {
			if (arr[i] != temp[i]) {
				ans++;
				swap(arr, i, indexOf(arr, temp[i]));
			}
		}
		return ans;
	}
	public void swap(int[] arr, int i, int j)
	{
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	public int indexOf(int[] arr, int ele)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}
}

class Main {

		public static void main(String[] args) throws Exception
	{
		int[] a
			= { 5,4,3,2,1 };
		int n = a.length;
		System.out.println(new minSwap().minSwaps(a, n));
	}



}
