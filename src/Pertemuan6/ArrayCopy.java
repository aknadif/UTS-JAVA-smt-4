/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;
public class ArrayCopy {
    public static void main(String[] args){
        int a[] = {1,8,3};
        int b[] = a.clone();
        b[0]++;
        System.out.println("Contents of a[] ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + "");
        System.out.println("\n\nContents of b[] ");
        for(int i=0; i<b.length; i++)
            System.out.print(b[i] + ""); 
    }}
