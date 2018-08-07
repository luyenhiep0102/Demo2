package com.hoctienganh.demo2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;


import com.hoctienganh.demo2.Fragment.Frag1;
import com.hoctienganh.demo2.Fragment.Frag2;
import com.hoctienganh.demo2.Fragment.Frag3;
import com.hoctienganh.demo2.Fragment.Frag4;
import com.hoctienganh.demo2.Fragment.Frag5;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rcDanhSach, rcDanhSachBuoi, rcDanhSachTrua, rcDanhSachToi;
    RecyclerView.Adapter adapter, adapter2, adapter3, adapter4;
    ArrayList<ListBuaSang> arDanhSach, ar2, ar3, ar4;
    TabLayout tabList;
    ViewPager viewPager;
    LinearLayout lnDay1, lnDay2, lnDay3, lnDay4, lnDay5, lnDay6, lnDay7;
    View vDay1, vDay2, vDay3, vDay4, vDay5, vDay6, vDay7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
//        rcDanhSach = findViewById(R.id.rcDanhSach);
//        rcDanhSachBuoi = findViewById(R.id.rcDanhSachBuoi);
//        rcDanhSachTrua = findViewById(R.id.rcDanhSachTrua);
//        rcDanhSachToi = findViewById(R.id.rcDanhSachToi);
        lnDay1 = findViewById(R.id.lnDay1);
        lnDay2 = findViewById(R.id.lnDay2);
        lnDay3 = findViewById(R.id.lnDay3);
        lnDay4 = findViewById(R.id.lnDay4);
        lnDay5 = findViewById(R.id.lnDay5);
        lnDay6 = findViewById(R.id.lnDay6);
        lnDay7 = findViewById(R.id.lnDay7);

        vDay1 = findViewById(R.id.vDay1);
        vDay2 = findViewById(R.id.vDay2);
        vDay3 = findViewById(R.id.vDay3);
        vDay4 = findViewById(R.id.vDay4);
        vDay5 = findViewById(R.id.vDay5);
        vDay6 = findViewById(R.id.vDay6);
        vDay7 = findViewById(R.id.vDay7);

        lnDay1.setOnClickListener(this);
        lnDay2.setOnClickListener(this);
        lnDay3.setOnClickListener(this);
        lnDay4.setOnClickListener(this);
        lnDay5.setOnClickListener(this);
        lnDay6.setOnClickListener(this);
        lnDay7.setOnClickListener(this);

        tabList = findViewById(R.id.tabList);
        viewPager = findViewById(R.id.vp);
        setupViewPager(viewPager);
        tabList.setupWithViewPager(viewPager);
        setupTabIcons();

//        rcDanhSach.setHasFixedSize(true);
//        rcDanhSach.setLayoutManager(new LinearLayoutManager(this));
//
//        rcDanhSachBuoi.setHasFixedSize(true);
//        rcDanhSachBuoi.setLayoutManager(new LinearLayoutManager(this));
//
//        rcDanhSachTrua.setHasFixedSize(true);
//        rcDanhSachTrua.setLayoutManager(new LinearLayoutManager(this));
//
//        rcDanhSachToi.setHasFixedSize(true);
//        rcDanhSachToi.setLayoutManager(new LinearLayoutManager(this));
//
//        arDanhSach = new ArrayList<>();
//        arDanhSach.add(new ListBuaSang("2 Trứng Rán", "350 Kcal"));
//        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        adapter = new AdapterListMonAn(arDanhSach, MainActivity.this);
//        rcDanhSach.setAdapter(adapter);
//
//        ar2 = new ArrayList<>();
//        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        adapter2 = new AdapterListMonAn(ar2, MainActivity.this);
//        rcDanhSachBuoi.setAdapter(adapter2);
//
//        ar3 = new ArrayList<>();
//        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        adapter3 = new AdapterListMonAn(ar3, MainActivity.this);
//        rcDanhSachTrua.setAdapter(adapter3);
//
//        ar4 = new ArrayList<>();
//        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
//        adapter4 = new AdapterListMonAn(ar4, MainActivity.this);
//        rcDanhSachToi.setAdapter(adapter4);


    }
    private void setupViewPager(ViewPager viewPager) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Frag1(), "Nutrition");
        adapter.addFragment(new Frag2(), "Workout");
        adapter.addFragment(new Frag3(), "Pedometer");
        adapter.addFragment(new Frag4(), "Calories");
        adapter.addFragment(new Frag5(), "Graphs");

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
    }

    private void setupTabIcons() {
        tabList.getTabAt(0).setIcon(R.drawable.ic_nutrition_blue);
        tabList.getTabAt(1).setIcon(R.drawable.ic_workout_black);
        tabList.getTabAt(2).setIcon(R.drawable.ic_pedometer_black);
        tabList.getTabAt(3).setIcon(R.drawable.ic_calories_black);
        tabList.getTabAt(4).setIcon(R.drawable.ic_graph_black);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lnDay1:
                lnDay1.setBackgroundResource(R.drawable.custom_button_shadow);
                lnDay2.setBackgroundResource(R.drawable.drawable_box);
                lnDay3.setBackgroundResource(R.drawable.drawable_box);
                lnDay4.setBackgroundResource(R.drawable.drawable_box);
                lnDay5.setBackgroundResource(R.drawable.drawable_box);
                lnDay6.setBackgroundResource(R.drawable.drawable_box);
                lnDay7.setBackgroundResource(R.drawable.drawable_box);
                vDay1.setVisibility(View.VISIBLE);
                vDay2.setVisibility(View.INVISIBLE);
                vDay3.setVisibility(View.INVISIBLE);
                vDay4.setVisibility(View.INVISIBLE);
                vDay5.setVisibility(View.INVISIBLE);
                vDay6.setVisibility(View.INVISIBLE);
                vDay7.setVisibility(View.INVISIBLE);
                break;
            case R.id.lnDay2:
                lnDay1.setBackgroundResource(R.drawable.drawable_box);
                lnDay2.setBackgroundResource(R.drawable.custom_button_shadow);
                lnDay3.setBackgroundResource(R.drawable.drawable_box);
                lnDay4.setBackgroundResource(R.drawable.drawable_box);
                lnDay5.setBackgroundResource(R.drawable.drawable_box);
                lnDay6.setBackgroundResource(R.drawable.drawable_box);
                lnDay7.setBackgroundResource(R.drawable.drawable_box);
                vDay1.setVisibility(View.INVISIBLE);
                vDay2.setVisibility(View.VISIBLE);
                vDay3.setVisibility(View.INVISIBLE);
                vDay4.setVisibility(View.INVISIBLE);
                vDay5.setVisibility(View.INVISIBLE);
                vDay6.setVisibility(View.INVISIBLE);
                vDay7.setVisibility(View.INVISIBLE);
                break;
            case R.id.lnDay3:
                lnDay1.setBackgroundResource(R.drawable.drawable_box);
                lnDay2.setBackgroundResource(R.drawable.drawable_box);
                lnDay3.setBackgroundResource(R.drawable.custom_button_shadow);
                lnDay4.setBackgroundResource(R.drawable.drawable_box);
                lnDay5.setBackgroundResource(R.drawable.drawable_box);
                lnDay6.setBackgroundResource(R.drawable.drawable_box);
                lnDay7.setBackgroundResource(R.drawable.drawable_box);
                vDay1.setVisibility(View.INVISIBLE);
                vDay2.setVisibility(View.INVISIBLE);
                vDay3.setVisibility(View.VISIBLE);
                vDay4.setVisibility(View.INVISIBLE);
                vDay5.setVisibility(View.INVISIBLE);
                vDay6.setVisibility(View.INVISIBLE);
                vDay7.setVisibility(View.INVISIBLE);
                break;
            case R.id.lnDay4:
                lnDay1.setBackgroundResource(R.drawable.drawable_box);
                lnDay2.setBackgroundResource(R.drawable.drawable_box);
                lnDay3.setBackgroundResource(R.drawable.drawable_box);
                lnDay4.setBackgroundResource(R.drawable.custom_button_shadow);
                lnDay5.setBackgroundResource(R.drawable.drawable_box);
                lnDay6.setBackgroundResource(R.drawable.drawable_box);
                lnDay7.setBackgroundResource(R.drawable.drawable_box);
                vDay1.setVisibility(View.INVISIBLE);
                vDay2.setVisibility(View.INVISIBLE);
                vDay3.setVisibility(View.INVISIBLE);
                vDay4.setVisibility(View.VISIBLE);
                vDay5.setVisibility(View.INVISIBLE);
                vDay6.setVisibility(View.INVISIBLE);
                vDay7.setVisibility(View.INVISIBLE);
                break;
            case R.id.lnDay5:
                lnDay1.setBackgroundResource(R.drawable.drawable_box);
                lnDay2.setBackgroundResource(R.drawable.drawable_box);
                lnDay3.setBackgroundResource(R.drawable.drawable_box);
                lnDay4.setBackgroundResource(R.drawable.drawable_box);
                lnDay5.setBackgroundResource(R.drawable.custom_button_shadow);
                lnDay6.setBackgroundResource(R.drawable.drawable_box);
                lnDay7.setBackgroundResource(R.drawable.drawable_box);
                vDay1.setVisibility(View.INVISIBLE);
                vDay2.setVisibility(View.INVISIBLE);
                vDay3.setVisibility(View.INVISIBLE);
                vDay4.setVisibility(View.INVISIBLE);
                vDay5.setVisibility(View.VISIBLE);
                vDay6.setVisibility(View.INVISIBLE);
                vDay7.setVisibility(View.INVISIBLE);
                break;
            case R.id.lnDay6:
                lnDay1.setBackgroundResource(R.drawable.drawable_box);
                lnDay2.setBackgroundResource(R.drawable.drawable_box);
                lnDay3.setBackgroundResource(R.drawable.drawable_box);
                lnDay4.setBackgroundResource(R.drawable.drawable_box);
                lnDay5.setBackgroundResource(R.drawable.drawable_box);
                lnDay6.setBackgroundResource(R.drawable.custom_button_shadow);
                lnDay7.setBackgroundResource(R.drawable.drawable_box);
                vDay1.setVisibility(View.INVISIBLE);
                vDay2.setVisibility(View.INVISIBLE);
                vDay3.setVisibility(View.INVISIBLE);
                vDay4.setVisibility(View.INVISIBLE);
                vDay5.setVisibility(View.INVISIBLE);
                vDay6.setVisibility(View.VISIBLE);
                vDay7.setVisibility(View.INVISIBLE);
                break;
            case R.id.lnDay7:
                lnDay1.setBackgroundResource(R.drawable.drawable_box);
                lnDay2.setBackgroundResource(R.drawable.drawable_box);
                lnDay3.setBackgroundResource(R.drawable.drawable_box);
                lnDay4.setBackgroundResource(R.drawable.drawable_box);
                lnDay5.setBackgroundResource(R.drawable.drawable_box);
                lnDay6.setBackgroundResource(R.drawable.drawable_box);
                lnDay7.setBackgroundResource(R.drawable.custom_button_shadow);
                vDay1.setVisibility(View.INVISIBLE);
                vDay2.setVisibility(View.INVISIBLE);
                vDay3.setVisibility(View.INVISIBLE);
                vDay4.setVisibility(View.INVISIBLE);
                vDay5.setVisibility(View.INVISIBLE);
                vDay6.setVisibility(View.INVISIBLE);
                vDay7.setVisibility(View.VISIBLE);
                break;
        }
    }
}
