package com.example.hallo_android_anaylse;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import java.util.Date;

public class MainActivity extends Activity implements OnClickListener { // Ciew.OnClickListener

	// Make the button global
	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); // super = Activity
		//Context mycontext = getApplicationContext();
		btn = new Button(this);
		/*
		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				updateTime();
			}
		});
		*/
		btn.setOnClickListener(this);
		// Call the method updateTime();
		updateTime();
		setContentView(btn);
		
		//setContentView(R.layout.activity_main);
	}
	
	// the method in View.OnClickListener interface
	public void onClick(View view){
		updateTime();
	}
	
	private void updateTime(){
		// Change the text of the button into the actuall time with the help of Date class in java.util.Date;
		btn.setText(new Date().toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
