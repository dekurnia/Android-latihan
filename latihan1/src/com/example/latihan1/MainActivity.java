package com.example.latihan1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
EditText nama;
Button ok;
TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ok = (Button) findViewById(R.id.ok);        
        output = (TextView) findViewById(R.id.output);
        
        }
    
    public void hasil (View v){
    	nama = (EditText) findViewById (R.id.nama);
    	nama.getText().toString();
    	String name = String.valueOf(nama.getText().toString());
    	output.setText("Nama Anda Adalah "+name);
    	}

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
