package edu.upc.eetac.dsa.dsaapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count;
    private EditText myinputtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        TextView tvHello =(TextView)findViewById(R.id.tvHello);
//        tvHello.setText(getString(R.string.label_hello) + count);

        myinputtext = (EditText) findViewById(R.id.tvhello2);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    public final static String TAG = MainActivity.class.getName();

//    public void clickMe(View button) {
//        Log.d("TAG", getString(R.string.someoneclicked));
//    }

    public final static String TAGcount = MainActivity.class.getName();

//    public void clickMe(View button) {
//        count++;
//        TextView tvHello =(TextView)findViewById(R.id.tvHello);
//        tvHello.setText(getString(R.string.label_hello) + count);
//
//
//        Log.d("TAGcount", count+"");
//    }

}
