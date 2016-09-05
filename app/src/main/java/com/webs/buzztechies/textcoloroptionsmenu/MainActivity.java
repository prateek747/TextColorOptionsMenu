package com.webs.buzztechies.textcoloroptionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.textcolor_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                Toast.makeText(getApplicationContext(),"Red is selected",Toast.LENGTH_LONG).show();
                text.setTextColor(getResources().getColor(R.color.red));
                return true;
            case R.id.blue:
                Toast.makeText(getApplicationContext(),"Blue is selected",Toast.LENGTH_LONG).show();
                text.setTextColor((getResources().getColor(R.color.blue)));
                return true;
            case R.id.green:
                Toast.makeText(getApplicationContext(),"Green is selected", Toast.LENGTH_LONG).show();
                text.setTextColor((getResources().getColor(R.color.green)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
