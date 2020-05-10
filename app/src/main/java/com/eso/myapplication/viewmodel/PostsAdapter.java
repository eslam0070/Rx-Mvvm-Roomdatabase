package com.eso.myapplication.viewmodel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eso.myapplication.R;
import com.eso.myapplication.model.PostsModel;

import java.util.List;


public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.myViewHolder> {

    private List<PostsModel> postsList;
    private OnItemClickListener mClickListener;

    public PostsAdapter(List<PostsModel> postsList, OnItemClickListener mClickListener) {
        this.postsList = postsList;
        this.mClickListener = mClickListener;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        PostsModel model = postsList.get(position);
        holder.mTitleTV.setText(model.getTitle());
        holder.mBodyTV.setText(model.getBody());

    }

    @Override
    public int getItemCount() {
        if (postsList == null) return 0;
        return postsList.size();
    }
    public void setList(List<PostsModel> postsModels) {
        this.postsList = postsModels;
        notifyDataSetChanged();
    }
    class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mTitleTV,mUserIDTV,mBodyTV;

        myViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mTitleTV = itemView.findViewById(R.id.titleTV);
            mUserIDTV = itemView.findViewById(R.id.userIDTV);
            mBodyTV = itemView.findViewById(R.id.bodyTV);
        }

        @Override
        public void onClick(View v) {
            mClickListener.onClick(getAdapterPosition());
        }
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }
}
