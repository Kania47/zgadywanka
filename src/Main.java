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

    }
}