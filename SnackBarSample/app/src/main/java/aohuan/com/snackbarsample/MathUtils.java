package aohuan.com.snackbarsample;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/5/12 0012.
 */
public class MathUtils {
    public static double additionDouble(double num1, double num2){
        return new BigDecimal(num1 + num2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double multiplicationDouble(double num1, double num2){
        return multiplicationDouble(num1, num2, 2);
    }
    public static double multiplicationDouble(double num1, double num2, int decimalWei){
        return new BigDecimal(num1 * num2).setScale(decimalWei, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static double jianDouble(double num1, double num2, int decimalWei){
        return new BigDecimal(num1 - num2).setScale(decimalWei, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double getDouble(double value){
        return getDouble(value, 2);
    }


    public static double getDouble(double value, int decimalWei){
        return new BigDecimal(value).setScale(decimalWei, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static double chuDouble(double num1, double num2){
        return chuDouble(num1, num2, 7);
    }
    public static double chuDouble(double num1, double num2, int decimalWei){
        return new BigDecimal(num1/num2).setScale(decimalWei, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
