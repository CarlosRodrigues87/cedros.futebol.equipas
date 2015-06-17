/**
 * Android application for cedros futebol equipas 21 de Mai de 2015
 */
package cedros.futebol.equipas.objects;

/**
 * @author Carlos
 * @version
 * @date 21 de Mai de 2015
 */
public class MenuNavDrawerItem {

	private String title;

	private int icon;

	/**
	 * Construtor
	 */
	public MenuNavDrawerItem() {

	}

	/**
	 * Construtor
	 * 
	 * @param title
	 * @param icon
	 */
	public MenuNavDrawerItem(String title, int icon) {
		this.title = title;
		this.icon = icon;

	}
	
	public MenuNavDrawerItem(String title) {
		this.title = title;
	}

	/**
	 * @return the icon
	 */
	public int getIcon() {
		return icon;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(int icon) {
		this.icon = icon;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
