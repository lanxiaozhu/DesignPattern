package com.moyu.pattern.handle;

import com.moyu.pattern.domain.Produce;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 15:57
 * @Description: 审批 抽象类
 */
public abstract class Approver {
    public Approver nextApprover;//下一个审批者对象
    public String name;//审批者名字

    public Approver(String name){
        this.name = name;
    }
    //创建 下级链路
    public void setNextApprover(Approver approver){
        this.nextApprover = approver;
    }


    /**
     * 抽象方法 必须被 ConcreteHandle（具体处理） 类实现
     */
    public abstract void handlePurChaseRequest(Produce produce);
}
