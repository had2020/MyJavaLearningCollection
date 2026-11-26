public class MonthDays
{
   public static void main(String[] args)
   {
      String[] months = { "Null", "January", "February", "March",
                          "April", "May", "June", "July",
                          "August", "September", "October",
                          "November", "December" };

      int[] days = {
          0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
      };

       for (int i=1;i<months.length;i++) {
           System.out.println("Month " + i + ": " + months[i] + " has " + days[i] + " days");
       }

   }
}
