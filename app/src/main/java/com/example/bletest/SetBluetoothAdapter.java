// Montando um sistema para ativar o bluetooth pelo botão
/*
package com.example.bletest;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


public class SetBluetoothAdapter extends AppCompatActivity {


    private static final int REQUEST_ENABLE_BT = 1;
    private BluetoothAdapter bluetoothAdapter;

    public void startBLE(Context context) {

        Context mContext = context;

        final BluetoothManager bluetoothManager =
                (BluetoothManager) mContext.getSystemService(Context.BLUETOOTH_SERVICE);
        bluetoothAdapter = bluetoothManager.getAdapter();

        // Ensures Bluetooth is available on the device and it is enabled. If not,
        // displays a dialog requesting user permission to enable Bluetooth.
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
            //mContext.startActivity(enableBtIntent);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_ENABLE_BT) {
            if (resultCode == Activity.RESULT_OK) {
                System.out.println("Usuário ativou o BLE");
            } else {
                System.out.println("Não ativou o BLE");
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }

    }
}*/
