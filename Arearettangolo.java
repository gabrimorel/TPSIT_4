package arearettangolo;
import java.util.Scanner;

public class Arearettangolo {
    public static void main(String[] args) {
        int lato;
        int altezza;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("inserisci un lato");
        lato = input.nextInt();
        }while(lato <= 0);
        do{
        System.out.println("inserisci altezza");
        altezza = input.nextInt();
        }while(altezza <= 0);
        int area = lato*altezza;
        int perimetro = (lato+altezza)*2;
        System.out.println("AREA:   "+area);
        System.out.println("PERIMETRO:   "+perimetro);

    }
}
