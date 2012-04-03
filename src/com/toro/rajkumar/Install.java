package com.toro.rajkumar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Install extends Activity {
	
	String result = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.installation);
		
		final RadioButton r1=(RadioButton) findViewById(R.id.radio0);
		final RadioButton r2=(RadioButton) findViewById(R.id.radio1);
		//RadioButton r2=(RadioButton) findViewById(R.id.radio1);
		ImageView im = (ImageView) findViewById(R.id.imageView2);
		
		if(Variables.installValue=="Installation"){
			r1.setChecked(true);
		}else if(Variables.installValue=="Retrofit"){
			r2.setChecked(true);
		}else{
			r1.setChecked(true);
		}
		
		
		
		im.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent= getIntent();
				setResult(RESULT_CANCELED, intent);
				finish();
			}
		});
		
		Button b1= (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(r1.isChecked()){
					Variables.installValue="Installation";
					//Toast.makeText(Install.this, "Pass", Toast.LENGTH_LONG).show();
				}
				else{
					result="Retrofit";
					Variables.installValue="Retrofit";
					//Toast.makeText(Install.this, "Pass", Toast.LENGTH_LONG).show();
				}
				Intent intent= getIntent();
				setResult(RESULT_OK, intent);
				finish();
			}
		
		});
		
	}
}
