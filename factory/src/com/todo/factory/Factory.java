package com.todo.factory;

import com.todo.Center;
import com.todo.subordinate.BlackAndWhite;
import com.todo.subordinate.Colours;

public class Factory {
	/**
	 * @annotation 注文：简单工厂可扩展性不强，如果有需求，这个工厂类还需要继续扩展编写方法
	 * 好处：管理其中生成的对象。
	 * @param type
	 * @return
	 */
	public Center print(String type){
		if(type.equals("colours")){
			return new Colours();
		}else if(type.equals("BlackAndWhite")){
			return new BlackAndWhite();
		}else{
		System.out.println("您输入的有误---");
		return null;
		}
	}
	/**
	 * 多工厂:每个需要管理的对象生成一个工厂 ，称为多工厂
	 */
	public Center printColours(){
		return new Colours();
	}
	public Center printBlackAndWhite(){
		return new BlackAndWhite();
	}
	/**
	 * 静态工厂 和多工厂一样 不需要实例化直  接调用
	 */
	public static Center printColourss(){
		return new Colours();
	}
	public static Center printBlackAndWhites(){
		return new BlackAndWhite();
	}
}
