package cedros.futebol.equipas.activities;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import cedros.futebol.equipas.adapters.ClassificationAdapter;
import cedros.futebol.equipas.objects.Classification;
import cedros.futebol.equipas.objects.ContentConstants;

import com.cedros.futebol.equipas.R;

public class ClassificationActivity extends BaseActivity {

	private ListView lv;

	/**
	 * mocka
	 */
	Classification class0 = new Classification();
	Classification class1 = new Classification();
	Classification class2 = new Classification();
	Classification class3 = new Classification();
	Classification class4 = new Classification();
	Classification class5 = new Classification();
	Classification class6 = new Classification();
	Classification class7 = new Classification();
	Classification class8 = new Classification();
	Classification class9 = new Classification();
	Classification class10 = new Classification();
	Classification class11 = new Classification();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_classification);

		// load titles from strings.xml
		ContentConstants.navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

		// load icons from strings.xml
		ContentConstants.navMenuIcons = getResources()
				.obtainTypedArray(R.array.nav_drawer_icons);

		set(ContentConstants.navMenuTitles, ContentConstants.navMenuIcons);

		ceninhas(R.layout.activity_classification);

	}

	private void ceninhas(int layout) {

		// load titles from strings.xml
		ContentConstants.navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

		// load icons from strings.xml
		ContentConstants.navMenuIcons = getResources()
				.obtainTypedArray(R.array.nav_drawer_icons);

		set(ContentConstants.navMenuTitles, ContentConstants.navMenuIcons);

		List<Classification> classificationList = new ArrayList<Classification>();

		mockado(classificationList);

		ClassificationAdapter adapter = new ClassificationAdapter(
				ClassificationActivity.this, layout, classificationList);

		lv = (ListView) findViewById(R.id.listViewPlayers);
		lv.setAdapter(adapter);
	}

	/**
	 * @param classificationList
	 */
	private void mockado(List<Classification> classificationList) {
		class0.setOrder(1);
		class0.setPlayer("André");
		class0.setGames(32);
		class0.setWins(18);
		class0.setDraws(4);
		class0.setLosses(10);
		class0.setPercent(62);
		class0.setPoints(58);
		classificationList.add(class0);

		class1.setOrder(2);
		class1.setPlayer("Chico");
		class1.setGames(19);
		class1.setWins(9);
		class1.setDraws(3);
		class1.setLosses(7);
		class1.setPercent(56);
		class1.setPercent(54);
		class1.setPoints(30);
		classificationList.add(class1);

		class2.setOrder(3);
		class2.setPlayer("Carlos");
		class2.setGames(29);
		class2.setWins(15);
		class2.setDraws(4);
		class2.setLosses(10);
		class2.setPercent(60);
		class2.setPoints(49);
		classificationList.add(class2);

		class3.setOrder(4);
		class3.setPlayer("Pedro");
		class3.setGames(33);
		class3.setWins(16);
		class3.setDraws(4);
		class3.setLosses(13);
		class3.setPercent(55);
		class3.setPoints(52);
		classificationList.add(class3);

		class4.setOrder(5);
		class4.setPlayer("Rui");
		class4.setGames(22);
		class4.setWins(10);
		class4.setDraws(3);
		class4.setLosses(9);
		class4.setPercent(52);
		class4.setPoints(33);
		classificationList.add(class4);

		class5.setOrder(6);
		class5.setPlayer("Tutti");
		class5.setGames(22);
		class5.setWins(10);
		class5.setDraws(3);
		class5.setLosses(9);
		class5.setPercent(52);
		class5.setPoints(30);
		classificationList.add(class5);

		class6.setOrder(7);
		class6.setPlayer("Renato");
		class6.setGames(27);
		class6.setWins(12);
		class6.setDraws(4);
		class6.setLosses(11);
		class6.setPercent(52);
		class6.setPoints(40);
		classificationList.add(class6);

		class7.setOrder(8);
		class7.setPlayer("Tenreiro");
		class7.setGames(22);
		class7.setWins(10);
		class7.setDraws(1);
		class7.setLosses(11);
		class7.setPercent(47);
		class7.setPoints(31);
		classificationList.add(class7);

		class8.setOrder(9);
		class8.setPlayer("Nuno");
		class8.setGames(29);
		class8.setWins(10);
		class8.setDraws(4);
		class8.setLosses(15);
		class8.setPercent(40);
		class8.setPoints(34);
		classificationList.add(class8);

		class9.setOrder(10);
		class9.setPlayer("Mendes");
		class9.setGames(32);
		class9.setWins(11);
		class9.setDraws(4);
		class9.setLosses(17);
		class9.setPercent(39);
		class9.setPoints(37);
		classificationList.add(class9);

		class10.setOrder(11);
		class10.setPlayer("Sérgio");
		class10.setGames(26);
		class10.setWins(9);
		class10.setDraws(3);
		class10.setLosses(14);
		class10.setPercent(39);
		class10.setPoints(30);
		classificationList.add(class10);

		class11.setOrder(12);
		class11.setPlayer("Ivo");
		class11.setGames(26);
		class11.setWins(8);
		class11.setDraws(4);
		class11.setLosses(14);
		class11.setPercent(36);
		class11.setPoints(28);
		classificationList.add(class11);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.classification, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		} else {
			int id = item.getItemId();

			if (id == R.id.action_filter_percent) {
				setContentView(R.layout.activity_classification);
				ceninhas(R.layout.activity_classification);
			}
			if (id == R.id.action_filter_points) {
				setContentView(R.layout.activity_classification_points);
				ceninhas(R.layout.activity_classification_points);
			}

		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		return super.onPrepareOptionsMenu(menu);
	}

}
