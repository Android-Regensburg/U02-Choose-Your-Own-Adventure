package de.ur.mi.android.chooseyourownadventure.scenes;

import android.os.Bundle;

import de.ur.mi.android.chooseyourownadventure.BaseActivity;
import de.ur.mi.android.chooseyourownadventure.R;

/**
 * Activity zur Darstellung des zweiten Kapitels: Stream
 */
public class Stream extends BaseActivity {

    /**
     * OnCreate wird überschrieben um die korrekten Ziele für die beiden Buttons zu setzen und den
     * richtigen Kapiteltext im TextView anzuzeigen. Alle restliche Funktionalität wird von der
     * Superklasse BaseActivity übernommen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        targetForOptionA = GoodEnding.class;
        targetForOptionB = BadEnding.class;
        textContent.setText(R.string.stream);
    }
}
