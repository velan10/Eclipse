package com.string;

public class String_fun {
	public static void main(String[] args) {
		
		String s = "  Welcome to Greens";
		System.out.println(s);
		
		int l = s.length();    // spacing counting panikum
		System.out.println(l);
		
		String s1 = "  welcome to greens";
		System.out.println(s1);
		
		boolean e = s1.equals(s);   //  case sensitive (capital letter)
		System.out.println(e);
		
		boolean eq = s1.equalsIgnoreCase(s);  // same ah irukanum( same words)
		System.out.println(eq);
		
		String up = s.toUpperCase();  // s.ctrl+space  after ctrl+2-- return type
		System.out.println(up);
		
		 String lc = s.toLowerCase();
		System.out.println(lc);
		
		boolean sw = s.startsWith("e");
		System.out.println(sw);
		
		boolean ew = s.endsWith("e");
		System.out.println(ew);
		
		boolean c = s.contains("m");  // gave word crt or not check pannum
		System.out.println(c);
		
		int io = s.indexOf("o");  // index count la irukura word  (front side count)
		System.out.println(io);   // space also counting
		
		int li = s.lastIndexOf("r"); // front side la last
		System.out.println(li);
		
		
		char ca = s.charAt(5);
		System.out.println(ca);
		
		String r = s.replace("Greens", "Bluecolor");
		System.out.println(r);
		
		
		String ss = s.substring(5, 16);// front side,  last side count
		// counting after last word not printed 
		System.out.println(ss);
		
		
		boolean et = s.isEmpty();  // length check pannum
		System.out.println(et);
		
		String[] split = s.split("e");         //   for each loop
		for (String t : split)  {
			System.out.print(t);                // (println-print) row side print aagum
		}
		System.out.println();   // horizontal la print aagum aathukaka ithu
		
		String trim = s1.trim();   // spacing ah trim pannum(--space ( welcome to greenns)
		System.out.println(trim);
		
		// compareto theveilla    
		
		//ASCII Value  compareto  // not need
		
		
		
		
				
	}

}
