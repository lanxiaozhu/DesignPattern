package com.moyu.pattern.client;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.handle.Approver;
import com.moyu.pattern.server.Director;
import com.moyu.pattern.server.President;
import com.moyu.pattern.server.VicePresident;

import java.math.BigDecimal;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 16:32
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        Approver a1,a2,a3;
        a1 = new Director("三号 主管");
        a2 = new VicePresident("二号 主管");
        a3 = new President("一号 主管");
        //创建审批链
        a1.setNextApprover(a2);
        a2.setNextApprover(a3);

        //创建单据
        Produce p1 = new Produce(1,"苹果手机",new BigDecimal(110));

        a1.handlePurChaseRequest(p1);
    }
}
