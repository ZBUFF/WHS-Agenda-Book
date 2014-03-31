package com.team.WHSAB;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class WHSABTodayActivity extends Activity {
	private TextView dateTextView;
	private TextView dayTextView;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_whsabtoday);
		
		//sets up UI ELEMENTS
		dateTextView = (TextView) findViewById(R.id.dateTextView);
		dayTextView = (TextView) findViewById(R.id.dayTextView);

		//Gets Calendar and TimeZone for current date
		TimeZone tz = TimeZone.getDefault();
		Calendar rightNow = Calendar.getInstance(tz);
		
		//Strings together in format [day of week], [date] [month], [year]
		String date = rightNow.getDisplayName(rightNow.DAY_OF_WEEK, rightNow.LONG, Locale.getDefault())
				+ " " + rightNow.getDisplayName(rightNow.MONTH, rightNow.LONG, Locale.getDefault())
				+ ", " + rightNow.get(rightNow.DATE)
				+ ", " + rightNow.get(rightNow.YEAR);
		dateTextView.setText(date);
		
		
		//METHOD TO GET WHAT DAY OF THE CYCLE IT IS
		
		//METHOD TO GET WHAT DAY OF THE CYCLE IT IS
		
		
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.whsabtoday, menu);
		return true;
	}

}
