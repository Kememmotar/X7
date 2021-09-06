package com.lessons.junior.n004;

import java.io.File;
import java.util.Scanner;

public class LabyrinthGame {

    public static void main(String[] args) {
        int x = -1, y = -1, number = 0, count;

        LabyrinthsFactory labyrinthsFactory = new LabyrinthsFactory();
        labyrinthsFactory.loadAndCreate("E:\\Programming\\Java\\X5\\src\\main\\com\\lessons\\junior\\n004\\Labyrinths"); // С путём ещё не разобрался
        count = labyrinthsFactory.getLabyrinthCount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose labyrinth (1 - " + count);

        while (number < 1 || number > count) {
            if (scanner.hasNextInt())
                number = scanner.nextInt();
        }
        System.out.println("Input coordinates (x and y): ");

        while (x == -1) {
            if (scanner.hasNextInt())
                x = scanner.nextInt();
        }
        while (y == -1) {
            if (scanner.hasNextInt())
                y = scanner.nextInt();
        }
        WalkthroughLabyrinth walkthroughLabyrinth = new WalkthroughLabyrinth(labyrinthsFactory.getLabyrinths(number), x, y);

    }

}
