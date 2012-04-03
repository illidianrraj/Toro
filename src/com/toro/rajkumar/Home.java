package com.toro.rajkumar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
//import android.util.Log;
import android.widget.TableRow;
import android.widget.TextView;

public class Home extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		TableRow tb1 =(TableRow) findViewById(R.id.tableRow1);
		TableRow tb2 =(TableRow) findViewById(R.id.tableRow2);
		TableRow tb3 =(TableRow) findViewById(R.id.tableRow3);
		TableRow tb4 =(TableRow) findViewById(R.id.tableRow4);
		
		tb1.setOnClickListener(this);
		tb2.setOnClickListener(this);
		tb3.setOnClickListener(this);
		tb4.setOnClickListener(this);
		
	}
		
	@Override
	public void onClick(View v){
		if (v.getId()==R.id.tableRow1){
			Intent i1 =new Intent(this, Install.class);
			startActivityForResult(i1,1);
		}
		else if (v.getId()==R.id.tableRow2){
			Intent i2 =new Intent(this, compare.class);
			startActivityForResult(i2,2);
		}
	}
	
	@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		  if(resultCode==RESULT_OK && requestCode==1){
			  //Toast.makeText(this, "Pass", Toast.LENGTH_LONG).show();
			  TextView tv1 =(TextView) findViewById(R.id.viewinstall);
			  tv1.setVisibility(1);
			  tv1.setText(Variables.installValue);
			  
		  }
		  else if(resultCode==RESULT_OK && requestCode==2){
			  
			 TextView tv2 = (TextView) findViewById(R.id.viewcomapre);
			 tv2.setVisibility(1);
			 tv2.setText(Variables.compare);
		  }
}
}
