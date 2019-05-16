package com.todo.subordinate;

import com.todo.Center;

/**
 * 报社需要发布 复古黑白报纸
 */
public class BlackAndWhite implements Center {

	@Override
	public void detail() {
		System.out.println("本日发布：黑白报纸");
	}
	
}
