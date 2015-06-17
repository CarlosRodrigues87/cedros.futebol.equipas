/**
 * Android application for cedros futebol equipas 31 de Mai de 2015
 */
package cedros.futebol.equipas.adapters;

import java.util.List;

import com.cedros.futebol.equipas.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import cedros.futebol.equipas.objects.Classification;

/**
 * @author Carlos
 * @version 1.0 @date 31 de Mai de 2015
 */
public class ClassificationAdapter extends ArrayAdapter<Classification> {

	private final Activity context;
	private final List<Classification> classificationList;
	private int layout;

	/**
	 * 
	 */
	public ClassificationAdapter(Activity context, int layout,
			List<Classification> list) {
		super(context, layout, list);
		this.context = context;
		this.setLayout(layout);
		this.classificationList = list;
	}

	@Override
	public int getCount() {
		return classificationList.size();
	}

	@Override
	public Classification getItem(int position) {
		return classificationList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return classificationList.get(position).hashCode();
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
		String percent = "";
		String points = "";

		final String order = String.valueOf(classificationList.get(position)
				.getOrder());
		final String name = classificationList.get(position).getPlayer();
		final String games = String.valueOf(classificationList.get(position)
				.getGames());
		final String wins = String.valueOf(classificationList.get(position)
				.getWins());
		final String draws = String.valueOf(classificationList.get(position)
				.getDraws());
		final String losses = String.valueOf(classificationList.get(position)
				.getLosses());

		

		if (getLayout() == R.layout.activity_classification) {

			rowView = inflater.inflate(R.layout.item_classification, parent,
					false);
			// FIXME
			percent = String.valueOf(classificationList.get(position)
					.getPercent());

			TextView txtViewItemPercent = (TextView) rowView
					.findViewById(R.id.txtViewItemPercent);
			txtViewItemPercent.setText(percent);
		} else {
			rowView = inflater.inflate(R.layout.item_classification_points,
					parent, false);

			points = String.valueOf(classificationList.get(position)
					.getPoints());

			TextView txtViewItemPoints = (TextView) rowView
					.findViewById(R.id.txtViewItemPoints);
			txtViewItemPoints.setText(points);
		}
		
		TextView txtViewOrderClassifcation = (TextView) rowView
				.findViewById(R.id.txtViewItemOrder);
		txtViewOrderClassifcation.setText(order);

		TextView txtViewItemName = (TextView) rowView
				.findViewById(R.id.txtViewItemName);
		txtViewItemName.setText(name);

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
