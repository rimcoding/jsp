package ch01;

public class Coffeemachine implements Electornic110v{

	@Override
	public void connect() {
		System.out.println("커피머신 110v On");
	}

}
