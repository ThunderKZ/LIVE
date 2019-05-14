package com.example.slatejack.diandianapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

public class cctv3 extends AppCompatActivity {
    PlayerView playerView;
    SimpleExoPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cctv3 );
        playerView=findViewById( R.id.player_view3 );
        //得到默认合适的带宽
        DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
        // 创建跟踪的工厂
        TrackSelection.Factory videoTrackSelectionFactory = new AdaptiveTrackSelection.Factory(bandwidthMeter);
        // 创建跟踪器
        TrackSelector trackSelector = new DefaultTrackSelector(videoTrackSelectionFactory);
        // 创建player
        player = ExoPlayerFactory.newSimpleInstance(this, trackSelector);
        // 开始播放，绑定player对象
        playerView.setPlayer(player);
        // 生成通过其加载媒体数据的DataSource实例
        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "ExoPlayer"), bandwidthMeter);
        // 创建要播放的媒体的MediaSource
        Uri uri=Uri.parse( "http://223.110.245.147/ott.js.chinamobile.com/PLTV/3/224/3221226992/index.m3u8" );
        MediaSource mediaSource = new HlsMediaSource.Factory(dataSourceFactory).createMediaSource(uri);
        // 准备播放器的MediaSource
        player.prepare(mediaSource);
        // 当准备完毕后直接播放
        player.setPlayWhenReady(true);
    }
    @Override
    //实现退出注销窗口
    protected void onDestroy() {
        super.onDestroy();
        if (player!=null){
            player.release();
        }
    }
}
