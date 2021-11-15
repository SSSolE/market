package chapter10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap10/ex2")
public class Chap10Ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSP에 익숙해지면 Maven 이라는걸 배울 예정
		// Maven은 우리 대신에 프로젝트를 일정 부분 관리해주는 툴
		// Maven을 배우면 Dependency 라고 해서 외부에 공개되어있는 자바 라이브러리를 쉽게 추가할 수 있는 기능
		//
		//String responseData = "{\"age\": 16, \"height\": 157.6, \"name\": \"홍길동\"}";
		
		// String responseData = "{\"array\": [1,2,3,4,5,6,7,8,9,10]}";
		
		String responseData = "{\"info\": {\"age\": 16, \"height\":167.7, \"name\":\"홍길동\"}}";
		
		// mine type이 text/plain으로 보내짐 -> 마인타입 설정 해주는게 좋음
		// 안해줘도 동작이 되지만 간혹 안될 수도 있으므로 json타입의 mine type 설정
		response.setContentType("application/json;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print(responseData);
		
		out.close();
	}
}
