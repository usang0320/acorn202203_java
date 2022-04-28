package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		String[] items = {"cherry","apple", "banana", "melon","7"};
		Random ran = new Random();
		int ranNum=ran.nextInt(5);	
		System.out.println(items[ranNum]);
		
		String[] strs= new String[3];
		int[] scores = {10,20,30,40,100};
		int score = 0;
		for(int i=0; i<strs.length; i++) {
			int ranNum2=ran.nextInt(5);
			String str=items[ranNum2];
			score+=scores[ranNum2];
			strs[i]=str;
		}
		
		String msg = strs[0]+" | "+strs[1]+" | "+strs[2];
		System.out.println(msg);
		System.out.println(score);
		
		 if(score>=200) {
			 System.out.println("Lucky!");
		 }
		 else if(score>=100) {
			 System.out.println("Good~");
		 }
		 else {
			 System.out.println("¤Ð¤Ð");
		 }
		 
		 
	}
}	
