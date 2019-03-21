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
        for(int r = 0; r<m.length; r++){
            if((checkRight(word, r, 0))==true){
                return true;
            }if((checkLeft(word, r, 0))==true){
                return true;
            }if((checkUp(word, 0, r))==true){
                return true;
            }if((checkDown(word, 0, r))==true){
                return true;
            }if((checkDiagUpRight(word, 0, r))==true){
                return true;
            }if((checkDiagUpLeft(word, 0, r))==true){
                return true;
            }if((checkDiagDownLeft(word, 0, r))==true){
                return true;
            }if((checkDiagDownRight(word, 0, r))==true){
                return true;
            }
        }return false;
    }

	public boolean checkRight(String w, int r, int c)
        {
            String str = "";
            for(String s: m[r]){
                str+=s;
            }
            for(int i = c; i<m[r].length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }
            return false;
            /*for(int i = 0; i<w.length(); i++){
                if(!w.substring(i,i+1).equals(m[r][c])){
                    check = false;
                }
            }*/
	}

	public boolean checkLeft(String w, int r, int c)
	{
            String str = "";
            for(int n = m[r].length-1; n>=0; n--){
                str+=m[r][n];
            }
            for(int i = c; i<m[r].length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
            String str = "";
            for(int n = m.length-1; n>=0; n--){
                str+=m[n][c];
            }
            for(int i = r; i<m.length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }return false;
	}

	public boolean checkDown(String w, int r, int c)
        {
	   String str = "";
            for(int n = 0; n<m.length; n++){
                str+=m[n][c];
            }
            for(int i = r; i<m.length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
            String str = "";
            for(int n = r; n>=0; n--){
                str = m[n][c-(n-r)];
            }
            if(str.length()>= w.length()){
                for(int i = 0; i<m.length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }
            }return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
            String str = "";
            for(int n = r; n>=0; n--){
                str = m[n][c+(n-r)];
            }
            if(str.length()>= w.length()){
                for(int i = 0; i<m.length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }
            }return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
            String str = "";
            for(int n = r; n<m.length; n++){
                if(-(r-n)<c){
                    str = m[n][c+r-n];
                }
            }
            if(str.length()>= w.length()){
            for(int i = r; i<m.length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }}return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
            String str = "";
            for(int n = r; n<m.length; n++){
                if(c+(n-r)<m.length){
                    str = m[n][c+n-r];
                }
            }
            if(str.length()>= w.length()){
            for(int i = r; i<m.length-w.length(); i++){
                if(w.equals(str.substring(i, i+w.length()))){
                    return true;
                }
            }}return false;
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
