package chapter2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

// Ŭ�������Ϸ� servlet�����
public class Hello extends HttpServlet{
	// 1. Hello Ŭ������ HttpServlet �߻�Ŭ������ ��ӹް� �Ѵ�.
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// ��û �� ���� ����Ǵ� �޼���
		// ������� ��û�� ó���ϴ� �ڵ带 �־��
		System.out.println("service() �޼��� ȣ��!");
	}

	@Override
	public void init() throws ServletException {
		// ���� ���� �ֱ⿡�� ���ʷ� ��û���� ���� ����Ǵ� �޼���
		// �� ���� ���õ� �߿��� �ʱ� ���� �ڵ带 �־��
		System.out.println("init() �޼��� ȣ��!");
	}
	// 2. init()�޼���� service() �޼��带 �������̵�

	
}
