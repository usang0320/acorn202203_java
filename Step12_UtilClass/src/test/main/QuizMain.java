package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/*
 *  run 을 누르면 로또번호 6 개를 랜덤하게 출력하는 코드를 작성해 보세요.
 *  
 *  1~45 사이의 숫자 중에 6개가 나와야 하며
 *  중복되는 숫자가 있으면 안되고
 *  작은 숫자부터 큰숫자 까지 정렬해서 출력해보세요.
 */
public class QuizMain {
	public static void main(String[] args) {
		Random ran = new Random();
		TreeSet<Integer> nums=new TreeSet<>();
		
		while(nums.size()<6) {
			int ranNum=ran.nextInt(45)+1;
			nums.add(ranNum);
		}
		System.out.println("이번주 당첨번호는 "+nums+"입니다.");
		
		
		//중복된 데이터가 저장되지 않는 정수를 저장할 수 있는 Stack 객체 생성
		Set<Integer> st = new HashSet<>();
		
		//무한루프 돌면서
		while(true) {
			///랜덤한 숫자를 얻어내서
			int ranNum = ran.nextInt(45)+1;
			//Stack 객체에 누적시키기
			st.add(ranNum);
			//번호가 6개가 되면
			if(st.size()==6) {
				break;	//반복문 탈출
			}
		}
		System.out.println(st);
		//Set 에 있는 데이터를 ArrayList 에 담고
		List<Integer> numbers = new ArrayList<>(st);
		System.out.println(numbers);
		//정렬하고
		Collections.sort(numbers);
		//출력
		for(int tmp:numbers) {
			System.out.println(tmp+",");
		}
		
	}
}
