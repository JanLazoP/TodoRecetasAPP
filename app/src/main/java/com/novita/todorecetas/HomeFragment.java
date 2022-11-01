package com.novita.todorecetas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.novita.todorecetas.adapters.HomeHorizontalAdapter;
import com.novita.todorecetas.modelos.HomeHorizontalModelo;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRecycler;
    List<HomeHorizontalModelo> homeHorizontalModeloList;
    HomeHorizontalAdapter homeHorizontalAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        homeHorizontalRecycler = root.findViewById(R.id.home_hor_recycler);

        homeHorizontalModeloList = new ArrayList<>();

        homeHorizontalModeloList.add(new HomeHorizontalModelo(R.drawable.almuerzo,"almuerzos"));
        homeHorizontalModeloList.add(new HomeHorizontalModelo(R.drawable.salad,"ensaladas"));
        homeHorizontalModeloList.add(new HomeHorizontalModelo(R.drawable.dinner,"cenas"));
        homeHorizontalModeloList.add(new HomeHorizontalModelo(R.drawable.sandwich,"sandwiches"));
        homeHorizontalModeloList.add(new HomeHorizontalModelo(R.drawable.dessert,"postres"));

        homeHorizontalAdapter = new HomeHorizontalAdapter(getActivity(),homeHorizontalModeloList);

        homeHorizontalRecycler.setAdapter(homeHorizontalAdapter);
        homeHorizontalRecycler.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRecycler.setHasFixedSize(true);
        homeHorizontalRecycler.setNestedScrollingEnabled(false);

        return root;
    }
}