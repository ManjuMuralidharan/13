import java.util.*;


public class weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the weekday");
		String ss=s.next();
		boolean b=weekdays(ss);
		System.out.println(b);

	}
	
	public static boolean weekdays(String days)
	{
		boolean b =true;
		String[] ds={"Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
		for(int i=0;i<ds.length;i++)
		{
			if(days.equalsIgnoreCase(ds[i]))
			{
	           b=true;
	           break;
			}
            else
            {
			   b=false;
			   break;
            }
			
		}
		return b;
		
	}

}
