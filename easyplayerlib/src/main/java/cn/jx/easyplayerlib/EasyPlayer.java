package cn.jx.easyplayerlib;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;

import cn.jx.easyplayerlib.events.VideoEventListener;


/**
 *
 */

public class EasyPlayer {

    static final String TAG = EasyPlayer.class.getSimpleName();

    private VideoEventListener videoEventListener;
    private Handler mainHandler = new Handler();


    static {
        System.loadLibrary("player-lib");
    }

    public native void play(String url, Surface surface);

    private void onResolutionChange(final int width,final int height){
        Log.d(TAG, "height: "+height+" width:"+width);
//        if (videoEventListener != null) {
//            mainHandler.post(new Runnable(){
//
//                @Override
//                public void run() {
//                    videoEventListener.onResolutionChange(width, height);
//                }
//
//            });
//
//        }


    }

    public void setVideoEventListener(VideoEventListener videoEventListener) {
        this.videoEventListener = videoEventListener;
    }
}