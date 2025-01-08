import javax.imageio.stream.FileCacheImageOutputStream;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Esercizio 1
        pariDispari("pari");
        pariDispari("dispari");

        System.out.println();

//anno bisestile
    annoBisestile(2020);
    annoBisestile(2021);
    annoBisestile(2022);
    annoBisestile(2024);

        System.out.println();

        //Esercizio 2
 /*       System.out.println(" Esercizio 2: Inserire un numero");
        int num = scanner.nextInt();
switch (num){
    case 0:
        System.out.println("zero");
        break;
    case 1:
        System.out.println("uno");
        break;
    case 2:
        System.out.println("due");
        break;
    case 3:
        System.out.println("tre");
        break;
    default:
        System.out.println("Numero non valido");
        break;
}
*/

//Esercizio 3

        String str;
do{

    System.out.println("Inserisci stringa");
    str = scanner.nextLine();
    if(Objects.equals(str, ":q"))
        break;

    char[] charArray = str.toCharArray();
    for (char c : charArray) {
        System.out.print(c + ",");
    }
    System.out.println();
    } while (true);

        scanner.close();
    }





    public static boolean pariDispari(String str){
        boolean result = true;
        if(str.length() % 2 != 0)
            result =false;
        System.out.println(result);
        return  result;
    }

    public static boolean annoBisestile(int anno){
        boolean result = false;

        if (anno % 4 == 0){
            if(anno % 100 != 0 || anno % 400 == 0)
            { result = true;
        }
}
        System.out.println(result);
        return result;
    }



}







