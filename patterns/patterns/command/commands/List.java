package patterns.command.commands;

import patterns.command.BluetoothDevice;
import patterns.command.executors.Lister;

public class List implements Command {
    private Lister lister;

    public List(BluetoothDevice bluetoothDevice) {
        this.lister = new Lister(bluetoothDevice);
    }

    @Override
    public void execute() {
        lister.List();

    }
}
