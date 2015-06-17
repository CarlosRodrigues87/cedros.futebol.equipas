package cedros.futebol.equipas.activities;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import cedros.futebol.equipas.objects.Classification;
import cedros.futebol.equipas.objects.ContentConstants;
import cedros.futebol.equipas.objects.PlayerList;
import cedros.futebol.equipas.objects.ProfilePlayer;

import com.cedros.futebol.equipas.R;

public class ProfileActivity extends BaseActivity {

	private ImageView mImageView;
	private ProfilePlayer profilePlayer = new ProfilePlayer();
	private ListView lv;

	private TextView txtViewItemName, txtViewProfileAge, txtViewProfileNumber,
			txtViewProfileStrength;
	private EditText edtTextProfileName, edtTxtProfileAge, edtTxtProfileNumber,
			edtTxtProfileStrength;
	boolean changeIcon = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);

		// load titles from strings.xml
		ContentConstants.navMenuTitles = getResources().getStringArray(
				R.array.nav_drawer_items);

		// load icons from strings.xml
		ContentConstants.navMenuIcons = getResources().obtainTypedArray(
				R.array.nav_drawer_icons);

		set(ContentConstants.navMenuTitles, ContentConstants.navMenuIcons);

		mImageView = (ImageView) findViewById(R.id.imageProfile);

		mImageView.setImageResource(R.drawable.images);

		Date date = new Date();

		date.setDate(15);
		date.setMonth(3);
		date.setYear(1987);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		sdf.format(date);
		PlayerList player = new PlayerList();
		player.setPlayer("Carlos Rodrigues");
		player.setStrength(77);

		profilePlayer.setPlayerInfo(player);
		profilePlayer.setDateBirth(sdf.format(date));
		profilePlayer.setTshirtNumber(7);

		Classification classPlayer = new Classification();
		classPlayer.setOrder(12);
		classPlayer.setGames(29);
		classPlayer.setWins(15);
		classPlayer.setDraws(4);
		classPlayer.setLosses(10);
		classPlayer.setPoints(49);
		classPlayer.setPercent(60);

		profilePlayer.setStatisticInfo(classPlayer);

		mockado(profilePlayer);

		// ProfilePlayerAdapter adapter = new ProfilePlayerAdapter(
		// ProfileActivity.this, R.layout.item_pofile_statistic,
		// profilePlayerList);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.profile, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		if (id == R.id.action_edit) {

			edtTextProfileName = (EditText) findViewById(R.id.edtTextProfileName);
			edtTxtProfileAge = (EditText) findViewById(R.id.edtTxtProfileAge);
			edtTxtProfileNumber = (EditText) findViewById(R.id.edtTxtProfileNumber);
			edtTxtProfileStrength = (EditText) findViewById(R.id.edtTxtProfileStrength);
			edtTxtProfileStrength.setVisibility(View.GONE);
			
			
			
			txtViewItemName = (TextView) findViewById(R.id.txtProfileName);
			
			
			
			if (!changeIcon) {
				item.setIcon(R.drawable.ic_menu_check);
				changeIcon = true;

				txtViewItemName.setVisibility(View.GONE);
				edtTextProfileName.setVisibility(View.VISIBLE);
				edtTextProfileName.setText("Carlos Rodrigues");

			} else {
				item.setIcon(R.drawable.ic_edit);
				changeIcon = false;

				edtTextProfileName.setVisibility(View.GONE);
				edtTxtProfileAge.setVisibility(View.GONE);
				edtTxtProfileNumber.setVisibility(View.GONE);
				edtTxtProfileStrength.setVisibility(View.GONE);
				txtViewItemName.setVisibility(View.VISIBLE);
				txtViewItemName.setText("Carlos Rodrigues");
			}

			return true;
		}
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void mockado(ProfilePlayer profilePlayer) {
		edtTextProfileName = (EditText) findViewById(R.id.edtTextProfileName);
		edtTxtProfileAge = (EditText) findViewById(R.id.edtTxtProfileAge);
		edtTxtProfileNumber = (EditText) findViewById(R.id.edtTxtProfileNumber);
		edtTxtProfileStrength = (EditText) findViewById(R.id.edtTxtProfileStrength);

		edtTextProfileName.setVisibility(View.GONE);
		edtTxtProfileAge.setVisibility(View.GONE);
		edtTxtProfileNumber.setVisibility(View.GONE);
		edtTxtProfileStrength.setVisibility(View.GONE);
		// text.setVisibility(View.GONE);
		// editText.setVisibility(View.VISIBLE);
		// editText.setText(edititemname);
		//
		txtViewItemName = (TextView) findViewById(R.id.txtProfileName);
		txtViewItemName.setText(profilePlayer.getPlayerInfo().getPlayer());

		TextView txtViewProfileAge = (TextView) findViewById(R.id.txtViewProfileAge);
		txtViewProfileAge.setText(profilePlayer.getDateBirth());

		TextView txtViewProfileNumber = (TextView) findViewById(R.id.txtViewProfileNumber);
		txtViewProfileNumber.setText(String.valueOf(profilePlayer
				.getTshirtNumber()));

		TextView txtViewProfileStrength = (TextView) findViewById(R.id.txtViewProfileStrength);
		txtViewProfileStrength.setText(String.valueOf(profilePlayer
				.getPlayerInfo().getStrength()));

		TextView txtViewOrderClassifcation = (TextView) findViewById(R.id.txtViewItemOrder);
		txtViewOrderClassifcation.setText(String.valueOf(profilePlayer
				.getStatisticInfo().getOrder()));

		TextView txtViewItemGame = (TextView) findViewById(R.id.txtViewItemGame);
		txtViewItemGame.setText(String.valueOf(profilePlayer.getStatisticInfo()
				.getGames()));

		TextView txtViewItemWins = (TextView) findViewById(R.id.txtViewItemWins);
		txtViewItemWins.setText(String.valueOf(profilePlayer.getStatisticInfo()
				.getWins()));

		TextView txtViewItemDraw = (TextView) findViewById(R.id.txtViewItemDraw);
		txtViewItemDraw.setText(String.valueOf(profilePlayer.getStatisticInfo()
				.getDraws()));

		TextView txtViewItemLosses = (TextView) findViewById(R.id.txtViewItemLosses);
		txtViewItemLosses.setText(String.valueOf(profilePlayer
				.getStatisticInfo().getLosses()));

		TextView txtViewItemPoints = (TextView) findViewById(R.id.txtViewItemPoints);
		txtViewItemPoints.setText(String.valueOf(profilePlayer
				.getStatisticInfo().getPoints()));

		TextView txtViewItemPercent = (TextView) findViewById(R.id.txtViewItemPercent);
		txtViewItemPercent.setText(String.valueOf(profilePlayer
				.getStatisticInfo().getPercent()));
	}
}
