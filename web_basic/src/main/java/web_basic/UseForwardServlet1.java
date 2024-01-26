package web_basic;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet1 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("サーブレットの実行");

		// フォワード先の指定
		RequestDispatcher dispatcher = req.getRequestDispatcher("/View/useForward.jsp");

		// フォワードの実行
		dispatcher.forward(req, resp);

		System.out.println("サーブレットの終了");
	}
}
