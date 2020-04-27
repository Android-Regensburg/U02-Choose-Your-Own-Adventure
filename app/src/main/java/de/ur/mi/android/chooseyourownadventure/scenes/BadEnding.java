package de.ur.mi.android.chooseyourownadventure.scenes;

import android.os.Bundle;

import de.ur.mi.android.chooseyourownadventure.BaseActivity;
import de.ur.mi.android.chooseyourownadventure.R;

/**
 * Activity zur Darstellung des negativen Endes: BadEnding
 */
public class BadEnding extends BaseActivity {

    /**
     * OnCreate wird überschrieben um den richtigen Kapiteltext im TextView anzuzeigen. Die übrige
     * Funktionalität wird komplett von der Superklasse BaseActivity übernommen. Da es sich um die
     * letzte Szene im Spiel handelt und keine weiteren Entscheidungen möglich sind, werden die
     * Buttons deaktivert.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textContent.setText(R.string.badEnding);
        optionA.setEnabled(false);
        optionB.setEnabled(false);
    }
}
