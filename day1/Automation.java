package week3.day1;

public class Automation extends MultipleLanguage implements TestTool,Language
{
public void Selenium() 
    {
		
	System.out.println("This is Selenium");	
	}

public void Java() 
	{
		System.out.println("This is Java");		
		
	}
void ruby() 
	{
		
		System.out.println("This is ruby");			
	}

	public static void main(String[] args) 
	{
		Automation Auto=new Automation();
		Auto.Java();
		Auto.python();
		Auto.ruby();
		Auto.Selenium();
		
	}
}
