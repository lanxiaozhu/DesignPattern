package com.gz.pro.demo.bean;

public class Agent {
    private int id;
    private int date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
