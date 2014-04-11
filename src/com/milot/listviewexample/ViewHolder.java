package com.milot.listviewexample;

import android.view.View;
import android.widget.TextView;

public class ViewHolder {
	View convertView;
	TextView textView;
	public ViewHolder(View convertView) {
		this.convertView = convertView;
	}
	
	public TextView getTextView() {
		if (textView == null) {
			textView = (TextView) convertView.findViewById(android.R.id.text1);
		}
		
		return textView;
	}
	
}
