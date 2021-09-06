package com.lessons.junior.n004;

public class WalkthroughLabyrinth {

    private final Labyrinths labyrinths;
    private final int startX, startY;

    public WalkthroughLabyrinth(Labyrinths labyrinths, int x, int y) {
        this.labyrinths = labyrinths;
        startX = x;
        startY = y;
    }

    public boolean run() {
        Step step = new Step(startX, startY);
        return step.start();
    }

    class Step {
        int x, y;
        Step previousStep;

        public Step(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean start() {

            return false;
        }
    }
}
