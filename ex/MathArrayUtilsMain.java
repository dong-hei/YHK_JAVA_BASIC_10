package section8_static2.ex;

import static section8_static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] val = {4,3,1,6};
        System.out.println("sum = " + sum(val));
        System.out.println("ave = " + ave(val));
        System.out.println("min = " + min(val));
        System.out.println("max = " + max(val));
    }
}
