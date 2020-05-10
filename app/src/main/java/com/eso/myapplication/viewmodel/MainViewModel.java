package com.eso.myapplication.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eso.myapplication.model.PostsModel;

import java.util.List;

public class MainViewModel extends ViewModel {
    public MutableLiveData <List<PostsModel>>data = new MutableLiveData<>();
    public MutableLiveData <String> msg=new MutableLiveData<>();
    public RepositryPost repositryPost=new RepositryPost();

    public  MainViewModel (){
        data=repositryPost.data;
        repositryPost.getData();

    }

    public void getData(){
        repositryPost.getData();
    }
}
