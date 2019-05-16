package com.moyu.pattern.server;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.handle.Approver;
import com.moyu.pattern.utils.BigDecimalUtils;
import com.moyu.pattern.handle.dispatch.CaseChain;
import com.moyu.pattern.utils.RessponsePattern;

import java.math.BigDecimal;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 16:27
 * @Description: 副 校长 主席 总统 ！！！都可以吧
 *                  审批金额 200万
 */
public class VicePresident extends Approver {

    private final BigDecimal approverAmount = new BigDecimal(200);


    @Override
    public void handlePurChaseRequest(Produce produce,CaseChain caseChain) {
        if (BigDecimalUtils.compare(produce.getAmount(), approverAmount)) {
            RessponsePattern.result(VicePresident.class.getSimpleName());
        } else {
            caseChain.handlePurChaseRequest(produce,caseChain);
        }
    }
}
