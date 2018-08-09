package trydemo.soul.trydemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class AppPowerActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startAndFinishThis();
            }

        }, 2500);

    }

    private void startAndFinishThis() {
        startActivity(new Intent(AppPowerActivity.this, MainActivity.class));
        AppPowerActivity.this.finish();
    }

}
