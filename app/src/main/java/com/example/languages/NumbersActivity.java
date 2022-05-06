package com.example.languages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","один ",R.drawable.number_one));
        words.add(new Word("two","два ",R.drawable.number_two));
        words.add(new Word("three","три ",R.drawable.number_three));
        words.add(new Word("four","четыре ",R.drawable.number_four));
        words.add(new Word("five","пять ",R.drawable.number_five));
        words.add(new Word("six","шесть ",R.drawable.number_six));
        words.add(new Word("seven","семь ",R.drawable.number_seven));
        words.add(new Word("eight","восемь ",R.drawable.number_eight));
        words.add(new Word("nine","девять ",R.drawable.number_nine));
        words.add(new Word("ten","десять ",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordView ;
//        for (int i = 0; i < words.size(); i++) {
//            wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }
//        for (int i = 0; i < 10; i++)
//            Log.v("NumbersActivity", "Word at index " + i + ": " + words.get(i));






    }
}