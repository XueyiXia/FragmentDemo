package com.xxy.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.xxy.activity.R;
import com.xxy.adapter.CouponsAdapter;

public class FragmentCurrent extends Fragment {
	private List<String> currentList=new ArrayList<String>();	//保存当前数据
	private ListView mListView;
	private CouponsAdapter mCouponsAdapter;	//适配器
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	public FragmentCurrent(){
		
	}
	
	public FragmentCurrent(List<String> mList){
			this.currentList=mList;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view=inflater.inflate(R.layout.fragment_list, null);
		mListView=(ListView)view.findViewById(R.id.listview);
		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		mCouponsAdapter=new CouponsAdapter(currentList, getActivity());
		mListView.setAdapter(mCouponsAdapter);
		super.onViewCreated(view, savedInstanceState);
	}

	
	
}
