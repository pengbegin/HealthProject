package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class RegularReportAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_regular_report);
		SeekBar seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
		SeekBar seekBar2 = (SeekBar)findViewById(R.id.seekBar2);
		SeekBar seekBar3 = (SeekBar)findViewById(R.id.seekBar3);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final TextView textView5=(TextView)findViewById(R.id.textView5);
        final TextView textView7=(TextView)findViewById(R.id.textView7);
        
        
		seekBar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
			@Override
			public void onProgressChanged(SeekBar arg0
				, int progress, boolean fromUser)
			{
				textView2.setText(String.valueOf(progress)+" mmHg");		
			}
			@Override
			public void onStartTrackingTouch(SeekBar bar){}
			@Override
			public void onStopTrackingTouch(SeekBar bar){}
		});
        
		seekBar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
			@Override
			public void onProgressChanged(SeekBar arg0
				, int progress, boolean fromUser)
			{
				textView5.setText(String.valueOf(progress)+" packages");		
			}
			@Override
			public void onStartTrackingTouch(SeekBar bar){}
			@Override
			public void onStopTrackingTouch(SeekBar bar){}
		});
		seekBar3.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
			@Override
			public void onProgressChanged(SeekBar arg0
				, int progress, boolean fromUser)
			{
				textView7.setText(String.valueOf(progress)+" kg");		
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
				Intent intent = new Intent(RegularReportAct.this, AfterExerAct.class);
				startActivity(intent);
		
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.regular_report, menu);
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
