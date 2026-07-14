import java.util.*;
public class Counting_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int k=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            k=Math.max(k,a[i]);
        }
        int []count=new int[k+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        for(int i=1;i<k+1;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            b[--count[a[i]]]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        sc.close();

    }
}