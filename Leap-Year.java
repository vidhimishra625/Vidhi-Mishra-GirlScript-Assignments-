public class LeapYear 
{
    public static boolean isLeapYear(int year)
    {
        boolean result;
        if(year>=1&&year<=9999)
        {
            if(year%4==0&&year%100==0&&year%400==0)
            {
                result=true;
            }
            else if(year%4==0&&year%100!=0)
            {
                result=true;
            }
            else
            {
                result=false;
            }
            
        }
        else
        {
            result=false;
        }
        return result;
        
    }
    public static void main(String[] args) {
        boolean p=isLeapYear(2020);
        System.out.println(p);
    }
}
