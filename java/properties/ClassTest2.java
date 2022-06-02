package properties;

import java.util.HashMap;
import java.util.Map;

public class ClassTest2 {

	public static void main(String[] args) {
		String keyName = args[0];
		Map<String,Action> map = new HashMap<String,Action>(); // map 객체 생성
		Class object = null;
		Action instance = null;
		
		try {
			object = Class.forName("properties.Spring");
			instance = (Action)object.newInstance(); // 
			map.put("Spring", instance); // mpa에 spring 저장
			
			object = Class.forName("properties.Summer");
			instance = (Action)object.newInstance(); // 
			map.put("Summer", instance);
			
			object = Class.forName("properties.Fall");
			instance = (Action)object.newInstance(); // 
			map.put("Fall", instance);
			
			object = Class.forName("properties.Winter");
			instance = (Action)object.newInstance(); // 
			map.put("Winter", instance);
			
			instance = map.get(keyName);
			instance.execute();
			
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
