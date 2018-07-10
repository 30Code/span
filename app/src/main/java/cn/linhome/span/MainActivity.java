package cn.linhome.span;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fanwe.library.SDLibrary;
import com.fanwe.library.activity.SDBaseActivity;

public class MainActivity extends SDBaseActivity
{

    @Override
    protected void init(Bundle savedInstanceState)
    {
        SDLibrary.getInstance().init(getApplication());
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_textview).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, TextViewActivity.class));
            }
        });
        findViewById(R.id.btn_edittext).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, EditTextActivity.class));
            }
        });
        findViewById(R.id.btn_pattern).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, PatternActivity.class));
            }
        });
        findViewById(R.id.btn_netspan).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, NetSpanActivity.class));
            }
        });
    }
}
