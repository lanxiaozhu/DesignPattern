package com.moyu.pattern.server;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.handle.Approver;
import com.moyu.pattern.utils.BigDecimalUtils;
import com.moyu.pattern.handle.dispatch.CaseChain;
import com.moyu.pattern.utils.RessponsePattern;

import java.math.BigDecimal;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 16:03
 * @Description: 主任 审批金额 100万
 */
public class Director extends Approver {

    private final BigDecimal approverAmount = new BigDecimal(100);


    @Override
    public void handlePurChaseRequest(Produce produce,CaseChain caseChain) {
        if (BigDecimalUtils.compare(produce.getAmount(), approverAmount)) {
            RessponsePattern.result(Director.class.getSimpleName());
        } else {
            caseChain.handlePurChaseRequest(produce,caseChain);
        }
    }

}
