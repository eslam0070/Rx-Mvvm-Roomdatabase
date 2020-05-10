package com.eso.myapplication.api;

import com.eso.myapplication.model.PostsModel;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface WebServices {
    @GET("posts")
    Single<List<PostsModel>> getPostModel();
}