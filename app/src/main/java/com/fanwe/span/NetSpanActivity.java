package com.fanwe.span;

import android.os.Bundle;
import android.widget.TextView;

import com.fanwe.lib.span.SDSpannableStringBuilder;
import com.fanwe.library.activity.SDBaseActivity;

/**
 * Created by Administrator on 2017/7/18.
 */

public class NetSpanActivity extends SDBaseActivity
{
    private TextView tv;

    @Override
    protected void init(Bundle savedInstanceState)
    {
        setContentView(R.layout.act_netspan);
        tv = (TextView) findViewById(R.id.tv);

        SDSpannableStringBuilder sb = new SDSpannableStringBuilder();

        NetImageSpan span = new NetImageSpan(tv);
        span.setUrl("https://www.baidu.com/img/bd_logo1.png");
        span.setWidth(200);
        sb.appendSpan(span, "span");

        tv.setText(sb);
    }
}