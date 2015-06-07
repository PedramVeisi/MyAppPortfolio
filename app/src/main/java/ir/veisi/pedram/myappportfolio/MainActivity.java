package ir.veisi.pedram.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
    }

    /*
    Set up views
     */
    private void setUpViews() {

        // Find reference to our buttons
        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        Button scoresButton = (Button) findViewById(R.id.scores_button);
        Button libraryButton = (Button) findViewById(R.id.library_button);
        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        Button xyzReaderButton = (Button) findViewById(R.id.xyz_reader_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        // Set onClickListener on each button to show a Toast
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.spotfy_toast_msg), Toast.LENGTH_SHORT).show();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.scores_toast_msg), Toast.LENGTH_SHORT).show();
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.library_toast_msg), Toast.LENGTH_SHORT).show();
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.build_bigger_toast_msg), Toast.LENGTH_SHORT).show();
            }
        });

        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.xyz_reader_toast_msg), Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.capstone_toast_msg), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
