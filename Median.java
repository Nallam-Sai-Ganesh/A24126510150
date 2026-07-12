import java.util.Arrays;

public class Median {
    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        int[] arr = new int[nums1.length + nums2.length];

        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            arr[index] = nums1[i];
            index++;
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[index] = nums2[i];
            index++;
        }
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0) {
            double median = (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
            System.out.println("Median = " + median);
        } else {
            double median = arr[n / 2];
            System.out.println("Median = " + median);
        }
    }
}