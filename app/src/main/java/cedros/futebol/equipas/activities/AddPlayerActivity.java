package cedros.futebol.equipas.activities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cedros.futebol.equipas.R;
import com.cedros.futebol.equipas.R.array;
import com.cedros.futebol.equipas.R.id;
import com.cedros.futebol.equipas.R.layout;
import com.cedros.futebol.equipas.R.menu;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import cedros.futebol.equipas.objects.ContentConstants;

public class AddPlayerActivity extends BaseActivity {

	private EditText edtTextPlayerName, edtTextStrength;

	private Button btnSave, btnClear;

	private TextView txtViewPlayerNameError, txtViewStrengthError;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_player);

		// load titles from strings.xml
		ContentConstants.navMenuTitles = getResources().getStringArray(
				R.array.nav_drawer_items);

		// load icons from strings.xml
		ContentConstants.navMenuIcons = getResources().obtainTypedArray(
				R.array.nav_drawer_icons);

		set(ContentConstants.navMenuTitles, ContentConstants.navMenuIcons);

		edtTextPlayerName = (EditText) findViewById(R.id.edtTextPlayerName);
		edtTextStrength = (EditText) findViewById(R.id.edtTextStrength);
		txtViewPlayerNameError = (TextView) findViewById(R.id.txtViewPlayerNameError);
		txtViewStrengthError = (TextView) findViewById(R.id.txtViewStrengthError);

		btnSave = (Button) findViewById(R.id.btnSave);
		btnClear = (Button) findViewById(R.id.btnClear);

		btnSave.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				final String name = edtTextPlayerName.getText().toString();
				final String strength = edtTextStrength.getText().toString();
				int strengthInt = 0;
				if (!strength.equals("")) {
					 strengthInt = Integer.parseInt(strength);
				}
				
				if (!isValidPlayerName(name)) {
					txtViewPlayerNameError.setError("Erro testes");
					txtViewPlayerNameError.setText("Nome inválido");
				} else {
					txtViewPlayerNameError.setError(null);
					txtViewPlayerNameError.setText("");
				}
				
				if (!isValidStrength(strengthInt)) {
					txtViewStrengthError.setError("");
					txtViewStrengthError.setText("Força inválida");	
				} else {
					txtViewStrengthError.setError(null);
					txtViewStrengthError.setText("");
				}

			}
		});
		
		btnClear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				edtTextPlayerName.setText("");
				edtTextStrength.setText("");
				
			}
		});

		edtTextPlayerName.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				final String name = edtTextPlayerName.getText().toString();
				if (!isValidPlayerName(name) && name.length() > 0) {
					txtViewPlayerNameError.setError("");
					txtViewPlayerNameError.setText("Nome inválido");
				} else {
					txtViewPlayerNameError.setError(null);
					txtViewPlayerNameError.setText("");
				}

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {

			}

		});
		
		edtTextStrength.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				final String strength = edtTextStrength.getText().toString();
				int strengthInt = 0;
				if (!strength.equals("")) {
					 strengthInt = Integer.parseInt(strength);
				}
				
				if (!isValidStrength(strengthInt) && strength.length() > 0) {
					txtViewStrengthError.setError("");
					txtViewStrengthError.setText("Força inválida");
				} else {
					txtViewStrengthError.setError(null);
					txtViewStrengthError.setText("");
				}

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {

			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_player, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private boolean isValidPlayerName(String playerName) {
		String validPattern = "[A-Za-z\\s]+";

		Pattern pattern = Pattern.compile(validPattern);
		Matcher matcher = pattern.matcher(playerName);
		return matcher.matches();

	}

	private boolean isValidStrength(int strength) {
		if (strength == 0) {
			return false;
		}
		return true;

	}
}
