package com.codinginflow.mvvmlistviewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.codinginflow.mvvmlistviewbinding.adapter.NewsAdapter;
import com.codinginflow.mvvmlistviewbinding.databinding.ActivityMainBinding;
import com.codinginflow.mvvmlistviewbinding.viewModel.NewsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayListNews();
        newsAdapter=new NewsAdapter(this,newsModelArrayList);
        activityMainBinding.listView.setAdapter(newsAdapter);

    }
}
