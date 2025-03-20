import java.util.Scanner;


public class Exercice4 {

    public static void main(String[] args){
        // boucle while
        /* int i = 1;
        while(i <= 10){
            System.out.println(i);
            i = i + 1;
        }

        // boucle for
        for( int i = 1 ; i <= 10; i++){
            System.out.println(i);

        }

        // boucle do-while
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i <= 10);



        // afficher les entiers de 10 à 1
        for(int i = 10 ; i >= 1; i--){
            System.out.println(i);
        }
         */
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("entrez un entier n: ");
        int n = scanner.nextInt();

         */

        // boucle for allant de 1 à n
        /*for (int i = 1; i <= n  ; i++){
            System.out.println(i);
        }

         */

        //afficher les nombres pairs compris entre 1 et 100
       /* for(int j = 1 ; j <= 100; j++){
            if (j % 2 == 0){
                System.out.println(j);
            }
        }

        */
        //afficher les nombres impairs sans le if
       /* int j = 1;
        while(j <= 100){
            System.out.println(j);
            j = j + 2;
        }

        */

        //afficher les entiers multiples de 3 mais non multiples de 5
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println(i);
            }

        }








    }

}
