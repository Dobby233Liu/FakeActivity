package com.github.dobby233liu.fakhello;
import android.app.*;
import android.os.*;
import android.content.*;
import android.widget.*;
public class HelloActivity extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.hello);
	TextView hello_hello=(TextView)findViewById(R.id.Hello_hello);
	Intent t2=getIntent();
	String str=t2.getStringExtra("hellotext");
	String str2=t2.getStringExtra("title");
	if (!str.equals("")){
	hello_hello.setText(t2.getStringExtra("hellotext"));
	}else{
	hello_hello.setText(R.string.hello_world);
	}
	if (!str2.equals("")){
	setTitle(str2);
	}
    }
}

