package com.example.latihan2;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class MainActivity extends Activity {
	int gajiStatus, gajiGolongan;
	RadioButton gol1,gol2;
	RadioGroup golongan;
	Button hitung;
	CheckBox status;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }


public void hitung (View v){
	EditText nama= (EditText) findViewById(R.id.nama);
	TextView outputNama = (TextView) findViewById(R.id.outputNama);
	String name = nama.getText().toString();
	outputNama.setText("Total Gaji +name");
	
	status = (CheckBox) findViewById(R.id.menikah);
	if (status.isChecked()){
		gajiStatus=500000;
	};
	
	golongan = (RadioGroup) findViewById(R.id.rgGolongan); 
	int gol = golongan.getCheckedRadioButtonId();
	if (gol== R.id.rbGolongan1){
		gajiGolongan = 1000000;
		
	}else
		if (gol == R.id.rbGolongan2){
			gajiGolongan = 200000;
		};
	
			
int totalGaji = gajiStatus+gajiGolongan;
	TextView total = (TextView) findViewById(R.id.outputGaji);
	total.setText(String.valueOf(totalGaji));
				
}
    
};
