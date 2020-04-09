package de.ur.mi.android.exercises.walkthrough;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageOne extends Activity implements View.OnClickListener {

    protected Button buttonBack;
    protected Button buttonNext;
    protected TextView textView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);
        buttonBack = findViewById(R.id.button_back);
        buttonNext = findViewById(R.id.button_next);
        textView = findViewById(R.id.textView);
        textView.setText(R.string.page_one);
        buttonBack.setEnabled(false);
        buttonNext.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        buttonNextClicked();
    }

    private void buttonNextClicked(){
        Intent intent = new Intent(PageOne.this, PageTwo.class);
        startActivity(intent);
    }


}




