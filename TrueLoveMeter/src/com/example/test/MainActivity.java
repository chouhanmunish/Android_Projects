package com.example.test;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ImageButton ib = null;
	private ImageButton ib2 = null;
	private ImageButton ib3 = null;
	private EditText et = null;
	private EditText et2 = null;

	private Calendar cal = null;
	private int day, month, year;
	private TextView tv = null;
	private TextView tv2 = null;
	private TextView gtv = null;
	static final int DATE_PICKER_ID = 1111;

	  /** Duration of wait **/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		

		ib = (ImageButton) findViewById(R.id.imageButton1);
		ib2 = (ImageButton) findViewById(R.id.imageButton2);
		ib3 = (ImageButton) findViewById(R.id.imageButton3);
		et = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		cal = Calendar.getInstance();
		day = cal.get(Calendar.DAY_OF_MONTH);
		month = cal.get(Calendar.MONTH);
		year = cal.get(Calendar.YEAR);
		tv = (TextView) findViewById(R.id.urdob);
		tv2 = (TextView) findViewById(R.id.loversdob);
		if (ib != null)
			ib.setOnClickListener(new OnClickListener() {

				@SuppressWarnings("deprecation")
				@Override
				public void onClick(View v) {
					gtv = tv;
					// On button click show datepicker dialog
					showDialog(DATE_PICKER_ID);
				}
			});
		if (ib2 != null)
			ib2.setOnClickListener(new OnClickListener() {

				@SuppressWarnings("deprecation")
				@Override
				public void onClick(View v) {
					gtv = tv2;
					// On button click show datepicker dialog
					showDialog(DATE_PICKER_ID);
				}
			});
		ib3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String Name = et.getText().toString();
				String LName =  et2.getText().toString();
				String DOB = tv.getText().toString();
				String LDOB = tv2.getText().toString();
				Context context = getApplicationContext();
				CharSequence text = null;
				int duration = Toast.LENGTH_SHORT;

				if (Name == null||Name.equals("")) {
					text = "Please Enter Your Name";
					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
					return;
				}
				if (LName == null||LName.equals("")) {
					text = "Please Enter Your Lover's Name";
					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
					return;
				}
				if (DOB == null||DOB.equals("")) {
					text = "Please Choose Your DOB";
					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
					return;
				}
				if (LDOB == null||LDOB.equals("")) {
					text = "Please Choose Your Lover's DOB";
					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
					return;
				}

				Intent i = new Intent(getApplicationContext(),
						ResultActivity.class);
				i.putExtra("Name", Name);
				i.putExtra("LName",LName);
				i.putExtra("DOB",DOB);
				i.putExtra("DOB", LDOB);
				startActivity(i);

			}
		});
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_PICKER_ID:

			// open datepicker dialog.
			// set date picker for current date
			// add pickerListener listner to date picker
			DatePickerDialog dpd = new DatePickerDialog(this,
					R.style.CustomTheme, pickerListener, year, month, day);
			return dpd;
		}
		return null;
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		
	}
	private DatePickerDialog.OnDateSetListener pickerListener = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		@Override
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {

			year = selectedYear;
			month = selectedMonth;
			day = selectedDay;

			// Show selected date
			if (gtv != null)
				gtv.setText(new StringBuilder().append(month + 1).append("-")
						.append(day).append("-").append(year).append(" "));

		}
	};

}
