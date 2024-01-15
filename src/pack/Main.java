package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		String zaino ="";
			
		Map<Character, String > valoriPresenti = new HashMap<>();
		int somma =0;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("inputZaino.TXT"));
			String z1=null;
			while ((z1=br.readLine()) != null) {
			//con gli stream	
//				char c = (char) z1.chars().filter(x->z2.indexOf(x)>-1).findAny().getAsInt();	
				//--------------------------------------------------
				String z2=br.readLine();
				String z3=br.readLine();

				char c= (char)z1.chars().filter(x->z2.indexOf(x)>-1&&z3.indexOf(x)>-1).findAny().getAsInt() ;
				somma+=Character.isUpperCase(c)?(c - 'A' + 1+26):(c - 'a' + 1);
				// ------------------------------------
				
				//senza stream (acdc)
				//--------------------------------------------
				
//				char[]  elementi =zaino.toCharArray();
//				for (int i =0; i<zaino.length();i++)
//				{
//					if(i>=(zaino.length()/2 ))
//					{
//						if(valoriPresenti.containsKey(elementi[i]))
//						{
//							somma+=assegnaValore(elementi[i]);
//							break;
//						}

//					}
//					else
//					{
//						valoriPresenti.put(elementi[i], "");
//					}
//		
//				}
//				valoriPresenti.clear();
				//--------------------------------------------------
			}
			System.out.println(somma);
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	public static int assegnaValore(char input) {
		int bias=0;
		if(Character.isUpperCase(input))
		{
			 bias =26;
			 input=Character.toLowerCase(input);
		}
		int valoreCarattere =input - 'a' + 1;
		return valoreCarattere+bias ;
	}

}
