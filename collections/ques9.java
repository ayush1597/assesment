import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class TimeZone {
    public static void main(String[] args) {
        List< Locale > locales = Arrays.asList(Locale.getAvailableLocales());
        DateFormat dateFormat;
        for(Locale l : locales)
        {
            dateFormat= DateFormat.getDateInstance(DateFormat.FULL,l);
            System.out.println( l.getDisplayCountry() +" :  "+dateFormat.format(new Date()));
        }
    }

}
