package com.wilis.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class spinner extends Activity
	implements AdapterView.OnItemSelectedListener {
	TextView selection;
	String[] items={"Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Jambi",
			"Sumatera Selatan", "Bengkulu", "Lampung", "Bangka Belitung", "Kepulauan Riau",
			"Jakarta", "Jawa Barat", "Jawa Tengah", "Yogyakarta", "Jawa Timur",
			"Banten", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat",
			"Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Sulawesi Utara", 
			"Sulawesi Tengah","Sulawesi Selatan","Sulawesi Tenggara","Gorontalo","Sulawesi Barat",
			"Maluku","Maluku Utara","Papua Barat","Papua"};
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		selection=(TextView)findViewById(R.id.selection);
		
		Spinner spin=(Spinner)findViewById(R.id.spinner);
		spin.setOnItemSelectedListener(this);
		
		ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item,items);
		
		aa.setDropDownViewResource(
			android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(aa);
	}
	
	public void onItemSelected(AdapterView<?> parent,
																View v, int position, long id) {
		selection.setText(items[position]);
	}
	
	public void onNothingSelected(AdapterView<?> parent) {
		selection.setText("");
	}
}