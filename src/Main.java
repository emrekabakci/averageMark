import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, chem , turkish, history, music;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuz : ");
        math = input.nextInt();

        System.out.print("Fizik notunuz : ");
        physics = input.nextInt();

        System.out.print("Kimya notunuz : ");
        chem = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkish = input.nextInt();

        System.out.print("Tarih notunuz : ");
        history = input.nextInt();

        System.out.print("Muzik notunuz : ");
        music = input.nextInt();

        int sum = (math + physics + chem + turkish + history + music);
        double result = sum / 6.0;
        System.out.println("Ortalamaniz : " + result);

        String pass = result > 60 ? "Sinifi gecti" : "Sinifta kaldi";

        System.out.println(pass);

    }
}