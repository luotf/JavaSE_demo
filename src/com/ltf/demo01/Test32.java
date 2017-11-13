package com.ltf.demo01;
/**
	多重for循环
	打印：
		*
	   ***
	  *****
	 *******
	********* 

*/
import java.util.Scanner;
public class Test32{
	public static void main(String[] args){
		System.out.print("请输入层数：");
		int n=new Scanner(System.in).nextInt();
		
		//外循环控制行数
		for(int i=1;i<=n;i++){
			//内循环输出空格
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			//内循环输出*
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}