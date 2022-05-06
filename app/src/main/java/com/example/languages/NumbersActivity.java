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

        words.add(new Word("one","один "));
        words.add(new Word("two","два "));
        words.add(new Word("three","три "));
        words.add(new Word("four","четыре "));
        words.add(new Word("five","пять "));
        words.add(new Word("six","шесть "));
        words.add(new Word("seven","семь "));
        words.add(new Word("eight","восемь "));
        words.add(new Word("nine","девять "));
        words.add(new Word("ten","десять "));

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