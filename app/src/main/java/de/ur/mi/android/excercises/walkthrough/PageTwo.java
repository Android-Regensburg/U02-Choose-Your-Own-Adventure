package de.ur.mi.android.exercises.walkthrough;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PageTwo extends PageOne {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        buttonBack.setEnabled(true);
        textView.setText(R.string.page_two);
    }


    public void onClick(View v){
        if(v.getId() == R.id.button_next){
            buttonNextClicked();
        }
        else if(v.getId() == R.id.button_back){
            buttonBackClicked();
        }

    }

    private void buttonNextClicked(){
        Intent intent = new Intent(PageTwo.this, PageThree.class);
        startActivity(intent);
    }
    private void buttonBackClicked(){
        finish();
    }
}
