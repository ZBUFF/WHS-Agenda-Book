package com.team.WHSAB;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.EditText;

public class WHSABOptionsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.whsaboptions, menu);
		return true;

	}

	public void onDayOneLunchOne() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_2_Day_1);
		cb.setChecked(false);
	
	}

	public void onDayTwoLunchOne() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_2_Day_2);
		cb.setChecked(false);
	}

	public void onDayThreeLunchOne() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_2_Day_3);
		cb.setChecked(false);

	}

	public void onDayFourLunchOne() {

		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_2_Day_4);
		cb.setChecked(false);
	}

	public void onDayFiveLunchOne() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_2_Day_5);
		cb.setChecked(false);

	}

	public void onDaySixLunchOne() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_2_Day_6);
		cb.setChecked(false);
	}
	
	public void onDayOneLunchTwo() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_1);
		cb.setChecked(false);
	}

	public void onDayTwoLunchTwo() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_2);
		cb.setChecked(false);
	}

	public void onDayThreeLunchTwo() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_3);
		cb.setChecked(false);
	}

	public void onDayFourLunchTwo() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_4);
		cb.setChecked(false);
	}

	public void onDayFiveLunchTwo() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_5);
		cb.setChecked(false);
	}

	public void onDaySixLunchTwo() {
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_6);
		cb.setChecked(false);
	}

	
	
	
	

	public void onSaveClassesClick() {
		EditText Ablock = (EditText) findViewById(R.id.ABlock);
		String AblockClass = Ablock.getText().toString();

		EditText Bblock = (EditText) findViewById(R.id.BBlock);
		String BblockClass = Bblock.getText().toString();

		EditText Cblock = (EditText) findViewById(R.id.CBlock);
		String CblockClass = Cblock.getText().toString();

		EditText Dblock = (EditText) findViewById(R.id.DBlock);
		String DblockClass = Dblock.getText().toString();

		EditText Eblock = (EditText) findViewById(R.id.FBlock);
		String EblockClass = Eblock.getText().toString();

		EditText Fblock = (EditText) findViewById(R.id.GBlock);
		String FblockClass = Fblock.getText().toString();

		EditText Gblock = (EditText) findViewById(R.id.EBlock);
		String GblockClass = Gblock.getText().toString();

		SharedPreferences settings = getSharedPreferences("Class Names", 0);
		
		
		// Saving Classes
		settings.edit().putString("A Block", AblockClass);
		settings.edit().putString("B Block", BblockClass);
		settings.edit().putString("C Block", CblockClass);
		settings.edit().putString("D Block", DblockClass);
		settings.edit().putString("E Block", EblockClass);
		settings.edit().putString("F Block", FblockClass);
		settings.edit().putString("G Block", GblockClass);
		
		
		//Saving Lunch Info
		
		CheckBox cb = (CheckBox) findViewById(R.id.Lunch_1_Day_1);
		boolean dayone = cb.isChecked();
		cb = (CheckBox) findViewById(R.id.Lunch_1_Day_2);
		boolean daytwo = cb.isChecked();
		cb = (CheckBox) findViewById(R.id.Lunch_1_Day_3);
		boolean daythree = cb.isChecked();
		cb = (CheckBox) findViewById(R.id.Lunch_1_Day_4);
		boolean dayfour = cb.isChecked();
		cb = (CheckBox) findViewById(R.id.Lunch_1_Day_5);
		boolean dayfive = cb.isChecked();
		cb = (CheckBox) findViewById(R.id.Lunch_1_Day_6);
		boolean daysix = cb.isChecked();
		
		
		settings.edit().putBoolean("Lunch 1 Day 1",dayone);
		settings.edit().putBoolean("Lunch 1 Day 2",daytwo);
		settings.edit().putBoolean("Lunch 1 Day 3",daythree);
		settings.edit().putBoolean("Lunch 1 Day 4",dayfour);
		settings.edit().putBoolean("Lunch 1 Day 5",dayfive);
		settings.edit().putBoolean("Lunch 1 Day 6",daysix);
		

	}

}
