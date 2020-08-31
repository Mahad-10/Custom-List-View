package pk.codebase.customlistview;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

public class Emoji extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> emojis =new ArrayList<Word>();
        emojis.add(new Word ("Thumbs Up", R.drawable.thumbs_up));
        emojis.add(new Word("Fire",R.drawable.fire));
        emojis.add(new Word ("Angry Face", R.drawable.angry));
        emojis.add(new Word("Cool with sunglasses",R.drawable.cool_sunglasses));
        emojis.add(new Word ("Feared Face", R.drawable.fearful));
        emojis.add(new Word("Loudly Crying Face",R.drawable.loudly_crying));
        emojis.add(new Word ("Love Heart Eyes Face", R.drawable.love_heart_eyes));
        emojis.add(new Word("Surprised Face",R.drawable.surprised));
        emojis.add(new Word ("Tears of Joy Face", R.drawable.tears_of_joy));
        emojis.add(new Word("Wink Face",R.drawable.wink));
        emojis.add(new Word ("Tongue Out", R.drawable.tongue_out));
        emojis.add(new Word ("Angel Blushing", R.drawable.angel_blushing));


        final WordAdapter adapter = new WordAdapter(this,emojis);
        ListView listView =(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("data1",emojis.get(position).getEmojiDescrip().toString());
                bundle.putInt("data2",emojis.get(position).getmImageResourceId());

                Intent intent = new Intent(Emoji.this, SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
