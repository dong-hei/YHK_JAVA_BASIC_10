package section8_static2;

/**
 * static 메서드2
 */
public class DecoData {

    private int instanceVal;
    private static int staticVal;

    public static void staticCall(){
//        instanceVal++; //인스턴스 변수에 접근 불가능 -> 왜? 참조값이 없으니 읽을수가 없다.
        staticVal++; // 정적 변수에 접근 -> 가능
        
        staticMethod(); // 정적 메소드 접근 -> 가능
//        instanceMethod(); // 인스턴스 메소드에 접근 불가능
    }
    public void instanceCall(){
        instanceVal++; //인스턴스 변수에 접근 가능
        staticVal++; // 정적 변수에 접근 -> 가능

        staticMethod(); // 정적 메소드 접근 -> 가능
        instanceMethod(); // 인스턴스 메소드에 접근 가능
    }

    //매개변수로 참조값을 넘겨 받는 경우는 static이여도 호출 할 수 있다.
    public static void staticCall(DecoData data){
        data.instanceVal++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceVal = " + instanceVal);
    }

    private static void staticMethod(){
        System.out.println("staticVal = " + staticVal);
    }

}
