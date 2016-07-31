package br.edu.ifpb.linearlayout;


import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static br.edu.ifpb.linearlayout.R.drawable.fundo;

public class ActivityLayoutManually extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_activity_layout_manually);

        TextView tv1 = new TextView(this);
        tv1.setText("FIRST");
        tv1.setTextSize(100);
        tv1.setGravity(Gravity.CENTER);

        TextView tv2 = new TextView(this);
        tv2.setTextSize(100);
        tv2.setGravity(Gravity.CENTER);
        tv2.setText("MIDDLE");

        TextView tv3 = new TextView(this);
        tv3.setTextSize(100);
        tv3.setGravity(Gravity.CENTER);
        tv3.setText("LAST");

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT ));
        ll.setGravity(Gravity.CENTER);
        ll.setBackgroundResource(R.drawable.fundo);
        ll.addView(tv1);
        ll.addView(tv2);
        ll.addView(tv3);
        setContentView(ll);
    }
}
