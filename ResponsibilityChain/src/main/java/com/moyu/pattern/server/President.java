package com.moyu.pattern.server;

import com.moyu.pattern.domain.Produce;
import com.moyu.pattern.handle.Approver;
import com.moyu.pattern.utils.RessponsePattern;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 16:29
 * @Description: 校长 主席 总统 ！！！都可以吧
 *                  审批金额 无上限  或者有上限，这是个值得考虑的问题
 */
public class President extends Approver {


    public President(String name) {
        super(name);
    }

    @Override
    public void handlePurChaseRequest(Produce produce) {
        RessponsePattern.result(President.class.getSimpleName(),this.name);

    }
}
