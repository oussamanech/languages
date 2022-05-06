package com.example.languages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Yes","Да (da)  "));
        words.add(new Word("No","Нет (nyet)  "));
        words.add(new Word("Please","Пожалуйста (poZHAlusta)  "));
        words.add(new Word("Thank you","Спасибо (spaSIbo)  "));
        words.add(new Word("You’re welcome. ","Не за что. (ne za chto)  "));
        words.add(new Word("Do you speak English?","вы говорите по-Английски? (vi govoRIte po angLIYski?)   "));
        words.add(new Word("Help me, please."," Помогите, пожалуйста. (pomoGIte, poZHAlusta)   "));
        words.add(new Word("What’s your (formal/informal) name?"," Как вас/тебя зовут? (kak vas/teBYA zoVUT?)  "));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}