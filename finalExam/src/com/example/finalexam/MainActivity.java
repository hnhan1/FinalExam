package com.example.finalexam;


//http://www.mkyong.com/android/android-imagebutton-example/


import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addListenerOnButton();

	}
	
	

	public void addListenerOnButton() {
		 
		final Button imageButton = (Button) findViewById(R.id.buttonNo);
 
		imageButton.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
			       
			       
				Toast.makeText(MainActivity.this,
					"Awwww",
					Toast.LENGTH_SHORT).show();
				
				imageButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.cryingface));
 
			}
			
			
 
		});
		
		final Button imageButton2 = (Button) findViewById(R.id.buttonYes);
		 
		imageButton2.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
			       
			       
				Toast.makeText(MainActivity.this,
					"Hooray!!!",
					Toast.LENGTH_SHORT).show();
 
				imageButton2.setBackgroundDrawable(getResources().getDrawable(R.drawable.happyface));
			}
			
			
 
		});

		
	}

}
