package ch02;

// 제약을 걸어둬서 하나의 메서드만 가지게 한다.
@FunctionalInterface

public interface IMaxNumber {
	
	int getMax(int a, int b);
	//int getMax(int a, int b, int c);
}
