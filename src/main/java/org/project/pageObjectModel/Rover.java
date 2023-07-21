package org.pageObjectModel;

public class Rover {
    //    public static final Integer N = 1;
//    public static final Integer E = 2;
//    public static final Integer S = 3;
//    public static final Integer W = 4;
    Integer x, y, facing;

    public Rover() {
    }

    public void initialiseRover() {
        x = 0;
        y = 0;
        facing = 0;
    }

    public void setPosition(Integer x, Integer y, String direction) {
        this.x = x;
        this.y = y;
        if (direction.equals("N")) {
            this.facing = 1;
        }
        if (direction.equals("E")) {
            this.facing = 2;
        }
        if (direction.equals("S")) {
            this.facing = 3;
        }
        if (direction.equals("W")) {
            this.facing = 4;
        }
    }

    public void printPosition() {
        char dir = 'N';
        if (facing == 1) {
            dir = 'N';
        } else if (facing == 2) {
            dir = 'E';
        } else if (facing == 3) {
            dir = 'S';
        } else if (facing == 4) {
            dir = 'W';
        }
        System.out.println(x + " " + y + " " + dir);
    }

    public void process(String commands) {
        for (int idx = 0; idx < commands.length(); idx++) {
            process(commands.charAt(idx));
        }
    }

    private void process(Character command) {
        if (command.equals('L')) {
            turnLeft();
        } else if (command.equals('R')) {
            turnRight();
        } else if (command.equals('M')) {
            move();
        } else {
            throw new IllegalArgumentException(
                    "Speak in Mars language, please!");
        }
    }

    private void move() {
        if (facing == 1) {
            this.y++;
        } else if (facing == 2) {
            this.x++;
        } else if (facing == 3) {
            this.y--;
        } else if (facing == 4) {
            this.x--;
        }
    }

    private void turnLeft() {
        facing = (facing - 1) < 1 ? 4 : facing - 1;
    }

    private void turnRight() {
        facing = (facing + 1) > 4 ? 1 : facing + 1;
    }

}
