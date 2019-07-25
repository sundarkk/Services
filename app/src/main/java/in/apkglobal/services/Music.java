package in.apkglobal.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class Music extends Service {
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //to attach the music to mediaplayer
        mediaPlayer=MediaPlayer.create(this, R.raw.ganna);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        //to start play music
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //to stop the music
        mediaPlayer.stop();
        //to release the music
        mediaPlayer.release();
    }
}
