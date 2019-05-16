package com.todo.subordinatea;

import com.todo.Center;
import com.todo.subordinate.Colours;
/**
 * 类工厂
 * @author Administrator
 *
 */
public class AColours implements AbstractFactory{

	@Override
	public Center printFactory() {
		return new Colours();
	}

}
