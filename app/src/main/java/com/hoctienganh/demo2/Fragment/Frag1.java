package com.hoctienganh.demo2.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoctienganh.demo2.AdapterListMonAn;
import com.hoctienganh.demo2.ListBuaSang;
import com.hoctienganh.demo2.MainActivity;
import com.hoctienganh.demo2.R;

import java.util.ArrayList;

public class Frag1 extends Fragment {
    RecyclerView rcDanhSach, rcDanhSachBuoi, rcDanhSachTrua, rcDanhSachToi;
    RecyclerView.Adapter adapter, adapter2, adapter3, adapter4;
    ArrayList<ListBuaSang> arDanhSach, ar2, ar3, ar4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_1, null);
        rcDanhSach = view.findViewById(R.id.rcDanhSach);
        rcDanhSachBuoi = view.findViewById(R.id.rcDanhSachBuoi);
        rcDanhSachTrua = view.findViewById(R.id.rcDanhSachTrua);
        rcDanhSachToi = view.findViewById(R.id.rcDanhSachToi);

        rcDanhSach.setHasFixedSize(true);
        rcDanhSach.setLayoutManager(new LinearLayoutManager(getActivity()));

        rcDanhSachBuoi.setHasFixedSize(true);
        rcDanhSachBuoi.setLayoutManager(new LinearLayoutManager(getActivity()));

        rcDanhSachTrua.setHasFixedSize(true);
        rcDanhSachTrua.setLayoutManager(new LinearLayoutManager(getActivity()));

        rcDanhSachToi.setHasFixedSize(true);
        rcDanhSachToi.setLayoutManager(new LinearLayoutManager(getActivity()));

        arDanhSach = new ArrayList<>();
        arDanhSach.add(new ListBuaSang("2 Trứng Rán", "350 Kcal"));
        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        arDanhSach.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        adapter = new AdapterListMonAn(arDanhSach, getActivity());
        rcDanhSach.setAdapter(adapter);

        ar2 = new ArrayList<>();
        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar2.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        adapter2 = new AdapterListMonAn(ar2, getActivity());
        rcDanhSachBuoi.setAdapter(adapter2);

        ar3 = new ArrayList<>();
        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar3.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        adapter3 = new AdapterListMonAn(ar3, getActivity());
        rcDanhSachTrua.setAdapter(adapter3);

        ar4 = new ArrayList<>();
        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        ar4.add(new ListBuaSang("luyen van hiep", "738 Kcal"));
        adapter4 = new AdapterListMonAn(ar4, getActivity());
        rcDanhSachToi.setAdapter(adapter4);
        return view;
    }
}
