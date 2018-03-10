package lfh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Datecode {
	/**
	*
	*/
	
	


	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String fromDate=sc.next(),toDate=sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date cfromDate = dateFormat.parse(fromDate),ctoDate = dateFormat.parse(toDate);
	calc(cfromDate,ctoDate);
	}
	public static void calc(Date fromDate, Date toDate)
	{
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Calendar c = Calendar.getInstance(),c1=Calendar.getInstance();
	c.setTime(fromDate);
	c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
	fromDate=c.getTime();
	System.out.println(dateFormat.format(fromDate));
	c.setTime(toDate);
	c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
	if(c.after(c1))
	c=c1;
	toDate=c.getTime();
	System.out.println(dateFormat.format(toDate));
	}
	}
	
	
	

