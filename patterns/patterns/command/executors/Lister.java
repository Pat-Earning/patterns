package patterns.command.executors;

import patterns.command.BluetoothDevice;

public class Lister {
    private BluetoothDevice bluetoothDevice;

    public Lister(BluetoothDevice bluetoothDevice){
        this.bluetoothDevice = bluetoothDevice;
    }

    public void List() {
        System.out.println("Listing using " + bluetoothDevice);
    }
}
