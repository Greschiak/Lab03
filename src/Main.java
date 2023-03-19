import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner wprowadzanie = new Scanner(System.in);
        int NumerZadania;
        do{
            System.out.print("\n----------------------------------------------------------------------------------\n");
            System.out.print("Wybierz numer zadania\n");
            System.out.print("1. Srednia ilosc punktow w grupie\n");
            System.out.print("2. Wczytywanie 10 licz i wyznaczanie ilości  oraz  sumy  liczb ujemnych i dodatnich \n");
            System.out.print("3. Obliczanie sumy wszystkich liczb parzystych w ciągu n liczb\n");
            System.out.print("4. Obliczanie sumy wszystkich liczb parzystych w ciągu n liczb (zakres -10,45)\n");
            System.out.print("5. Czy palindrom?\n");
            System.out.print("0. Zakoncz dzialanie programu\n");
            NumerZadania = wprowadzanie.nextInt();
            switch (NumerZadania) {
                case 1:
                    zadanie1.zadanie(wprowadzanie);
                    break;
                case 2:
                    zadanie2.zadanie(wprowadzanie);
                    break;
                case 3:
                    zadanie3.zadanie(wprowadzanie);
                    break;
                case 4:
                    zadanie4.zadanie(wprowadzanie);
                    break;
                case 5:
                    zadanie5.zadanie(wprowadzanie);
                    break;
                case 0:
                    System.out.println("koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy numer zadania.");
                    break;
            }
        }while(NumerZadania !=0);
    }
}
class zadanie1 {
    public static void zadanie(Scanner wprowadzanie){
        int n;
        double Punkty;
        double Suma=0;
        int i =0;
        double Srednia;
        System.out.print("Wprowadz ilosc studentow w grupie: ");
        n = wprowadzanie.nextInt();
        while(i<n){
            System.out.print("Podaj ilosc punktow dla studenta nr." + (i+1) + ": ");
            Punkty = wprowadzanie.nextDouble();
            Suma= Suma + Punkty;
            i++;
        }
        Srednia =Suma/n;
        System.out.print("\nŚrednia ilosc punktow wynosi: " + Srednia+"\n");

    }

}
class zadanie2 {
    public static void zadanie(Scanner wprowadzanie){
        double liczba;
        int IloscDodatnich=0;
        double SumaDodatnich=0;
        int IloscUjemnych=0;
        double SumaUjemnych=0;
        for(int i =0;i<10;i++){
            System.out.print("Wprowadz " + (i+1) + " liczbę: ");
            liczba = wprowadzanie.nextDouble();
            if (liczba > 0) {
                SumaDodatnich =SumaDodatnich+ liczba;
                IloscDodatnich++;
            }
            else if (liczba < 0) {
                SumaUjemnych =SumaUjemnych+ liczba;
                IloscUjemnych++;
            }
        }
        System.out.println("Suma liczb dodatnich: " + SumaDodatnich);
        System.out.println("Ilość liczb dodatnich: " + IloscDodatnich);
        System.out.println("Suma liczb ujemnych: " + SumaUjemnych);
        System.out.println("Ilość liczb ujemnych: " + IloscUjemnych);
    }
}
class zadanie3 {
    public static void zadanie(Scanner wprowadzanie){
        Random rand = new Random();
        System.out.print("Wprowadz ilosc liczb: ");
        int n = wprowadzanie.nextInt();
        int suma=0;
        for(int i =0; i<n;i++){
            int a =rand.nextInt(101);//od 0 do 100
            if(a%2==0){
                suma = suma + a;
            }
        }
        System.out.print("Suma parzystych wynosi: " + suma);



    }

}
class zadanie4 {
    public static void zadanie(Scanner wprowadzanie){
        Random rand = new Random();
        System.out.print("Wprowadz ilosc liczb: ");
        int n = wprowadzanie.nextInt();
        int suma=0;
        for(int i =0; i<n;i++){
            int a =rand.nextInt(56)-10;
            if(a%2==0){
                suma = suma + a;
            }
        }
        System.out.print("Suma parzystych wynosi: " + suma);

    }
}
class zadanie5 {
    public static void zadanie(Scanner wprowadzanie) {
        System.out.print("Wprowadz słowo: ");
        String slowo = wprowadzanie.next();
        if (czyPalindrom(slowo)) {
            System.out.println(slowo + " jest palindromem");
        } else {
            System.out.println(slowo + " nie jest palindromem");
        }
    }
    public static boolean czyPalindrom(String slowo) {
        for (int i = 0; i < slowo.length() / 2; i++) {
            char znak = slowo.charAt(i);
            char znakPrzeciwny = slowo.charAt(slowo.length() - 1 - i);
            if (znak != znakPrzeciwny) {
                return false;
            }
        }
        return true;
    }


}

