package src;

import com.google.gson.Gson;
import src.entity.Meeting;
import java.io.*;

public class Starter {
    public static void main(String[] args) throws FileNotFoundException {

        //Witaj Orange !,
        //nazywam się Grzegorz Poznański, dziękuję za możliwość wykonania zadania rekrutacyjnego na staż w waszej Firmie
        //mam nadzieję ,iż przedstawiony program spełni wasze oczekiwania
        //Zaczynajmy!
        //Ps. Nagrałem również film udostępniony na kanale YT z działania przedstawionego programu
        //link:
        /**
         * Główna funkcja aplikacji pobierająca pliki z formacie JSON
         * Korzystam z GSON aby parsować pliki typu JSON na Obiekty
         * Zapisuje pliki w postaci obiektów klasy Meeting o nazwach calendar1 oraz calendar2
         * Tworzę obiekt typu Meeting o nazwie meeting i wywołuje na nim metodę letsmeet
         * Metoda letsmeet znajdująca się w klasie Meeting pakietu entity wykonuje odpowiedne operacje
         * następnie w postaci typu String wyświetla w konsoli potencjalne godziny spotkań dla 2 osób, wczytanych kalendarzy
         * Metoda uwzględnia czas trwania potencjalnego spotkania
         */

        Gson gson = new Gson();
        //wczytanie 1 kalendarza
        Reader reader1 = new FileReader("src/main/resources/calendar1.json");
        Meeting calendar1 = gson.fromJson(reader1, Meeting.class);

        //wczytanie 2 kalendarza
        Reader reader2 = new FileReader("src/main/resources/calendar2.json");
        Meeting calendar2 = gson.fromJson(reader2, Meeting.class);

        //stworzenie obiektu klasy Meeting
        Meeting meeting = new Meeting();
        //wywyłanie metody z klasy Meeting, która przyjmuje jako argumenty obiektu calendar1, calendar2 oraz czas trwania psotkania, meetingDuration
        System.out.println(meeting.letsmeet(calendar1,calendar2,"02:30"));

    }
}
