package chap12.Ex09;

public class Ex {

	public static void main(String[] args) {
		//1. SamsungPhone 타입으로 지정
		SamsungPhone s1 = new SamsungPhone();
		s1.printLogo();		//interface에서 default 메소드가 상속되어 내려온 기능
		s1.sendCall();		//
		s1.receiveCall();
		s1.flash();
		
		System.out.println("==========================");
		
		//2. PhoneInterface 로 업캐스팅
		PhoneInterface s2 = new SamsungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		
		SamsungPhone ss = (SamsungPhone)s2; 	//s2 : PhoneInterface  ==>삼성폰으로 다운캐스팅
		ss.flash(); 	//flash 는 다운캐스팅후 출력
		
		
		
		
		
		
		
	}

}
