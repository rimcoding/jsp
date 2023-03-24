package wrapper_ex;

public class MainTest1 {

	public static void main(String[] args) {
		
		Integer num = new Integer(20);	// 박싱
		// 타입 미스매치가 떠야 정상인데 자동으로 들어간다 (자동 언박싱)
		// int n = num;
		int n = num.intValue();	//언 박싱 (제대로 쓰면 이렇게 써야 한다)
		
		System.out.println("n : " +n);
		
		System.out.println("-------------------");
		
		Integer num2 = 30;	// 자동 박싱
		int result = num2;	//타입 미스매치가 나야하는데 무리가 없이 들어간다. (자동 언박싱)
		System.out.println("result : " + result);
	}

}
