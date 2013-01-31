
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName：   PalindromeNumber
 * FileName: PalindromeNumber.java
 * Author:   润发
 * Date:     2013-1-31 上午10:14:52  
 * Version :
 * Description:回文数
 **********************************************************/
package com.trf;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judgement judge = new Judgement();
		judge.judge();
	}
}

class Judgement{
	public void judge(){
		String sReverse, s;
		StringBuffer sb =new StringBuffer();
		Scanner input = new Scanner(System.in);
	
		sb.append(input.nextLine());
		input.close();
		s = sb.toString();
		sb.reverse();
		sReverse = sb.toString();
		
		System.out.print(s);
		if(sReverse.equals(s))
			System.out.print("是回文数。");
		else
			System.out.print("不是回文数。");
	}
}