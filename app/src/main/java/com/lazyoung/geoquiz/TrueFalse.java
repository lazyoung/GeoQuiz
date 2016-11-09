package com.lazyoung.geoquiz;

/**
 * Created by Dell on 2016/1/17.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mCheatJudgment;

    public TrueFalse(int question, boolean trueQuestion, boolean cheatJudgment) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mCheatJudgment = cheatJudgment;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public boolean isCheated() {
        return mCheatJudgment;
    }

    public void setCheatJudgment(boolean cheatJudgment) {
        mCheatJudgment = cheatJudgment;
    }
}
