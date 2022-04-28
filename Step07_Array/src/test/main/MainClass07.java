package test.main;

import java.util.Random;

/*
 * 
 * 1. cherry, apple, banana, melon, 7
 * 	  5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.
 * 
 * 2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
 *    예) cherry | apple | cherry
 *    
 *  - hint
 *  String[] items = {"cherry","apple", "banana", "melon","7"}
 *  
 *  Random ran = new Random();
 *  int ranNum = ran.nextInt(5);
 */
public class MainClass07 {
	public static void main(String[] args) {
		String[] items = {"cherry","apple", "banana", "melon","7"};
		Random ran = new Random();
		int ranNum=ran.nextInt(5);	
		System.out.println(items[ranNum]);
		
		String[] strs= new String[3];
		for(int i=0; i<strs.length; i++) {
			int ranNum2=ran.nextInt(5);
			String str=items[ranNum2];
			strs[i]=str;
		}
		
		String msg = strs[0]+" | "+strs[1]+" | "+strs[2];
		System.out.println(msg);
		
		 if(strs[0]==strs[1] && strs[1]==strs[2]) {
			 System.out.println("Lucky!");
		 }
		 else if(strs[0]==strs[1] || strs[1]==strs[2] || strs[0]==strs[2]) {
			 System.out.println("Good~");
		 }
		 else {
			 System.out.println("ㅠㅠ");
		 }
	}
}	
