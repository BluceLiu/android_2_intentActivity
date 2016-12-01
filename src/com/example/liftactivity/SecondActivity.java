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
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class SecondActivity extends ActionBarActivity {

	TextView yonghumingzhi;
	TextView mimazhi;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);

        yonghumingzhi=(TextView) findViewById(R.id.yonghumingzhi);
        mimazhi=(TextView) findViewById(R.id.mimazhi);
        
        Intent intent=this.getIntent();
//        yonghumingzhi.setText(intent.getExtras().get("uname").toString());
//        mimazhi.setText(intent.getExtras().get("upwd").toString());
        User user=  (User)intent.getExtras().get("user");
        yonghumingzhi.setText(user.getUserNameString());
        mimazhi.setText(user.getUserMinaString());
       
    }


}
