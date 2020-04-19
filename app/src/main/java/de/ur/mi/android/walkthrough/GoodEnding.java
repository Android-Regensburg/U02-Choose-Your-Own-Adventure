package de.ur.mi.android.walkthrough;

import android.os.Bundle;

import de.ur.mi.android.exercises.walkthrough.R;

public class GoodEnding extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textContent.setText(R.string.godEnding);
        optionA.setEnabled(false);
        optionB.setEnabled(false);
    }
}
