package action;

import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CommandService;

public class TeamAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse respons) {
		// model사용
		CommandService service = new CommandService();
		List<Map> list = service.getTeam();
		// 결과 request에 저장
		request.setAttribute("team", list);
		return "/view/list.jsp";
	}

}
