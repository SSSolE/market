package chapter2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

// 클래스파일로 servlet만들기
public class Hello extends HttpServlet{
	// 1. Hello 클래스가 HttpServlet 추상클래스를 상속받게 한다.
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 요청 시 마다 실행되는 메서드
		// 사용자의 요청을 처리하는 코드를 넣어둠
		System.out.println("service() 메서드 호출!");
	}

	@Override
	public void init() throws ServletException {
		// 서블릿 생성 주기에서 최초로 요청했을 때만 실행되는 메서드
		// 이 서블릿 관련된 중요한 초기 설정 코드를 넣어둠
		System.out.println("init() 메서드 호출!");
	}
	// 2. init()메서드와 service() 메서드를 오버라이딩

	
}
