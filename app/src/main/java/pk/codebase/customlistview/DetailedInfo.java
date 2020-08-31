package pk.codebase.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailedInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = getIntent();
//        int position = getIntent().getExtras().getInt("position");
//        ArrayList<Word> emojis = (ArrayList<Word>) getIntent().getSerializableExtra("Emojis");
//
//        Word word = emojis.get(position);
//        int mImageId = word.getmImageResourceId();
//        String emojiDescrip = word.getEmojiDescrip();
//
//
//
//        final WordAdapter adapter = new WordAdapter(this,emojis);
//        ListView listView =(ListView)findViewById(R.id.list);
//        listView.setAdapter(adapter);
    }
}
