package aohuan.com.snackbarsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.androidadvance.topsnackbar.TSnackbar;

public class MainActivity extends AppCompatActivity {
    private Button btn0,btn,btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn0= (Button) findViewById(R.id.m_btn0);
        btn = (Button) findViewById(R.id.m_btn);
        btn1 = (Button) findViewById(R.id.m_btn1);
        btn2 = (Button) findViewById(R.id.m_btn2);
        btn3 = (Button) findViewById(R.id.m_btn3);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "过年了，过年了", Snackbar.LENGTH_LONG)
                        .setAction("去过年", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,"你点击了右边的按钮",Toast.LENGTH_LONG).show();
                            }
                        }).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab.setVisibility(View.GONE);
                Snackbar.make(fab, "我是普通的Snackbar", Snackbar.LENGTH_LONG).show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar =
                        Snackbar.make(fab, "过年了，过年了", Snackbar.LENGTH_LONG)
                                .setAction("去过年", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Toast.makeText(MainActivity.this, "你点击了右边的按钮", Toast.LENGTH_LONG).show();
                                    }
                                })
                        ;
                Snackbar.SnackbarLayout ve = (Snackbar.SnackbarLayout)snackbar.getView();
                ve.setBackgroundColor(0xffff0000);//设置背景Se
                ve.setAlpha(0.9f);//设置透明度
                ((TextView) ve.findViewById(R.id.snackbar_text)).setTextColor(Color.parseColor("#FFFFFF"));
                ((Button) ve.findViewById(R.id.snackbar_action)).setTextColor(Color.parseColor("#c0d9d9"));
                snackbar.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar =
                        Snackbar.make(fab, "过年了，过年了", Snackbar.LENGTH_LONG)
                                .setAction("去过年", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Toast.makeText(MainActivity.this, "你点击了右边的按钮", Toast.LENGTH_LONG).show();
                                    }
                                });
                View snackbarview = snackbar.getView();
                Snackbar.SnackbarLayout snackbarLayout=(Snackbar.SnackbarLayout)snackbarview;
                snackbarview.setBackgroundColor(0xffffffff);//设置背景Se
                View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(R.layout.snackbar_main,null);
                ((TextView) snackbarview.findViewById(R.id.snackbar_text)).setTextColor(Color.parseColor("#FF0000"));
                ((Button) snackbarview.findViewById(R.id.snackbar_action)).setTextColor(Color.parseColor("#ff0000"));
                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                p.gravity= Gravity.CENTER_VERTICAL;
                snackbarLayout.addView(add_view, 0, p);
                snackbar.show();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(fab, "我是顶部啊，看到没，这里这里", TSnackbar.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
