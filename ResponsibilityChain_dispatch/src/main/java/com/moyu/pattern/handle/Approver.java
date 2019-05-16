package com.moyu.pattern.handle;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.handle.dispatch.CaseChain;
/**
 * @Auther: wishm
 * @Date: 2019/5/15 15:57
 * @Description:  审批 抽象类
 */
public abstract class Approver {

    /**
     * 抽象方法 必须被 ConcreteHandle（具体处理） 类实现
     */
    public abstract void handlePurChaseRequest(Produce produce, CaseChain caseChain);
}
