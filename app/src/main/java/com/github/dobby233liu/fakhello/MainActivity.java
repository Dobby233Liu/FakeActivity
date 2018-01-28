package com.github.dobby233liu.fakhello;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	 EditText main_HelloText=(EditText)findViewById(R.id.main_HelloText);
	Button madeBtn=(Button)findViewById(R.id.madebtn);
	EditText main_title=(EditText)findViewById(R.id.main_title);
	
		madeBtn.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View p1){
			TextView main_HelloTextCopy=(TextView)findViewById(R.id.main_HelloText);
			EditText main_titleCopy=(EditText)findViewById(R.id.main_title);
				startActivity(new Intent(MainActivity.this, HelloActivity.class).putExtra("hellotext", main_HelloTextCopy.getText().toString()).putExtra("title",main_titleCopy.getText().toString()));
			}
		});
    }
	
}
