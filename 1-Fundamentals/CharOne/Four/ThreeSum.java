package Sw.CharOne.Four;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.Contract;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by MiMO on 2016/10/24.
 */
public class ThreeSum {
    private static int[] a;

    static int[] list = new int[1000];
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("File/8Kints.txt");
        Scanner input = new Scanner(file);

        System.out.println("Start");
        for (int i = 0; i < 1000; i++) {
            list[i] = input.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == -list[j]){
                System.out.print(list[i] + " ");
                }
            }
        }
        System.out.println("Invoke counts function");

        //int[] a = In.readInts(args[0]);
        StdOut.println(countTwo(list));
    }


    public static int count(int[] a) {
        ThreeSum.a = a; // Count triples that sum to 0.
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }


    public static int countTwo(int[] a) {
        // Count pairs that sum to 0.
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            if (BinarySearch.rank(-a[i], a) > i)
                cnt++;
        return cnt;
    }

    public static int countThreeFast(int[] a)
    { // Count triples that sum to 0.
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < N; j++)
                if (BinarySearch.rank(-a[i]-a[j], a) > j)
                    cnt++;
        return cnt;
    }
}
