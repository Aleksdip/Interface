import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner in = new Scanner(System.in);
        System.out.println("Instruction users:");
        System.out.println("1 - start play music; 2 - pause play; 3 - stop play");
        System.out.println("4 - start record music; 5 - pause rec; 6 - stop rec");
        System.out.println("0 - exit of the player");

        for (; ; ) {
            int function = in.nextInt();

            switch (function) {
                case 1: {
                    player.play();
                    continue;
                }
                case 2: {
                    System.out.print("Playing ");
                    player.pause();
                    continue;
                }
                case 3: {
                    System.out.print("Playing ");
                    player.stop();
                    continue;
                }
                case 4: {
                    player.record();
                    continue;
                }
                case 5: {
                    System.out.print("Recording ");
                    player.pause();
                    continue;
                }
                case 6: {
                    System.out.print("Recording ");
                    player.stop();
                    continue;
                }
                case 0: {
                    System.out.print("Exit");
                    break;
                }
                default: System.out.print("Error. For exit enter '0'\n");
                continue;
            }
            break;
        }
    }
}