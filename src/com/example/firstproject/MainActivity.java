package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	 public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setTitle("le shit");
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void sendMessage(View view){
		Intent intent= new Intent(this, DisplayMessageActivity.class);
		EditText mytext= (EditText) findViewById(R.id.edit_message);
		String message = mytext.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
	
	public boolean onOptionsItemSelected(MenuItem menuItem) {
		
		switch(menuItem.getItemId()) {
			case R.id.action_search:
					openSearch();
					return true;
			case R.id.action_settings:
					openSettings();
					return true;
			default:
	            return super.onOptionsItemSelected(menuItem);
		}	
	}
	
	public void openSearch() {
		TextView text2 = new TextView(this);
		text2.setText("blabla2");
		setContentView(text2);
	}
	
	public void openSettings() {
		
	}
}
