package com.mobileapp.thirdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivityLinear extends AppCompatActivity {

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        linearLayout=findViewById(R.id.LinearLayout);
    }

    public void fnChangeOrientation(View view)
    {
        linearLayout.setOrientation(LinearLayout.VERTICAL);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_layouts,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int idMenu=item.getItemId();
        Intent intent=null;

        if(idMenu==R.id.linear)
        {
            intent = new Intent(this,MainActivityLinear.class);

        }
        else if(idMenu==R.id.constraint)
        {
            intent = new Intent(this,MainActivity.class);
        }
        else if(idMenu==R.id.relative)
        {
            intent =new Intent(this,MainActivityRelative.class);
        }
        else if(idMenu==R.id.absolute)
        {
            intent=new Intent(this,MainActivityAbsolute.class);
        }
        else if(idMenu==R.id.table)
        {
            intent=new Intent(this,MainActivityTable.class);
        }
        else if(idMenu==R.id.frame)
        {
            intent=new Intent(this,MainActivityFrame.class);
        }

        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

}
