package WordSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
        m = new String[size][size];
        int ind = 0;
        for(int i = 0; i<size; i++){
            for(int n = 0; n<size; n++){
                m[i][n]= str.substring(ind, ind+1);
                ind++;
            }
        }
    }

    public boolean isFound( String word )
    {
    	boolean check = false;
        for(int r = 0; r<m.length; r++){
            for(int c = 0; c<m[r].length; c++){
                if(checkRight(word, r, c)){
                    check = true;
                }
            }
        }
        return check;
    }

	public boolean checkRight(String w, int r, int c)
        {
            String str = "";
            for(String s: m[r]){
                str+=s;
            }
            for(int i = c; i<m[r].length-w.length(); i++){
                if()
            }
            
            /*for(int i = 0; i<w.length(); i++){
                if(!w.substring(i,i+1).equals(m[r][c])){
                    check = false;
                }
            }*/
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 	String str = "";
        for(int i = 0; i<m.length; i++){
            for(int n = 0; n<m[i].length; n++){
                str += m[i][n]+" ";
            }
            str+="\n";
        }	
        return str;
    }
}
