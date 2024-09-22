package pack;

public class Test {

	public static void main(String[]args) {
		String str = "Git Demo";
		System.out.println("Print in console:" +str);
		
		String a= "Hellow";
		String b= "Word";
		
		System.out.println("Before swap a = "+ a + " and b =" + b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring( b.length());
		
		System.out.println("After swap= a "+a);
		System.out.println("After swap= b "+b);

	
	}
}
