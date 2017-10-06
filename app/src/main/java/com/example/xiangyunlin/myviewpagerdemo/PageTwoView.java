package com.example.xiangyunlin.myviewpagerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by givemepass on 2016/7/8.
 */
public class PageTwoView extends PageView {
    public PageTwoView(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.page_content, null);
        TextView textView = view.findViewById(R.id.text);
        textView.setText("Page two");
        addView(view);
    }

    @Override
    public void refreshView() {

    }
}
