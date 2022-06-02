package action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CommandService;

public class DateAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse respons) {
		// model사용
		CommandService service = new CommandService();
		String str = service.getDate();
		// 결과 request 저장
		request.setAttribute("date", str);
		// 결과를 보여줄 view 선택
		return "/view/date.jsp";
	}

}
