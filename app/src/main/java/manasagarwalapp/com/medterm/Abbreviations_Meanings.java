package manasagarwalapp.com.medterm;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import manasagarwalapp.com.medterm.R;

public class Abbreviations_Meanings extends AppCompatActivity {

    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Abbreviations and Meanings");

        lv = (ListView) findViewById(R.id.listview);
        inputSearch = (EditText) findViewById(R.id.txtsearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, getResources().getStringArray(R.array.Abbreviations));
        lv.setAdapter(adapter);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Abbreviations_Meanings.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemClickedOn = (String) parent.getItemAtPosition(position);
                String[] comparing = getResources().getStringArray(R.array.Abbreviations);


                for(int i =0; i<comparing.length; i++){

                    Intent myIntent = new Intent(getApplicationContext(), Definition_Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("itemSelected", itemClickedOn);
                    myIntent.putExtras(bundle);
                    startActivity(myIntent);

                    break;

                }
            }
        });



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
                Toast.makeText(Abbreviations_Meanings.this, "Transferring you to Abbreviations and Meanings Page", Toast.LENGTH_SHORT).show();

                Intent menu1Intent = new Intent(getApplicationContext(), Abbreviations_Meanings.class);
                startActivity(menu1Intent);

                break;

            case R.id.menu_2:
                Toast.makeText(Abbreviations_Meanings.this, "Transferring you to Glossary", Toast.LENGTH_SHORT).show();

                Intent menu2Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menu2Intent);

                break;

            case R.id.menu_3:
                Toast.makeText(Abbreviations_Meanings.this, "Transferring you to Prefixes and Roots", Toast.LENGTH_SHORT).show();

                Intent menu3Intent = new Intent(getApplicationContext(), Prefixes_Roots.class);
                startActivity(menu3Intent);

                break;

            case R.id.menu_4:
                Toast.makeText(Abbreviations_Meanings.this, "Transferring you to Settings", Toast.LENGTH_SHORT).show();

                Intent menu4Intent = new Intent(getApplicationContext(), Credits_Settings.class);
                startActivity(menu4Intent);

                break;

        }
        return super.onOptionsItemSelected(item);
    }
}




