package manasagarwalapp.com.medterm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Definition_Activity extends AppCompatActivity {
    String title;
    // Hold a reference to the current animator,
    // so that it can be canceled mid-way.
    private Animator mCurrentAnimator;

    // The system "short" animation time duration, in milliseconds. This
    // duration is ideal for subtle animations or animations that occur
    // very frequently.
    private int mShortAnimationDuration;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        // Putting the title

        Bundle b = getIntent().getExtras();
        title = b.getString("itemSelected");

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        transparent();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String checker = preferences.getString("isChecked", "");

        // Hook up clicks on the thumbnail views.

        if (checker.equals("on")) {

            final View thumb1View = findViewById(R.id.thumb_button_1);
            thumb1View.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    String[] zoomImageCompare = getResources().getStringArray(R.array.Glossary);
                    if (title.equals(zoomImageCompare[0])) {
                        zoomImageFromThumb(thumb1View, R.drawable.abdominocentesis);
                    } else if (title.equals(zoomImageCompare[1])) {
                        zoomImageFromThumb(thumb1View, R.drawable.ablation);
                    } else if (title.equals(zoomImageCompare[2])) {
                        zoomImageFromThumb(thumb1View, R.drawable.abortion);
                    } else if (title.equals(zoomImageCompare[3])) {
                        zoomImageFromThumb(thumb1View, R.drawable.abrasion);
                    } else if (title.equals(zoomImageCompare[4])) {
                        zoomImageFromThumb(thumb1View, R.drawable.placental_abruption);
                    } else if (title.equals(zoomImageCompare[5])) {
                        zoomImageFromThumb(thumb1View, R.drawable.abscess);
                    } else if (title.equals(zoomImageCompare[6])) {
                        zoomImageFromThumb(thumb1View, R.drawable.accomodation);
                    } else if (title.equals(zoomImageCompare[7])) {
                        zoomImageFromThumb(thumb1View, R.drawable.ace);
                    } else if (title.equals(zoomImageCompare[8])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acetone);
                    } else if (title.equals(zoomImageCompare[9])) {
                        zoomImageFromThumb(thumb1View, R.drawable.achilles);
                    } else if (title.equals(zoomImageCompare[10])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acholorhydria);
                    } else if (title.equals(zoomImageCompare[11])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acne);
                    } else if (title.equals(zoomImageCompare[12])) {
                        zoomImageFromThumb(thumb1View, R.drawable.aids);
                    } else if (title.equals(zoomImageCompare[13])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acromegaly);
                    } else if (title.equals(zoomImageCompare[14])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acronym);
                    } else if (title.equals(zoomImageCompare[15])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acrophobia);
                    } else if (title.equals(zoomImageCompare[16])) {
                        zoomImageFromThumb(thumb1View, R.drawable.actinic_keratosis);
                    } else if (title.equals(zoomImageCompare[17])) {
                        zoomImageFromThumb(thumb1View, R.drawable.acute_nasopharyngitis);
                    } else if (title.equals(zoomImageCompare[18])) {
                        zoomImageFromThumb(thumb1View, R.drawable.white_lung);
                    } else if (title.equals(zoomImageCompare[19])) {
                        zoomImageFromThumb(thumb1View, R.drawable.addiction);
                    } else if (title.equals(zoomImageCompare[20])) {
                        zoomImageFromThumb(thumb1View, R.drawable.addisons_disease);
                    } else if (title.equals(zoomImageCompare[21])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenectomy);
                    } else if (title.equals(zoomImageCompare[22])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenitis);
                    } else if (title.equals(zoomImageCompare[23])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenocarcinoma);
                    } else if (title.equals(zoomImageCompare[24])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenoidectomy);
                    } else if (title.equals(zoomImageCompare[25])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenoma);
                    } else if (title.equals(zoomImageCompare[26])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenoma_p);
                    } else if (title.equals(zoomImageCompare[27])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adenoma_pp);
                    }

                    // Skipped three here!

                    else if (title.equals(zoomImageCompare[31])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adhesion);
                    } else if (title.equals(zoomImageCompare[32])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adrenalitis);
                    } else if (title.equals(zoomImageCompare[33])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adrenitis);
                    } else if (title.equals(zoomImageCompare[34])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adrenomegaly);
                    } else if (title.equals(zoomImageCompare[35])) {
                        zoomImageFromThumb(thumb1View, R.drawable.adrenopathy);
                    } else if (title.equals(zoomImageCompare[36])) {
                        zoomImageFromThumb(thumb1View, R.drawable.aerophagia);
                    } else if (title.equals(zoomImageCompare[37])) {
                        zoomImageFromThumb(thumb1View, R.drawable.agglutination);
                    } else if (title.equals(zoomImageCompare[38])) {
                        zoomImageFromThumb(thumb1View, R.drawable.agoraphobia);
                    } else if (title.equals(zoomImageCompare[39])) {
                        zoomImageFromThumb(thumb1View, R.drawable.albinism);
                    } else if (title.equals(zoomImageCompare[40])) {
                        zoomImageFromThumb(thumb1View, R.drawable.albuminuria);
                    } else if (title.equals(zoomImageCompare[41])) {
                        zoomImageFromThumb(thumb1View, R.drawable.alcoholism);
                    } else if (title.equals(zoomImageCompare[42])) {
                        zoomImageFromThumb(thumb1View, R.drawable.aldosteronism);
                    } else if (title.equals(zoomImageCompare[43])) {
                        zoomImageFromThumb(thumb1View, R.drawable.allergen);
                    } else if (title.equals(zoomImageCompare[44])) {
                        zoomImageFromThumb(thumb1View, R.drawable.allergic_rhinitis);
                    } else if (title.equals(zoomImageCompare[45])) {
                        zoomImageFromThumb(thumb1View, R.drawable.allergist);
                    } else if (title.equals(zoomImageCompare[46])) {
                        zoomImageFromThumb(thumb1View, R.drawable.allergy);
                    } else if (title.equals(zoomImageCompare[47])) {
                        zoomImageFromThumb(thumb1View, R.drawable.allogenic);
                    } else if (title.equals(zoomImageCompare[48])) {
                        zoomImageFromThumb(thumb1View, R.drawable.alopecia);
                    } else if (title.equals(zoomImageCompare[49])) {
                        zoomImageFromThumb(thumb1View, R.drawable.alopecia_areata);
                    }
                }
            });

            // Retrieve and cache the system's default "short" animation time.
            mShortAnimationDuration = getResources().getInteger(
                    android.R.integer.config_shortAnimTime);
        }


        putTextandImagesintoGlossary();
        putTextintoAbbreviationsandMeanings();
        putTextintoPrefixesandRoots();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (android.R.id.home == item.getItemId()) {
            Toast.makeText(getApplicationContext(), "Going back", Toast.LENGTH_SHORT).show();
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    public void putTextandImagesintoGlossary() {

        // getting Item Selected!

        Bundle b = getIntent().getExtras();
        title = b.getString("itemSelected");

        String[] compare = getResources().getStringArray(R.array.Glossary);

        if (title.equals(compare[0])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition1));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.abdominocentesis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[0]);

        } else if (title.equals(compare[1])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition2));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.ablation);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[1]);

        } else if (title.equals(compare[2])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition3));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.abortion);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[2]);

        } else if (title.equals(compare[3])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition4));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.abrasion);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[3]);

        } else if (title.equals(compare[4])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition5));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.placental_abruption);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[4]);

        } else if (title.equals(compare[5])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition6));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.abscess);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[5]);

        } else if (title.equals(compare[6])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition7));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.accomodation);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[6]);

        } else if (title.equals(compare[7])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition8));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.ace);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[7]);

        } else if (title.equals(compare[8])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition9));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acetone);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[8]);

        } else if (title.equals(compare[9])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition10));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.achilles);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[9]);

        } else if (title.equals(compare[10])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition11));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acholorhydria);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[10]);

        } else if (title.equals(compare[11])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition12));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acne);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[11]);

        } else if (title.equals(compare[12])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition13));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.aids);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[12]);

        } else if (title.equals(compare[13])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition14));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acromegaly);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[13]);

        } else if (title.equals(compare[14])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition15));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acronym);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[14]);

        } else if (title.equals(compare[15])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition16));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acrophobia);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[15]);

        } else if (title.equals(compare[16])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition17));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.actinic_keratosis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[16]);

        } else if (title.equals(compare[17])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition18));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.acute_nasopharyngitis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[17]);

        } else if (title.equals(compare[18])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition19));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.white_lung);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[18]);

        } else if (title.equals(compare[19])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition20));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.addiction);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[19]);

        } else if (title.equals(compare[20])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition21));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.addisons_disease);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[20]);

        } else if (title.equals(compare[21])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition22));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenectomy);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[21]);

        } else if (title.equals(compare[22])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition23));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenitis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[22]);

        } else if (title.equals(compare[23])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition24));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenocarcinoma);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[23]);

        } else if (title.equals(compare[24])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition25));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenoidectomy);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[24]);

        } else if (title.equals(compare[25])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition26));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenoma);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[25]);

        } else if (title.equals(compare[26])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition27));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenoma_p);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[26]);

        } else if (title.equals(compare[27])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition28));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adenoma_pp);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[27]);

        } else if (title.equals(compare[28])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition29));

        } else if (title.equals(compare[29])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition30));

        } else if (title.equals(compare[30])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition31));


        } else if (title.equals(compare[31])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition32));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adhesion);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[28]);

        } else if (title.equals(compare[32])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adrenalitis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[29]);
            definition.setText(getString(R.string.definition33));

        } else if (title.equals(compare[33])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adrenitis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[30]);
            definition.setText(getString(R.string.definition34));

        } else if (title.equals(compare[34])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition35));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adrenomegaly);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[31]);

        } else if (title.equals(compare[35])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition36));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.adrenopathy);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[32]);

        } else if (title.equals(compare[36])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition37));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.aerophagia);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[33]);

        } else if (title.equals(compare[37])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition38));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.agglutination);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[34]);

        } else if (title.equals(compare[38])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition39));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.agoraphobia);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[35]);

        } else if (title.equals(compare[39])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition40));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.albinism);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[36]);

        } else if (title.equals(compare[40])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition41));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.albuminuria);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[37]);

        } else if (title.equals(compare[41])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition42));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.alcoholism);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[38]);

        } else if (title.equals(compare[42])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition43));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.aldosteronism);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[39]);

        } else if (title.equals(compare[43])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition44));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.allergen);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[40]);

        } else if (title.equals(compare[44])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition45));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.allergic_rhinitis);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[41]);

        } else if (title.equals(compare[45])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition46));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.allergist);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[42]);

        } else if (title.equals(compare[46])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition47));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.allergy);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[43]);

        } else if (title.equals(compare[47])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition48));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.allogenic);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[44]);

        } else if (title.equals(compare[48])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition49));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.alopecia);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[45]);

        } else if (title.equals(compare[49])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.definition50));
            ImageView image = (ImageView) findViewById(R.id.DefImage);
            image.setImageResource(R.drawable.alopecia_areata);
            TextView citation = (TextView) findViewById(R.id.citation_text);
            String[] citation_array = getResources().getStringArray(R.array.citations);
            citation.setText(citation_array[45]);

        }

    }

    public void putTextintoAbbreviationsandMeanings() {
        // getting Item Selected!

        Bundle b = getIntent().getExtras();
        title = b.getString("itemSelected");

        //Put the text for Abbreviations and Meanings!

        String[] compare3 = getResources().getStringArray(R.array.Abbreviations);

        if (title.equals(compare3[0])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd1));
        } else if (title.equals(compare3[1])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd2));
        } else if (title.equals(compare3[2])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd3));
        } else if (title.equals(compare3[3])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd4));
        } else if (title.equals(compare3[4])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd5));
        } else if (title.equals(compare3[5])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd6));
        } else if (title.equals(compare3[6])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd7));
        } else if (title.equals(compare3[7])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd8));
        } else if (title.equals(compare3[8])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd9));
        } else if (title.equals(compare3[9])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd10));
        } else if (title.equals(compare3[10])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd11));
        } else if (title.equals(compare3[11])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd12));
        } else if (title.equals(compare3[12])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd13));
        } else if (title.equals(compare3[13])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd14));
        } else if (title.equals(compare3[14])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd15));
        } else if (title.equals(compare3[15])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd16));
        } else if (title.equals(compare3[16])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd17));
        } else if (title.equals(compare3[17])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd18));
        } else if (title.equals(compare3[18])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd19));
        } else if (title.equals(compare3[19])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd20));
        } else if (title.equals(compare3[20])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd21));
        } else if (title.equals(compare3[21])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd22));
        } else if (title.equals(compare3[22])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd23));
        } else if (title.equals(compare3[23])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd24));
        } else if (title.equals(compare3[24])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd25));
        } else if (title.equals(compare3[25])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd26));
        } else if (title.equals(compare3[26])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd27));
        } else if (title.equals(compare3[27])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd28));
        } else if (title.equals(compare3[28])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd29));
        } else if (title.equals(compare3[29])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd30));
        } else if (title.equals(compare3[30])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd31));
        } else if (title.equals(compare3[31])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd32));
        } else if (title.equals(compare3[32])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd33));
        } else if (title.equals(compare3[33])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd34));
        } else if (title.equals(compare3[34])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd35));
        } else if (title.equals(compare3[35])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd36));
        } else if (title.equals(compare3[36])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd37));
        } else if (title.equals(compare3[37])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd38));
        } else if (title.equals(compare3[38])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd39));
        } else if (title.equals(compare3[39])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd40));
        } else if (title.equals(compare3[40])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd41));
        } else if (title.equals(compare3[41])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd42));
        } else if (title.equals(compare3[42])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd43));
        } else if (title.equals(compare3[43])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd44));
        } else if (title.equals(compare3[44])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd45));
        } else if (title.equals(compare3[45])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd46));
        } else if (title.equals(compare3[46])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd47));
        } else if (title.equals(compare3[47])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd48));
        } else if (title.equals(compare3[48])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd49));
        } else if (title.equals(compare3[49])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd50));
        }

        else if (title.equals(compare3[50])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd51));
        } else if (title.equals(compare3[51])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd52));
        } else if (title.equals(compare3[52])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd53));
        } else if (title.equals(compare3[53])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd54));
        } else if (title.equals(compare3[54])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd55));
        } else if (title.equals(compare3[55])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd56));
        } else if (title.equals(compare3[56])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd57));
        } else if (title.equals(compare3[57])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd58));
        } else if (title.equals(compare3[58])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd59));
        } else if (title.equals(compare3[59])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd60));
        } else if (title.equals(compare3[60])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd61));
        } else if (title.equals(compare3[61])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd62));
        } else if (title.equals(compare3[62])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd63));
        } else if (title.equals(compare3[63])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd64));
        } else if (title.equals(compare3[64])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd65));
        } else if (title.equals(compare3[65])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd66));
        } else if (title.equals(compare3[66])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd67));
        } else if (title.equals(compare3[67])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd68));
        } else if (title.equals(compare3[68])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd69));
        } else if (title.equals(compare3[69])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd70));
        } else if (title.equals(compare3[70])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd71));
        } else if (title.equals(compare3[71])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd72));
        } else if (title.equals(compare3[72])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd73));
        } else if (title.equals(compare3[73])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd74));
        } else if (title.equals(compare3[74])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd75));
        } else if (title.equals(compare3[75])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd76));
        } else if (title.equals(compare3[76])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd77));
        } else if (title.equals(compare3[77])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd78));
        } else if (title.equals(compare3[78])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd79));
        } else if (title.equals(compare3[79])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd80));
        } else if (title.equals(compare3[80])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd81));
        } else if (title.equals(compare3[81])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd82));
        } else if (title.equals(compare3[82])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd83));
        } else if (title.equals(compare3[83])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd84));
        } else if (title.equals(compare3[84])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd85));
        } else if (title.equals(compare3[85])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd86));
        } else if (title.equals(compare3[86])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd87));
        } else if (title.equals(compare3[87])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd88));
        } else if (title.equals(compare3[88])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd89));
        } else if (title.equals(compare3[89])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd90));
        } else if (title.equals(compare3[90])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd91));
        } else if (title.equals(compare3[91])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd92));
        } else if (title.equals(compare3[92])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd93));
        } else if (title.equals(compare3[93])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd94));
        } else if (title.equals(compare3[94])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd95));
        } else if (title.equals(compare3[95])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd96));
        } else if (title.equals(compare3[96])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd97));
        } else if (title.equals(compare3[97])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd98));
        } else if (title.equals(compare3[98])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd99));
        } else if (title.equals(compare3[99])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd100));
        } else if (title.equals(compare3[100])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd101));
        } else if (title.equals(compare3[101])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd102));
        } else if (title.equals(compare3[102])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd103));
        } else if (title.equals(compare3[103])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd104));
        } else if (title.equals(compare3[104])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd105));
        } else if (title.equals(compare3[105])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd106));
        } else if (title.equals(compare3[106])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd107));
        } else if (title.equals(compare3[107])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd108));
        } else if (title.equals(compare3[108])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd109));
        } else if (title.equals(compare3[109])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd110));
        } else if (title.equals(compare3[110])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd111));
        } else if (title.equals(compare3[111])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd112));
        } else if (title.equals(compare3[112])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd113));
        } else if (title.equals(compare3[113])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd114));
        } else if (title.equals(compare3[114])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd115));
        } else if (title.equals(compare3[115])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd116));
        } else if (title.equals(compare3[116])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd117));
        } else if (title.equals(compare3[117])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd118));
        } else if (title.equals(compare3[118])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd119));
        } else if (title.equals(compare3[119])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd120));
        } else if (title.equals(compare3[120])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd121));
        } else if (title.equals(compare3[121])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd122));
        } else if (title.equals(compare3[122])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd123));
        } else if (title.equals(compare3[123])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd124));
        } else if (title.equals(compare3[124])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd125));
        } else if (title.equals(compare3[125])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd126));
        } else if (title.equals(compare3[126])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd127));
        } else if (title.equals(compare3[127])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd128));
        } else if (title.equals(compare3[128])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd129));
        } else if (title.equals(compare3[129])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd130));
        } else if (title.equals(compare3[130])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd131));
        } else if (title.equals(compare3[131])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd132));
        } else if (title.equals(compare3[132])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd133));
        } else if (title.equals(compare3[133])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd134));
        } else if (title.equals(compare3[134])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd135));
        } else if (title.equals(compare3[135])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd136));
        } else if (title.equals(compare3[136])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd137));
        } else if (title.equals(compare3[137])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd138));
        } else if (title.equals(compare3[138])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd139));
        } else if (title.equals(compare3[139])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd140));
        } else if (title.equals(compare3[140])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd141));
        } else if (title.equals(compare3[141])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd142));
        } else if (title.equals(compare3[142])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd143));
        } else if (title.equals(compare3[143])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd144));
        } else if (title.equals(compare3[144])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd145));
        } else if (title.equals(compare3[145])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd146));
        } else if (title.equals(compare3[146])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd147));
        } else if (title.equals(compare3[147])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd148));
        } else if (title.equals(compare3[148])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd149));
        } else if (title.equals(compare3[149])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd150));
        } else if (title.equals(compare3[150])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd151));
        } else if (title.equals(compare3[151])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd152));
        } else if (title.equals(compare3[152])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd153));
        } else if (title.equals(compare3[153])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd154));
        } else if (title.equals(compare3[154])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd155));
        } else if (title.equals(compare3[155])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd156));
        } else if (title.equals(compare3[156])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd157));
        } else if (title.equals(compare3[157])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd158));
        } else if (title.equals(compare3[158])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd159));
        } else if (title.equals(compare3[159])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd160));
        } else if (title.equals(compare3[160])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd161));
        } else if (title.equals(compare3[161])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd162));
        } else if (title.equals(compare3[162])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd163));
        } else if (title.equals(compare3[163])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd164));
        } else if (title.equals(compare3[164])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd165));
        } else if (title.equals(compare3[165])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd166));
        } else if (title.equals(compare3[166])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd167));
        } else if (title.equals(compare3[167])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd168));
        } else if (title.equals(compare3[168])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd169));
        } else if (title.equals(compare3[169])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd170));
        } else if (title.equals(compare3[170])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd171));
        } else if (title.equals(compare3[171])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd172));
        } else if (title.equals(compare3[172])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd173));
        } else if (title.equals(compare3[173])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd174));
        } else if (title.equals(compare3[174])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd175));
        } else if (title.equals(compare3[175])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd176));
        } else if (title.equals(compare3[176])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd177));
        } else if (title.equals(compare3[177])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd178));
        } else if (title.equals(compare3[178])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd179));
        } else if (title.equals(compare3[179])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd180));
        } else if (title.equals(compare3[180])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd181));
        } else if (title.equals(compare3[181])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd182));
        } else if (title.equals(compare3[182])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd183));
        } else if (title.equals(compare3[183])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd184));
        } else if (title.equals(compare3[184])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd185));
        } else if (title.equals(compare3[185])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd186));
        } else if (title.equals(compare3[186])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd187));
        } else if (title.equals(compare3[187])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd188));
        } else if (title.equals(compare3[188])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd189));
        } else if (title.equals(compare3[189])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd190));
        } else if (title.equals(compare3[190])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd191));
        } else if (title.equals(compare3[191])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd192));
        } else if (title.equals(compare3[192])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd193));
        } else if (title.equals(compare3[193])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd194));
        } else if (title.equals(compare3[194])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd195));
        } else if (title.equals(compare3[195])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd196));
        } else if (title.equals(compare3[196])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd197));
        } else if (title.equals(compare3[197])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd198));
        } else if (title.equals(compare3[198])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd199));
        } else if (title.equals(compare3[199])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd200));
        } else if (title.equals(compare3[200])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd201));
        } else if (title.equals(compare3[201])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd202));
        } else if (title.equals(compare3[202])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd203));
        } else if (title.equals(compare3[203])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd204));
        } else if (title.equals(compare3[204])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd205));
        } else if (title.equals(compare3[205])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd206));
        } else if (title.equals(compare3[206])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd207));
        } else if (title.equals(compare3[207])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd208));
        } else if (title.equals(compare3[208])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd209));
        } else if (title.equals(compare3[209])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd210));
        } else if (title.equals(compare3[210])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd211));
        } else if (title.equals(compare3[211])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd212));
        } else if (title.equals(compare3[212])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd213));
        } else if (title.equals(compare3[213])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd214));
        } else if (title.equals(compare3[214])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd215));
        } else if (title.equals(compare3[215])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd216));
        } else if (title.equals(compare3[216])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd217));
        } else if (title.equals(compare3[217])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd218));
        } else if (title.equals(compare3[218])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd219));
        } else if (title.equals(compare3[219])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd220));
        } else if (title.equals(compare3[220])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd221));
        } else if (title.equals(compare3[221])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd222));
        } else if (title.equals(compare3[222])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd223));
        } else if (title.equals(compare3[223])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd224));
        } else if (title.equals(compare3[224])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd225));
        } else if (title.equals(compare3[225])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd226));
        } else if (title.equals(compare3[226])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd227));
        } else if (title.equals(compare3[227])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd228));
        } else if (title.equals(compare3[228])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd229));
        } else if (title.equals(compare3[229])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd230));
        } else if (title.equals(compare3[230])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd231));
        } else if (title.equals(compare3[231])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd232));
        } else if (title.equals(compare3[232])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd233));
        } else if (title.equals(compare3[233])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd234));
        } else if (title.equals(compare3[234])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd235));
        } else if (title.equals(compare3[235])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.abd236));
        }
    }

    public void putTextintoPrefixesandRoots() {

        // getting ItemSelected

        Bundle b = getIntent().getExtras();
        title = b.getString("itemSelected");

        //Put the text for Prefixes and Roots!

        String[] compare2 = getResources().getStringArray(R.array.Prefixes_Roots);

        if (title.equals(compare2[0])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr1));
        } else if (title.equals(compare2[1])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr2));
        } else if (title.equals(compare2[2])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr3));
        } else if (title.equals(compare2[3])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr4));
        } else if (title.equals(compare2[4])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr5));
        } else if (title.equals(compare2[5])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr6));
        } else if (title.equals(compare2[6])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr7));
        } else if (title.equals(compare2[7])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr8));
        } else if (title.equals(compare2[8])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr9));
        } else if (title.equals(compare2[9])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr10));
        } else if (title.equals(compare2[10])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr11));
        } else if (title.equals(compare2[11])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr12));
        } else if (title.equals(compare2[12])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr13));
        } else if (title.equals(compare2[13])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr14));
        } else if (title.equals(compare2[14])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr15));
        } else if (title.equals(compare2[15])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr16));
        } else if (title.equals(compare2[16])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr17));
        } else if (title.equals(compare2[17])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr18));
        } else if (title.equals(compare2[18])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr19));
        } else if (title.equals(compare2[19])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr20));
        } else if (title.equals(compare2[20])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr21));
        } else if (title.equals(compare2[21])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr22));
        } else if (title.equals(compare2[22])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr23));
        } else if (title.equals(compare2[23])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr24));
        } else if (title.equals(compare2[24])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr25));
        } else if (title.equals(compare2[25])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr26));
        } else if (title.equals(compare2[26])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr27));
        } else if (title.equals(compare2[27])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr28));
        } else if (title.equals(compare2[28])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr29));
        } else if (title.equals(compare2[29])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr30));
        } else if (title.equals(compare2[30])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr31));
        } else if (title.equals(compare2[31])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr32));
        } else if (title.equals(compare2[32])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr33));
        } else if (title.equals(compare2[33])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr34));
        } else if (title.equals(compare2[34])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr35));
        } else if (title.equals(compare2[35])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr36));
        } else if (title.equals(compare2[36])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr37));
        } else if (title.equals(compare2[37])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr38));
        } else if (title.equals(compare2[38])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr39));
        } else if (title.equals(compare2[39])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr40));
        } else if (title.equals(compare2[40])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr41));
        } else if (title.equals(compare2[41])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr42));
        } else if (title.equals(compare2[42])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr43));
        } else if (title.equals(compare2[43])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr44));
        } else if (title.equals(compare2[44])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr45));
        } else if (title.equals(compare2[45])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr46));
        } else if (title.equals(compare2[46])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr47));
        } else if (title.equals(compare2[47])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr48));
        } else if (title.equals(compare2[48])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr49));
        } else if (title.equals(compare2[49])) {
            TextView definition = (TextView) findViewById(R.id.Definition_Text);
            definition.setText(getString(R.string.pr50));
        }

    }

    //makes img button transparent

    public void transparent() {
        ImageButton img = (ImageButton) findViewById(R.id.thumb_button_1);
        ImageView img2 = (ImageView) findViewById(R.id.DefImage);

        float mama = 0;
        img.setAlpha(mama);
    }

    public void Hide_Text_Image_when_Zoom() {
        TextView defText = (TextView) findViewById(R.id.Definition_Text);
        TextView citText = (TextView) findViewById(R.id.citation_text);
        ImageView defImage = (ImageView) findViewById(R.id.DefImage);
        defText.setVisibility(View.GONE);
        citText.setVisibility(View.GONE);
        defImage.setVisibility(View.GONE);
    }

    public void Display_Text_Image_when_Unzoom() {
        TextView defText = (TextView) findViewById(R.id.Definition_Text);
        TextView citText = (TextView) findViewById(R.id.citation_text);
        ImageView defImage = (ImageView) findViewById(R.id.DefImage);
        defText.setVisibility(View.VISIBLE);
        citText.setVisibility(View.VISIBLE);
        defImage.setVisibility(View.VISIBLE);

    }

    //makes img zoom!!!

    private void zoomImageFromThumb(final View thumbView, int imageResId) {
        // If there's an animation in progress, cancel it
        // immediately and proceed with this one.
        if (mCurrentAnimator != null) {
            mCurrentAnimator.cancel();
        }

        // Load the high-resolution "zoomed-in" image.
        final ImageView expandedImageView = (ImageView) findViewById(
                R.id.expanded_image);
        expandedImageView.setImageResource(imageResId);

        // Calculate the starting and ending bounds for the zoomed-in image.
        // This step involves lots of math. Yay, math.
        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();

        // The start bounds are the global visible rectangle of the thumbnail,
        // and the final bounds are the global visible rectangle of the container
        // view. Also set the container view's offset as the origin for the
        // bounds, since that's the origin for the positioning animation
        // properties (X, Y).
        thumbView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container)
                .getGlobalVisibleRect(finalBounds, globalOffset);
        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, -globalOffset.y);

        // Adjust the start bounds to be the same aspect ratio as the final
        // bounds using the "center crop" technique. This prevents undesirable
        // stretching during the animation. Also calculate the start scaling
        // factor (the end scaling factor is always 1.0).
        float startScale;
        if ((float) finalBounds.width() / finalBounds.height()
                > (float) startBounds.width() / startBounds.height()) {
            // Extend start bounds horizontally
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            // Extend start bounds vertically
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight - startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }

        // Hide the thumbnail and show the zoomed-in view. When the animation
        // begins, it will position the zoomed-in view in the place of the
        // thumbnail.
        thumbView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);

        // Set the pivot point for SCALE_X and SCALE_Y transformations
        // to the top-left corner of the zoomed-in view (the default
        // is the center of the view).
        expandedImageView.setPivotX(0f);
        expandedImageView.setPivotY(0f);

        // Construct and run the parallel animation of the four translation and
        // scale properties (X, Y, SCALE_X, and SCALE_Y).
        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expandedImageView, View.X,
                        startBounds.left, finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y,
                        startBounds.top, finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X,
                        startScale, 1f)).with(ObjectAnimator.ofFloat(expandedImageView,
                View.SCALE_Y, startScale, 1f));
        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
                transparent();
                Hide_Text_Image_when_Zoom();
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
                transparent();
                Hide_Text_Image_when_Zoom();
            }
        });
        set.start();
        mCurrentAnimator = set;

        // Upon clicking the zoomed-in image, it should zoom back down
        // to the original bounds and show the thumbnail instead of
        // the expanded image.
        final float startScaleFinal = startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel,
                // back to their original values.
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator
                        .ofFloat(expandedImageView, View.X, startBounds.left))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.Y, startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                        transparent();
                        Display_Text_Image_when_Unzoom();
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                        transparent();
                        Display_Text_Image_when_Unzoom();
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });
    }



}

