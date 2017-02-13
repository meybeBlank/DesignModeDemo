package com.example.ffengz.designmode;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by ffengz.
 *
 * BigDecimal 精度运算
 */
public class BigDecimalTest {

    private static BigDecimalTest mInstance = new BigDecimalTest();
    private BigDecimalTest(){}
    public static BigDecimalTest newInstance(){
        return mInstance;
    }

    /**
     * 对小数进行精度控制
     * @param s  小数对应String
     * @param precisiion  保留精度 包换整数位所有的位数
     *                    即 1.2222 和 11.2222 同为 3
     *                    分别得到 1.22 和 11.2
     */
    public BigDecimal testScale(String s, int precisiion){
        return new BigDecimal(s, new MathContext(precisiion));
    }

    /**
     * 乘法测试
     * @param a 乘数 a
     * @param b 乘数 b
     * @param precisiion 精度 为0默认精度
     */
    public BigDecimal testMultiply(String a, String b, int precisiion){
        BigDecimal ba = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return precisiion == 0 ? ba.multiply(bb) : ba.multiply(bb,new MathContext(precisiion));
    }

    /**
     * 除法测试
     * @param a 除数 a
     * @param b 被除数 b
     * @param precisiion 精度 为0默认精度
     */
    public BigDecimal testDivide(String a, String b, int precisiion){
        BigDecimal ba = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return precisiion == 0 ? ba.divide(bb) : ba.divide(bb,new MathContext(precisiion));
    }
}
