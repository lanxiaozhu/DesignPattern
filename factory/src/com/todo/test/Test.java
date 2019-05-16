package com.todo.test;

import com.todo.Center;
import com.todo.factory.Factory;
import com.todo.subordinatea.AColours;
import com.todo.subordinatea.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		Factory f=new Factory();//普通
		f.print("BlackAndWhite").detail();
		
		AbstractFactory af=new AColours();
		af.printFactory().detail();//抽象

		//自己的理解普通工厂
		//我去工厂说 老板今天我要彩色报纸
		Factory factory = new Factory();
		//老板回去问下属：有没有彩色颜料？ 下属说：有。boss 发令制作彩色报纸
		Center center = factory.print("colours");
		//彩色报纸制作完毕，送到报社，发布
		center.detail();

	}

}
