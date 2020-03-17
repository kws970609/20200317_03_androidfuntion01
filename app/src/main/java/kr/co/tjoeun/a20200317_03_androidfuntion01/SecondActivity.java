package kr.co.tjoeun.a20200317_03_androidfuntion01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200317_03_androidfuntion01.databinding.ActivityFirstBinding;
import kr.co.tjoeun.a20200317_03_androidfuntion01.databinding.ActivityMainBinding;
import kr.co.tjoeun.a20200317_03_androidfuntion01.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        binding.sec


    }
}
