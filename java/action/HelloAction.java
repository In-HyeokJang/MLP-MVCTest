package action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CommandService;

public class HelloAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse respons) {
		// model 사용
		CommandService service = new CommandService(); // 객체생성
		StringBuffer sb = service.getHello(); // 객체생성
		// 결과 request 저장
		request.setAttribute("hello", sb);
		// 결과를 보여줄 view 선택(포워드 예쩡)
		return "/view/hello.jsp";
	}

}
