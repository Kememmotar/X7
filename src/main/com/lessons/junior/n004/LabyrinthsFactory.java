package com.lessons.junior.n004;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabyrinthsFactory {

    public int getLabyrinthCount() {
        return labyrinths.size();
    }

    public Labyrinths getLabyrinths(int number) {
        return labyrinths.get(number-1);
    }

    private List<Labyrinths> labyrinths;

    public LabyrinthsFactory() {
        labyrinths = new ArrayList<>();
    }

    private boolean[][] loadLabyrinth(Path path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path.toString()));
        int x = 0, y = 0, tempY = 1;
        String [] splitted;
        if (sc.hasNext()) {
            splitted = sc.nextLine().split(" ");
            y = Integer.parseInt(splitted[0]);
            x = Integer.parseInt(splitted[1]);
        }
        boolean[][] data = new boolean[x][y];
        while (sc.hasNext()) {
            if (tempY == y) break;
            splitted = sc.nextLine().split("");
            for (int i = 0; i < x; i++)
                data[i][tempY] = !splitted[i].equals("#");
            tempY++;
        }
        return data;
    }

    public boolean loadAndCreate(String path) {
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(
                Paths.get(path), "*.in")) {

            for (Path entry : dir) {
                try {
                    labyrinths.add(new Labyrinths(loadLabyrinth(entry)));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
