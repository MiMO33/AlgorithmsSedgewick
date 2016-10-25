package Sw.CharOne.One;


import edu.princeton.cs.algs4.StdOut;
import java.util.Scanner;

/**
 * Created by MiMO on 2016/10/20.
 */
public class Euclid {
    public static void main(String[]args) {
        tsetHistogram();
    }
    private static void tsetHistogram(){
        //生成所需数列并调用函数
        Scanner input = new Scanner(System.in);
        StdOut.println("Please input the lengh of the list .");
        int m = input.nextInt();

        int list[] = new int[m];
        for (int i = 0; i < m; i++) {
            list[i] = (int)(Math.random() * m);
        }
        System.out.println("The test arrray is : ");
        for (int i :list) {
            System.out.print(i + " ");
        }
        System.out.println("Invoke targe function : ");
        int []result = histogram(list,m);
        for (int i :result) {
            System.out.print(i + " ");
        }

        //如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length 相等
        int sum  = 0;
        for (int i:result) {
            sum += i;
        }
        System.out.println();
        if(sum == list.length) {
            System.out.println("Success !");
        } else {
            System.out.println("failed !");}
    }

    private static int[] histogram(int[]list,int m){
        /*编写一个静态方法histogram()，接受一个整型数组list[] 和一个整数M 为参数并返回一个大小
    *为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
    *之间，返回数组中所有元素之和应该和a.length 相等。
    * Write a static method histogram() that takes an array list[] of int values and
    *an integer M as arguments and returns an array of length M whose ith entry is the number
    *of times the integer i appeared in the argument array. If the values in a[] are all
    *between 0 and M–1, the sum of the values in the returned array should be equal to
    *a.length.
    */
        int[] table = new int[m];

        for (int i = 0; i < list.length; i++) {
            table[list[i]]++;
        }
        return table;
    }
    /*private static int lg(int n) {
        int targe = 1;
        int count = 0;
       while (targe * 2 <= n){
           targe *= 2;
           count++;
       }
        return count;
    }*/

}
