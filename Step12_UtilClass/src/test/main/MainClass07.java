package test.main;

import java.util.HashMap;

public class MainClass07 {
	public static void main(String[] args) {
		HashMap<String, Object> map1=new HashMap<>();
		/*
		 * 
	     *  HashMap<key 값의 type, value 값의 type>
	     *  
	     *  key 의 generic class 는 String 으로 지정하는것이 일반적이다.
	     *  value 의 generic class 는 담을 데이터 type 을 지정하면된다.
	     *  여러개의 type 을 섞어서 담을거면 Object 로 지정하면 된다.  
	     */
		/*
		 *  위에서 생성한 HashMap 객체에 다음과 같은 정보 3가지를 담아 보세요.
		 *  번호 : 1
		 *  이름 : 김구라
		 *  남자인지 여부 : true
		 */
		
		map1.put("번호", 1);
		map1.put("이름", "김구라");
		map1.put("남자?", true);
		System.out.println(map1);
		/*
		 * value 의 Generic 클래스가 Object 로 지정 되어 있기 때문에
		 * 리턴되는 Object type 을 원래 type 으로 casting 해야 한다.
		 */
		
		//map1 에 담긴 번호는 num, 이름은 name, 남자인지 여부는 isMan 이라는 지역변수에 담아보세요
		int num =(int) map1.get("번호");
		String name = (String) map1.get("이름");
		boolean isMan = (boolean) map1.get("남자?");
	}
}
