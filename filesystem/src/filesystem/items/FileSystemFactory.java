package filesystem.items;

import filesystem.api.IFolder;
import filesystem.api.Item;

public class FileSystemFactory {

	private static FileSystemFactory instance = null;

	private FileSystemFactory() {
	}

	public static FileSystemFactory getInstance() {
		if (instance == null) {
			instance = new FileSystemFactory();
		}
		return instance;
	}
	
	public Item createFile(String name){
		return new File(name);			
	}
	
	public IFolder createFolder(String name){
		return new Folder(name);
	}

}
