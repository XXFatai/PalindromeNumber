
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
		Scanner input = new Scanner(System.in);
		Judgement judge = new Judgement();
		String str;
		
		str = input.nextLine();
		input.close();
		judge.judge(str);
	}

}
class Judgement{
	public void judge(String s){
		String sReverse;
		StringBuffer sb =new StringBuffer();
		
		System.out.print(s);
		sb.append(s);
		sb.reverse();
		sReverse = sb.toString();
		if(sReverse.equals(s))
			System.out.print("是回文数。");
		else
			System.out.print("不是回文数。");
	}
}