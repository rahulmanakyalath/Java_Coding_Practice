package DateManipulation;

import java.util.Calendar;

public class DateAndTime {

    public String  SmokerStatus(String last)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int lyear = Integer.parseInt(last.substring(0,4));
        int lmonth = Integer.parseInt(last.substring(5));
          if(year-lyear>=2 || (year-lyear==1 && month-lmonth>=0))
          {
              return "Non-Smoker";
          }
          return "Smoker";
    }
}
