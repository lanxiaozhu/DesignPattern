package com.moyu.pattern.client;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.server.Director;
import com.moyu.pattern.server.President;
import com.moyu.pattern.server.VicePresident;
import com.moyu.pattern.handle.dispatch.CaseChain;

import java.math.BigDecimal;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 16:32
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        CaseChain caseChain = new CaseChain();
        caseChain.addBaseCase(new Director())
                .addBaseCase(new VicePresident())
                .addBaseCase(new President());

        Produce p1 = new Produce(1,"苹果手机",new BigDecimal(200));
        caseChain.handlePurChaseRequest(p1,caseChain);
    }
}
