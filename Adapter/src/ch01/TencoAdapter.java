package ch01;
/**
 * 어댑터 패턴 설정
 * **/
public class TencoAdapter implements Electronic220v {
	
	//클래스를 선언해서 다른 인터페이스와 연결 후에 내가 쓰고 싶은 인터페이스를 넣는것을 어댑터라고 한다.

	Electornic110v electornic110v;
	
	public TencoAdapter(Electornic110v electornic110v) {
		this.electornic110v = electornic110v;
	}
	
	@Override
	public void connect() {
		electornic110v.connect();
	}

}
