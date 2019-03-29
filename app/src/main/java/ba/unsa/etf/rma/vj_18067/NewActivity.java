package ba.unsa.etf.rma.vj_18067;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import static ba.unsa.etf.rma.vj_18067.MainActivity.muzicari;


public class NewActivity extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4, textView5, textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        //u android manifestu sam dodala mogucnost da se i ova aktivnost poziva odvojeno
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(getIntent().getStringExtra("imeAutora"));
        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(getIntent().getStringExtra("prezimeAutora"));
        textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(getIntent().getStringExtra("biografija"));
        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(getIntent().getStringExtra("zanr"));
        textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(getIntent().getStringExtra("webStranica"));


        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = getIntent().getStringExtra("webStranica");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}