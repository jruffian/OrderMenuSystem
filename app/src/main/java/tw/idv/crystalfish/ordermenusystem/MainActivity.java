package tw.idv.crystalfish.ordermenusystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    ImageView orderImageView, staffImageView, menuImageView;
    ImageView recordImageView, accountImageView, analysisImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderImageView = (ImageView) findViewById(R.id.order_IV);
        staffImageView = (ImageView) findViewById(R.id.staff_IV);
        menuImageView = (ImageView) findViewById(R.id.menu_IV);
        recordImageView = (ImageView) findViewById(R.id.record_IV);
        accountImageView = (ImageView) findViewById(R.id.account_IV);
        analysisImageView = (ImageView) findViewById(R.id.analysis_IV);

        orderImageView.setOnClickListener(ImageViewListener);
        staffImageView.setOnClickListener(ImageViewListener);
        menuImageView.setOnClickListener(ImageViewListener);
        recordImageView.setOnClickListener(ImageViewListener);
        accountImageView.setOnClickListener(ImageViewListener);
        analysisImageView.setOnClickListener(ImageViewListener);

    }

    private View.OnClickListener ImageViewListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.order_IV:
                    intent.setClass(MainActivity.this, orderActivity.class);
                    startActivity(intent);
                    break;
                case R.id.staff_IV:
                    intent.setClass(MainActivity.this, staffActivity.class);
                    startActivity(intent);
                    break;
                case R.id.menu_IV:
                    intent.setClass(MainActivity.this, menuActivity.class);
                    startActivity(intent);
                    break;
                case R.id.record_IV:
                    intent.setClass(MainActivity.this, recordActivity.class);
                    startActivity(intent);
                    break;
                case R.id.account_IV:
                    intent.setClass(MainActivity.this, accountActivity.class);
                    startActivity(intent);
                    break;
                case R.id.analysis_IV:
                    intent.setClass(MainActivity.this, analysisActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
