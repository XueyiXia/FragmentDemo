package com.xxy.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{
	private List<Fragment> mFragmentList;
	
	public FragmentAdapter(FragmentManager fm) {
		super(fm);
		
	}
	
	public FragmentAdapter(FragmentManager fm,List<Fragment> fragments){
		super(fm);
		this.mFragmentList=fragments;
	}

	@Override
	public Fragment getItem(int position) {
		
		return mFragmentList.get(position);
	}

	@Override
	public int getCount() {
		
		return mFragmentList.size();
	}
	
}

