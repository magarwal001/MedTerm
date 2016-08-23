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

public class Prefixes_Roots extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Prefixes and Roots");

        lv = (ListView) findViewById(R.id.listview);
        inputSearch = (EditText) findViewById(R.id.txtsearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, getResources().getStringArray(R.array.Prefixes_Roots));
        lv.setAdapter(adapter);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Prefixes_Roots.this.adapter.getFilter().filter(cs);
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
                String[] comparing = getResources().getStringArray(R.array.Prefixes_Roots);

                if (itemClickedOn.equals(comparing[0]) || itemClickedOn.equals(comparing[1]) || itemClickedOn.equals(comparing[2])
                        || itemClickedOn.equals(comparing[3]) || itemClickedOn.equals(comparing[4]) || itemClickedOn.equals(comparing[5])
                        || itemClickedOn.equals(comparing[6]) || itemClickedOn.equals(comparing[7]) || itemClickedOn.equals(comparing[8])
                        || itemClickedOn.equals(comparing[9]) || itemClickedOn.equals(comparing[10]) || itemClickedOn.equals(comparing[11]) || itemClickedOn.equals(comparing[12])
                        || itemClickedOn.equals(comparing[13]) || itemClickedOn.equals(comparing[14]) || itemClickedOn.equals(comparing[15])
                        || itemClickedOn.equals(comparing[16]) || itemClickedOn.equals(comparing[17]) || itemClickedOn.equals(comparing[18])
                        || itemClickedOn.equals(comparing[19]) || itemClickedOn.equals(comparing[20]) || itemClickedOn.equals(comparing[21])
                        || itemClickedOn.equals(comparing[22]) || itemClickedOn.equals(comparing[23]) || itemClickedOn.equals(comparing[24])
                        || itemClickedOn.equals(comparing[25]) || itemClickedOn.equals(comparing[26]) || itemClickedOn.equals(comparing[27])
                        || itemClickedOn.equals(comparing[28]) || itemClickedOn.equals(comparing[29]) || itemClickedOn.equals(comparing[30])
                        || itemClickedOn.equals(comparing[31]) || itemClickedOn.equals(comparing[32]) || itemClickedOn.equals(comparing[33])
                        || itemClickedOn.equals(comparing[34]) || itemClickedOn.equals(comparing[35]) || itemClickedOn.equals(comparing[36])
                        || itemClickedOn.equals(comparing[37]) || itemClickedOn.equals(comparing[38]) || itemClickedOn.equals(comparing[39])
                        || itemClickedOn.equals(comparing[40]) || itemClickedOn.equals(comparing[41]) || itemClickedOn.equals(comparing[42])
                        || itemClickedOn.equals(comparing[43]) || itemClickedOn.equals(comparing[44]) || itemClickedOn.equals(comparing[45])
                        || itemClickedOn.equals(comparing[46]) || itemClickedOn.equals(comparing[47]) || itemClickedOn.equals(comparing[48])
                        || itemClickedOn.equals(comparing[49])) {

                    Intent myIntent = new Intent(getApplicationContext(), Definition_Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("itemSelected", itemClickedOn);
                    myIntent.putExtras(bundle);
                    startActivity(myIntent);

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
                Toast.makeText(Prefixes_Roots.this, "Transferring you to Abbreviations and Meanings Page", Toast.LENGTH_SHORT).show();

                Intent menu1Intent = new Intent(getApplicationContext(), Abbreviations_Meanings.class);
                startActivity(menu1Intent);

                break;

            case R.id.menu_2:
                Toast.makeText(Prefixes_Roots.this, "Transferring you to Glossary", Toast.LENGTH_SHORT).show();

                Intent menu2Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menu2Intent);

                break;

            case R.id.menu_3:
                Toast.makeText(Prefixes_Roots.this, "Transferring you to Prefixes and Roots", Toast.LENGTH_SHORT).show();

                Intent menu3Intent = new Intent(getApplicationContext(), Prefixes_Roots.class);
                startActivity(menu3Intent);

                break;

            case R.id.menu_4:
                Toast.makeText(Prefixes_Roots.this, "Transferring you to Settings", Toast.LENGTH_SHORT).show();

                Intent menu4Intent = new Intent(getApplicationContext(), Credits_Settings.class);
                startActivity(menu4Intent);

                break;

        }
        return super.onOptionsItemSelected(item);
    }
}




