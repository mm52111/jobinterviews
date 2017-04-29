package filesystem.main;

import filesystem.api.IFolder;
import filesystem.api.Item;
import filesystem.exeptions.ItemNotFoundException;
import filesystem.items.FileSystemFactory;
/**
 *
 * 	Design a file system with the following operation:
	1. create folder
	2. create file
	3. print name
	4. print structure
	5. delete file
	6. search
 */

public class Main {

	public static void main(String[] args) throws ItemNotFoundException {
		/*
		 *		/
		 *			A
		 *				AA
		 *					AAA
		 *					aa.js
		 *					ab.js
		 *				a.js
		 *				b.js
		 *			B
		 *				BB
		 *					bb.js
		 *				b.js
		 *			C
		 *				CC
		 *				c.js
		 *			d.js
		 */
		FileSystemFactory factory = FileSystemFactory.getInstance();
		IFolder root = factory.createFolder("/");
		IFolder A = factory.createFolder("A");
		IFolder AA = factory.createFolder("AA");
		IFolder AB = factory.createFolder("AB");
		A.add(AA);
		A.add(AB);
		Item a = factory.createFile("a.js");
		Item b = factory.createFile("b.js");
		AA.add(a);
		AA.add(b);
		IFolder AAA = factory.createFolder("AAA");
		Item aa = factory.createFile("aa.js");
		Item ab = factory.createFile("ab.js");
		AA.add(AAA);
		AA.add(aa);
		AA.add(ab);
		IFolder B = factory.createFolder("B");
		Item b2 = factory.createFile("b.js");
		B.add(b2);
		IFolder BB = factory.createFolder("BB");
		Item bb = factory.createFile("bb.js");
		BB.add(bb);
		B.add(BB);
		IFolder C = factory.createFolder("C");
		IFolder CC = factory.createFolder("CC");
		Item c = factory.createFile("c.js");
		CC.add(c);
		C.add(CC);
		root.add(A);
		root.add(B);
		root.add(C);
		System.out.println(root.print(""));
		System.out.println("----------------------------------------------------------------------------------");
		C.remove(CC);
		System.out.println(root.print(""));
		Item search = root.search("bb1.js");
		if (search!= null)
			System.out.println(search.getName());
		else System.out.println("not found");

	}

}
