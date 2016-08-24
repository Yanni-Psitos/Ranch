package ypsitos.geoquizreal;

/**
 * Created by YPsitos on 8/21/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textRedId, boolean answerTrue){
        mTextResId = textRedId;
        mAnswerTrue = answerTrue;
    }
}
