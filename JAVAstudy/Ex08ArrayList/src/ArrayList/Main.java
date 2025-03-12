package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// 1. 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 2. 데이터 추가하기
		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");
		list.add(2, "꼬부기");
		
		// 3. 데이터 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 4. 데이터 삭제하기
		list.remove(2);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 5. 리스트 크기 알아보기
		System.out.println(list.size());
		
		// 6. 데이터 전체 삭제
		list.clear();
		
	}

}
