/* MainActivity.java needs to implement this interface so that it can receive and process data
produced by the Bluetooth scanning process.*/

package com.example.bletest.bluetooth;

import android.bluetooth.BluetoothDevice;

public interface ScanResultsConsumer {
    public void candidateBleDevice(BluetoothDevice device, byte[] scan_record, int rssi);
    public void scanningStarted();
    public void scanningStopped();
}
