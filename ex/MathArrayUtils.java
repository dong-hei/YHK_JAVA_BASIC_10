package section8_static2.ex;

public class MathArrayUtils {
    
    private MathArrayUtils(){
        //인스턴스 생성을 private으로 막음
    }
    
    public static int sum(int[] val){
        int total = 0;
        for (int value : val) {
            total += value;
        }
        return total;
    }

    public static double ave(int[] val){
        return (double) sum(val) / val.length;
    }

    public static int min(int[] val){
        int minVal = val[0];
        for (int value : val) {
            if (value < minVal) {
                minVal = value;
            }
        }
        return minVal;
    }

    public static int max(int[] val){
        int maxVal = val[0];
        for (int value : val) {
            if (value > maxVal) {
                maxVal = value;
            }
        }
        return maxVal;
    }
}
