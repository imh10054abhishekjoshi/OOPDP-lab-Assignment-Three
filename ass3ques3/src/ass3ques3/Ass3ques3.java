/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ass3ques3;
import java.util.Arrays;
import java.util.Scanner;
public class Ass3ques3 {

    public static void displaytotalargu(int... numbers){
        System.out.println("Total number of arguments is: " + numbers.length);
    }
    public static int findMax(int... numbers){
        if (numbers.length == 0){
            throw new IllegalArgumentException("No arguments provided");
        }
        int max = numbers[0];
        for(int num: numbers){
            if (num> max){
                max = num;
            }
        }
        return max;
    }
    public static int calculatesum(int... numbers){
        int sum =0;
        for(int num: numbers){
            sum += num;
        }
        return sum;
    }
    public static void checkvarargs(Object... args){
        for(Object arg: args){
            System.out.println("Argument: " + arg);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by spaces for total arguments: ");
        int[] totalArgsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        displaytotalargu(totalArgsInput);
        System.out.print("Enter integers separated by spaces to find the maximum: ");
        int[] maxArgsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxNumber = findMax(maxArgsInput);
        System.out.println("Maximum number: " + maxNumber);
        System.out.print("Enter integers separated by spaces to calculate the sum: ");
        int[] sumArgsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = calculatesum(sumArgsInput);
        System.out.println("Sum of elements: " + sum);
        System.out.print("Enter the different types of arguments separated by spaces: ");
        Object[] varArgsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .toArray();
        checkvarargs(varArgsInput);
    }
}