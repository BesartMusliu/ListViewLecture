package com.milot.listviewexample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
	View convertView;
	TextView tekstiKryesore;
	TextView tekstiPerfuni;
	ImageView foto;
	ImageView foto2;
	
	public ViewHolder(View convertView) {
		this.convertView = convertView;
	}
	
	public ImageView getFoto2() {
		if (foto2 == null) {
			foto2 = (ImageView) convertView.findViewById(R.id.foto2);
		}
		
		return foto2;
	}
	
	public ImageView getFoto() {
		if (foto == null) {
			foto = (ImageView) convertView.findViewById(R.id.foto);
		}
		
		return foto;
	}
	
	public TextView getTekstiPerfuni() {
		if (tekstiPerfuni == null) {
			tekstiPerfuni = (TextView) convertView.findViewById(R.id.tekstiPerfuni);
		}
		
		return tekstiPerfuni;
	}
	
	public TextView getTekstiKryesore() {
		if (tekstiKryesore == null) {
			tekstiKryesore = (TextView) convertView.findViewById(R.id.tekstiKryesore);
		}
		
		return tekstiKryesore;
	}
	
}
