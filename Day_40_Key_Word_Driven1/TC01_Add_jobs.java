package Day_40_Key_Word_Driven1;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class TC01_Add_jobs {
	
	
	 
	 @Test
	 public void TC01_Test() throws Exception
	 {
		 
		 DriverScript DS4= new DriverScript();
		 DS4.mainTest("C://HTML Report//OrangeHRM6//TC01_Jobs.xlsx","Sheet1");
		 
	 }
	 
	

	 
	 

}