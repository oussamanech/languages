package com.example.languages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","красный  "));
        words.add(new Word("orange","оранжевый  "));
        words.add(new Word("yellow","жёлтый  "));
        words.add(new Word("green","зелёный  "));
        words.add(new Word("blue","синий  "));
        words.add(new Word("light blue","голубой  "));
        words.add(new Word("purple/violet","фиолетовый  "));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}