/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

/**
 *
 * @author DELL
 */
public class SecLarge {
    public static void main(String[] args) {
        int arr[]={ 10,40,23,45,60,57};
        int size=arr.length;
        int temp;
        for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
          {
              if(arr[i]>arr[j])
              {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
          
        }
        System.out.println(arr[size-2]);
        
    }
    
}
