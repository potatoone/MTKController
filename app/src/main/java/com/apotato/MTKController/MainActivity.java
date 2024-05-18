package com.apotato.MTKController;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String apkRoot="chmod 777 "+getPackageCodePath();

        //获取button按钮
        Button a1 = (Button) findViewById(R.id.a1);
        Button a2 = (Button) findViewById(R.id.a2);
        Button a3 = (Button) findViewById(R.id.a3);
        Button a4 = (Button) findViewById(R.id.a4);
        Button a5 = (Button) findViewById(R.id.a5);
        Button a6 = (Button) findViewById(R.id.a6);
        Button a7 = (Button) findViewById(R.id.a7);
        Button a8 = (Button) findViewById(R.id.a8);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        Button b5 = (Button) findViewById(R.id.b5);
        Button b6 = (Button) findViewById(R.id.b6);
        Button b7 = (Button) findViewById(R.id.b7);
        Button b8 = (Button) findViewById(R.id.b8);
        Button c1 = (Button) findViewById(R.id.c1);
        Button c2 = (Button) findViewById(R.id.c2);
        Button c3 = (Button) findViewById(R.id.c3);
        Button c4 = (Button) findViewById(R.id.c4);
        Button d1 = (Button) findViewById(R.id.d1);
        Button d2 = (Button) findViewById(R.id.d2);
        Button d3 = (Button) findViewById(R.id.d3);
        Button d4 = (Button) findViewById(R.id.d4);
        Button d5 = (Button) findViewById(R.id.d5);
        //为控件注册监听器
        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        d1.setOnClickListener(this);
        d2.setOnClickListener(this);
        d3.setOnClickListener(this);
        d4.setOnClickListener(this);
        d5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.a1:
                try {
                    String[] cmdline = { "su","-c","echo 800000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"玑你太美",Toast.LENGTH_LONG).show();
                break;
            case R.id.a2:
                try {
                    String[] cmdline = { "su","-c","echo 1866000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;
            case R.id.a3:
                try {
                    String[] cmdline = { "su","-c","echo 2133000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;
            case R.id.a4:
                try {
                    String[] cmdline = { "su","-c","echo 2667000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;
            case R.id.a5:
                try {
                    String[] cmdline = { "su","-c","echo 3200000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;
            case R.id.a6:
                try {
                    String[] cmdline = { "su","-c","echo 4266000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;
            case R.id.a7:
                try {
                    String[] cmdline = { "su","-c","echo 5500000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;
            case R.id.a8:
                try {
                    String[] cmdline = { "su","-c","echo 6400000000 >/sys/class/devfreq/mtk-dvfsrc-devfreq/userspace/set_freq" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"你没玑玑",Toast.LENGTH_LONG).show();
                break;



            case R.id.b1:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 219000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b2:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 292000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b3:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 368000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b4:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 453000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b5:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 538000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b6:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 642000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b7:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 773000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;
            case R.id.b8:
                try {
                    String[] cmdline = { "su","-c","echo 0 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 0 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" +
                            "echo 830000000 >/sys/class/devfreq/13000000.mali/userspace/set_freq\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"露出鸡脚了吧",Toast.LENGTH_LONG).show();
                break;



            case R.id.c1:
                try {
                    String[] cmdline = { "su","-c","echo schedutil >/sys/devices/system/cpu/cpufreq/policy0/scaling_governor\n" +
                            "echo schedutil >/sys/devices/system/cpu/cpufreq/policy4/scaling_governor\n" +
                            "echo schedutil >/sys/devices/system/cpu/cpufreq/policy7/scaling_governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.c2:
                try {
                    String[] cmdline = { "su","-c","echo conservative >/sys/devices/system/cpu/cpufreq/policy0/scaling_governor\n" +
                            "echo conservative >/sys/devices/system/cpu/cpufreq/policy4/scaling_governor\n" +
                            "echo conservative >/sys/devices/system/cpu/cpufreq/policy7/scaling_governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.c3:
                try {
                    String[] cmdline = { "su","-c","echo performance >/sys/devices/system/cpu/cpufreq/policy0/scaling_governor\n" +
                            "echo performance >/sys/devices/system/cpu/cpufreq/policy4/scaling_governor\n" +
                            "echo performance >/sys/devices/system/cpu/cpufreq/policy7/scaling_governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.c4:
                try {
                    String[] cmdline = { "su","-c","echo powersave >/sys/devices/system/cpu/cpufreq/policy0/scaling_governor\n" +
                            "echo powersave >/sys/devices/system/cpu/cpufreq/policy4/scaling_governor\n" +
                            "echo powersave >/sys/devices/system/cpu/cpufreq/policy7/scaling_governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;



            case R.id.d1:
                try {
                    String[] cmdline = { "su","-c","echo 1 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo dummy >/sys/class/devfreq/13000000.mali/governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.d2:
                try {
                    String[] cmdline = { "su","-c","echo 1 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo userspace >/sys/class/devfreq/13000000.mali/governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.d3:
                try {
                    String[] cmdline = { "su","-c","echo 1 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo powersave >/sys/class/devfreq/13000000.mali/governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.d4:
                try {
                    String[] cmdline = { "su","-c","echo 1 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo performance >/sys/class/devfreq/13000000.mali/governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;
            case R.id.d5:
                try {
                    String[] cmdline = { "su","-c","echo 1 >/sys/module/ged/parameters/ged_boost_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/gpu_dvfs_enable\n" +
                            "echo 1 >/sys/module/ged/parameters/is_GED_KPI_enabled\n" +
                            "echo simple_ondemand >/sys/class/devfreq/13000000.mali/governor\n" };
                    Runtime.getRuntime().exec(cmdline);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(MainActivity.this,"鸡汤来喽",Toast.LENGTH_LONG).show();
                break;


        }
    }
}
