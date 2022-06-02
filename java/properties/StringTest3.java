package properties;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		
		   Scanner r = new Scanner(System.in); 
		   System.out.println("파일명을 입력하세요"); 
		   String file = r.nextLine(); 
		
		  while(true){ 
			  if(file.indexOf(".")==-1 || file.startsWith(".") || file.endsWith(".")){
				  System.out.println("파일이 오류입니다. 다시 입력하세요");
				  file = r.nextLine();
			  }else {
				  int p = file.indexOf(".");
				  String s = file.substring(0,p);
				  String e = file.substring(p+1);
				  System.out.println("파일 앞부분: "+ s);
				  System.out.println("파일 확장자: "+ e);
				  break;
			  }
			 
		  }// end while
	}
}
