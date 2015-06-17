/**
 * Android application for cedros futebol equipas 26 de Mai de 2015
*/
package cedros.futebol.equipas.adapters;

import java.util.ArrayList;

import com.cedros.futebol.equipas.R;


import cedros.futebol.equipas.objects.MenuNavDrawerItem;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Carlos
 * @version 1.0 @date 26 de Mai de 2015
 */
public class MenuNavDrawerListAdapter extends BaseAdapter {

	private Context context;
    private ArrayList<MenuNavDrawerItem> menuNavDrawerItems;
    
    public MenuNavDrawerListAdapter(Context context, ArrayList<MenuNavDrawerItem> menuNavDrawerItems) {
    	 this.context = context;
    	 this.menuNavDrawerItems = menuNavDrawerItems;
    }
	
	@Override
	public int getCount() {
		
		return menuNavDrawerItems.size();
	}

	@Override
	public Object getItem(int position) {
		return menuNavDrawerItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.menu_drawer_list_item, null);
        }
          
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        
          
        imgIcon.setImageResource(menuNavDrawerItems.get(position).getIcon());        
        txtTitle.setText(menuNavDrawerItems.get(position).getTitle());
         
       
         
        return convertView;
	}
	

}
