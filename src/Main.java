import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        switch (num){
            case 5:
                System.out.println("Is five");
                break;
            case 6:
                System.out.println("Is six");
                break;
            default:
                System.out.println("Is no six or five");
        }

        funtionTest(true);
    }

    public static void response(boolean validation){
        System.out.println("hello world");
    }

    public static void funtionTest(boolean validation){
        for(int ind = 0; ind < 25; ind++)
            System.out.println("Just a funtion test");
    }
}

