package com.jalfonsosuarez.gastospersonales;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class EditarMovimiento extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_editar_movimiento);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_editar_movimiento, menu);
		return true;
	}

}
