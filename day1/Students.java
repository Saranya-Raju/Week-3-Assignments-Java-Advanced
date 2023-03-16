package week3.day1;

public class Students {
public void	getStudentInfo(int a)
{
System.out.println("The ID is " +a);
}

public void	getStudentInfo(int a,String n)
{
System.out.println("The ID is " +a);
System.out.println("The Name is " +n);
}
public void	getStudentInfo(int a,String n,String m)
{
System.out.println("The ID is " +a);
System.out.println("The Name is " +n);
System.out.println("The Mail id is " +m);
}
	public static void main(String[] args) 
	{
		Students stu=new Students();
		stu.getStudentInfo(10);
		stu.getStudentInfo(20, "Raj");
		stu.getStudentInfo(30, "Sam", "sam.90@gmail.com");
	}

}
