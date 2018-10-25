package com.itpvt.footlib;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar tool;
  ImageView whatss;
  ImageView cartt;
  TextView im1;
    TextView  im2;
    TextView im2_1;
    TextView  im3;
    TextView  im4;
    TextView  im5;
    TextView  im6;
    ImageView insta;
    Button facebook;
    TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        tool=(Toolbar)findViewById(R.id.toolbar);
     whatss=(ImageView)findViewById(R.id.whats);
     cartt=(ImageView)findViewById(R.id.Cartart);

     im1=(TextView )findViewById(R.id.img1);
     im2=(TextView )findViewById(R.id.img2);
     im2_1=(TextView)findViewById(R.id.img2_1);
     im3=(TextView )findViewById(R.id.img3);
     im4=(TextView )findViewById(R.id.img4);
     im5=(TextView )findViewById(R.id.img5);
     im6=(TextView )findViewById(R.id.img6);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
