package com.milot.listviewexample;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.milot.listviewexample.R;

public class MyListViewActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_layout);
		
		List<String> objects = new ArrayList<String>();
		for (int i = 0; i < 20; ++i) {
			objects.add("test");
		}
		
		setListAdapter(new MyArrayAdapter(this, objects));
	}
	
	private class MyArrayAdapter extends ArrayAdapter<String> {

	    List<String> objs;
	    Context context;
	    public MyArrayAdapter(Context context,
	        List<String> objects) {
	      super(context, 0, objects);
	      objs = objects;
	      this.context = context;
	    }
	    
	    @Override
	    public long getItemId(int position) {
	        return position;
	    }

	    
	    @Override
	    public int getCount() {
	    		return objs.size();
	    }

	    @Override
      public View getView(int position, View convertView, ViewGroup parent) {
	    	ViewHolder holder;
	    	if (convertView == null) {
           convertView = getLayoutInflater().inflate(android.R.layout.simple_list_item_1,
                        parent, false);
           holder = new ViewHolder(convertView);
           convertView.setTag(holder);
	    	} else {
	    		holder = (ViewHolder) convertView.getTag();
	    	}
        holder.getTextView().setText(objs.get(position));

        return convertView;
      }
	}
}
