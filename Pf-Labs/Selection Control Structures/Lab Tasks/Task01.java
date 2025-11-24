import java.util.*;
public class Task01{
	public static void main(String[] args){
	int x = 10;
	int y = 15;
	int z = 20;
	if ( !(x>10)) 
		{System.out.println("First Line is True");}
	else 
		{System.out.println("First Line is False");}

	if ( x<= 5 || y<15 ) 
		{System.out.println("Second Line is True");}
	else 
		{System.out.println("Second Line is False");}

	if ( (x != 5) && (x+y)>= z) 
		{System.out.println("Third Line is True");}
	else 
		{System.out.println("Thrid Line is False");}

	if ( x>= z || (x=y)>= z) 
		{System.out.println("Fourth Line is True");}
	else 
		{System.out.println("Fourth Line is False");}
	if ((x<=y-2) && (y>= z) || (z-2!=20)) 
		{System.out.println("Fifth Line is True");}
	else 
		{System.out.println("Fifth Line is False");}
	}
}




