package balu.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Select extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.select);

		View continueButton = findViewById(R.id.about_button);
		continueButton.setOnClickListener(this);

		View commonNamesButton = findViewById(R.id.common_names);
		commonNamesButton.setOnClickListener(this);

		View unCommonNamesButton = findViewById(R.id.un_common_names);
		unCommonNamesButton.setOnClickListener(this);

		View namesPopularButton = findViewById(R.id.names_popular);
		namesPopularButton.setOnClickListener(this);

	}

	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.about_button:
			Intent i = new Intent(this, About.class);
			startActivity(i);
			break;
		case R.id.common_names:
			Intent cn = new Intent(this, CommonNames.class);
			startActivity(cn);
			break;
		case R.id.un_common_names:
			Intent ucn = new Intent(this, UnCommonNames.class);
			startActivity(ucn);
			break;
		case R.id.names_popular:
			Intent np = new Intent(this, PopularNames.class);
			startActivity(np);
			break;
		}

	}

}
