/**
 * Android application for cedros futebol equipas 27 de Mai de 2015
 */
package cedros.futebol.equipas.adapters;

import java.util.ArrayList;
import java.util.List;

import com.cedros.futebol.equipas.R;

import cedros.futebol.equipas.objects.PlayerList;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * @author Carlos
 * @version 1.0 @date 27 de Mai de 2015
 */
public class PlayersListAdapter extends ArrayAdapter<PlayerList> {

	private final Activity context;
	private final List<PlayerList> players;

	/**
	 * 
	 */
	public PlayersListAdapter(Activity context, ArrayList<PlayerList> list) {
		super(context, R.layout.item_player_list, list);
		this.context = context;
		this.players = list;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = layoutInflater.inflate(R.layout.item_player_list,
				parent, false);

		String name = players.get(position).getPlayer();

		String strength = String.valueOf(players.get(position).getStrength());

		TextView txtViewItemName = (TextView) rowView
				.findViewById(R.id.txtViewItemName);
		txtViewItemName.setText(name);

		TextView txtViewItemStrength = (TextView) rowView
				.findViewById(R.id.txtViewItemStrength);
		txtViewItemStrength.setText(strength);

		return rowView;

	}

}
