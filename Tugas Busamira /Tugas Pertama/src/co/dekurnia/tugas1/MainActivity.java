package co.dekurnia.tugas1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener{
	EditText txtnama,dateTgl,txtalamat;
	Button ok;
	TextView namasow,tglsow,alamatsow;
	
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      
      ok = (Button) findViewById(R.id.ok);     
      txtnama = (EditText) findViewById(R.id.txtnama);
      dateTgl = (EditText) findViewById(R.id.dateTgl);
      txtalamat = (EditText) findViewById(R.id.txtalamat);
      //nama filed tampildata 
      namasow = (TextView) findViewById(R.id.namasow);
      tglsow=(TextView) findViewById(R.id.tglsow);
      alamatsow=(TextView) findViewById(R.id.alamatsow); 
      ok.setOnClickListener(this);
  }
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==ok){					
		String namadex=txtnama.getText().toString();
		if(namadex.equalsIgnoreCase("")){
			txtnama.setError("Nama Jangan Kosong");
		}
		else {
			namasow.setText("Nama :"+namadex);
		}
		
		String tgl =dateTgl.getText().toString();
		if(tgl.equalsIgnoreCase("")){
			dateTgl.setError("Tanggal Lahir jangan kosong");
		}else {
			tglsow.setText("Tanggal Lahir :"+tgl);
		}
		
		
		String alamat =txtalamat.getText().toString();
		if(alamat.equalsIgnoreCase("")){
			txtalamat.setError("Alamat Jangan kosong");
		}else {
			alamatsow.setText("Alamat :"+alamat);
		}

		}
		
	}
	
}

