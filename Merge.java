package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=obj.nextInt();
        int[] arr1=new int[m];
        System.out.println("Enter array1 elements:");
        for(int i=0;i<m;i++) {
        	arr1[i]=obj.nextInt();
        }
        System.out.print("Enter n:");
        int n=obj.nextInt();
        int[] arr2=new int[n];
        System.out.println("Enter array2 elements:");
        for(int i=0;i<n;i++) {
        	arr2[i]=obj.nextInt();
        }
     // Call the merge function
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Function to merge two arrays
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        // Create a new array with a size equal to the sum of the two arrays
        int[] result = new int[length1 + length2];

        // Copy elements from both arrays into the result array
        System.arraycopy(array1, 0, result, 0, length1);
        System.arraycopy(array2, 0, result, length1, length2);

        return result;
    }
}   
