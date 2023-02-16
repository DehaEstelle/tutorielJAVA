import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Permut {
    public static void permut() {
        int c;
        Scanner scr = new Scanner(System.in);

        System.out.println("Veuillez entrez un premier nombre");
        int a = scr.nextInt();

        System.out.println("Veuillez entrez un second nombre");
        int b = scr.nextInt();

        System.out.println("Avant permutation: \n x: "+ a + "\n y: "+ b);

        c= a;
        a = b;
        b = c;

        System.out.println("Apres permutation: \n x: "+ a + "\n y: "+ b);

    }

    public String produit(int x, int y) {
        return "Le produit de "+ x +" et "+ y + " est: " + x*y;
    }
    public void demiSomme() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Veuillez entrer un premier nombre");
        int nbr1 = scr.nextInt();

        System.out.println("Veuillez entrer un second nombre");
        int nbr2 = scr.nextInt();

        int total;
        total = (nbr1 + nbr2) / 2;

        System.out.println("La demi-somme de "+nbr1 + " et "+nbr2 + " est: " +total);
    }

    public void pairOrImpair() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre");
        int nbr = scr.nextInt();

        if (nbr % 2 == 0) {
            System.out.println(nbr + " est un nombre pair");
        } else {
            System.out.println(nbr + " est un nombre impair");
        }
    }

    public void plusGrand() {
        Scanner scr = new Scanner(System.in);

        int max = 0;
        for(int i = 1; i <= 3; i++) {
            System.out.println("Veuillez entrer le nombre " + i);
            int nbr = scr.nextInt();

            if(nbr > max) {
                max = nbr;
            }
        }

        System.out.println("Le plus grand entier saisis est: "+ max); 
    }

    // public void minMax() {
    //     Scanner scr = new Scanner(System.in);
    //     int [] arr = {};
    //     for(int i=0; i < arr.length; i++) {
    //         System.out.println("Veuillez entrer le nombre n°"+ i);
    //         int x = scr.nextInt();
    //         arr[i] = x;
    //     }
    //     System.out.println(arr);
    // }

    public void minMax(Integer[] arr) {
        

        int max = 0;
        int min = 0;
        Arrays.sort(arr, Collections.reverseOrder()); 
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            max = arr[0];
            min = arr[arr.length - 1];
        }
        System.out.println("Le plus grand nombre des entiers saisis est: "+ max);
        System.out.println("Le plus petit nombre des entiers saisis est: "+ min);
    }

    public static void main(String[] args) {
        Permut obj = new Permut();
        // permut();
        // System.out.println(obj.produit(5, 6));
        // obj.demiSomme();
        // obj.pairOrImpair();
        // obj.plusGrand();

        Integer[] tab =  {12, 15, 2, 78, 4};
        obj.minMax(tab);
    } 
}
