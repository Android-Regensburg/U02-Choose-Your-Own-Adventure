package de.ur.mi.android.chooseyourownadventure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Die BaseActivity dient als Vorlage (Superklasse) für alle Activities der Anwendung. Hier werden
 * die gemeinsamen Eigenschaften modelliert, die in den übrigen Activities zur Darstellung des
 * Kapiteltexts und zum Abfangen der NutzerInnen-Interaktion notwendig sind.
 */
public class BaseActivity extends AppCompatActivity {

    // Instanzvariablen für Referenzen auf UI-Elemente
    protected Button optionA;
    protected Button optionB;
    protected TextView textContent;
    // Instanzvariablen für Ziele (Activities) der beiden Auswahlmöglichkeiten
    protected Class targetForOptionA = null;
    protected Class targetForOptionB = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    /**
     * In dieser Methode werden die Referenzen auf die notwendigen UI-Elemente erstellt und in
     * den entsprechenden Instanzvariablen abgespeichert. Der Klick auf die Buttons wird über das
     * Setzen entsprechender Listener realisiert. Als engültige Callback-Methode dient dabei die,
     * in dieser Activity definierte, handleCLickOnView-Methode.
     */
    private void initUI() {
        setContentView(R.layout.activity_walkthrough);
        optionA = findViewById(R.id.buttonOptionA);
        optionB = findViewById(R.id.buttonOptionB);
        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleClickOnView(view);
            }
        });
        // Kürzer geht es mit einer Lambda-Funktion: optionA.setOnClickListener(view -> handleClickOnView(view));
        // Noch kürzer gehts mit einer Methoden-Referenz: optionA.setOnClickListener(this::handleClickOnView);
        optionB.setOnClickListener(this::handleClickOnView);
        textContent = findViewById(R.id.content);
    }

    /**
     * Anhand der ID des Views, das als Parameter an die Methode übergeben wird, kann festgestellt
     * werden, welcher Button genau angeklickt wurde. Beide Buttons teilen sich dieselbe Callback-
     * Methode, um diese Klasse über die Klick-Events zu informieren. Beim Aufruf wird aber jeweils
     * die konkrete Button-Instanz als Parameter (v) übergeben.
     */
    private void handleClickOnView(View v) {
        int id = v.getId();
        if (id == R.id.buttonOptionA) {
            startIntent(targetForOptionA);
        } else if (id == R.id.buttonOptionB) {
            startIntent(targetForOptionB);
        }
    }

    /**
     * In dieser Methode wird ein Intent erstellt und gestartet, der, ausgehend von der aktuellen
     * Activity, die als target-Parameter übergebene Activity aufruft.
     */
    private void startIntent(Class target) {
        /*
         * Um in den abgeleiteten Subklassen den korrekten Kontext für den Intent zu verwenden, wird
         * an dieser Stelle nicht der aktulle Context hart eincodiert (BaseActvity.this) sondern bei
         * jedem Aufruf dynamsich ausgelesend (this.getBaseContext()). Dadurch wird der Intent immer
         * im Kontext der jeweiligen Subklasser heraus erzeugt, die von dieser Klasse erbt.
         */
        Intent intent = new Intent(this.getBaseContext(), target);
        startActivity(intent);
    }

}
