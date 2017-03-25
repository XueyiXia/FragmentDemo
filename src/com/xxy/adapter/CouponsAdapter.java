package com.xxy.adapter;

import java.util.ArrayList;
import java.util.List;

import com.xxy.activity.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CouponsAdapter extends BaseAdapter {
	private List<String> mList=new ArrayList<String>();
	private Context mContext;
	private LayoutInflater mInflater;
	
	public CouponsAdapter(List<String> mList,Context mContext){
		this.mList=mList;
		this.mContext=mContext;
		mInflater=LayoutInflater.from(mContext);
	}
	
	@Override
	public int getCount() {
		
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup g) {
		
		ViewHolder holder=null;
		if(convertView==null){
			holder=new ViewHolder();
			convertView=mInflater.inflate(R.layout.list_item, null);
			
			
			holder.textview=(TextView)convertView.findViewById(R.id.textview);
			
			convertView.setTag(holder);
		}else{
			holder=(ViewHolder)convertView.getTag();
		}
		
		holder.textview.setText(mList.get(position));
		return convertView;
	}
	
	class ViewHolder{
		TextView textview;
	}

}
