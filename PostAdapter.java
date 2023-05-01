package com.example.imagecropper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private ArrayList<Post> postList;

    public PostAdapter(ArrayList<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.postId.setText(String.valueOf(post.getId()));
        holder.postTitle.setText(post.getTitle());
        holder.postBody.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView postId, postTitle, postBody;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postId = itemView.findViewById(R.id.postId);
            postTitle = itemView.findViewById(R.id.postTitle);
            postBody = itemView.findViewById(R.id.postBody);
        }
    }
}
