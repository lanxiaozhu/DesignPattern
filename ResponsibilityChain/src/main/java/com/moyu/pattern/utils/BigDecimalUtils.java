package com.moyu.pattern.utils;

import java.math.BigDecimal;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 16:11
 * @Description:
 */
public class BigDecimalUtils {

    /**
     * 金额小于等于 上限时  允许审批
     * @return
     */
    public static boolean compare(BigDecimal apply,BigDecimal allow){
        System.out.println(apply.compareTo(allow));
        return apply.compareTo(allow) > 0 ? false : true;
    }
}
