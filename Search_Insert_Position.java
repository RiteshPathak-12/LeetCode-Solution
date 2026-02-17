/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4 */

import java.util.Scanner;

public class Search_Insert_Position {
    public static int search(int a[],int target){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                return mid;
            }else if(a[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.err.println("Enter the target element : ");
        int target=sc.nextInt();
        System.out.println("Index of the target element are "+search(a,target));
    }
}
