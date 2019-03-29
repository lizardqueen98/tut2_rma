package ba.unsa.etf.rma.vj_18067;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReciever extends BroadcastReceiver {

        public MyReciever() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
                System.out.println("ufatio ga");
        }

}
