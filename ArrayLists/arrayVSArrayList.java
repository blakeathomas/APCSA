import java.util.*;
public class arrayVSArrayList{
//9
 name[3] = "Rattata";

//10
nameList.set(3, "Rattata");

//11
public static int searchArray (String [] arr, String search) {
	for (int i=0; i < arr.length; i++) {
		if (arr[i].compareTo(search) == 0)
			return i;
	}
	return -1;
}

 public static void main(String args[]){

    String [] array = {"dog", "cat", "mouse"};
    int i =	searchArray(array, "mouse");
 	System.out.print(i);



}
}

//12

public int searchArrayList(ArrayList<String> str , String search) {
	for (int i=0; i< str.size(); i++){
		if (str.get(i).compareTo(search) == 0)
			return i;
	}
	return -1;
}
