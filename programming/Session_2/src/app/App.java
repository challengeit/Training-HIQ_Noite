package app;

import domain.Chef;
import domain.Director;
import domain.Driver;
import domain.Employee;
import domain.Person;

public class App 
{	
	public static void main(String[] args) 
	{
//		Person p = new Director("ze", 18, 3);
//		System.out.println(p.getName());
//		
//		boolean flag = p instanceof Director;
//		
//		if(flag)
//			System.out.println(((Director)p).getXpto2());
//		
//		StringBuilder builder = new StringBuilder();
//		p.concatName(builder);
//		System.out.println(builder.toString());
//		
//		
//		Person p2 = new Person("luis", 20) {
//			@Override
//			protected String getTagName() {
//				return "Classe anónima";
//				
//			}
//		};
//		
//		Person.Member member = p2.new Member("braço");
//		
//		
//		builder = new StringBuilder();
//		member.getPerson().concatName(builder);
//		System.out.println(builder.toString());
		
//		int a = 10;
//		a = 2;
//		int b = 10;
//		b = b%2;
//		
//		final String aux = "The name is: ";
//		Person person = new Person("Ze", 30);
//		
//		String phrase = "The name is: ";
//		phrase += " Luis";
//		
//		StringBuilder builder = new StringBuilder(aux).append(" Luis");
//		person.concatName(builder);
//		
//		
//		
//		System.out.println(builder.toString());// The name is: Ze
//		
//		String s = aux;
//		person.concatName(s);
//		
//		System.out.println(s);// The name is: 
//		
//		Outer.Inner inner = new Inner();
		
//		Chef dir = new Director("Ze", 18, 1);
//		xpto(dir);
//		
//		Chef chef = new Chef() {
//			
//			@Override
//			public void cooking() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		Object obj = new Object() {
			@Override
			public String toString() {
				return super.toString() + " anonimo";
			}
		};
		
		System.out.println(obj);
		
		Chef dir = new Director("ze", 20, 1);
		dir.cooking();
		
		System.out.println(Chef.id);
		System.out.println(Director.id);
	}
	
	private static void xpto(Chef c)
	{
	}
}