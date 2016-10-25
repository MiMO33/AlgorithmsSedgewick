package Sw.CharOne.Four;

import edu.princeton.cs.algs4.BinarySearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by MiMO on 2016/10/25.
 * 仍然有问题，foreach还是没有理解，为什么在40行上下两个for语句会产生不一样的结果
 * 另外，这段代码的空间复杂度也不太一样，如果用二分法搜索，空间复杂度应该是log级别的
 * 如果想变成liner级别，还是遍历靠谱一些
 * 擦，foreach是怎么实现的啊
 */


public class EX_1_4_8 {
    static int[] list = new int[1000];

    public static void main(String[]args) throws FileNotFoundException {

        File file = new File("File/1Kints.txt");
        Scanner input = new Scanner(file);
        for (int i = 0; i < 1000; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Start");

        Arrays.sort(list);
        for (int i = 0; i < 1000; i++) {
            System.out.println(list[i]);
        }
        int count = 0;
        for (int i = 0; i < 1000 - 1; i++) {
            if(list[i] == list[i + 1]){
                count++;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if(BinarySearch.rank(i,list) >= i){
                System.out.println(BinarySearch.rank(list[i],list));
            }
        }
        for (int i: list) {
            if (BinarySearch.rank(i,list) > i)
                System.out.println(BinarySearch.rank(i,list) + "num is" + i);
                count++;
        }
        System.out.println("count is " + count);
    }
}
