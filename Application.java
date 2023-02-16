import java.util.Arrays;

class Application {

    //exercice 1

    public void firstUpperCase(String str) {
        String[] arr = str.split(" ");
        System.out.println(arr);
    }

    public static void main(String[] args){
        Application obj = new Application();

        obj.firstUpperCase("hello world");
    }
}

