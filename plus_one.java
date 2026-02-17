/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].


Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/
import java.util.Scanner;

public class plus_one {
    public static  int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int newArray[]=new int[digits.length+1];
        newArray[0]=1;
        return newArray;
    }
    public static void main(String arg[]){
        System.out.println("Enter the size of the array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array after adding 1 in it  are :- ");
        int result[]=plusOne(a);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
