package com.liqi.nohttprxutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.liqi.nohttprxutils.download.DownloadFileActivity;

/**
 * 首页面，此页面用的是最LOW的方法实现的。请勿吐槽
 * Created by LiQi on 2016/12/30.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button, button1, button2, button3,button4,button5,button6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button.setAlpha(0.6f);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button1.setAlpha(0.6f);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button2.setAlpha(0.6f);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button3.setAlpha(0.6f);
        button4= (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button4.setAlpha(0.6f);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button5.setAlpha(0.6f);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button6.setAlpha(0.6f);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //GET-POST请求演示
            case R.id.button:
                startActivity(new Intent(this, GetPostDemoActivity.class));
                break;
            //图片请求演示
            case R.id.button1:
                startActivity(new Intent(this, ImageDownloadDemoActivity.class));
                break;
            //文件上传请求演示
            case R.id.button2:
                startActivity(new Intent(this, FileUploadingDemoActivity.class));
                break;
            //Https协议演示
            case R.id.button3:
                startActivity(new Intent(this, HttpsDemoActivity.class));
                break;
            //文件下载演示
            case R.id.button4:
                startActivity(new Intent(this, DownloadFileActivity.class));
                break;
            //多请求队列演示
            case R.id.button5:
                startActivity(new Intent(this, RequestQueueDemoActivity.class));
                break;
            //多请求队列演示
            case R.id.button6:
                startActivity(new Intent(this, PollDemo.class));
                break;
        }
    }
}
