
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName��   PalindromeNumber
 * FileName: PalindromeNumber.java
 * Author:   ��
 * Date:     2013-1-31 ����10:14:52  
 * Version :
 * Description:������
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
			System.out.print("�ǻ�������");
		else
			System.out.print("���ǻ�������");
	}
}