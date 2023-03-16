package org.system;

public class Desktop extends Computer
{
	public void desktopSize()
	{
	System.out.println("The Size is 6 inches");	
	}

	public static void main(String[] args) 
	{
		Desktop des=new Desktop();
		des.computerModel();
		des.desktopSize();		
	}

}
