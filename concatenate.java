import java.util.*;

public class Concatenate {

    public static void main(String[] args) {
        // Sample arrays
        Scanner sc=new Scanner(System.in);
        {
        System.out.print("Enter the size of the array1: ");
        int size1=sc.nextInt();
        System.out.print("Enter the size of the array2: ");
        int size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        int arr3[]=new int[size1+size2];
        System.out.print("Enter the elements of arr1: ");
        for(int i=0;i<size1;i++)
         arr1[i]=sc.nextInt();
        System.out.print("Enter the elements of arr2: ");
        for(int i=0;i<size2;i++)
         arr2[i]=sc.nextInt();
         System.out.print("Array 1: ");
         for(int i=0;i<size1;i++)
         System.out.print(arr1[i]+" ");
         System.out.print("\nArray 2: ");
         for(int i=0;i<size2;i++)
         System.out.print(arr2[i]+" ");
        System.out.print("\nConcatenated array: ");
        int k=0;
        for(int i=0;i<size1;i++)
         arr3[k++]=arr1[i];
        for(int i=0;i<size2;i++)
         arr3[k++]=arr2[i];
         for(int i=0;i<size1+size2;i++)
         System.out.print(arr3[i]+" ");
        }
    }
}
        
        
       
