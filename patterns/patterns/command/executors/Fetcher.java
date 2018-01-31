package patterns.command.executors;

import patterns.command.BluetoothDevice;

public class Fetcher {
    private BluetoothDevice bluetoothDevice;

    public Fetcher(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;

    }

    public void fetch() {
        System.out.println("Fetching no. " + CommandParameters.getInstance().getItem() + " using " + bluetoothDevice);

    }
}
