package filesystem.api;

public interface Item {
	
	public String getName();
	public String print(String prefix);
	public Item search(String name);

}
