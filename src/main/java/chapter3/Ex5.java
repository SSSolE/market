package chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex5
 */
@WebServlet("/ex5")
public class Ex5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		
		String ClientIp = request.getRemoteAddr();
		String adminIp = "192.168.10.16";
	
		out.print("<html>");
		out.print(	"<head>");
		out.print(		"<title>ex</title>");
		out.print(	"</head>");
		out.print(	"<body>");
		
		if(ClientIp.equals(adminIp)) {
			try {
				int age = Integer.parseInt(request.getParameter("age"));
				
				if(name==null) {
					out.print("<h1>name 파라미터를 넣어서 호출해야 합니다.</h1>");
				} else {
					out.print(		"<h1>클라이언트가 전달한 파라미터</h1>");
					out.print(		"<p>name = " + name + "</p>");
					out.print(		"<p>age = " + age + "</p>");
				}		
			} catch(NumberFormatException e) {			
				out.print("<h1>age 파라미터를 넣어서 호출해야 합니다.</h1>");
			} finally {
				out.print(	"</body>");
				out.print("</html>");
				// 스트림을 닫는 코드는 항상 finally 안에 넣어야 함.
				out.close();
			}
		}	else {
			out.print("<h1>허용된 관리자만 접근할 수 있습니다.</h1>");
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
