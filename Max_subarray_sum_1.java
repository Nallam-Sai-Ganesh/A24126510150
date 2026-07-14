import java.util.*;
public class Max_subarray_sum_1{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    int cs=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        cs=Math.max(arr[i],cs+arr[i]);
        maxSum=Math.max(maxSum,cs);
    }
    System.out.println("\n"+maxSum);
    sc.close();
}
}