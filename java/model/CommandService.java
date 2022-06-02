package model; 

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class CommandService{ 

    /** 
     * 기본 생성자 
     */ 
    public CommandService() { 
        super(); 
    } 

    public StringBuffer getHello(){  // model의 메소드
        StringBuffer sb = new StringBuffer(); 
        sb.append("<li> 안녕하세요..MVC 입니다.<br>"); 
        sb.append("<li> Template Page<br>"); 
        sb.append("<li> URI Command Pattern<br>"); 
        sb.append("<li> Properties 파일을 이용한 처리입니다.<br>"); 
         
        return sb; 

    } 

    public String getDate(){ // model의 메소드
        Date dt = new Date(); 
        String str = dt.toLocaleString();  
         
        return str; 
    }

	public StringBuffer getMyinfo() { // model의 메소드
		StringBuffer sb = new StringBuffer(); 
        sb.append("<li> 이름 : 장인혁<br>"); 
        sb.append("<li> 전화번호 : 010-978-1261<br>"); 
        sb.append("<li> 주소 : 서울시 성동구 도선동<br>"); 
		return sb;
	}

	public List<Map> getTeam() {
		List<Map> list = new ArrayList<Map>();
		Map map = new HashMap();
		map.put("name", "홍길동");
		map.put("skill", "Java,JSP,Spring");
		map.put("phone", "010-5585-1236");
		map.put("address", "서울시 역상동");
		
		list.add(map);
		
		map = new HashMap();
		map.put("name", "김길동");
		map.put("skill", "Java,python,JSP,Spring");
		map.put("phone", "010-4585-4445");
		map.put("address", "서울시 영등포구");
		
		list.add(map);
		
		map = new HashMap();
		map.put("name", "이길동");
		map.put("skill", "C,Java,JSP,Spring");
		map.put("phone", "010-1234-1216");
		map.put("address", "서울시 관악구");
		
		list.add(map);
		
		map = new HashMap();
		map.put("name", "박길동");
		map.put("skill", "Java,JSP,Spring");
		map.put("phone", "010-1111-1016");
		map.put("address", "서울시 역상동");
		
		list.add(map);
		
		return list;
	} 

} 