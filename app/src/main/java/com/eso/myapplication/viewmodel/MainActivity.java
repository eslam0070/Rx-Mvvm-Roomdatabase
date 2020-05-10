package com.eso.myapplication.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.eso.myapplication.R;
import com.eso.myapplication.model.PostsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PostsAdapter.OnItemClickListener {

    PostsAdapter postAdapter;
    RecyclerView recyclerView;
    MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        postAdapter =new PostsAdapter(new ArrayList<PostsModel>(),this);

        recyclerView=findViewById(R.id.rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postAdapter);
        mainViewModel= ViewModelProviders.of(this).get(MainViewModel.class);
        observeToLiveData();

    }

    private void observeToLiveData() {
        mainViewModel.data.observe(this, new Observer<List<PostsModel>>() {
            @Override
            public void onChanged(List<PostsModel> postsModels) {
                postAdapter.setList(postsModels);
            }
        });

        mainViewModel.msg.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(int position) {

    }
}
