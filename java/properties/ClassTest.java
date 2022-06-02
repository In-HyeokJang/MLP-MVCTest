package properties;
interface Action{
	void execute();
}
class Spring implements Action{

	@Override
	public void execute() {
		System.out.println("따뜻한 봄 입니다. - 새싹");
		
	}
}
class Summer implements Action{

	@Override
	public void execute() {
		System.out.println("너무 더운 여름이야. - 더워");
		
	}
	
}

class Fall implements Action{

	@Override
	public void execute() {
		System.out.println("가을 날씨 선선하다 좋다 - 낙엽");
		
	}
	
}

class Winter implements Action{

	@Override
	public void execute() {
		System.out.println("춥다 추워 클스마스 스키장 눈사람 눈 오예~ - 윈턴");
		
	}
	
}

public class ClassTest {

	public static void main(String[] args) {
		// 클래스가 가지고 있는 forname을 통해서 
		String className = args[0]; 
		try {
			Class object = Class.forName(className); 
			//Class.forNmae 객체생성할 수 있음, 
			//new는 생성자가 옆에 있어 타입이 누군지 알아야 하지만 class는 몰라도 가능 하고 class이기만 하면 됨
			Action instance = (Action)object.newInstance(); // Action으로 다운 캐스팅
			instance.execute(); // execute 호출
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
