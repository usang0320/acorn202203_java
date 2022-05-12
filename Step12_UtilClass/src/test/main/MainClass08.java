package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		System.out.println(dic);
		
		/*
		 * 검색할 단어를 입력하세요:house
		 * house 의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요:gura
		 * gura 는 목록에 없습니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요:");
		String word = sc.nextLine();
		if(dic.containsKey(word)) {
			String value= dic.get(word);
			System.out.println(word+"의 뜻은 "+value+"입니다.");
		}
		else {
			System.out.println(word+"는 목록에 없습니다");
		}
		
		//쌤풀이
//		String value = dic.get(word);
//		 if(value == null) { //찾는 단어가 없는 경우
//	         System.out.println(word+" 는 목록에 없습니다.");
//	     }else {//찾는 단어가 있는 경우 
//	         System.out.println(word+" 의 뜻은 "+value+"입니다");
//	     }
		
		
		
		
		
	}
}
