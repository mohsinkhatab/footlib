package com.itpvt.footlib;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

;


public class MainActivity extends AppCompatActivity {

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
    ImageView iinsta;
    Button face;
    TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

face=(Button)findViewById(R.id.facebook);
iinsta=(ImageView)findViewById(R.id.insta);
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


//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
//        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,tool, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.navv);
//        navigationView.setNavigationItemSelectedListener(this);

im3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i= new Intent(MainActivity.this, All_Products_Design.class);
        i.putExtra("category_id","34");
        i.putExtra("Title","Hello");
        startActivity(i);



    }
});
//        tt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.footlib.com/"));
//                startActivity(myIntent);
//            }
//        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activitymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//int id=item.getItemId();
//
//if (id==R.id.home){
//    Intent intent=new Intent(MainActivity.this,MainActivity.class);
//    startActivity(intent);
//
//}else if (id==R.id.Categories){
//
//
//}else if (id==R.id.Cart){
//Intent intent=new Intent(MainActivity.this,My_Cart.class);
//startActivity(intent);
//
//}else if (id==R.id.web){
//
//    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.footlib.com/"));
//    startActivity(myIntent);
//
//}else if(id==R.id.Whatsapppp){
//
//    Uri uri  = Uri.parse("smsto:"+"+923000225587");
//    Intent intent =new Intent(Intent.ACTION_SENDTO,uri);
//    intent.setPackage("com.whatsapp");
//    startActivity(intent);
//
//}else if (id==R.id.Innovators){
//
//    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://itpvt.net/"));
//    startActivity(myIntent);
//
//}
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
//        drawer.closeDrawer(GravityCompat.START);

//        return false;
  //  }
}
