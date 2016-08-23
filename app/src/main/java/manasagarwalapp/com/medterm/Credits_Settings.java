package manasagarwalapp.com.medterm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Credits_Settings extends AppCompatActivity {

    String Checked;
    String f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits__settings);

        getSupportActionBar().setTitle("Settings");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        changeTextNearSwitch();

        Switch s = (Switch) findViewById(R.id.switch1);
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        s.setChecked(sharedPrefs.getBoolean("switcher", true));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.menu_1:
                Toast.makeText(Credits_Settings.this, "Transferring you to Abbreviations and Meanings Page", Toast.LENGTH_SHORT).show();

                Intent menu1Intent = new Intent(getApplicationContext(), Abbreviations_Meanings.class);
                startActivity(menu1Intent);

                break;

            case R.id.menu_2:
                Toast.makeText(Credits_Settings.this, "Transferring you to Glossary", Toast.LENGTH_SHORT).show();

                Intent menu2Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menu2Intent);

                break;

            case R.id.menu_3:
                Toast.makeText(Credits_Settings.this, "Transferring you to Prefixes and Roots", Toast.LENGTH_SHORT).show();

                Intent menu3Intent = new Intent(getApplicationContext(), Prefixes_Roots.class);
                startActivity(menu3Intent);

                break;

            case R.id.menu_4:
                Toast.makeText(Credits_Settings.this, "Transferring you to Settings", Toast.LENGTH_SHORT).show();

                Intent menu4Intent = new Intent(getApplicationContext(), Credits_Settings.class);
                startActivity(menu4Intent);

                break;

        }

        if (android.R.id.home == item.getItemId()) {
            Toast.makeText(getApplicationContext(), "Going back", Toast.LENGTH_SHORT).show();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeTextNearSwitch() {
        Switch s = (Switch) findViewById(R.id.switch1);

        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //Logging in Logcat
                Log.v("Switch State=", "" + isChecked);

                Switch s = (Switch) findViewById(R.id.switch1);

                //Changing the text of the Switch
                if (isChecked) {
                    s.setText("ON");
                    f = "on";

                    changestate();


                } else {
                    s.setText("OFF");
                    f = "off";

                    changestate();

                }

            }

        });
    }


    public void changestate() {

        if (f.equals("on")) {

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = preferences.edit();

            //Passing to Def Activity whether this was checked
            Checked = "on";
            editor.putString("isChecked", Checked);
            editor.putBoolean("switcher", true);
            editor.apply();

        } else {

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = preferences.edit();

            //Passing to Def Activity whether this was checked
            Checked = "off";
            editor.putString("isChecked", Checked);
            editor.putBoolean("switcher", false);
            editor.apply();

        }

    }


}
