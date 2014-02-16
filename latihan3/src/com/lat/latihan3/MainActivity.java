package com.lat.latihan3;

import android.R.interpolator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	Button webkfc=(Button) findViewById(R.id.skfc);
	Button phonekfc = (Button) findViewById(R.id.pkfc);
	Button webmcd = (Button) findViewById(R.id.smcd);
	Button phonemcd = (Button) findViewById(R.id.pmcd);
	
	webkfc.setOnClickListener(new Button.OnClickListener(){
		public void onClick(View v){
			callintent(v);
		}
	});
	
	phonekfc.setOnClickListener(new Button.OnClickListener(){
		public void onClick(View v){
			callintent(v);
		}
	});
	
	webmcd.setOnClickListener(new Button.OnClickListener(){
		public void onClick(View v){
			callintent(v);
		}
	});
	
	phonemcd.setOnClickListener(new Button.OnClickListener(){
		public void onClick(View v){
			callintent(v);
		}
	});	
	}	


public void callintent(View view){
Intent intent =null;
	switch (view.getId()){
		case R.id.pkfc:
			intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:085863311476"));
			startActivity(intent);
			break;
		case R.id.skfc:
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
			startActivity(intent);
			break;			
		case R.id.pmcd:
			intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:14045"));
			startActivity(intent);
			break;		
		case R.id.smcd:
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mcdelivery24hrs.com"));
			startActivity(intent);
			break;
			default:
			break;	
	
	}
}
	

@Override
protected void onActivityResult(int requestCode, int resultCode,Intent data) {
	if (resultCode == Activity.RESULT_OK && requestCode == 0) 
	{
		String result = data.toURI();
		Toast.makeText(this, result, Toast.LENGTH_LONG);
}
}
	


}