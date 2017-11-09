package com.ltf.class01;

/**
	基本数据类型转换
*/
public class Test03{
	public static void main(String[] args){
		for(int i=1;i<100000;i++){
			int m = (int) Math.sqrt(100+i);
			int n = (int) Math.sqrt(168+i);
			if(m*m==(i+100)&&(n*n)==(i+168)){
				System.out.println("输出的数："+i);
			}
		}
	}
}