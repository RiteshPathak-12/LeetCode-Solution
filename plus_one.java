
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
