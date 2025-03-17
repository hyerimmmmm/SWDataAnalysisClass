package JDBC기초;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Dama {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "12345";

		String sql = "";

		System.out.println("========== 메뉴 ==========");

		System.out.println("[1]다마고치 생성 \t [2]다마고치 키우기");
		System.out.print("선택 >> ");
		int select = sc.nextInt();

		while (true) {
			if (select == 1) {
				// 다마고치 생성
				// 입력받을 것 : 이름 / 좋아하는 음식
				// 기본 수치: 배고픔 / 졸림 => 30
				System.out.print("다마고치의 이름을 입력해주세요. >> ");
				String name = sc.next();
				System.out.print("다마고치가 좋아하는 음식을 입력해주세요. >> ");
				String food = sc.next();
				try {
					conn = DriverManager.getConnection(url, user, pw);
					sql = "insert into DAMA values (?, ?, 30, 30)";

					psmt = conn.prepareStatement(sql);
					psmt.setString(1, name);
					psmt.setString(2, food);

					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println("다마고치를 생성했습니다.");
					} else {
						System.out.println("다마고치 생성에 실패했습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			} else if (select == 2) {
				System.out.println("");
				System.out.println("========== 메뉴 ==========");
				System.out.println("[1]상태확인 \t [2]밥주기 \t [3]재우기");
				System.out.print("선택 >> ");
				int select2 = sc.nextInt();

				if (select2 == 1) {
					// 상태확인
					try {
						conn = DriverManager.getConnection(url, user, pw);
						sql = "select * from DAMA";
						
						psmt = conn.prepareStatement(sql);

						rs = psmt.executeQuery();
						System.out.println("========== 상태 확인 ==========");
						System.out.println("이름\t배고픔\t졸림");
						while (rs.next()) {
							System.out.println(
									rs.getString("NAME") + "\t" + rs.getInt("HUNGRY") + "\t" + rs.getInt("SLEEPY"));
						}
						System.out.println("");

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (select == 2) {
					// 밥주기
					// 다마고치의 이름과 어떤 음식을 줄 지 작성
					try {
						conn = DriverManager.getConnection(url, user, pw);
						
						System.out.print("밥을 주려는 다마고치의 이름을 입력해주세요. >> ");
						String eatName = sc.next();
						System.out.print("다마고치가 좋아하는 음식을 입력해주세요. >> ");
						String favoriteFood = sc.next();
						
						sql = "select * from DAMA where NAME = ? and FOOD = ?";
						
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, eatName);
						psmt.setString(2, favoriteFood);
						
						rs = psmt.executeQuery();
						
						if (rs.next()) {
							System.out.println("밥을 먹이는데 성공했습니다.");
							sql = "update DAMA set HUNGRY = HUNGRY - 5 where NAME = ?";
							psmt = conn.prepareStatement(sql);
							psmt.setString(1, eatName);
							
							ResultSet rs2 = psmt.executeQuery();

							System.out.println("현재 배고픔은 " + rs2.getInt("HUNGRY") + "입니다.");
						} else {
							System.out.println("밥을 먹이는데 실패했습니다.");
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
