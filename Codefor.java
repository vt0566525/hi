 
import java.util.*;
 
 class Codefor {
    public static void main(String[] args) {
		//System.out.print("hello");
		//  int i=0100;
		//  int j=07;
		//  System.out.println(i);
		//  System.out.println(j);
	 int [] arr={2,7,2,6,4,11,4,9,1,3,6,5,7,8,9};
	 int n=arr.length;
	 String res="";
	 int i=0;
	 for( i=0;i<n;i++){
		 res+=arr[i]+" ";
	 }
	 res+="  i="+i;
	 String result="";
	 int j=0;
	 for(j=0;j<n;++j){
		 result+=arr[j]+" ";
	 }
	 result+=" j="+j;
	 System.out.println(res);
	 System.out.println(result);

        


    }
    }

