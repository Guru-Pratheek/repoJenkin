import java.util.*;
public class MyDate
{
  private int day,month,year;
  MyDate()
  {
   day=20;month=10;year=2020;
  }
  MyDate(int a, int b, int c)
 {
   day=a;
   month=b;
   year=c;
 }
   int getDay()
    {
      return day;
    }

   int getMonth()
    {
      return month;
    }

    int getYear()
    {
      return year;
    }

   void setDay(int d) 
    {
      day=d;
    }

    void setMonth(int e) 
    {


      month=e;
    }

    void setYear(int f) 
    {
      year=f;
    }

   void display()
   {
     System.out.println(day+"/"+month+"/"+year);
   }

    static void show()
     {
      System.out.println("In Static Method");
      }
   public static void main(String args[])
   {
    Scanner sc =new Scanner(System.in);
    MyDate d1= new MyDate();
    d1.display(); 
    MyDate d= new MyDate(13,9,21);
    d.display();
    System.out.println("Enter the day");
    int day = sc.nextInt();
    System.out.println("Enter the month");
    int month = sc.nextInt();
    System.out.println("Enter the year");
    int year = sc.nextInt();
    d.setDay(day);
    d.setMonth(month);
    d.setYear(year); 
    d.display();
    
   }
}
