package src.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    //niech to będzie metoda pozwalająca na ustawienie meetengu
    //Callendar 1 to klandarz 1 osoby,
    //Callendar 2 to klandarz 2 osoby,
    public String meeting(Meeting callendar1, Meeting callendar2,String meetingDuration) {
        int duration=0;
        String wynik ="Długość twojego spotkania wynosi: "+meetingDuration+"\n";
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
            //stworze najpierw liste czasow co 30 minut
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

            WorkingHours workingHours1 = callendar1.getWorkingHours();
            WorkingHours workingHours2 = callendar2.getWorkingHours();
            //mam liste czasu calkowitego w ciagu doby
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

            //teraz sprawdzam jak powinny zapisac sie godziny pracy osob
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
            //moment wypisanie godzin w ktorych obydwie osoby pracuja
            for (String Hours : workingHours) {
                System.out.println(Hours);
            }
            ;
            //KONIEC ETAPU 1 - MAM WYIZOLOWANE GODZINIY PRACY DLA OSÓB

            //wystawienie 2 planow dla 2 osob
            List<PlannedMeeting> plannedMeeting1 = callendar1.getPlannedMeeting();

            //najpierw musze wyizolowac punkty inta dla spotkan, dopiero potem moge porownywac je z lista dostepnych godzin
            List<Integer> IntegerMeeting1 = new LinkedList<>();
            for (int j = 0; j <= plannedMeeting1.size() - 1; j++) {
                //tutaj iteruje po czasie pracy wspolnym dla obojga osob
                for (int i = 0; i <= czas.size() - 1; i++) {
                    //tutaj warunek nie dodajacy mozliwych godzin spotkan jezeli sa one juz zajete w liscie aktualnych spotkan
                    //warunek na continue
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
            //tutaj mam juz zrobiona liste godzin spotkan ktore sa juz zajete dal 1 pracownika
            for (int wypisz1 : IntegerMeeting1) {
                System.out.println(wypisz1);
            }

            System.out.println();


            List<PlannedMeeting> plannedMeeting2 = callendar2.getPlannedMeeting();
            List<Integer> IntegerMeeting2 = new LinkedList<>();
            for (int j = 0; j <= plannedMeeting2.size() - 1; j++) {
                //tutaj iteruje po czasie pracy wspolnym dla obojga osob
                for (int i = 0; i <= czas.size() - 1; i++) {
                    //tutaj warunek nie dodajacy mozliwych godzin spotkan jezeli sa one juz zajete w liscie aktualnych spotkan
                    //warunek na continue
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
            //tutaj mam juz zrobiona liste godzin spotkan ktore sa juz zajete dal 1 pracownika
            for (int wypisz2 : IntegerMeeting2) {
                System.out.println(wypisz2);
            }
            // w tym momencie mam stworzone w 2 etapie listy INT dla 2 pracownikow oddzielnie
            //listy zawieraja godziny w ktorych pracownicy maja juz spotkania

            //robimy listy w których pracownicy nie maja spotkan i pracuja w czasie wspolnym uwzgledniajac zachdzenie czasu
            //ista nr 1
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
            System.out.println();
            for (int freetime1 : freeTime1) {
                System.out.println(freetime1);
            }

            System.out.println();
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
            System.out.println();
            for (int freetime2 : freeTime2) {
                System.out.println(freetime2);
            }
            System.out.println();
            //mamy tutaj juz listy int z mozliwymi godzinami pracy ale bez godzin zakonczenia potencjalnego spotkania

            //robimy wspolna liste wolnych czasow
            List<Integer> freeTimeLastList = new LinkedList<>();
            for (int i = 0; i <= freeTime1.size() - 1; i++) {
                for (int j = 0; j <= freeTime2.size() - 1; j++) {
                    if (freeTime1.get(i).equals(freeTime2.get(j))) {
                        freeTimeLastList.add(freeTime1.get(i));
                    }
                }
            }
            List<Integer>indexList = new LinkedList<>();
            for(int i =0; i<=freeTimeLastList.size()-1;i++){
                indexList.add(i);
            }
            for (int allfree : freeTimeLastList) {
                System.out.println(allfree);
            }

            //mamy wspolna liste czasow ale bez czasow zakonczen spotkan ,jednak nie ma juz problemu godziny zakanczajacej
            //KONIEC ETAPU 2
//--------------------------------------------------------------------------------------------------------------------------------------------------
            //teraz etap 3, czyli odpowiednie wypisanie godzin spotkań  w zaleznosci od mmeting duration:
            //przechodzi po wszystkich wynikach
            wynik=wynik+"[";
            for(int i = freeTimeLastList.size()-1; i >= 0; i--){
                //tutaj po wszystki wynikach w 2 strone tylko bez koncow ,same poczatki chyba :/
                    for(int j = 0; j<=freeTimeLastList.size()-1; j++){
                        //sprawdza czy i-j jest na pewno oki równe podanemu odstepowi(duration)

                        //teraz trzeba jeszcze sprawdzic czy pomiedzy nibi nie ma jakiegos spotkania
                        if(((freeTimeLastList.get(i))+1) - (freeTimeLastList.get(j))==duration){

                            if((duration>=2)&&(((freeTimeLastList.get(indexList.get(i))-(freeTimeLastList.get(indexList.get(j)))==(duration-1)))||(freeTimeLastList.get(indexList.get(i))-(freeTimeLastList.get(indexList.get(j)))==(duration)))){
                                wynik = wynik + "["+(czas.get(freeTimeLastList.get(j)) + "," + czas.get(freeTimeLastList.get(i) + 1))+"]";
                            }
                            //tu sytuacja tylko dla 30 minut - 1 odstepu i jest juz git
                            else{
                                wynik=wynik+"["+(czas.get(freeTimeLastList.get(j)) + "," + czas.get(freeTimeLastList.get(i) + 1))+"]";
                            }
                        }
                    }
            }
            wynik=wynik+"]";
            //twprze loste pomocnicza
        /*List<Integer>pomocnicza = new LinkedList<>();
        int p =0;
        int x =0;
        String wynik = "[";
        //lece po liscie freetime od prze ostatniego wyrazu
        for(int i =0; i<=freeTimeLastList.size()-2; i++ ){
            //jezeli wyraz i jest rowny wyrazowi get(i+1)-1 to wchodze do if'a

            if((freeTimeLastList.get(i).equals((freeTimeLastList.get(i+1))-1))||(p>0)){
                p++;
                //jezeli i+1 jest rowne rozmiarowi listy - czyli ostatnia iteracja
                if((i+1)==(freeTimeLastList.size()-1)){
                    //to dodajemy 2 wyrazy ostatnie
                    //dodajemy przeostatni wyraz
                    pomocnicza.add(freeTimeLastList.get(i));
                    //dodajemy ostatni wyraz
                    pomocnicza.add(freeTimeLastList.get(i+1));
                }
                //w przeciwnym wypadku dodajemy tylko ten wyraz
                else {
                    pomocnicza.add(freeTimeLastList.get(i));
                    x=freeTimeLastList.get(i+1);

                }
                    //jezeli rozmiar listy omocniczej >=2 to wchodze do if'a
                    if ((pomocnicza.size()) >= 2) {
                        //jezeli to juz jest rozne to wtedy

                        if ((!pomocnicza.get(pomocnicza.size()-1).equals(x))||((i+1)==(freeTimeLastList.size()-1))) {
                            //wypisuje ten nawias z pierwszym wyrazem i przedostatnim
                            wynik = wynik + "[" + czas.get(pomocnicza.get(0)) + "," + czas.get((pomocnicza.get(pomocnicza.size()-2))+2) + "]";
                            //na koniec resetuje liste pomocnicza
                            for (int j = pomocnicza.size() - 1; j >= 0; j--) {
                                pomocnicza.remove(j);
                            }
                            p=0;
                        }
                    }
            }
            else{
                if(p==0) {
                    wynik = wynik + "[" + czas.get((freeTimeLastList.get(i))) + "," + czas.get((freeTimeLastList.get(i)) + 1) + "]";
                }
                //tutaj jakas zmiana jeszcze
                else if((p==0)&&(i==freeTimeLastList.size()-1)){
                    wynik = wynik + "[" + czas.get((freeTimeLastList.get(i+1))) + "," + czas.get((freeTimeLastList.get(i)) + 2) + "]";
                }
            }
        };
        wynik = wynik + "]";
        //KONIEC ETAPU 3

       */

       /* String wynik = "[";
        for (int i =0; i<=freeTimeLastList.size()-1;i++){
            wynik = wynik + "["+czas.get(freeTimeLastList.get(i))+","+czas.get((freeTimeLastList.get(i))+1)+"]";
        }

        */
        }
        catch (Exception e){
            System.out.println("Nie odnaleziono mozliwych spotkań");
        }
        return wynik;
    }


      /*  List<Integer>user1freeHoursHelpingInt = new LinkedList<>();
        //tutaj iteruje po kolejnych spotkaniach dla 1 osoby
        for(int k=0;k<=plannedMeeting1.size()-1;k++){
            //tutaj iteruje po czasie pracy wspolnym dla obojga osob
            for(int i=HelpingIntList.get(0); i<=HelpingIntList.size()-1;i++){
                //tutaj warunek nie dodajacy mozliwych godzin spotkan jezeli sa one juz zajete w liscie aktualnych spotkan
                //warunek na continue
                user1freeHoursHelpingInt.add(i);
            }
        }
        plannedMeeting1.get(0).getStart();
        plannedMeeting1.get(0).getEnd();

*/
}


