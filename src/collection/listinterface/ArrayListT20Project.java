package collection.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListT20Project {

	public static void main(String[] args) {
		
		List<String> cskplayer = new ArrayList<String>();
		cskplayer.add("M.S Dhoni");
		cskplayer.add("R.A Jadeja");
		cskplayer.add("R.D Gaikwad");
		System.out.println("Chennai Super Kings: " + cskplayer);
		
		List<String> miplayer = new ArrayList<String>();
		miplayer.add("R.G Sharma");
		miplayer.add("H.H Pandya");
		miplayer.add("J.J Bumrah");
		System.out.println("Mumbai Indians: " + miplayer);
		
		
		List<List<String>> IPL = new ArrayList<List<String>>();
		IPL.add(cskplayer);
		IPL.add(miplayer);
		System.out.println("#Indian Premier League: " + IPL + "\n");

		
		List<String> msplayer = new ArrayList<String>();
		msplayer.add("Glenn Maxwell");
		msplayer.add("Marcus Stoinis");	
		System.out.println("Melbourne Stars: " + msplayer);
		
		
		List<String> asplayer = new ArrayList<String>();
		asplayer.add("Chris Lynn");
		asplayer.add("Travis Head");
		System.out.println("Adelaide Strikers: " + asplayer);
		
		List<List<String>> BBL = new ArrayList<List<String>>();
		BBL.add(msplayer);
		BBL.add(asplayer);
		System.out.println("#Big Bash League: " + BBL + "\n");
		
		List<List<List<String>>> T20 = new ArrayList<List<List<String>>>();
		T20.add(IPL);
		T20.add(BBL);
		System.out.println("#T20 League: " + T20);
		
		
		
	}

}
