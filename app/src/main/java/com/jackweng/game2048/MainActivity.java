package com.jackweng.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.jackweng.game2048.utils.CacheUtils;

public class MainActivity extends Activity {

    private static final String TAG = "jack";

    private int score;
    private int bestScore;
    private int bestScoreRec;
    private CacheUtils utils;

    private TextView tv_score;
    private TextView tv_best_score;
    private TextView tv_remind_best_score_rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        utils = new CacheUtils(this);
        score = utils.getInt(utils.SCORE, 0);
        Log.i(TAG, "score = " + score);
        bestScore = utils.getInt(utils.BESTSCORE, 0);
        Log.i(TAG, "bestScore = " + bestScore);
        bestScoreRec = utils.getInt(utils.BESTSCOREREC, 0);
        Log.i(TAG, "bestScoreRec = " + bestScoreRec);

        tv_score = findViewById(R.id.tv_score);
        tv_score.setText(String.valueOf(score));
        tv_best_score = findViewById(R.id.tv_best_score);
        tv_best_score.setText(String.valueOf(bestScore));
        tv_remind_best_score_rec = findViewById(R.id.tv_remind_best_score_rec);
        tv_remind_best_score_rec.setText(
                getResources().getQuantityString(
                        R.plurals.remind_best_score,
                        bestScoreRec,
                        bestScoreRec));
    }
}
