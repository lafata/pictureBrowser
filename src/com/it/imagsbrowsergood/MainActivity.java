package com.it.imagsbrowsergood;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	int aa = 6;	

	public void fun(View view) {
		ImageView showimageview = (ImageView) findViewById(R.id.show_iv);
		int[] imgIds = { R.drawable.a1, R.drawable.a2, R.drawable.a3,
				R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7 };
		if (view.getId() == R.id.xiang_zuo) {
			System.out.println("left");
			showimageview.setImageResource(imgIds[aa]);
			aa--;
			if (aa == 0)
				aa = 6;
		} else if (view.getId() == R.id.xiang_you) {
			System.out.println("right");
			showimageview.setImageResource(imgIds[aa]);
			if (aa == 6)
				aa = 0;
			aa++;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
