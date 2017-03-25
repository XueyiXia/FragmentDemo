package com.xxy.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.xxy.adapter.FragmentAdapter;
import com.xxy.fragment.FragmentCurrent;
import com.xxy.fragment.FragmentHistory;


public class MainActivity extends FragmentActivity {
	private List<Fragment> fragmentList;
	private List<String> currentList;	//保存当前数据
	private List<String> historyList;	//保存历史数据
	private ViewPager viewPager;
	private FragmentAdapter adapter;
	private TextView current;
	private TextView history;
	
	private FragmentCurrent mFragmentCurrent;
	private FragmentHistory mFragmentHistory; 
	
	private FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentList=new ArrayList<String>();
        currentList.add("乔丹1");
        currentList.add("乔丹2");
        currentList.add("乔丹3");
        currentList.add("乔丹4");
        currentList.add("乔丹5");
        
        historyList=new ArrayList<String>();
        historyList.add("科比1");
        historyList.add("乔丹2");
        historyList.add("科比2");
        historyList.add("科比3");
        historyList.add("科比4");
        historyList.add("科比5");
        historyList.add("乔丹3");
        historyList.add("乔丹4");
        historyList.add("乔丹5");
        initWidget();
        initViewPager();
    }
    
    /**
     * 初始化组件
     */
    private void initWidget(){
    	viewPager=(ViewPager)findViewById(R.id.viewpager);
    	current=(TextView)findViewById(R.id.current);
    	history=(TextView)findViewById(R.id.history);
    }
    
    /**
     * 
     */
    private void initViewPager(){
    	mFragmentManager=getSupportFragmentManager();	//获取管理
    	mFragmentCurrent=new FragmentCurrent(currentList);
    	mFragmentHistory=new FragmentHistory(historyList);
    	
    	fragmentList=new ArrayList<Fragment>();
    	
    	fragmentList.add(mFragmentCurrent);
    	fragmentList.add(mFragmentHistory);
    	adapter=new FragmentAdapter(mFragmentManager, fragmentList);
    	viewPager.setAdapter(adapter);
    }

}
