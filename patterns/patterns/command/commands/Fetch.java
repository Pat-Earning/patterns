package patterns.command.commands;

import patterns.command.BluetoothDevice;
import patterns.command.executors.Fetcher;

public class Fetch implements Command {
    private Fetcher fetcher;

    public Fetch(BluetoothDevice bluetoothDevice){
        this.fetcher = new Fetcher(bluetoothDevice);
    }

    @Override
    public void execute() {
        fetcher.fetch();
    }

}
