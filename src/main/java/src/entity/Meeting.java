package src.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class Meeting {

    @SerializedName("working_hours")
    @Expose
    private WorkingHours workingHours;
    @SerializedName("planned_meeting")
    @Expose
    private List<PlannedMeeting> plannedMeeting = null;

    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(WorkingHours workingHours) {
        this.workingHours = workingHours;
    }

    public List<PlannedMeeting> getPlannedMeeting() {
        return plannedMeeting;
    }

    public void setPlannedMeeting(List<PlannedMeeting> plannedMeeting) {
        this.plannedMeeting = plannedMeeting;
    }

    public String letsmeet(Meeting callendar1, Meeting callendar2,String meetingDuration) {


        /**
         *  Etap 1
         *  Cel:Wyizolowanie wspólnej listy czasów pracy dla obu osób, czas w którym obie osoby pracują
         *
         * - Stworzenie listy czasów, wraz z listami pomocniczymi.
         * - Dopasowanie trwania meetingu (meetingDuration) do pomocniczej zmiennej typu int duration.
         * - Wyizolowanie listy czasów pracy dla obu osób typu String , List<String>WorkingHours
         */

        int duration=0;
        String wynik ="Długość twojego spotkania wynosi: "+meetingDuration+"\n";

        //zabezpieczenie metody na wypadek błędnygo podania argumentów funkcji letsmeet

        try {
            if (meetingDuration.equals("00:30")) {
                duration = 1;
            }
            if (meetingDuration.equals("01:00")) {
                duration = 2;
            }
            if (meetingDuration.equals("01:30")) {
                duration = 3;
            }
            if (meetingDuration.equals("02:00")) {
                duration = 4;
            }
            if (meetingDuration.equals("02:30")) {
                duration = 5;
            }
            if (meetingDuration.equals("03:00")) {
                duration = 6;
            }
            if (meetingDuration.equals("03:30")) {
                duration = 7;
            }
            if (meetingDuration.equals("04:00")) {
                duration = 8;
            }
            if (meetingDuration.equals("04:30")) {
                duration = 9;
            }
            if (meetingDuration.equals("05:00")) {
                duration = 10;
            }
            if (meetingDuration.equals("05:30")) {
                duration = 11;
            }
            if (meetingDuration.equals("06:00")) {
                duration = 12;
            }
            if (meetingDuration.equals("06:30")) {
                duration = 13;
            }
            if (meetingDuration.equals("07:00")) {
                duration = 14;
            }
            if (meetingDuration.equals("07:30")) {
                duration = 15;
            }
            if (meetingDuration.equals("08:00")) {
                duration = 16;
            }
            if (meetingDuration.equals("08:30")) {
                duration = 17;
            }
            if (meetingDuration.equals("09:00")) {
                duration = 18;
            }
            if (meetingDuration.equals("09:30")) {
                duration = 19;
            }
            if (meetingDuration.equals("10:00")) {
                duration = 20;
            }
            if (meetingDuration.equals("10:30")) {
                duration = 21;
            }
            if (meetingDuration.equals("11:00")) {
                duration = 22;
            }
            if (meetingDuration.equals("11:30")) {
                duration = 23;
            }
            if (meetingDuration.equals("12:00")) {
                duration = 24;
            }
            if (meetingDuration.equals("12:30")) {
                duration = 25;
            }
            if (meetingDuration.equals("13:00")) {
                duration = 26;
            }
            if (meetingDuration.equals("13:30")) {
                duration = 27;
            }
            if (meetingDuration.equals("14:00")) {
                duration = 28;
            }
            if (meetingDuration.equals("14:30")) {
                duration = 29;
            }
            if (meetingDuration.equals("15:00")) {
                duration = 30;
            }
            if (meetingDuration.equals("15:30")) {
                duration = 31;
            }
            if (meetingDuration.equals("16:00")) {
                duration = 32;
            }
            if (meetingDuration.equals("16:30")) {
                duration = 33;
            }
            if (meetingDuration.equals("17:00")) {
                duration = 34;
            }
            if (meetingDuration.equals("17:30")) {
                duration = 35;
            }
            if (meetingDuration.equals("18:00")) {
                duration = 36;
            }
            if (meetingDuration.equals("18:30")) {
                duration = 37;
            }
            if (meetingDuration.equals("19:00")) {
                duration = 38;
            }
            if (meetingDuration.equals("19:30")) {
                duration = 39;
            }
            if (meetingDuration.equals("20:00")) {
                duration = 40;
            }
            if (meetingDuration.equals("20:30")) {
                duration = 41;
            }
            if (meetingDuration.equals("21:00")) {
                duration = 42;
            }
            if (meetingDuration.equals("21:30")) {
                duration = 43;
            }
            if (meetingDuration.equals("22:00")) {
                duration = 44;
            }
            if (meetingDuration.equals("22:30")) {
                duration = 45;
            }
            if (meetingDuration.equals("23:00")) {
                duration = 46;
            }
            if (meetingDuration.equals("23:30")) {
                duration = 47;
            }
            if (meetingDuration.equals("24:00")) {
                duration = 48;
            }

            //stworzenie czasów w odstępach 30 minutowych

            String time0 = "00:00";
            String time1 = "00:30";
            String time2 = "01:00";
            String time3 = "01:30";
            String time4 = "02:00";
            String time5 = "02:30";
            String time6 = "03:00";
            String time7 = "03:30";
            String time8 = "04:00";
            String time9 = "04:30";
            String time10 = "05:00";
            String time11 = "05:30";
            String time12 = "06:00";
            String time13 = "06:30";
            String time14 = "07:00";
            String time15 = "07:30";
            String time16 = "08:00";
            String time17 = "08:30";
            String time18 = "09:00";
            String time19 = "09:30";
            String time20 = "10:00";
            String time21 = "10:30";
            String time22 = "11:00";
            String time23 = "11:30";
            String time24 = "12:00";
            String time25 = "12:30";
            String time26 = "13:00";
            String time27 = "13:30";
            String time28 = "14:00";
            String time29 = "14:30";
            String time30 = "15:00";
            String time31 = "15:30";
            String time32 = "16:00";
            String time33 = "16:30";
            String time34 = "17:00";
            String time35 = "17:30";
            String time36 = "18:00";
            String time37 = "18:30";
            String time38 = "19:00";
            String time39 = "19:30";
            String time40 = "20:00";
            String time41 = "20:30";
            String time42 = "21:00";
            String time43 = "21:30";
            String time44 = "22:00";
            String time45 = "22:30";
            String time46 = "23:00";
            String time47 = "23:30";

            //Przypisanie wartości do listy czas.

            List<String> czas = new LinkedList<>();
            czas.add(time0);
            czas.add(time1);
            czas.add(time2);
            czas.add(time3);
            czas.add(time4);
            czas.add(time5);
            czas.add(time6);
            czas.add(time7);
            czas.add(time8);
            czas.add(time9);
            czas.add(time10);
            czas.add(time11);
            czas.add(time12);
            czas.add(time13);
            czas.add(time14);
            czas.add(time15);
            czas.add(time16);
            czas.add(time17);
            czas.add(time18);
            czas.add(time19);
            czas.add(time20);
            czas.add(time21);
            czas.add(time22);
            czas.add(time23);
            czas.add(time24);
            czas.add(time25);
            czas.add(time26);
            czas.add(time27);
            czas.add(time28);
            czas.add(time29);
            czas.add(time30);
            czas.add(time31);
            czas.add(time32);
            czas.add(time33);
            czas.add(time34);
            czas.add(time35);
            czas.add(time36);
            czas.add(time37);
            czas.add(time38);
            czas.add(time39);
            czas.add(time40);
            czas.add(time41);
            czas.add(time42);
            czas.add(time43);
            czas.add(time44);
            czas.add(time45);
            czas.add(time46);
            czas.add(time47);

            //wyciągam do zmiennych godziny pracy dla 2 osób
            WorkingHours workingHours1 = callendar1.getWorkingHours();
            WorkingHours workingHours2 = callendar2.getWorkingHours();
            // lista czasu calkowitego w ciagu doby
            List<Integer> inEndWork = new LinkedList<>();
            Integer inWorkStartTime = 0;
            Integer inWorkEndTime = 0;
            for (int i = 0; i <= czas.size() - 1; i++) {
                if ((workingHours1.getStart().equals(czas.get(i))) || (workingHours2.getStart().equals(czas.get(i)))) {
                    inWorkStartTime = i;
                }
                if ((workingHours1.getEnd().equals(czas.get(i))) || (workingHours2.getEnd().equals(czas.get(i)))) {
                    inWorkEndTime = i;
                    inEndWork.add(inWorkEndTime);
                }
            }

            for (int j = 0; j <= inEndWork.size() - 1; j++) {
                if (inEndWork.get(0) <= inEndWork.get(j)) {
                    inWorkEndTime = inEndWork.get(0);
                } else {
                    inWorkEndTime = inEndWork.get(j);
                }
            }

            //teraz sprawdzam jak powinny zapisac sie godziny pracy 2 osob
            List<Integer> HelpingIntList = new LinkedList<>();
            List<String> workingHours = new LinkedList<>();
            if (inWorkStartTime < inWorkEndTime) {
                for (int i = inWorkStartTime; i <= inWorkEndTime; i++) {
                    workingHours.add(czas.get(i));
                    HelpingIntList.add(i);
                }
            } else if (inWorkStartTime > inWorkEndTime) {
                for (int i = inWorkEndTime; i <= inWorkStartTime; i++) {
                    workingHours.add(czas.get(i));
                    HelpingIntList.add(i);
                }
            } else {
                for (int i = 0; i <= czas.size() - 1; i++) {
                    workingHours.add(czas.get(i));
                    HelpingIntList.add(i);
                }
            }

            //KONIEC ETAPU 1
//-------------------------------------------------------------------------------------------------------------------------------------------------------

            /**
             * Etap 2
             * Cel:Utworzenie listy wspólnych godzin wolnego czasu dla 2 osób. Lista ma zawierać daty, lecz bez godzin zakończeń spotkań
             * Zakończenia spotkań nie są uwzględniane, gdyż może zacząć się wtedy kolejne spotkanie
             * przykład: spotkanie od 15:00-16:30, wartość 16:30 nie powinna zostać zapisana w liście
             * - Wyizolowanie 2 list ,po 1 dla każdej z osób w celu ustalenia ich czasów aktualnych spotkań
             * - Wyizolowanie listy wolnych terminów spotkań freeTimeLastList
             * - Utworzenie list pomocniczych zawierający numery indeksów listy w celu łatwiejszego wyświetlenia danych w kroku 3. - indexList
             */
            //wyniesienie godzin aktualnych spotkań dla 1 osoby do zmiennej typu PlannedMeeting
            List<PlannedMeeting> plannedMeeting1 = callendar1.getPlannedMeeting();

            //najpierw wyizoluje punkty typu int dla spotkan
            List<Integer> IntegerMeeting1 = new LinkedList<>();
            for (int j = 0; j <= plannedMeeting1.size() - 1; j++) {
                //tutaj iteruje po czasie pracy wspolnym dla obojga osob
                for (int i = 0; i <= czas.size() - 1; i++) {
                    //tutaj warunek nie dodajacy mozliwych godzin spotkan jezeli sa one juz zajete w liscie aktualnych spotkan
                    if (czas.get(i).equals(plannedMeeting1.get(j).getStart())) {
                        int k = i;
                        do {
                            IntegerMeeting1.add(k);
                            k++;
                        }
                        while (!czas.get(k).equals(plannedMeeting1.get(j).getEnd()));
                    }
                }
            }
            //tutaj mam juz zrobiona liste godzin spotkan ktore sa juz zajete dla 1 osoby

            //wyniesienie godzin aktualnych spotkań dla 1 osoby do zmiennej typu PlannedMeeting
            List<PlannedMeeting> plannedMeeting2 = callendar2.getPlannedMeeting();

            //najpierw wyizoluje punkty typu int dla spotkan
            List<Integer> IntegerMeeting2 = new LinkedList<>();
            for (int j = 0; j <= plannedMeeting2.size() - 1; j++) {
                //tutaj iteruje po czasie pracy wspolnym dla obojga osob
                for (int i = 0; i <= czas.size() - 1; i++) {
                    //tutaj warunek nie dodajacy mozliwych godzin spotkan jezeli sa one juz zajete w liscie aktualnych spotkan
                    if (czas.get(i).equals(plannedMeeting2.get(j).getStart())) {
                        int k = i;
                        do {
                            IntegerMeeting2.add(k);
                            k++;
                        }
                        while (!czas.get(k).equals(plannedMeeting2.get(j).getEnd()));
                    }
                }
            }
            //tutaj mam juz zrobiona liste godzin spotkan ktore sa juz zajete dla 2 osoby

            // w tym momencie mam stworzone w 2 etapie listy INT dla 2 pracownikow oddzielnie
            //listy zawieraja godziny w ktorych pracownicy maja juz spotkania

            //robimy listy w których pracownicy nie maja spotkan i pracuja w czasie wspolnym uwzgledniajac zachdzenie czasu

            //Lista nr 1
            List<Integer> freeTime1 = new LinkedList<>();
            for (int i = 0; i <= HelpingIntList.size() - 2; i++) {
                int k = 0;
                for (int j = 0; j <= IntegerMeeting1.size() - 1; j++) {
                    if ((HelpingIntList.get(i).equals(IntegerMeeting1.get(j)))) {
                        k = j;
                        continue;
                    }
                }
                if ((HelpingIntList.get(i).equals(IntegerMeeting1.get(k)))) {
                    continue;
                }
                freeTime1.add(HelpingIntList.get(i));
            }

            //lista nr 2
            List<Integer> freeTime2 = new LinkedList<>();
            for (int i = 0; i <= HelpingIntList.size() - 2; i++) {
                int k = 0;
                for (int j = 0; j <= IntegerMeeting2.size() - 1; j++) {
                    if ((HelpingIntList.get(i).equals(IntegerMeeting2.get(j)))) {
                        k = j;
                        continue;
                    }
                }
                if ((HelpingIntList.get(i).equals(IntegerMeeting2.get(k)))) {
                    continue;
                }
                freeTime2.add(HelpingIntList.get(i));
            }

            //mamy tutaj juz listy int z mozliwymi godzinami pracy ale bez godzin zakonczenia potencjalnego spotkania
            //cel z etapu 2 zachowany

            //robimy wspolna liste wolnych czasow
            List<Integer> freeTimeLastList = new LinkedList<>();
            for (int i = 0; i <= freeTime1.size() - 1; i++) {
                for (int j = 0; j <= freeTime2.size() - 1; j++) {
                    if (freeTime1.get(i).equals(freeTime2.get(j))) {
                        freeTimeLastList.add(freeTime1.get(i));
                    }
                }
            }
            //utworzenie pomocniczej listy z Indeksami listy freeTimeLastList w celu łatwiejszego wypisania potencjalnych
            //godzin spotkań w etapie 3
            List<Integer> indexList = new LinkedList<>();
            for (int i = 0; i <= freeTimeLastList.size() - 1; i++) {
                indexList.add(i);
            }

            //KONIEC ETAPU 2
//--------------------------------------------------------------------------------------------------------------------------------------------------
            /**
             * Etap 3
             * Cel: Wyświetlenie możliwych czasów pracy zależnych od zmiennej pomocniczej duration
             * zgodnie z założeniem godziny wyświetlone w odpowinich przedziałach wynikających z
             * meetingDuration, podanych funkcji letsmeet.
             */
            //stworznie zmiennej typu String zwracanej w funkcji o nazwie wynik
            wynik = wynik + "[";
            //iteracja po elementach listy pomocniczej zawierajacej wolne godziny dla 2 osob
            for (int i = freeTimeLastList.size() - 1; i >= 0; i--) {
                //iteraca tutaj po wszystki wynikach jednak od tyłu tak by nie ominąć żadnej kombinacji
                for (int j = 0; j <= freeTimeLastList.size() - 1; j++) {
                    //warunek sprawdzajacy dlugosc spotkania
                    if (((freeTimeLastList.get(i)) + 1) - (freeTimeLastList.get(j)) == duration) {
                        //dodatkowy warunek  uwzgledniajacy czy aby pomiedzy aktualnymi godzinami nie wystepuje juz jakies spotkanie
                        if ((duration >= 2) && (((freeTimeLastList.get(indexList.get(i)) - (freeTimeLastList.get(indexList.get(j))) == (duration - 1))) || (freeTimeLastList.get(indexList.get(i)) - (freeTimeLastList.get(indexList.get(j))) == (duration)))) {
                            wynik = wynik + "[" + (czas.get(freeTimeLastList.get(j)) + "," + czas.get(freeTimeLastList.get(i) + 1)) + "]";
                        }
                        //warunek dla szczególnego przypadku - spotkania 30 minutowego, czyli najkrótszego jakie możliwe do ustalenia w tej metodzie
                        else {
                            wynik = wynik + "[" + (czas.get(freeTimeLastList.get(j)) + "," + czas.get(freeTimeLastList.get(i) + 1)) + "]";
                        }
                    }
                }
            }
            wynik=wynik+"]";
            //KONIEC ETAPU 3
    //---------------------------------------------------------------------------------------------------------------------------------------------------


        }
        catch (Exception e){
            System.out.println("Ups... coś poszło nie tak, upewnij się że dane wejściowe są poprawne.");
        }
        //wpisanie godzin potencjalnych spotkań
        return wynik;
    }
}


