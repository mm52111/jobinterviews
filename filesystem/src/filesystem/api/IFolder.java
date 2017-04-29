package filesystem.api;

import filesystem.exeptions.ItemNotFoundException;

public interface IFolder extends Item {
	
	public void add(Item item);
	
	public void remove(Item item) throws ItemNotFoundException;
	

}
