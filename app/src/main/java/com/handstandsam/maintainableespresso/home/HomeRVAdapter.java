package com.handstandsam.maintainableespresso.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handstandsam.maintainableespresso.R;
import com.handstandsam.maintainableespresso.models.Category;

import java.util.ArrayList;
import java.util.List;

class HomeRVAdapter extends RecyclerView.Adapter<HomeViewHolder> {
    private List<Category> categories = new ArrayList<>();

    public HomeRVAdapter() {
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recyclerview_categories_row, parent, false);
        return new HomeViewHolder(view);
    }

    public void setData(List<Category> categories) {
        this.categories = categories;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.bindData(categories.get(position), position);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
