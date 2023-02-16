package exoTI;
import java.util.Arrays;

public class exercie1 {
    public static void firstUpperCase(String val) {
        String[] valSplit = val.split("\\s+");
        String resultat = "";
        for (int i = 0; i < valSplit.length; i++) {
            String intermediate = valSplit[i].substring(0,1).toUpperCase() + valSplit[i].substring(1);
            resultat += intermediate + " ";
        }
        System.out.println(resultat);
    }

    public static void longuestWord(String str) {
        String[] strSplit = str.split("\\s+");
        int index = 0;
        for (int i = 0; i < strSplit.length; i++) {
            if(strSplit[i].length() > strSplit[i+1].length()) {
                index = strSplit[i].length();
            } 
        }
        System.out.println("La longueur du mot le plus lon est: " + index);

    }

    public static void main(String[] args) {
        String phrase = "deha estelle soit forte";
        firstUpperCase(phrase);

        String groupeMot = "impecablement jolie sont les enfants de Dieu";
        longuestWord(groupeMot);
    }
}
