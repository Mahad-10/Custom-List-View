package pk.codebase.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }

    public WordAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView =convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.emoji_view, parent, false);
        }
        Word currentWord = (Word) getItem(position);
        TextView emojiTextView = (TextView) listItemView.findViewById(R.id.text_view);
        emojiTextView.setText(currentWord.getEmojiDescrip());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getmImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
