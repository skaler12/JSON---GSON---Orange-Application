package src;

import com.google.gson.Gson;
import src.entity.Meeting;
import src.entity.PlannedMeeting;
import src.entity.WorkingHours;

import java.io.*;
import java.net.URL;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class RestClient {
    public static void main(String[] args) throws FileNotFoundException {

        //w aplikacji zakladam iz spotkania moga sie odbywac ,zaczynac o godzinach pelnych lub po opoznieniu 30 minut
        // spotkania trwaja dokladnie 30 minut
        //typ wyjsiowy to string

        Gson gson = new Gson();
        //wczytanie 1 kalendarza
        Reader reader1 = new FileReader("src/main/resources/calendar1.json");
        Meeting calendar1 = gson.fromJson(reader1, Meeting.class);

        //wczytanie 2 kalendarza
        Reader reader2 = new FileReader("src/main/resources/calendar2.json");
        Meeting calendar2 = gson.fromJson(reader2, Meeting.class);

        Meeting met = new Meeting();
        System.out.println(met.meeting(calendar1,calendar2,"00:30"));


    }

    //public String meeting(Meeting meeting1, Meeting meeting2) {
   //     return "siem";
 //   }
      /*
       try {
           Reader reader = new FileReader("C:\\Users\\Grzegorz\\Desktop\\Orange-Json-File-master/calendar1.json");

           Meeting meeting1 = gson.fromJson(reader, Meeting.class);
       }
       catch (IOException e){
           e.printStackTrace();
       }
        System.out.println();
        try {
            Reader reader = new FileReader("C:\\Users\\Grzegorz\\Desktop\\Orange-Json-File-master/calendar2.json");

            //zapis danych do obiektu meeting2
            Meeting meeting2 = gson.fromJson(reader, Meeting.class);

            //zapis listy zaplanowawnych meetingow do listy plannedMeeting2
            List<PlannedMeeting> plannedMeeting2 = meeting2.getPlannedMeeting();
            //zapis workinghours do zmiennej workinghours2
            WorkingHours workingHours2 = meeting2.getWorkingHours();

            System.out.println("Pracownik nr 2");
            System.out.println();
            //1 spotkanie
            int i =1;
            for (PlannedMeeting meetings:plannedMeeting2) {
                System.out.println("Spotkanie nr: " + i);
                System.out.println(meetings.getStart());
                System.out.println(meetings.getEnd());
                System.out.println();
                i++;
            }

            //wyswietlenie poczatku i konca czasu pracy
            System.out.println("Czas pracy w ciągu dnia.");
            System.out.println(workingHours2.getStart());
            System.out.println(workingHours2.getEnd());

            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            String dateInString = workingHours2.getStart();

            System.out.println();
            System.out.println("wyswietlam czas");
            Date date = formatter.parse(dateInString);
            System.out.println(formatter.format(date));

            date.equals(date);

            List<Date>czas = new LinkedList<>();
            czas.add(date);
            System.out.println(czas.get(0));

        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }


        /*URL url1 = new URL("https://github.com/skaler12/Orange-Json-File/blob/master/calendar1.json");

        InputStreamReader readerUrl1 = new InputStreamReader(url1.openStream());

        WorkingHours workingHours1 = new Gson().fromJson(readerUrl1,WorkingHours.class);

        System.out.println(workingHours1.getStart());
*/

}
