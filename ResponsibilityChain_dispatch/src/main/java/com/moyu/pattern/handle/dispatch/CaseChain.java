package com.moyu.pattern.handle.dispatch;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.handle.Approver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wishm
 * @Date: 2019/5/16 09:49
 * @Description: 链路负责人
 */
public class CaseChain extends Approver{

    // 所有 case 列表
    private List<Approver> mCaseList = new ArrayList<>();
    // 索引，用于遍历所有 case 列表
    private int index = 0;
    // 添加 case
    public CaseChain addBaseCase(Approver baseCase) {
        mCaseList.add(baseCase);
        return this;
    }


    @Override
    public void handlePurChaseRequest(Produce produce,CaseChain caseChain) {
        // 所有遍历完了，直接返回
        if (index == mCaseList.size()) return;
        // 获取当前 case
        Approver nextApprover = mCaseList.get(index);
        // 修改索引值，以便下次回调获取下个节点，达到遍历效果
        index++;
        // 调用 当前 case 处理方法
        nextApprover.handlePurChaseRequest(produce,this);
    }
}
