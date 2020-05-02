# Orange-Application , Zadanie ,,Spotkajmy się ! " 
![logo-orange](https://user-images.githubusercontent.com/57706581/80892268-fe899a00-8cc8-11ea-914e-439286e07261.jpg)
Zadanie rekrutacyjne na praktyki Let's Orange! Stanowisko #Java #Spring # Unit tests - Grzegorz Poznański 
Link do opisu aplikacji na YouTube:


#Założenia Aplikacji
Podstawowym założeniem aplikacji jest pobranie z plików JSON danych oraz parsowanie ich na obiektu w celu odnalezienia odpowiednich godzin spotkań dla każdej z osób.
Potencjalne spotkania uzależnione są od takich czynników jak:
- Czas trwania spotkania
- Godziny pracy każdej z osób 
- Zaplanowane już godziny spotkań w których potencjalne spotkanie nie może zostać zrealizowane
- Zabezpieczenie aplikacji przed błędami oraz wypisanie w takiej sytuacji bloku informacyjnego w konsoli. 

W Aplikacji założyłem iż:
- Minimalny czas spotkania wynosi 30 minut.
- Spotkania mogą zaczynać się  i kończyć o równych godzinach lub godzinach z 30 minutowym opóźnieniem np. 18:30, 12:30 itd. 
- Typem wyjściowym będzie String, rozważałem również pracę z biblioteką localtime w której to stworzę 2 wersję aplikaji. 
- Aplikacja zwróci godziny potencjalnych spotkań w odpowiednich długościach czasu wynikających z argumentu meetingDuration funkcji letsmeet znajdujacej sie w katalogu src pakietu entity , wywolanej na obiekcie meeting w klasie Starter. 

#Pobierz aplikacje i otrzymaj wynik
Pobierz repozytorium, otwórz w kompilatorze, w klasie Starter ustaw odpowiedni parametr meetingDuration i ciesz się wynikami propozycji spotkań ! 

#Zmiany w plikach JSON 
Pliki z kalendarzami 1 jak i 2 osoby znajdują się w katalogu resources, pod nazwami calendar1, calendar2. Chcesz zmienić aktualne godziny spotkań, dodac lub usunac spotkanie, nic prostrzego!

#pom.xml - dependencies
- Maven
- Gson

#Autor
Grzegorz Poznański Skaler12 - Github 
