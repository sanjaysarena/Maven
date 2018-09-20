package com.cg.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.bean.Calculator;

public class TestCalculator {

	@Test
	public void test()
	{
		Calculator calc=new Calculator();
		int res=calc.add(3,4);
		Assert.assertEquals(7, res);
	}
	@Test
	public void test2()
	{
		Calculator calc=new Calculator();
		int res=calc.subtract(4,3);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test3()
	{
		Calculator calc=new Calculator();
		int res=calc.multiply(3,4);
		Assert.assertEquals(12, res);
	}
	@Test
	public void test4()
	{
		Calculator calc=new Calculator();
		int res=calc.calcSquare(3);
		Assert.assertEquals(9, res);
	}
}
