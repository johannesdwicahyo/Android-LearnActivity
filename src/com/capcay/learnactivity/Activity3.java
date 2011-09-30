package com.capcay.learnactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Activity3 extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    Intent in = new Intent();
        setResult(2,in);
        finish();
	}

}
