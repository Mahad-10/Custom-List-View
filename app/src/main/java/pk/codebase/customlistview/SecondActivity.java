package pk.codebase.customlistview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        TextView textView = (TextView)findViewById(R.id.text_view);
        ImageView imageView = (ImageView)findViewById(R.id.image_view);

        Bundle bundle = getIntent().getExtras();
        textView.setText(bundle.getString("data1"));

        Drawable MyImageDraw = ContextCompat.getDrawable(this,bundle.getInt("data2"));
        imageView.setImageDrawable(MyImageDraw);
    }
}
