package be.thomastoye.gillessimoenssoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;

public class SoundboardFragment extends Fragment {

    private Button playButton;
    private Button showListButton;

    public SoundboardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_soundboard, container, false);

        playButton = (Button) v.findViewById(R.id.buttonPlay);
        showListButton = (Button) v.findViewById(R.id.buttonShowList);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getActivity().getBaseContext(), R.raw.bedankt);
                mp.start();
            }
        });

        showListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().startActivityForResult(
                        new Intent(getActivity().getApplicationContext(), SoundListActivity.class), SoundboardActivity.REQUEST_FILE_NAME);
            }
        });

        return v;
    }

}
