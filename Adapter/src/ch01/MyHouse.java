package ch01;

public class MyHouse {

	public static void main(String[] args) {
		
		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDryer dryer = new HairDryer();
		Coffeemachine coffeemachine = new Coffeemachine();
		//다형성
		
		connect(airConditioner);
		connect(cleaner);
		
		//220v만 사용 가능할 때 110v를 사용하고 싶으면 어댑터를 철물점에 사오는 개념이랑 같다.
		TencoAdapter adapterHairDryer = new TencoAdapter(dryer);
		connect(adapterHairDryer);
		
		TencoAdapter adapterCoffeemachine = new TencoAdapter(coffeemachine);
		connect(adapterCoffeemachine);
		
		
	}	//end of main

	//Myhouse static 전기 콘센트
	//MyHouse랑 AirConditioner,cleaner 랑 상호작용 하게 할려면 어떻게 해야할까?
	// airConditioner만 할때는 괄호안에 airConditioner만 넣으면 되지만 둘다 번갈아 쓰고 싶을때 다형성을 이용해 Electronic220v로 바라볼수 있다.
	public static void connect(Electronic220v electronic220v) {
		electronic220v.connect();
	}
	
}	//end of class
