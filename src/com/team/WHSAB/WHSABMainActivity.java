package com.team.WHSAB;
import com.team.WHSAB.R;

import android.os.Bundle;
import android.widget.ImageView;
import android.app.Activity;

public class WHSABMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView dogeImageView = (ImageView) findViewById(R.id.dogeImageView);
		dogeImageView.setImageResource(R.drawable.doge);
		
		//Doge is life, doge is love.
		//Let us never forget, thy who bring warmth
		//upon our shallow, cold hearts. The doge of truth. The doge
		//of compassion. Bless.
		//							- Dogus 69:420
		
	}
	

}
