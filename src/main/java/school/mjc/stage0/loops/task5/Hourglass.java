package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {

            int spaces, symbols;

            if (i <= height / 2) {
                spaces = i;
                symbols = height - 2 * i;
            } else {
                spaces = height - 1 - i;
                symbols = height - 2 * spaces;
            }
            for (int j = 0; j < spaces; j++) System.out.println(" ");
            for (int k = 0; k < symbols; k++) System.out.println("8");


            System.out.println();
        }
    }
}
