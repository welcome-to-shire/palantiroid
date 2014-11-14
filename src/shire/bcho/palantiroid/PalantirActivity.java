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
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
