package Automation.PageObjectModal.Utilites;

import java.util.Date;
import java.util.Random;

public class Utilites {

	public static int IMPLICIT_WAIT_TIME = 10;
	public static int PAGE_Load_TIME = 10;
	public static Random random = new Random();
	public static int y = random.nextInt(1000);
    public static String accName="Automation"+y;
    public static String firstName="Automation"+y;
    public static String lastNname="Automation"+y;
	public static String random_EmailID() {
		Date date = new Date();
		String num = date.toString().replace(" ", "_").replace(":", "_");
		String email = "automation" + num + "@gmail.com";
		return email;

	}

}
