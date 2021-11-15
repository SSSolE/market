package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Chap6Ex6
 */
@WebServlet("/chap6/ex6")
public class Chap6Ex6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Chap6Ex6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String id = "id";
		String pw = "pw";
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		// 예외 1 -> userId, userPw 가 null 일 때
		// 처리방법 1 -> try-catch로 null 예외를 잡음.
		// 처리방법 2 -> if 문에서 userId, userPw가 null이 아닐 때 라는 조건을 추가함.
		
		// 식의 단축 연산 -> 논리 연산을 할 때 굳이 할 필요 없는 연산은 하지 않는 현상
		if( (userId != null && id.equals(userId)) && (userPw != null && pw.equals(userPw))) {
			// 사용자가 입력한 아이디와 비밀번호가 저장된 아이디와 비밀번호와 같다면
			
			// 세션에 로그인한 사용자의 이름을 기록
			HttpSession session = request.getSession();
			
			// setAttribute(name, value) -> 세션에 값을 저장할 수 있음
			session.setAttribute("isLogin", "true");
			session.setAttribute("userName", "김철수");
		}
		boolean isLogin = false;
		

		HttpSession session = request.getSession();
		// session.getAttribute(name) -> 세션에 저장된 값을 불러올 수 있음
		
		// 예외 2 -> 세션에 isLogin 키가 없을 경우 nullPointerException이 발생할 수 있음(최초 실행할 때)
		
		String s_isLogin = (String) session.getAttribute("isLogin");
		isLogin = Boolean.parseBoolean(s_isLogin);
		
		PrintWriter out = response.getWriter();
		if(isLogin) {
			// 로그아웃 버튼을 출력
			out.print("<a href=\"/Market/chap6/ex7\">로그아웃</a>");
		} else {
			// 로그인을 하세요 출력
			out.print("<p>로그인을 하세요.</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
