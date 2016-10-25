package Sw.CharOne.Two;

import edu.princeton.cs.algs4.*;
import javafx.scene.effect.Light;

/**
 * Created by MiMO on 2016/10/21.
 */
public class Ex_1 {
    public static void main(String[] args)
    {
        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        int T = Integer.parseInt(args[4]);
        Interval1D x = new Interval1D(xlo, xhi);
        Interval1D y = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(x, y);
        box.draw();
        Counter c = new Counter("hits");

        StdOut.println(c);
        StdOut.println(box.area());
    }
}
