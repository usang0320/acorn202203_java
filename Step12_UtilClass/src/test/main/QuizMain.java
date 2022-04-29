package test.main;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
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
		
	}
}
