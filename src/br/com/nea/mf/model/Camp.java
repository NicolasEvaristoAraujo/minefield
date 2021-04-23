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
	
	Camp(int line, int colum){
		this.line = line;
		this.colum = colum;
	}
	
}
