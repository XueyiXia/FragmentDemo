package com.xxy.fragment;

import java.util.ArrayList;
import java.util.List;

import com.xxy.activity.R;
import com.xxy.adapter.CouponsAdapter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentHistory extends Fragment {
	private List<String> historyList=new ArrayList<String>();
	
	private ListView mListView;
	private CouponsAdapter mCouponsAdapter;	//适配器
	public  FragmentHistory(List<String> historyList){
		this.historyList=historyList;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
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
		mCouponsAdapter=new CouponsAdapter(historyList, getActivity());
		mListView.setAdapter(mCouponsAdapter);
		super.onViewCreated(view, savedInstanceState);
	}

}
