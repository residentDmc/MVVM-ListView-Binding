package com.codinginflow.mvvmlistviewbinding.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.codinginflow.mvvmlistviewbinding.R;
import com.codinginflow.mvvmlistviewbinding.databinding.ListRawBinding;
import com.codinginflow.mvvmlistviewbinding.viewModel.NewsModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

public class NewsAdapter extends ArrayAdapter<NewsModel> {

    private ArrayList<NewsModel> newsModelArrayList;
    private Context context;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.list_raw, newsModelArrayList);
        this.context = context;
        this.newsModelArrayList = newsModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        @SuppressLint("ViewHolder") ListRawBinding listRawBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_raw, parent, false);
        listRawBinding.setNewList(newsModelArrayList.get(position));
        return listRawBinding.getRoot();
    }
}
