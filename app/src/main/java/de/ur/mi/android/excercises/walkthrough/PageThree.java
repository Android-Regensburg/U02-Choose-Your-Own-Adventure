package de.ur.mi.android.exercises.walkthrough;

import android.os.Bundle;
import android.view.View;

public class PageThree extends PageTwo {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView.setText(R.string.page_three);
        buttonNext.setEnabled(false);
    }

    public void onClick(View v){
        buttonBackClicked();
    }

    private void buttonBackClicked(){
        finish();
    }
}
