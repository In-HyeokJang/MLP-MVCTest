package action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CommandService;

public class MyinfoAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse respons) {
		//model사용
		CommandService service = new CommandService();
		StringBuffer sb = service.getMyinfo();
		//request 저장
		request.setAttribute("myinfo", sb);
		//결과를 보여줄 view 선택(포워드 예정)
		return "/view/myinfo.jsp";
	}

}
