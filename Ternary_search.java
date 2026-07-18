import java.util.Scanner;

public class Ternary_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int l = 0;
        int r = arr.length - 1;
    
        
        while(l<=r) {
            int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;
            if (arr[mid1] == key) {
                
                System.out.println("Element found at index: " + mid1);
                return;
            }
            if (arr[mid2] == key) {
                
                System.out.println("Element found at index: " + mid2);
                return;
            }
            if (key < arr[mid1]) {
                r = mid1 - 1;
            } else if (key > arr[mid2]) {
                l = mid2 + 1;
            } else {
                l = mid1 + 1;
                r = mid2 - 1;
            }
            
        }
        sc.close();
    System.out.println("Element not found");
    
}
}
