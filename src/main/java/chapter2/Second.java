package chapter2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/second", name="two")
// @WebServlet("second")
public class Second extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("second ������ doGet() �޼��� ȣ��!");
	}
	

//	@Override
//	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//		// Ŭ���̾�Ʈ�� � ������� ��û�ϴ��� service �޼��尡 ȣ���
//		// Ŭ���̾�Ʈ�� GET ������� ��û�ߴٴ°� �������� ���� �ޱ⸸ �ϱ� �����̰�
//		// Ŭ���̾�Ʈ�� POST ������� ��û�޴ٴ°� �������� �����ϱ� ������
//		// �̷��� ��û ��Ŀ� ���� Ŭ���̾�Ʈ�� ��û ������ �ٸ�
//		// service �޼��� �ϳ������δ� ��� ��û�� ó���ϱ⿡�� �ʹ� �����ϴϱ�
//		// ������ ������ ���� service �޼��带 �������̵����� �ʰ�
//		// ������� ��û ��Ŀ� �´� ó���� �� �� �ְ� ���ִ� �ٸ� �޼��带 �������̵� ��
//		System.out.println("Second�� ������ service() �޼��� ȣ��!");
//	}
}
