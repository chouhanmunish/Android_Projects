package com.example.test;

import com.facebook.UiLifecycleHelper;
import com.facebook.widget.FacebookDialog;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity {
	private TextView rtv = null;
	private TextView rtv2 = null;
	private Button fbshare = null;
	String Name = null;
	String LName = null;

	UiLifecycleHelper uiHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		uiHelper = new UiLifecycleHelper(this, null);
		uiHelper.onCreate(savedInstanceState);

		setContentView(R.layout.activity_result);
		rtv = (TextView) findViewById(R.id.textView2);
		rtv2 = (TextView) findViewById(R.id.textView3);

		fbshare = (Button) findViewById(R.id.sharefb);
		Intent i = getIntent();
		Name = i.getStringExtra("Name");
		LName = i.getStringExtra("LName");
		startActivity(i);

	}

	public ResultActivity getOuter() {
		return ResultActivity.this;
	}

	@Override
	protected void onStart() {
		super.onStart();
		calc c = new calc(Name, LName);
		Pythagoreancalc pc = new Pythagoreancalc(Name, LName);
		rtv.setText("Your Love result out of 10 is : " + c.Result);
		rtv2.setText("Relationship status: " + pc.Status);

		fbshare.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				FacebookDialog shareDialog = new FacebookDialog.ShareDialogBuilder(
						getOuter()).setLink(
						"https://developers.facebook.com/android").setApplicationName("True Love Meter").build();
				uiHelper.trackPendingDialogCall(shareDialog.present());
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		uiHelper.onActivityResult(requestCode, resultCode, data,
				new FacebookDialog.Callback() {
			
			
					@Override
					public void onError(FacebookDialog.PendingCall pendingCall,
							Exception error, Bundle data) {
						Log.e("Activity",
								String.format("Error: %s", error.toString()));
					}

					@Override
					public void onComplete(
							FacebookDialog.PendingCall pendingCall, Bundle data) {
						Log.i("Activity", "Success!");
					}
				});
	}

	@Override
	protected void onResume() {
		super.onResume();
		uiHelper.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		uiHelper.onSaveInstanceState(outState);
	}

	@Override
	public void onPause() {
		super.onPause();
		uiHelper.onPause();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		uiHelper.onDestroy();
	}

}
