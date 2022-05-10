package test.mypac;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		File f = new File("c:/");
		String[] names=f.list();
		//배열에 있는 문자열 모두 출력하기
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("---------------");
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
