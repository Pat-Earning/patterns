package patterns.command;

public class BluetoothDevice {
    private static BluetoothDevice ourInstance = new BluetoothDevice();

    public static BluetoothDevice getInstance() {
        return ourInstance;
    }

    private BluetoothDevice() {
    }

    @Override
    public String toString() {
        return "BT device";
    }

}
