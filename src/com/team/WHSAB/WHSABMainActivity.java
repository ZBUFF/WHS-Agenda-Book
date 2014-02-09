package com.team.WHSAB;
import com.team.WHSAB.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;

public class WHSABMainActivity extends Activity {
	private ActionBar aBar;
	
	private Button homeworkActivityButton;
	private Button optionsActivityButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		homeworkActivityButton = (Button) findViewById(R.id.HomeworkActivityButton);
		optionsActivityButton = (Button) findViewById(R.id.OptionsActivityButton);
		
		aBar = getActionBar();
		aBar.show();
		
		
	}
	
	
	public void homeworkActivityButtonClicked(View v){
		Intent intent = new Intent(this, WHSABHomeworkActivity.class);
	    startActivity(intent);

	}
	
	
	public void optionsActivityButtonClicked(View v){
		Intent intent = new Intent(this, WHSABOptionsActivity.class);
	    startActivity(intent);

	}

	
}


		//Doge is life, doge is love.
		//Let us never forget, thy who bringth warmth
		//upon our shallow, cold hearts. The doge of truth. The doge
		//of compassion. Bless.
		//									- Dogus 69:420:lol
