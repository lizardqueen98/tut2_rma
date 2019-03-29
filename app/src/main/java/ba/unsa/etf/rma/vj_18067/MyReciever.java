package ba.unsa.etf.rma.vj_18067;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;


public class MyReciever extends BroadcastReceiver {

        public MyReciever() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
                Toast.makeText(context,"Nema interneta!!!",Toast.LENGTH_LONG).show();
        }
        /*public boolean isConnected(Context context) {
                ConnectivityManager cm =
                        (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

                NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
                boolean isConnected = activeNetwork != null &&
                        activeNetwork.isConnected();
                return isConnected;
        }*/

}
