/**
 * 
 */
package cedros.futebol.equipas.activities;

import java.util.ArrayList;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import cedros.futebol.equipas.adapters.MenuNavDrawerListAdapter;
import cedros.futebol.equipas.objects.MenuNavDrawerItem;

import com.cedros.futebol.equipas.R;

/**
 * 
 * @author Carlos
 * @version 1.0
 * @date 21 de Mai de 2015
 */
public class BaseActivity extends ActionBarActivity {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerListView;
	public ActionBarDrawerToggle mDrawerToggle;
	protected RelativeLayout _completeLayout, _activityLayout;

	// nav drawer title
	private CharSequence mDrawerTitle;

	private MenuNavDrawerListAdapter adapter;

	// used to store app title
	private CharSequence mTitle;

	private ArrayList<MenuNavDrawerItem> navDrawerItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_drawer_list_item);
	}

	public void set(String[] navMenuTitles, TypedArray navMenuIcons) {
		mTitle = mDrawerTitle = getTitle();
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerListView = (ListView) findViewById(R.id.left_drawer);
		navDrawerItems = new ArrayList<MenuNavDrawerItem>();

		// adding nav drawer items
		if (navMenuIcons == null) {
			for (int i = 0; i < navMenuTitles.length; i++) {
				navDrawerItems.add(new MenuNavDrawerItem(navMenuTitles[i]));
			}
		} else {
			for (int i = 0; i < navMenuTitles.length; i++) {
				navDrawerItems.add(new MenuNavDrawerItem(navMenuTitles[i],
						navMenuIcons.getResourceId(i, -1)));
			}
		}

		mDrawerListView.setOnItemClickListener(new SlideMenuClickListener());

		// setting the nav drawer list adapter
		adapter = new MenuNavDrawerListAdapter(getApplicationContext(),
				navDrawerItems);
		mDrawerListView.setAdapter(adapter);

		// enabling action bar app icon and behaving it as toggle button
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		// getSupportActionBar().setIcon(R.drawable.ic_drawer);

		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, // nav menu toggle icon
				R.string.open, // nav drawer open - description for
				// accessibility
				R.string.close // nav drawer close - description for
		// accessibility
		) {
			public void onDrawerClosed(View view) {
				getSupportActionBar().setTitle(mTitle);
				// calling onPrepareOptionsMenu() to show action bar icons
				supportInvalidateOptionsMenu();
			}

			public void onDrawerOpened(View drawerView) {
				getSupportActionBar().setTitle(mDrawerTitle);
				// calling onPrepareOptionsMenu() to hide action bar icons
				supportInvalidateOptionsMenu();
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

	private class SlideMenuClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// display view for selected nav drawer item
			displayView(position);
		}
	}

	/**
	 * Diplaying fragment view for selected nav drawer list item
	 * */
	private void displayView(int position) {
		// update the main content by replacing fragments
		switch (position) {
		case 0:
			Intent intent = new Intent(this, PlayersListActivity.class);
			startActivity(intent);
//			finish();
			break;
		case 1:
			Intent intent2 = new Intent(this, ClassificationActivity.class);
			startActivity(intent2);
//			finish();
			break;
		default:
			break;
		}

		// update selected item and title, then close the drawer
		mDrawerListView.setItemChecked(position, true);
		mDrawerListView.setSelection(position);
		mDrawerLayout.closeDrawer(mDrawerListView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			if (mDrawerLayout.isDrawerOpen(mDrawerListView)) {
				mDrawerLayout.closeDrawer(mDrawerListView);
			} else {
				mDrawerLayout.openDrawer(mDrawerListView);
			}
		}

		return super.onOptionsItemSelected(item);
	}

	/***
	 * Called when invalidateOptionsMenu() is triggered
	 */
	 @Override
	 public boolean onPrepareOptionsMenu(Menu menu) {
	 // if nav drawer is opened, hide the action items
	  boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerListView);
	  menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
	 return super.onPrepareOptionsMenu(menu);
	 }

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}

	/**
	 * When using the ActionBarDrawerToggle, you must call it during
	 * onPostCreate() and onConfigurationChanged()...
	 */

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggls
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

}
