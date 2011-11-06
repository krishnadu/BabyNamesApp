package balu.android;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class CommonNames extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.listview);

		CommonNameTable cnTable = new CommonNameTable(this);
		
		cnTable.open();
		Cursor c = cnTable.fetchAllCommonNames();
		
		if (c != null){
			SimpleCursorAdapter adapter2 = new SimpleCursorAdapter(this,
					R.layout.listview,
					c, // Give the cursor to the list adapter
					new String[] {c.getColumnName(1),c.getColumnName(2)},
					
					new int[] {R.id.commonName, R.id.commonNameCount});
			
					ListView cnListView = (ListView)findViewById(R.id.commonName);
		
					cnListView.setAdapter(adapter2);
		    }
		cnTable.close();
	}
}