package tw.idv.crystalfish.ordermenusystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ParseObject object = new ParseObject("Menu");
        object.put("order1", "Pork");
        object.put("order", "Beef");
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Toast.makeText(orderActivity.this, "Parse Success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(orderActivity.this, "Parse Fall", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }
}
