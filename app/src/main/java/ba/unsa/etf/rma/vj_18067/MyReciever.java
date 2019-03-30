package ba.unsa.etf.rma.vj_18067;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import static android.net.ConnectivityManager.EXTRA_NO_CONNECTIVITY;


public class MyReciever extends BroadcastReceiver {

        public MyReciever() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
                //https://developer.android.com/reference/android/net/ConnectivityManager
                if(intent.getBooleanExtra(EXTRA_NO_CONNECTIVITY,false))
                        Toast.makeText(context,"Nema interneta!!!",Toast.LENGTH_LONG).show();
        }


}
