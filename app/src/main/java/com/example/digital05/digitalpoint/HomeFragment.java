package com.example.digital05.digitalpoint;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by digital05 on 5/3/16.
 */
public class HomeFragment extends Fragment {
    public static final String EXTRA_PROJECT = "project";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        GridView customGridView = (GridView) v.findViewById(R.id.customGridView);
        customGridView.setAdapter(new ImageAdapter(getContext()));

        final List<Project> projects = getProjects();

        customGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ProductDetailsActivity.class);
                i.putExtra(EXTRA_PROJECT, projects.get(position));
                startActivity(i);
            }
        });

        return v;
    }

    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Title", "Description", R.drawable.image_2));
        projects.add(new Project("Title", "Description", R.drawable.image_4));
        projects.add(new Project("Title", "Description", R.drawable.image_4));

        return projects;
    }
}

