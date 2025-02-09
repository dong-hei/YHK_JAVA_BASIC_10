package section8_static2;

/**
 * static 메서드1
 */

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "Hello Universe";
        String deco = DecoUtil2.deco(s); //static 사용하여 별도의 인스턴스없이 클래스를 즉시 호출

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
