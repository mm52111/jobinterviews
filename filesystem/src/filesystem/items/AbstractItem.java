package filesystem.items;

import filesystem.api.Item;

public abstract class AbstractItem implements Item {

	private String name;

	public AbstractItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item search(String name) {
		Item item = null;
		if (this.getName() == name) {
			item = this;
		}
		return item;
	}

}
