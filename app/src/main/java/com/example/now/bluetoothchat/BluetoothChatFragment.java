package com.example.now.bluetoothchat;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Admin on 12/15/2016.
 */

public class BluetoothChatFragment extends Fragment {

    private static final String TAG = "BluetoothChatFragment";

    // Intent request codes
    private static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    private static final int REQUEST_CONNECT_DEVICE_INSECURE = 2;
    private static final int REQUEST_ENABLE_BT = 3;

    // layout views
    private ListView mConversationView;
    private EditText mOutEditText;
    private Button mSendButton;

    // name of the connected device
    private String mConnectedDeviceName = null;

    //Array Adapter for the conversation thread
    private ArrayAdapter<String> mConversationArrayAdapter;

    //String buffer for outgoing messages
    private StringBuffer mOutStringBuffer;

    // local Bluetooth adapter
    private BluetoothAdapter mBluetoothAdapter = null;

    // member object for the chat services
    private BluetoothChatService mChatService = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

    }
}
