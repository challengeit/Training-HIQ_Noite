package strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
//		Properties props = new Properties();
//		props.load(new FileInputStream("config.properties"));

		Properties props = System.getProperties();

		System.out.println(System.getProperty("username"));
		System.out.println(props.getProperty("password"));
		System.out.println(props.getProperty("xpto", "manel"));					
	}
}
