package com.Demo;

import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Demo1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字，第二个数字须大于等于第一个数字");
		int num2 = scanner.nextInt();

		int rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);
	}

}
