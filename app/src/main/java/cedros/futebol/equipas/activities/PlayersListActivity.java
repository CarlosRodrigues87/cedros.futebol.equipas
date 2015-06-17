package cedros.futebol.equipas.activities;

import java.util.ArrayList;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import cedros.futebol.equipas.adapters.PlayersListAdapter;
import cedros.futebol.equipas.objects.PlayerList;

import com.cedros.futebol.equipas.R;

public class PlayersListActivity extends BaseActivity {

	private String[] navMenuTitles;
	private String[] menuItems;
	private TypedArray navMenuIcons;

	private PlayerList player = new PlayerList();
	private PlayerList player2 = new PlayerList();
	private PlayerList player3 = new PlayerList();
	private PlayerList player4 = new PlayerList();
	private PlayerList player5 = new PlayerList();
	private PlayerList player6 = new PlayerList();
	private PlayerList player7 = new PlayerList();
	private PlayerList player8 = new PlayerList();
	private PlayerList player9 = new PlayerList();
	private PlayerList player10 = new PlayerList();
	private PlayerList player11 = new PlayerList();
	private PlayerList player12 = new PlayerList();

	private ArrayList<PlayerList> playersList = new ArrayList<PlayerList>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_players_list);

		// load titles from strings.xml
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

		// load icons from strings.xml
		navMenuIcons = getResources()
				.obtainTypedArray(R.array.nav_drawer_icons);

		set(navMenuTitles, navMenuIcons);

		player.setPlayer("André");
		player.setStrength(38);
		playersList.add(player);

		player2.setPlayer("Carlos");
		player2.setStrength(77);
		playersList.add(player2);

		player3.setPlayer("Chico");
		player3.setStrength(72);
		playersList.add(player3);

		player4.setPlayer("Ivo");
		player4.setStrength(32);
		playersList.add(player4);
		
		player5.setPlayer("Mendes");
		player5.setStrength(86);
		playersList.add(player5);
		
		player6.setPlayer("Nuno");
		player6.setStrength(82);
		playersList.add(player6);
		
		player7.setPlayer("Pedro");
		player7.setStrength(71);
		playersList.add(player7);
		
		player8.setPlayer("Renato");
		player8.setStrength(66);
		playersList.add(player8);
		
		player9.setPlayer("Rui");
		player9.setStrength(89);
		playersList.add(player9);
		
		player10.setPlayer("Sérgio");
		player10.setStrength(30);
		playersList.add(player10);
		
		player11.setPlayer("Tenreiro");
		player11.setStrength(58);
		playersList.add(player11);
		
		player12.setPlayer("Tuti");
		player12.setStrength(70);
		playersList.add(player12);

		fillListView(playersList);
	}

	private void fillListView(ArrayList<PlayerList> players) {
		ListView listViewPlayers;
		listViewPlayers = (ListView) findViewById(R.id.listViewPlayers);

		PlayersListAdapter playersAdapter = new PlayersListAdapter(
				PlayersListActivity.this, players);

		listViewPlayers.setAdapter(playersAdapter);
		registerForContextMenu(listViewPlayers);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item
				.getMenuInfo();
		String delete = getResources().getString(R.string.delete);
		int menuItemIndex = item.getItemId();
		if (menuItems == null) {
			// Faz load das entradas do menu
			menuItems = getResources().getStringArray(R.array.menu);
		}

		String menuItemName = menuItems[menuItemIndex];
		// String listItemName = playersList.get(info.position).getPlayer();

		if (menuItemName.equals(delete)) {
			PlayerList player = playersList.get(info.position);
			playersList.remove(player);
			fillListView(playersList);
		}
		String profile = getResources().getString(R.string.profile);
		if (menuItemName.equals(profile)) {
			Intent intent = new Intent(PlayersListActivity.this,
					ProfileActivity.class);
			startActivity(intent);
			return true;
		}
		

		return true;
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {

		if (v.getId() == R.id.listViewPlayers) {
			AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
			menu.setHeaderTitle(getResources().getString(R.string.player) + " "
					+ playersList.get(info.position).getPlayer());

			if (menuItems == null) {
				// Faz load das entradas do menu
				menuItems = getResources().getStringArray(R.array.menu);
			}
			for (int i = 0; i < menuItems.length; i++) {
				menu.add(Menu.NONE, i, i, menuItems[i]);
			}

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.players_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		} else {
			int id = item.getItemId();
			if (id == R.id.refresh) {
				// // Intent myIntent = new Intent(RandomActivity.this,
				// // HistoryActivity.class);
				// // startActivity(myIntent);
				//
				return true;
			}
			
			if (id == R.id.random) {
				Intent intent = new Intent(PlayersListActivity.this,
						GenerateTeams.class);
				startActivity(intent);
				return true;
			}
			
			if (id == R.id.addPlayer) {
				Intent intent = new Intent(PlayersListActivity.this,
						AddPlayerActivity.class);
				startActivity(intent);
				return true;
			}
		}

		return super.onOptionsItemSelected(item);
	}

//	@Override
//	public boolean onPrepareOptionsMenu(Menu menu) {
//		// if nav drawer is opened, hide the action items
//		// boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
//		// menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
//		return super.onPrepareOptionsMenu(menu);
//	}

}
