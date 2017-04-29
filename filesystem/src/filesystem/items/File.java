package filesystem.items;

import filesystem.api.Item;

public class File extends AbstractItem implements Item {

	
	public File(String name) {
		super(name);

	}
	
	@Override
	public String print(String prefix) {
		return prefix + this.getName();
	}


}
