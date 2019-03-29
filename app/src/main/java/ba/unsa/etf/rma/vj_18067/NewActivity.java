package ba.unsa.etf.rma.vj_18067;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static ba.unsa.etf.rma.vj_18067.MainActivity.muzicari;


public class NewActivity extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4, textView5, textView6;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> pjesme;
    private Button share;

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
        listView = (ListView)findViewById(R.id.listaPjesama);
        pjesme = getIntent().getStringArrayListExtra("listaPjesama");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pjesme);
        listView.setAdapter(adapter);
        share = (Button)findViewById(R.id.share);


        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = getIntent().getStringExtra("webStranica");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    searchYoutubeVideo(NewActivity.this, pjesme.get(position)+" "+getIntent().getStringExtra("imeAutora"));
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, getIntent().getStringExtra("biografija"));
                sendIntent.setType("text/plain");
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }
        });

    }
    public static void searchYoutubeVideo(Context context, String id){
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/results?search_query=" + id));
        try {
            context.startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            ex.printStackTrace();
            context.startActivity(webIntent);
        }
    }
}
