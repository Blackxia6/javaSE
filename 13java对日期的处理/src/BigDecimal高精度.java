import java.math.BigDecimal;

/**
 * @date 2022/9/18 - 15:16
 */
public class BigDecimal高精度 {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(100);//精度极高的100
        BigDecimal bd1 = new BigDecimal(200);//精度极高的100
        BigDecimal bd3 = bd.add(bd1);//调用方法求和
        System.out.println(bd3);
    }
}
