package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Calc {

	public static void main(String[] args) {
		Properties prop = new Properties(); // 객체 생성
		FileInputStream fis = null;
		File file = new File("calc.properties");
		
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}// if end
		}// edn finally
		
        //변수 선언
        int su1 = 0;
        int su2 = 0;
        
        
        su1 = Integer.parseInt(prop.getProperty("su1")); // int로 형변환
        su2 = Integer.parseInt(prop.getProperty("su2")); // int로 형변환
        
        System.out.println("su1 + su2 =" + (su1+su2));
        System.out.println("su1 - su2 =" + (su1-su2));
        System.out.println("sw1 * su2 =" + (su1*su2));
        System.out.println("su1 / su2 =" + (su1/su2));
        
		
	}
}
