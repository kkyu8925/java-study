package section01;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 3
//배열 while
public class Code07 {

	public static void main(String[] args) {
		int[] arr = { 100, 76, 92, 95, 14 };

		int i = 0;
		while (i < arr.length) {
			System.out.println("grade " + (i + 1) + ": " + arr[i]);
			i++;
		}
	}

}
