package com.isosystems.smartmaid;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by NickGodov on 30.08.2015.
 */
public class Exiter extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();

        // Android will clean up the process automatically. But hey, if you
        // need to kill the process yourself, don't let me stop you.
        System.exit(0);
    }

}