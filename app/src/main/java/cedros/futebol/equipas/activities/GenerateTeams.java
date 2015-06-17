package cedros.futebol.equipas.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import cedros.futebol.equipas.objects.ContentConstants;

import com.cedros.futebol.equipas.R;

/**
 * 
 * @author Carlos
 * @version 1.0 @date 2 de Jun de 2015
 */
public class GenerateTeams extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_generate_teams);

		// load titles from strings.xml
		ContentConstants.navMenuTitles = getResources().getStringArray(
				R.array.nav_drawer_items);

		// load icons from strings.xml
		ContentConstants.navMenuIcons = getResources().obtainTypedArray(
				R.array.nav_drawer_icons);

		set(ContentConstants.navMenuTitles, ContentConstants.navMenuIcons);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.generate_teams, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
