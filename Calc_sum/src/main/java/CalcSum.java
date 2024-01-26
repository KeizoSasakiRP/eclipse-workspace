import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalcSum extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		// 入力パラメータの取得
		String strNum1 = req.getParameter("num1");
		String strNum2 = req.getParameter("num2");
		// エラーメッセージ用変数
		String message = null;

		// 計算用の変数
		String answer = null;
		int num1 = 0;
		int num2 = 0;

		// 入力パラメータのエラーチェック
		if (strNum1 == null || strNum2 == null) {
			message = "フォーム画面から入力してください";
		} else if (strNum1.equals("") || strNum2.equals("")) {
			message = "未入力の箇所があります";
		} else {
			try {
				num1 = Integer.parseInt(strNum1);
				num2 = Integer.parseInt(strNum2);
			} catch (NumberFormatException e) {
				message = "数字を入力してください";
			}
		}

		// 計算
		answer = String.valueOf(num1 + num2);

		// 条件分岐による遷移先の変更処理
		if (message == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/view/sumResult.jsp?answer=" + answer);
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/view/errorMessage.jsp?message=" + message);
			dispatcher.forward(req, resp);
		}

	}
}
