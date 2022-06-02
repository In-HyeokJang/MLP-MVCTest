package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) {
		//객체 생성
		 Properties prop = new Properties(); 
		//load의 맥의 변수가 file 을 가지고 올수 있는 InputStream 객체 생성
		FileInputStream fis = null;
		//file을 가지고 객체 생성
		File file = new File("jdbc.properties");
		
		//FileInputStream에다가 file 넣어주기
		try {
			fis = new FileInputStream(file);
			// load 함
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) { // fis가 null이 아니면 닫겠다
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}//end if
		}// end finally
		
		 // properties 객체에서 키목록을 추출합니다. 
	    // driver, url, account, password 
	    Iterator keyIter = prop.keySet().iterator(); 
	    while( keyIter.hasNext() ) { 
	        String key = (String)keyIter.next();  //키 추출 
	        String value = prop.getProperty(key); //키에 따른 값 추출 
	        System.out.println(key + "=" + value);
		
	    }
	    // 변수
	    Connection con = null; 
        PreparedStatement pstmt = null; 
        ResultSet rs = null; 
        String sql = ""; 
        String driver = ""; 
        String url = ""; 
        String account = ""; 
        String password=""; 
        
        //뽑아온다.
        driver = prop.getProperty("driver");
        url = prop.getProperty("url");
        account = prop.getProperty("account");
        password = prop.getProperty("password");
        
        try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, account, password);
			sql = "select count(*) cnt from information_schema.tables "
					+ "where table_schema='javadb'"; // 쿼리문 생성
			pstmt = con.prepareStatement(sql); // 전송객체 생성
			rs = pstmt.executeQuery(); //결과 받을 객체 생성
			if(rs.next()) {
				System.out.println("현재 javadb의 table 갯수: " + rs.getInt("cnt"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    }	
}
