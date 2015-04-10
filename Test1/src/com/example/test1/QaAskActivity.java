package com.example.test1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class QaAskActivity extends Activity {
	
	private EditText subjectTxt;
	private EditText noteTxt;
	private Button btnSend;
	private ImageView attachButton;
	
	private String subjectString;
	private String noteString;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qa_ask);
		
		subjectTxt = (EditText) findViewById(R.id.qa_ask_subject);
		noteTxt = (EditText) findViewById(R.id.qa_ask_note);
		attachButton = (ImageView) findViewById(R.id.qa_ask_attach_button);
		btnSend = (Button) findViewById(R.id.button_qa_ask_send);
		
		// Strings get from UI
		subjectString = subjectTxt.getEditableText().toString();
		noteString = noteTxt.getEditableText().toString();
		
		
		attachButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 添加附件的操作
			}
		});
		
		btnSend.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				// Post mysql statement here:
				// 参考QaFbAnswerActivity， create a classextends AsyncTask<String, String, String>
				// call:	new class().execute();
				
				// 把下面的代码放在 先的class -> onPostExecute > runOnUiThread(new Runnable() { -> public void run() {
				// begin
				QaAskActivity.this.runOnUiThread(new Runnable() {
					@Override
					public void run() {
						new AlertDialog.Builder(QaAskActivity.this)
				        .setMessage("Message Sent Successfully.")
				        .setTitle("Send")
				        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog, int whichButton) {
				                dialog.dismiss();
				                Intent intent = new Intent(QaAskActivity.this, QAActivity.class);
								startActivity(intent);
				            }
				        })		        
				        .show();
					}
				});
				// end
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.qa_ask, menu);
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
