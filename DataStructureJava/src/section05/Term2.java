package section05;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 1
// Term(항) coefficient 계수, exponent 지수
//클래스 안에 매서드 추가
public class Term2 {
	public int coef;
	public int expo;

	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}

	public void printTerm() {
		System.out.print(coef + "x^" + expo);

	}
}
