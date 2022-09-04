package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateUtility {
	
	public static String getCurrentDate() {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	String formattedDate = sdf.format(date);
	return formattedDate;
	}
	
}
