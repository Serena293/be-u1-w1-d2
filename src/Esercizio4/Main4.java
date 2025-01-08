package Esercizio4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int num = scanner.nextInt();

    // il ciclo parte al valore inserito
    //se il numero è maggiore di uno ad ogni iterazione verrà sottratto 1
        for(int i = num; i>= 1 ; i--){
            System.out.println(i);
        }

     scanner.close();
    }

}

