package de.ur.mi.android.chooseyourownadventure.scenes;

import android.os.Bundle;

import de.ur.mi.android.chooseyourownadventure.BaseActivity;
import de.ur.mi.android.chooseyourownadventure.R;

public class GoodEnding extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textContent.setText(R.string.godEnding);
        optionA.setEnabled(false);
        optionB.setEnabled(false);
    }
}
