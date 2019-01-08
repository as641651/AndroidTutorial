package com.aravindsankaran.gridlayout;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){

        //this is a unique number generated by system
        int id = view.getId();

        // the id we set
        String ourId =  view.getResources().getResourceEntryName(id);

        Log.i("button tapped ",ourId);

        //getting resource id (R.id.name) from file name
        int resourceId = getResources().getIdentifier(ourId,"raw",getPackageName());

        MediaPlayer mPlayer = MediaPlayer.create(this,resourceId);
        mPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
