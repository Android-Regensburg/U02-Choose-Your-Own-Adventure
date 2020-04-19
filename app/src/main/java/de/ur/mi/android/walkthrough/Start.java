package de.ur.mi.android.walkthrough;

import android.os.Bundle;

import de.ur.mi.android.exercises.walkthrough.R;

public class Start extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        targetForOptionA = Stream.class;
        targetForOptionB = BadEnding.class;
        textContent.setText(R.string.start);
    }
}




