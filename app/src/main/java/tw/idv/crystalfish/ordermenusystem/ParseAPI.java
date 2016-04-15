package tw.idv.crystalfish.ordermenusystem;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by jruffian on 2016/4/14.
 */
public class ParseAPI extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        /* initial Parse service */
        Parse.enableLocalDatastore(this);

        /*Parse service builder */
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("45f9de2da69d8a2919fdfa033638b798")
                .clientKey(null)
                .server("http://parseserver-c8hfp-env.us-east-1.elasticbeanstalk.com/parse/")
                .build()
        );
    }
}
