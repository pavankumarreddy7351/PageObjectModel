package Automation_ObjectManager;

import Automation_BaseClass.BaseClass;
import Automation_ObjectPages.HomePage;
import Automation_ObjectPages.Navigate_To_DemoPage;
import Automation_ObjectPages.RegisterPage;
import Automation_ObjectPages.SeleniumTrainingPage;
import Automation_ObjectPages.successfull_Page;

public class ObjectManager extends BaseClass{
	public static HomePage home=new HomePage();
	public static SeleniumTrainingPage selenium=new SeleniumTrainingPage();
	public static Navigate_To_DemoPage demo=new Navigate_To_DemoPage();
	public static RegisterPage register=new RegisterPage();
	public static successfull_Page success=new successfull_Page();
	
	

}
