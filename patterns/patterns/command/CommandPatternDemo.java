package patterns.command;


public class CommandPatternDemo {
    public static void main(){
        ControlBoard controlBoard = ControlBoard.getInstance();

        controlBoard.list();
        controlBoard.fetch(8);
    }
}
