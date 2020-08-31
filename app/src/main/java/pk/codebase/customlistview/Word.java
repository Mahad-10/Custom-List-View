package pk.codebase.customlistview;

public class Word {
    private String emojiDescrip;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String emojiDescrip, int mImageResourceId){
     this.emojiDescrip = emojiDescrip;
     this.mImageResourceId = mImageResourceId;
    }
    public String getEmojiDescrip(){
        return emojiDescrip;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public void setEmojiDescrip(String emojiDescrip){
        this.emojiDescrip = emojiDescrip;
    }
    public void setmImageResourceId(int mImageResourceId){
        this.mImageResourceId = mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{ " + "emoji Description = '" + emojiDescrip + '\'' +
                ", mImageResourceId = '" + mImageResourceId + '\'' + "}";
    }

}
