package sg.edu.rp.demoservice;

import android.content.Intent;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyService extends Service {

    boolean started;

    Button btnStart, btnStop;

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Service", "Service created");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false) {
            started = true;
            Log.d("Service", "Service started");
        } else {
            Log.d("Service", "Service is still running");
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("Service", "Service exited");
        super.onDestroy();
    }

   btnStart.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent i = new Intent(MainActivity.this, MyService.class);
        startService(i);
    }
    });

        btnStop.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent i = new Intent(MainActivity.this, MyService.class);
        stopService(i);
    }
    });


}
