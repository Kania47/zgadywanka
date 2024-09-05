import java.util.Scanner;

public class Main {
    //Nazwa pliku i nazwa klasy muszą być takie same
    //nazwy klas powinny być z wielkiej litery - tak karze obyczaj
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Witamy na lekcjach programowania");
        //typ prosty - tylko wartośc, z małej litery
        /*
        boolean,
        int long  short byte
        float double
        char
         */
        //typ zlozony - obiekt ktory ma walansosci i metody, z wielkiej litery
        int wylosowanaLiczba = (int)(Math.random()*10+1);//rzutowanie

        System.out.println(wylosowanaLiczba);

        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();

        if(wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Gratulacje wygrana");
        }
        else {
            System.out.println("Pudło");
        }
        int roznica = wylosowanaLiczba>wpisanaLiczba? wylosowanaLiczba-wpisanaLiczba : wpisanaLiczba-wylosowanaLiczba;
        System.out.println(roznica);
        roznica = roznica/10;//dzielenie calkowite

            switch (roznica){
                case 0:
                    System.out.println("gj");
                    break;
                case 1:
                    System.out.println("blisko");
                    break;
                case 2:
                    System.out.println("moglo byc lepiej");
                    break;
                case 3:
                    System.out.println("źle");
                    break;
            }
        System.out.println(switch(roznica){
            case 0 -> "Bardzo dobrze";
            case 1 -> "Blisko";
            case 2 -> "dość blisko";
            default -> "słabo";
        });
            //zgaduje 10 razy
        for (int i = 0; i <10 ; i++) {
            System.out.println("podaj liczbe");
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Gratulacje");
                break;
            }

        }
        do {
            System.out.println("podaj liczbe:");
            wpisanaLiczba = klawiatura.nextInt();
            while (wylosowanaLiczba != wpisanaLiczba) {
                if (wylosowanaLiczba > wpisanaLiczba) {
                    System.out.println("Wpisano za mało");
                } else {
                    System.out.println("wpisano za duzo");
                }

            }
            while (wylosowanaLiczba != wpisanaLiczba);
                System.out.println("Gratulacje Wygrana");
        }
    }
}