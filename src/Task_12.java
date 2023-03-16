/**
 * Task12: На игровом поле расположен робот. Метоположение робота задано
 * координатами по оси Х и по оси Y.
 * Также известно, в какую сторону сморит робот: up, left, down и right.
 * Необходимо привести робота из начальной точки в заданную.
 * Input: Robot robot , int toX , int toY
 * Output: void
 */
public class Task_12 {
    public static void solve(Robot robot, int toX, int toY) {
        int diffX = robot.getX() - toX;
        int diffY = robot.getY() - toY;
        while (!(diffX == 0 && diffY == 0)) {
            if (diffX > 0) {
                switch (robot.getDirection()) {
                    case Direction.UP:
                        robot.turnLeft();
                        break;
                    case Direction.LEFT:
                        break;
                    case Direction.DOWN:
                        robot.turnRight();
                        break;
                    case Direction.RIGHT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
                diffX--;
            } else if (diffX < 0) {
                switch (robot.getDirection()) {
                    case Direction.UP:
                        robot.turnRight();
                        break;
                    case Direction.LEFT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case Direction.DOWN:
                        robot.turnLeft();
                        break;
                    case Direction.RIGHT:
                        break;
                    default:
                        break;
                }
                diffX++;
            }

            else if (diffY > 0) {
                switch (robot.getDirection()) {
                    case Direction.UP:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case Direction.LEFT:
                        robot.turnLeft();
                        break;
                    case Direction.DOWN:
                        break;
                    case Direction.RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
                diffY--;
            }

            else if (diffY < 0) {
                switch (robot.getDirection()) {
                    case Direction.UP:
                        break;
                    case Direction.LEFT:
                        robot.turnRight();
                        break;
                    case Direction.DOWN:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case Direction.RIGHT:
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
                diffY++;
            }

            robot.stepForward();
            System.out.println(robot.getX() + " ; " + robot.getY());
        }
    }
}

enum Direction {
    UP, LEFT, DOWN, RIGHT
};

class Robot {

    private int coordX;
    private int coordY;
    private Direction dir;

    public Robot(int c_x, int c_y, Direction d) {
        this.coordX = c_x;
        this.coordY = c_y;
        this.dir = d;
    }

    public Direction getDirection() {
        return this.dir;
    }

    public int getX() {
        return this.coordX;
    }

    public int getY() {
        return this.coordY;
    }

    public void turnLeft() {
        switch (this.dir) {
            case UP:
                this.dir = Direction.LEFT;
                break;
            case LEFT:
                this.dir = Direction.DOWN;
                break;
            case DOWN:
                this.dir = Direction.RIGHT;
                break;
            case RIGHT:
                this.dir = Direction.UP;
                break;
            default:
                System.out.println("Movement Error");
                break;
        }
    }

    public void turnRight() {
        switch (this.dir) {
            case UP:
                this.dir = Direction.RIGHT;
                break;
            case LEFT:
                this.dir = Direction.UP;
                break;
            case DOWN:
                this.dir = Direction.LEFT;
                break;
            case RIGHT:
                this.dir = Direction.DOWN;
                break;
            default:
                System.out.println("Movement error");
                ;
                break;
        }
    }

    public void stepForward() {
        switch (this.dir) {
            case UP:
                this.coordY += 1;
                break;
            case LEFT:
                this.coordX -= 1;
                break;
            case DOWN:
                this.coordY -= 1;
                break;
            case RIGHT:
                this.coordX += 1;
                break;
            default:
                System.out.println("Movement error");
                break;
        }
    }
}
