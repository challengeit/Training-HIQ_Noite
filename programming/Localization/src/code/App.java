package code;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class App 
{
	public static void main(String[] args) 
	{
		/*/ all locals available
		System.out.println("The default locale is: " + Locale.getDefault());
        Locale [] locales = Locale.getAvailableLocales();
        System.out.format("No. of other available locales is: %d, and they are: %n", locales.length);
        for(Locale locale : locales) {
            System.out.format("Locale code: %s and it stands for %s %n", locale, locale.getDisplayName());
        }
		//*/
		
		/*/ access default file
		ResourceBundle bundle = ResourceBundle.getBundle("labels", Locale.forLanguageTag("es"));
		System.out.println("Default Locale s1 = " + bundle.getString("s1"));
		
		// access class
		ResourceBundle resBundle = ResourceBundle.getBundle("Labels", new Locale("it", "IT"));
    	System.out.println("Class ResourceBundle s3 = " + resBundle.getString("s3"));
		System.out.println();
		//*/
		
		//
		Locale[] supportedLocales = {
		    Locale.FRANCE,
		    Locale.GERMANY,
		    Locale.UK,
		    //Locale.forLanguageTag("pt")
		    new Locale("pt", "BR")
		};
		
		for(Locale locale : supportedLocales)
		{
			System.out.println("*** LOCALE " + locale + " ***");
			ResourceBundle labels = ResourceBundle.getBundle("labels", locale);
			Enumeration<String> bundleKeys = labels.getKeys();

			while (bundleKeys.hasMoreElements()) {
			    String key = (String) bundleKeys.nextElement();
			    String value = labels.getString(key);
			    System.out.println("key = " + key + ", " + "value = " + value);
			}
			
			// dates
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
			System.out.println("Date Format: " + df.format(new Date()));
			
			// currency
			NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
			System.out.println("Number Format: " + nf.format(1031.54));
			
			System.out.println();
		}
		//*/
	}
}
