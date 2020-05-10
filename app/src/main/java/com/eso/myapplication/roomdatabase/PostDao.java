package com.eso.myapplication.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.eso.myapplication.model.PostsModel;

import java.util.List;

@Dao
public interface PostDao {

    @Query("select * from PostsModel")
    List<PostsModel> getAllPosts();
    @Insert
    void cahePosts(List<PostsModel> postsModels);
}
