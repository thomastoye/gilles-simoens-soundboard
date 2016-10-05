package be.thomastoye.gillessimoenssoundboard;

import android.app.ListActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import be.thomastoye.gillessimoenssoundboard.data.Sound;


public class SoundListActivity extends ListActivity {

    private ListAdapter listAdapter;

    public SoundListActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sounds);
        listAdapter = new SoundAdapter();
        setListAdapter(listAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soundboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Sound sound= Sound.values().get(position);

//        Intent intent = new Intent();
//        intent.putExtra(SoundboardActivity.EXTRA_FILE_NAME, fileName);
//        setResult(RESULT_OK);
//        finish();
    }

    private int filenameToResourceId(String fileName) {
        return this.getResources().getIdentifier(fileName, "raw", this.getPackageName());
    }

    public class SoundAdapter extends ArrayAdapter<Sound> {
        public SoundAdapter() {
            super(SoundListActivity.this, R.layout.row_sound, R.id.text, Sound.values());
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = super.getView(position, convertView, parent);

            final Sound sound = Sound.values().get(position);
            TextView text = (TextView) row.findViewById(R.id.text);
            text.setText(sound.getName());

            Button play = (Button) row.findViewById(R.id.playButton);

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mp = MediaPlayer.create(SoundListActivity.this, sound.getResourceId());
                    mp.start();
                }
            });

            return row;
        }
    }
}
