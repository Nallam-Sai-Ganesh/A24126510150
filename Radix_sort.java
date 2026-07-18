import java.util.*;
public class Radix_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        radixSort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    static void radixSort(int []a,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]);
        }
        for(int exp=1;max/exp>0;exp*=10){
            countingSort(a,n,exp);
        }
    }
    static void countingSort(int []a,int n,int exp){
        int []b=new int[n];
        int []count=new int[10];
        for(int i=0;i<n;i++){
            count[(a[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            b[--count[(a[i]/exp)%10]]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
    }
}