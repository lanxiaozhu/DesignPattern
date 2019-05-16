package com.moyu.pattern.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Auther: wishm
 * @Date: 2019/5/15 15:50
 * @Description: 产品
 */
public class Produce implements Serializable {


    private static final long serialVersionUID = 339765502328759545L;


    private int id;//主键Id
    private String name;//产品名称
    private BigDecimal amount;//金额

    public Produce() {
    }

    public Produce(int id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
