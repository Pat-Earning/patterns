package patterns.command;

import patterns.command.commands.Command;
import patterns.command.commands.Fetch;
import patterns.command.commands.List;
import patterns.command.executors.CommandParameters;

public class ControlBoard {
    private static Command list;
    private static Command fetch;
    private static ControlBoard ourInstance = new ControlBoard();

    public static ControlBoard getInstance() {
        return ourInstance;
    }

    private ControlBoard() {
        BluetoothDevice bluetoothDevice = BluetoothDevice.getInstance();
        list = new List(bluetoothDevice);
        fetch = new Fetch(bluetoothDevice);

    }

    public void list() {
        list.execute();
    }

    public void fetch(Integer number) {
        CommandParameters.getInstance().setItem(number);
        fetch.execute(); }
}
