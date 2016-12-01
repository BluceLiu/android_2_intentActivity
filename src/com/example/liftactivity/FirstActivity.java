package com.example.liftactivity;

import com.example.entity.User;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class FirstActivity extends ActionBarActivity {
	EditText yonghuming;
	EditText mima;
	Button denglu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlayout);
        
       //初始化
        yonghuming=(EditText) findViewById(R.id.yonghuming);
        mima=(EditText) findViewById(R.id.mima);
        denglu=(Button) findViewById(R.id.denglu);
        
        //获得参数值并传递
        denglu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// 获得参数
				String userNameStr=yonghuming.getText().toString();
				String userPwdStr=mima.getText().toString();
				
				//方法一、intent传递
				Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
//				intent.putExtra("uname", userNameStr);
//				intent.putExtra("upwd", userPwdStr);
				
				User user=new User(userNameStr, userPwdStr);
				intent.putExtra("user", user);
				startActivity(intent);//跳转
			
				
				
			}
		});
    }


}
