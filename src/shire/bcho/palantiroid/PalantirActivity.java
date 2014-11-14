package shire.bcho.palantiroid;

import android.util.Log;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

/**
 * Application main activity.
 */
public class PalantirActivity extends Activity
{
    private final static String START = "shire.bcho.palantiroid.START";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Intent intent = new Intent();
        intent.setAction(START);
        sendBroadcast(intent);
    }
}
