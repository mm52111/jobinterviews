package filesystem.items;

import java.util.ArrayList;
import java.util.List;

import filesystem.api.IFolder;
import filesystem.api.Item;
import filesystem.exeptions.ItemNotFoundException;

public class Folder extends AbstractItem implements IFolder {

	private List<Item> items;

	public Folder(String name) {
		super(name);
		this.items = new ArrayList<Item>();

	}

	@Override
	public String print(String prefix) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(prefix + this.getName());
		stringBuilder.append("\n");
		for (Item item : items) {
			stringBuilder.append(item.print(prefix + "\t"));
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}

	@Override
	public void add(Item item) {
		this.items.add(item);
	}

	@Override
	public void remove(Item item) throws ItemNotFoundException {
		boolean remove = this.items.remove(item);
		if (remove == false)
			throw new ItemNotFoundException();

	}

	@Override
	public Item search(String name) {
		Item searchedItem = super.search(name);
		if (searchedItem != null)
			return searchedItem;
		for (Item item : items) {
			searchedItem = item.search(name);
			if (searchedItem != null)
				return searchedItem;
		}
		return null;
	}

}
