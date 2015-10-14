package persistance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1297617316145685759L;
	
	private String _name;
	private int _age;
	private transient final Attribute _attr;
	
	public Person(String name, int age, Attribute attr)
	{
		_name = name;
		setAge(age);
		_attr = attr;
	}
	
	private void setAge(int age) 
	{
		_age = (2*age);
	}
	
	public String getName() { return _name; }
	
	public int getAge() { return _age; }
	
	public Attribute getAttribute() { return _attr; }
	
	@Override
	public String toString() 
	{
		return getName() + ": " + getAge(); //+ ", " + getAttribute().getValue();
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException 
	{	
		oos.defaultWriteObject();
		oos.writeObject(new Date());
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
	{
		ois.defaultReadObject();
		setAge(1);
	}
}
