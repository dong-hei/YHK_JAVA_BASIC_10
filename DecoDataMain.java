package section8_static2;

import static section8_static2.DecoData.*;

/**
 * static 메서드2
 */
public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        // 여러번 쓰기 불편하면 import로 클래스명은 생략 가능하다. (단축키 Alt + Enter)

        System.out.println("2. 인스턴스 호출 1");
        DecoData d1 = new DecoData();
        d1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData d2 = new DecoData();
        d2.instanceCall();   
        
        
        System.out.println("3. static 메소드 호출");
        staticCall(d1);

        //추가
        //인스턴스를 통한 접근
        DecoData d3 = new DecoData();
        d3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();


    }
}
