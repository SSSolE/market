package chapter6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class join
 */
@WebServlet("/join")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MemberInfo[] Database = new MemberInfo[0];
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 항상 클라이언트가 우리가 원하는 값을 보내준다 라는 가정을 하면 절대 안됨!
		// 우리가 원하는 값 -> 회원 가입 페이지에서 입력하는 것들
		
		if(name == null) {
			// 이름이 전달되지 않았을 때 처리
			response.setStatus(400);
		}
		// 파라미터 체크가 끝났으면
		// 회원 가입 처리
		// 회원 가입 -> 우리 사이트를 이용하는 회원의 정보를 저장하는 기능
		
		// 회원 정보를 저장하는 코드(회원가입)
		// 일반적으로는 회원 정보를 DB에 저장
		// 우리는 아직 DB를 배우지 않았으니까
		// DB에 저장할 수는 없고
		// DB의 역할을 하는 변수를 활용
		
		// 회원의 정보를 저장할 객체를 만들어서
		// 그 객체안에 회원의 정보가 저장되도록
		
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setId(id);
		memberInfo.setPw(pw);
		memberInfo.setName(name);
	
		// 회원가입 할 때 아이디 중복 여부 체크	
		// 회원 가입 성공
		Database[0] = memberInfo;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
