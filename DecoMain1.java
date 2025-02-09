package section8_static2;

/**
 * static 메서드1
 */
public class DecoMain1 {

    public static void main(String[] args) {
        String s = "Hello JAVA";
        DecoUtil ut = new DecoUtil();
        String deco = ut.deco(s);


        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
