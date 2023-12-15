package Automation_ObjectManager;

import Automation_BaseClass.BaseClass;
import Automation_ObjectPages.AboutMe_Pages;
import Automation_ObjectPages.Alert_Pop_Up_Page;
import Automation_ObjectPages.DemoSite_DynamicTransaction_Page;
import Automation_ObjectPages.HomePage;
import Automation_ObjectPages.Iframe_Pages;
import Automation_ObjectPages.MouseEvet_Page;
import Automation_ObjectPages.MultiWindows_Pages;
import Automation_ObjectPages.Navigate_To_DemoPage;
import Automation_ObjectPages.ProgressBar_Page;
import Automation_ObjectPages.RegisterPage;
import Automation_ObjectPages.SeleniumTrainingPage;
import Automation_ObjectPages.WebTable_Page;
import Automation_ObjectPages.successfull_Page;

public class PageObjectManager extends BaseClass{
	public static HomePage home=new HomePage();
	public static SeleniumTrainingPage selenium=new SeleniumTrainingPage();
	public static Navigate_To_DemoPage demo=new Navigate_To_DemoPage();
	public static RegisterPage register=new RegisterPage();
	public static successfull_Page success=new successfull_Page();
	public static DemoSite_DynamicTransaction_Page dynamic=new DemoSite_DynamicTransaction_Page();
	public static MouseEvet_Page mouseEvent=new MouseEvet_Page();
	public static Alert_Pop_Up_Page alert=new Alert_Pop_Up_Page();
	public static MultiWindows_Pages windows=new MultiWindows_Pages();
	public static Iframe_Pages iframe=new Iframe_Pages();
	public static WebTable_Page table=new WebTable_Page();
	public static ProgressBar_Page bar=new ProgressBar_Page();
	public static AboutMe_Pages test=new AboutMe_Pages();

	
}
