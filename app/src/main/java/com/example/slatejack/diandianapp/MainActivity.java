package com.example.slatejack.diandianapp;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*
    public static final String TAG = MainActivity.class.getCanonicalName();
    private List<String> mList = new ArrayList<>();
    private List<String> mList1 = new ArrayList<>();
    FloatingActionButton floatingActionButton;
    BottomAppBar bottomAppBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        floatingActionButton = findViewById(R.id.fab);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        //main line for setting menuin bottom app bar
        setSupportActionBar(bottomAppBar);//使底边栏的按钮可以实现点击操作
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "174020303 徐靖鸿", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", null)
                        .show();
            }

        });
        initData();
        initData1();
        initView();
    }

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

    private void initView() {
        VerticalAdapter adapter = new VerticalAdapter( this );
        RecyclerView rcvVertical = findViewById( R.id.rcv_vertical );

        LinearLayoutManager managerVertical = new LinearLayoutManager( this );
        managerVertical.setOrientation( LinearLayoutManager.VERTICAL );

        rcvVertical.setLayoutManager( managerVertical );
        rcvVertical.setHasFixedSize( true );
        rcvVertical.setAdapter( adapter );
        adapter.setVerticalDataList( mList,mList1);
        adapter.setOnItemClickListener( new VerticalAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                //定义相应的事件逻辑
                switch (position) {
                    case 0: {
                        Intent intent1 = new Intent( MainActivity.this, cctv1.class );
                        MainActivity.this.startActivity( intent1 );
                        break;
                    }
                    case 1: {
                        Intent intent2 = new Intent( MainActivity.this, cctv1HD.class );
                        MainActivity.this.startActivity( intent2 );
                        break;
                    }
                    case 2: {
                        Intent intent3 = new Intent( MainActivity.this, cctv2HD.class );
                        MainActivity.this.startActivity( intent3 );
                        break;
                    }
                    case 3: {
                        Intent intent4 = new Intent( MainActivity.this, cctv3.class );
                        MainActivity.this.startActivity( intent4 );
                        break;
                    }
                    case 4: {
                        Intent intent5 = new Intent( MainActivity.this, cctv3HD.class );
                        MainActivity.this.startActivity( intent5 );
                        break;
                    }
                    case 5: {
                        Intent intent6 = new Intent( MainActivity.this, cctv4.class );
                        MainActivity.this.startActivity( intent6 );
                        break;
                    }
                    case 6: {
                        Intent intent7 = new Intent( MainActivity.this, cctv4HD.class );
                        MainActivity.this.startActivity( intent7 );
                        break;
                    }
                    case 7: {
                        Intent intent8 = new Intent( MainActivity.this, cctv5.class );
                        MainActivity.this.startActivity( intent8 );
                        break;
                    }
                    case 8: {
                        Intent intent9 = new Intent( MainActivity.this, cctv5HD.class );
                        MainActivity.this.startActivity( intent9 );
                        break;
                    }
                }
            }
        } );

    }
*/
}
