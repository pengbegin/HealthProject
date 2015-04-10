package com.example.test1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SelfReportAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_self_report);
        SeekBar seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
        Button button1=(Button)findViewById(R.id.button1);
        final TextView textView8=(TextView)findViewById(R.id.textView8);
		
		seekBar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
			@Override
			public void onProgressChanged(SeekBar arg0
				, int progress, boolean fromUser)
			{
				textView8.setText(String.valueOf(progress)+" mmHg");		
			}
			@Override
			public void onStartTrackingTouch(SeekBar bar){}
			@Override
			public void onStopTrackingTouch(SeekBar bar){}
		});
        
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				// Toast.makeText(getApplicationContext(), "Click On Image 1", Toast.LENGTH_LONG).show();
				Intent intent = new Intent(SelfReportAct.this, AfterExerAct.class);
				startActivity(intent);
		
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pre_exer, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
