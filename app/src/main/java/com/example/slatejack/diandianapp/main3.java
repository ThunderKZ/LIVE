package com.example.slatejack.diandianapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class main3 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;
    public static final String TAG = MainActivity.class.getCanonicalName();
    private List<String> mList = new ArrayList<>();
    private List<String> mList1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        //底部按钮弹出框代码部分
        floatingActionButton = findViewById( R.id.fab);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        //main line for setting menuin bottom app bar
        setSupportActionBar(bottomAppBar);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "感谢您的反馈", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", null)
                        .show();
                Intent intent=new Intent( main3.this,questiontable.class );
                startActivity( intent );
            }
        });
        //点击菜单menu按钮划出侧滑菜单方法
        floatingActionButton = findViewById(R.id.fab);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        setSupportActionBar(bottomAppBar);

        DrawerLayout drawer = findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, bottomAppBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();
        NavigationView navigationView = findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener(this);
        //添加节目名称数据，节目URL数据代码
        initData();
        initData1();
        initView();
    }



    //设置侧滑菜单属性
    @Override
    public void onBackPressed() {//当按下返回键的时候，对抽屉进行设置，这个地方要知道如何关闭和打开抽屉
            /**
                  *  drawer.closeDrawer(GravityCompat.START);从开始关闭抽屉
                  *  drawer.openDrawer();打开抽屉，方向自选
                  */
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            }
        else {
        super.onBackPressed();
        }
    }
    //设置点击侧滑菜单里面按钮所响应的事件
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }
    //设置界面右下角三个小点的点击事件
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main2, menu );
        return true;
    }
    //创建一个列表用于存放节目名称
    private void initData() {
        mList.add( "测试平台" );
        mList.add( "cctv1 高清" );
        mList.add( "cctv2 高清" );
        mList.add( "cctv3" );
        mList.add( "cctv3 高清" );
        mList.add( "cctv4" );
        mList.add( "cctv4 高清" );
        mList.add( "cctv5" );
        mList.add( "cctv5 高清" );
    }
    //创建一个列表用于存放节目URL
    private void initData1() {
        mList1.add( "测试平台仅供参考测试使用" );
        mList1.add( "欢迎收看cctv1高清(1080p)" );
        mList1.add( "欢迎收看cctv2高清(1080p)" );
        mList1.add( "欢迎收看cctv3" );
        mList1.add( "欢迎收看cctv3高清(1080p)" );
        mList1.add( "欢迎收看cctv4" );
        mList1.add( "欢迎收看cctv4高清(1080p)" );
        mList1.add( "欢迎收看cctv5" );
        mList1.add( "欢迎收看cctv5高清(1080p)" );
    }
    //设置点击不同cardview时的点击事件
    @SuppressLint("WrongConstant")
    private void initView() {
        VerticalAdapter adapter = new VerticalAdapter( this );
        RecyclerView rcvVertical = findViewById( R.id.rcv_vertical );
        LinearLayoutManager managerVertical = new LinearLayoutManager( this );
        managerVertical.setOrientation( LinearLayoutManager.VERTICAL );
        rcvVertical.setLayoutManager( managerVertical );
        rcvVertical.setHasFixedSize( true );
        rcvVertical.setAdapter( adapter );
        adapter.setVerticalDataList( mList,mList1);//将数据从main3传递到verticalAdapter内
        adapter.setOnItemClickListener( new VerticalAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {//根据verticalAdapter里获取到的cardview地址号定义每一个cardview点击逻辑
                //定义相应的事件逻辑
                switch (position) {
                    case 0: {
                        Intent intent1 = new Intent( main3.this, cctv1.class );
                        main3.this.startActivity( intent1 );
                        break;
                    }
                    case 1: {
                        Intent intent2 = new Intent( main3.this, cctv1HD.class );
                        main3.this.startActivity( intent2 );
                        break;
                    }
                    case 2: {
                        Intent intent3 = new Intent( main3.this, cctv2HD.class );
                        main3.this.startActivity( intent3 );
                        break;
                    }
                    case 3: {
                        Intent intent4 = new Intent( main3.this, cctv3.class );
                        main3.this.startActivity( intent4 );
                        break;
                    }
                    case 4: {
                        Intent intent5 = new Intent( main3.this, cctv3HD.class );
                        main3.this.startActivity( intent5 );
                        break;
                    }
                    case 5: {
                        Intent intent6 = new Intent( main3.this, cctv4.class );
                        main3.this.startActivity( intent6 );
                        break;
                    }
                    case 6: {
                        Intent intent7 = new Intent( main3.this, cctv4HD.class );
                        main3.this.startActivity( intent7 );
                        break;
                    }
                    case 7: {
                        Intent intent8 = new Intent( main3.this, cctv5.class );
                        main3.this.startActivity( intent8 );
                        break;
                    }
                    case 8: {
                        Intent intent9 = new Intent( main3.this, cctv5HD.class );
                        main3.this.startActivity( intent9 );
                        break;
                    }
                }
            }
        } );

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {//底部单独菜单点击处理
        return super.onOptionsItemSelected( item );
    }
}
