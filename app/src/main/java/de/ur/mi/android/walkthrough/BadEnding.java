package de.ur.mi.android.walkthrough;

import android.os.Bundle;

import de.ur.mi.android.exercises.walkthrough.R;

public class BadEnding extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textContent.setText(R.string.badEnding);
        optionA.setEnabled(false);
        optionB.setEnabled(false);
    }
}
