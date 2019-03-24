package com.example.sozluk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

   List<Word> words=new ArrayList<>();
   ListView liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        words.add(new Word("un","bir",R.drawable.number_one,R.raw.bir));
        words.add(new Word("deux","iki",R.drawable.number_two,R.raw.bir));
        words.add(new Word("trois","üç",R.drawable.number_three,R.raw.bir));
        words.add(new Word("quarte","dört",R.drawable.number_four,R.raw.bir));
        words.add(new Word("cinq","beş",R.drawable.number_five,R.raw.bir));
        words.add(new Word("six","altı",R.drawable.number_six,R.raw.bir));
        words.add(new Word("sept","yedi",R.drawable.number_seven,R.raw.bir));
        words.add(new Word("huit","sekiz",R.drawable.number_eight,R.raw.bir));
        words.add(new Word("neuf","dokuz",R.drawable.number_nine,R.raw.bir));
        words.add(new Word("dix","on",R.drawable.number_ten,R.raw.bir));

        WordAdapter adapter=new WordAdapter(this,words,R.color.category_numbers);
        liste=(ListView)findViewById(R.id.list);
        liste.setAdapter(adapter);


    }
}
