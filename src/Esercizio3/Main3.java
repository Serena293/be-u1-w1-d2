package Esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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
}
