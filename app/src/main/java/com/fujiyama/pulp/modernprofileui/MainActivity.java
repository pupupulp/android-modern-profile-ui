package com.fujiyama.pulp.modernprofileui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView email = (TextView)findViewById(R.id.txtEmail);
        TextView phone = (TextView)findViewById(R.id.txtPhone);
        TextView repo = (TextView)findViewById(R.id.txtRepo);
        TextView social = (TextView)findViewById(R.id.txtSocial);

        URLSpanNoUnderline.removeUnderlines((Spannable)email.getText());
        URLSpanNoUnderline.removeUnderlines((Spannable)phone.getText());
        URLSpanNoUnderline.removeUnderlines((Spannable)repo.getText());
        URLSpanNoUnderline.removeUnderlines((Spannable)social.getText());
    }
}
