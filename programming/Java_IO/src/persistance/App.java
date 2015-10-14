package persistance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class App
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		
//		Person person = new Person("Ze", 18, new Attribute("ugly"));
//		
//		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("person_with_date")))
//		{
//			os.writeObject(person);
//		}
		
		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("person_with_date")))
		{
			Object person = is.readObject();
			if(person instanceof Person)
			{
				person = (Person) person;
				System.out.println(person.toString());
			}
		}
//		
//		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("person_with_date")))
//		{
//			Object date = is.readObject();
//			if(date instanceof Date)
//			{
//				date = (Date) date;
//				System.out.println(date.toString());
//			}
//			else
//				System.out.println("notttt");
//		}
	}
}
