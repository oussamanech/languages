package com.example.languages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","Отец"));
        words.add(new Word("mother","Мать"));
        words.add(new Word("dad","Папа"));
        words.add(new Word("mum","Мама"));
        words.add(new Word("brother","Брат"));
        words.add(new Word("sister","Сестра"));
        words.add(new Word("son","Сын  "));
        words.add(new Word("daughter","Дочь "));

        words.add(new Word("wife","Жена "));
        words.add(new Word("husband","Муж"));
        words.add(new Word("parents","Родители "));
        words.add(new Word("children","Дети "));
        words.add(new Word("child","ребенок   "));
        words.add(new Word("grandmother","Бабушка"));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}