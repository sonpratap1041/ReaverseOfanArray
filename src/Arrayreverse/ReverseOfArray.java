package Arrayreverse;

import java.util.Scanner;

public class ReverseOfArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,b,j;
        System.out.println("enter the size of the array and entries");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(j=a.length-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}