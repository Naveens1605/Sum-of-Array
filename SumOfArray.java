package sumofarray;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int sizeOfArray = in.nextInt();
        int array[] = new int[sizeOfArray];
        int sum=0;
        System.out.println("Enter elements in Array :");
        for(int i=0; i<sizeOfArray;i++){
            array[i] = in.nextInt();
            sum += array[i];
        }
    System.out.println(sum);
}
}
