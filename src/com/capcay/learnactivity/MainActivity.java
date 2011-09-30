package com.capcay.learnactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
	private final static String DEBUG_TAG = "LifeCycleLog";
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    Log.i(DEBUG_TAG, "onCreate ...");
	    setContentView(R.layout.main);
	}
	protected void onRestart()
	{
		super.onRestart();
	        Log.i(DEBUG_TAG, "onRestart ...");
	}
	
	protected void onStart()
	{
		super.onStart();
		Log.i(DEBUG_TAG, "onStart ...");
	}

	protected void onResume()
	{
		super.onResume();
		Log.i(DEBUG_TAG, "onResume ...");
	}

	protected void onPause()
	{
		super.onPause();
		Log.i(DEBUG_TAG, "onPause ...");
	}

	protected void onStop()
	{
		super.onStop();
		Log.i(DEBUG_TAG, "onStop ...");
	}    
	
	protected void onDestroy()
	{
		super.onDestroy();
		Log.i(DEBUG_TAG, "onDestroy ...");
	}
	public void act2(View v) {
		Intent i = new Intent(this, Activity2.class);
		startActivity(i);
	}
	
	public void act2ext(View v) {
		Intent i = new Intent(this, Activity2.class);
		i.putExtra("extra", "this is an extra from activity1");
		startActivity(i);
	}
}