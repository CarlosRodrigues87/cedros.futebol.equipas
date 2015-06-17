/**
 * Android application for cedros futebol equipas 7 de Jun de 2015
 */
package cedros.futebol.equipas.adapters;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import cedros.futebol.equipas.objects.ProfilePlayer;

import com.cedros.futebol.equipas.R;

/**
 * @author Carlos
 * @version 1.0 @date 7 de Jun de 2015
 */
public class ProfilePlayerAdapter extends ArrayAdapter<ProfilePlayer> {

	private final Activity context;
	private final List<ProfilePlayer> profilePlayerList;
	private int layout;

	/**
	 * @param context
	 * @param resource
	 * @param textViewResourceId
	 * @param objects
	 */
	public ProfilePlayerAdapter(Activity context, int layout,
			List<ProfilePlayer> list) {
		super(context, layout, list);
		this.context = context;
		this.setLayout(layout);
		this.profilePlayerList = list;
	}

	@Override
	public int getCount() {
		return profilePlayerList.size();
	}

	@Override
	public ProfilePlayer getItem(int position) {
		return profilePlayerList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return profilePlayerList.get(position).hashCode();
	}

	/**
	 * @return the layout
	 */
	public int getLayout() {
		return layout;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = null;

		rowView = inflater.inflate(R.layout.item_pofile_statistic, parent,
				false);

		final String name = profilePlayerList.get(position).getPlayerInfo()
				.getPlayer();
		final String dateBirth = profilePlayerList.get(position).getDateBirth();
		final String thshirtNumber = String.valueOf(profilePlayerList.get(
				position).getTshirtNumber());
		final String strength = String.valueOf(profilePlayerList.get(position)
				.getPlayerInfo().getStrength());

		final String order = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getOrder());
		final String games = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getGames());
		final String wins = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getWins());
		final String draws = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getDraws());
		final String losses = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getLosses());

		final String points = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getPoints());

		final String percent = String.valueOf(profilePlayerList.get(position)
				.getStatisticInfo().getPercent());

		TextView txtViewItemName = (TextView) rowView
				.findViewById(R.id.txtProfileName);
		txtViewItemName.setText(name);

		TextView txtViewProfileAge = (TextView) rowView
				.findViewById(R.id.txtViewProfileAge);
		txtViewProfileAge.setText(dateBirth);

		TextView txtViewProfileNumber = (TextView) rowView
				.findViewById(R.id.txtViewProfileNumber);
		txtViewProfileNumber.setText(thshirtNumber);

		TextView txtViewProfileStrength = (TextView) rowView
				.findViewById(R.id.txtViewProfileStrength);
		txtViewProfileStrength.setText(strength);

		TextView txtViewOrderClassifcation = (TextView) rowView
				.findViewById(R.id.txtViewItemOrder);
		txtViewOrderClassifcation.setText(order);

		TextView txtViewItemGame = (TextView) rowView
				.findViewById(R.id.txtViewItemGame);
		txtViewItemGame.setText(games);

		TextView txtViewItemWins = (TextView) rowView
				.findViewById(R.id.txtViewItemWins);
		txtViewItemWins.setText(wins);

		TextView txtViewItemDraw = (TextView) rowView
				.findViewById(R.id.txtViewItemDraw);
		txtViewItemDraw.setText(draws);

		TextView txtViewItemLosses = (TextView) rowView
				.findViewById(R.id.txtViewItemLosses);
		txtViewItemLosses.setText(losses);

		TextView txtViewItemPoints = (TextView) rowView
				.findViewById(R.id.txtViewItemPoints);
		txtViewItemPoints.setText(points);

		TextView txtViewItemPercent = (TextView) rowView
				.findViewById(R.id.txtViewItemPercent);
		txtViewItemPercent.setText(percent);

		return rowView;
	}

	/**
	 * @param layout
	 *            the layout to set
	 */
	public void setLayout(int layout) {
		this.layout = layout;
	}
}
