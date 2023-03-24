package wrapper_ex;

public class MainTest2 {

	public static void main(String[] args) {
		
		//문자열이라서 래퍼 클래스를 이용하면 형변환이 가능하다.
		System.out.println(10+"");
		//문자열 데이터 타입에서 기본 데이터 타입으로 변환하는 방법을 알아야 한다.
		//래퍼클래스란 개념을 알고있으면 된다.
		String str = "127";
		String str2 = "10.5";
		String str3 = "true";
		
		//억지로 바이트타입 변수 b에 담고싶으면?
		//래퍼클래스를 이용하면 담을수있다.
		//바이트 크기에 따라 형변환이 된다 안된다가 결정될수도 있다.
		byte b = Byte.parseByte(str); //127 - 128
		System.out.println(b);
		int i = Integer.parseInt(str);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(!bool);
		short s = Short.parseShort(str);
		System.out.println(s);
		long l = Long.parseLong(str);
		System.out.println(l);
		float f = Float.parseFloat(str2);
		System.out.println(f);
		double d = Double.parseDouble(str2);
		System.out.println(d);
		
	}

}
