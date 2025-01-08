import javax.imageio.stream.FileCacheImageOutputStream;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Esercizio 1
        pariDispari("pari");
        pariDispari("dispari");

        System.out.println();

//anno bisestile
    annoBisestile(2020);
    annoBisestile(2021);
    annoBisestile(2022);
    annoBisestile(2024);

    }


    public static boolean pariDispari(String str){

        boolean result = true;

    //Se la lunghezza della stringa è dispari allora il risultato cambia da vero a falso

        if(str.length() % 2 != 0)
            result =false;
        System.out.println(result);
        return  result;
    }

    public static boolean annoBisestile(int anno){
        boolean result = false;

    //un anno è bisestile se divisibile per 4
    //se l'anno termina con 00 (anno secolare) allora è bisestile SOLO se è divisibile per 400

        if (anno % 4 == 0){
            if(anno % 100 != 0 || anno % 400 == 0)
            { result = true;
        }
}
        System.out.println(result);
        return result;
    }

}







