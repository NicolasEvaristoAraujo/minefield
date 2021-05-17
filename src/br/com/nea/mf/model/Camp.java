package br.com.nea.mf.model;

import java.util.ArrayList;
import java.util.List;

public class Camp {
		
	private final int line;
	private final int colum;
	
	private boolean open = false;
	private boolean mined = false;
	private boolean flagged = false;
	
	private List<Camp> neighbors = new ArrayList<>();

	//Construtor
	Camp(int line, int colum){
		this.line = line;
		this.colum = colum;
	}

	boolean addNeighbor(Camp neighbor){
		boolean lineDiff = line != neighbor.line;
		boolean columDiff = colum != neighbor.colum;
		boolean diagonal = lineDiff && columDiff;

		int deltLine = Math.abs(line - neighbor.line);
		int deltColum = Math.abs(colum - neighbor.colum);
		int deltGlobal = deltColum + deltLine;

		if (deltGlobal == 1 && !diagonal){
			neighbors.add(neighbor);
			return true;
		}else if (deltGlobal == 2 && diagonal){
			neighbors.add(neighbor);
			return true;
		}else{
			return false;
		}
	}
}
