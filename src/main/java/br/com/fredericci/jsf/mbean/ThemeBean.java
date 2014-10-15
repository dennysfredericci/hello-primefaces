package br.com.fredericci.jsf.mbean;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ThemeBean {

	private List<String> all = new LinkedList<String>();

	public ThemeBean() {
		all.add("bootstrap");
		all.add("afterdark");
		all.add("afternoon");
		all.add("afterwork");
		all.add("black-tie");
		all.add("blitzer");
		all.add("bluesky");
		all.add("casablanca");
		all.add("cruze");
		all.add("cupertino");
		all.add("dark-hive");
		all.add("dot-luv");
		all.add("eggplant");
		all.add("excite-bike");
		all.add("flick");
		all.add("glass-x");
		all.add("hot-sneaks");
		all.add("humanity");
		all.add("le-frog");
		all.add("midnight");
		all.add("mint-choc");
		all.add("overcast");
		all.add("pepper-grinder");
		all.add("redmond");
		all.add("rocket");
		all.add("sam");
		all.add("smoothness");
		all.add("south-street");
		all.add("start");
		all.add("sunny");
		all.add("swanky-purse");
		all.add("trontastic");
		all.add("ui-darkness");
		all.add("ui-lightness");
		all.add("vader");
		all.add("home");
	}

	public List<String> getAll() {
		return all;
	}

	public void setAll(List<String> all) {
		this.all = all;
	}

}
