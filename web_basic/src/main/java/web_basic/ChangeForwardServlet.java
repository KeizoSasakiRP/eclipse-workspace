package web_basic;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ChangeForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); // 文字コードの指定
		String strNum = req.getParameter("num"); // 入力パラメータの取得
		String message = null; // エラーメッセージ用変数

		// 入力パラメータのエラーチェック
		if (strNum == null) {
			message = "フォーム画面から入力してね。";
		} else if (strNum.equals("")) {
			message = "何も入力されていませんよ。";
		} else {
			try {
				Integer.parseInt(strNum);

			} catch (NumberFormatException e) {
				message = "数字を入力してね。";
			}
		}

		// 条件分岐による遷移先の変更処理
		if (message == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/view/ch09/changeForward2.jsp?strNum=" + strNum);
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/view/ch09/changeForward3.jsp?message=" + message);
			dispatcher.forward(req, resp);
		}

	}
}
