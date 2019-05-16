package com.todo.subordinate;

import com.todo.Center;
/**
 * 报社需要发布 炫酷彩色报纸
 */
public class Colours implements Center{

	@Override
	public void detail() {
		System.out.println("本日发布 ： 彩色报纸");
	}
	
}
