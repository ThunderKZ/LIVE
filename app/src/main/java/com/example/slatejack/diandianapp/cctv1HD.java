package com.example.slatejack.diandianapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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

public class cctv1HD extends AppCompatActivity {
    private PlayerView playerView1;
    SimpleExoPlayer player1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cctv1_hd );
        playerView1=findViewById( R.id.player_view1 );
        //得到默认合适的带宽
        DefaultBandwidthMeter bandwidthMeter1 = new DefaultBandwidthMeter();
        // 创建跟踪的工厂
        TrackSelection.Factory videoTrackSelectionFactory1 = new AdaptiveTrackSelection.Factory(bandwidthMeter1);
        // 创建跟踪器
        TrackSelector trackSelector = new DefaultTrackSelector(videoTrackSelectionFactory1);
        // 创建player
        player1 = ExoPlayerFactory.newSimpleInstance(this, trackSelector);
        // 开始播放，绑定player对象
        playerView1.setPlayer(player1);
        // 生成通过其加载媒体数据的DataSource实例
        DataSource.Factory dataSourceFactory1 = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "ExoPlayer"), bandwidthMeter1);
        // 创建要播放的媒体的MediaSource
        Uri uri=Uri.parse( "http://223.110.245.147/ott.js.chinamobile.com/PLTV/3/224/3221226998/index.m3u8" );
        MediaSource mediaSource1 = new HlsMediaSource.Factory(dataSourceFactory1).createMediaSource(uri);
        // 准备播放器的MediaSource
        player1.prepare(mediaSource1);
        // 当准备完毕后直接播放
        player1.setPlayWhenReady(true);
    }
    @Override
    //实现退出注销窗口
    protected void onDestroy() {
        super.onDestroy();
        if (player1!=null){
            player1.release();
        }
    }
}
