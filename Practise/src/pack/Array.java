package pack;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Array {
       public static void main(String args[]){
/*Scanner sc = new Scanner(System.in);
System.out.println("Enter number of ports :");
       int n = sc.nextInt();
      
      
       System.out.println(n);*/
       int cityid_i;
        int road_i,air_i;
       String[] port= 
    	   {"1|Saint Paul|0|1|1", 
    	   		"3|Charlotte|1|0|1" , 
    	   		"4|Las Vegas|0|0|0" , 
    	   		"6|Toledo|0|0|0" ,
    	   		"2|Cincinnati|0|0|0" ,
    	   		"8|Los Angels|1|0|1"};
    	   /*{"1|Honolulu|1|0|0",
    		   "3|Norfork|1|0|1",
    		   "4|Albuquerque|0|1|1",
    		   "6|Minneapolis|0|0|1",
    		   "2|Detroit|0|1|1",
    		   "5|St.Louis|0|1|0",
    		   "12|Cleveland|1|1|0",
    		   "11|Atlanta|0|0|0",
    		   "15|Richmond|1|1|1"};
    		*/   
    		   
    		   
    	   		//{"5|Boston|1|0|0","1|Philadelphia|0|1|0","7|Denver|0|1|1","4|Charleston|0|0|0","3|Chicago|0|0|0","6|Pittsburg|1|0|0","9|fius|1|0|0","8|hous|0|0|0","10|housu|1|0|1","2|hytr|1|0|0"};
      
       /*One mode of transportation :
          Id   Name
          1    Boston
          2    Philadelphia
          5    Charleston
          More than one mode of transportation :
          Id   Name
          3    Chicago
          4    Denver
          6    Pittsburg*/
      
      // System.out.println("Enter port details:");
       String[] cityNamesMoreThanOne = new String[3*port.length];
       String[] cityNamesOne = new String[3*port.length];
       String[] cityNamesZero = new String[3*port.length];
       
       int[] cityNamesMoreIdSort = new int[3*port.length];
       int[] cityNamesOneIdSort = new int[3*port.length];
       int[] cityNamesZeroIdSort = new int[3*port.length];
       
       /*String[] cityNamesMoreNameSort = new String[port.length];
       String[] cityNamesOneNameSort = new String[port.length];
       String[] cityNamesZeroNameSort = new String[port.length];*/
 
          int index0 = 0;
          int index1 = 0;
          int index2 = 0;
      
       for(int i=0;i<port.length;i++)
       {
          String[] s=port[i].split("\\|");
          int rail_i = 0;
          
          for(int j=2;j<s.length;j++)
          {
 
                 String rail_s=s[j];
                    rail_i+=Integer.parseInt(rail_s);
          }
                       
          if(rail_i>1)
           {
                 cityNamesMoreThanOne[index2++] = s[0];
                 cityNamesMoreThanOne[index2++] = s[1];
              //System.out.println( "More than one mode of transportation : "+s[1]); 
           }
           else if(rail_i==1)
           {
                cityNamesOne[index1++] = s[0];
                cityNamesOne[index1++] = s[1];
             //System.out.println( "One mode of transportation : "+s[1]);
           }
           else
           {
                cityNamesZero[index0++] = s[0];
                cityNamesZero[index0++] = s[1];
           // System.out.println( "No mode of transportation : "+s[1]);
           }
          
          
       } 
       
       if(cityNamesZero[0] != null)
       {
       	 int ind = 0;
          System.out.println( "\nNo mode of transportation");
          //System.out.println( "Id\tName");
              for(int m=0;m<cityNamesZero.length-1;m+=2)
              {
                 if(cityNamesZero[m] != null)
                  { 
                	 cityNamesZeroIdSort[ind++] = Integer.parseInt(cityNamesZero[m]);
                  }  
              }
              Arrays.sort(cityNamesZeroIdSort);

              for(int a=0;a<cityNamesZeroIdSort.length;a++)
    		  {
            	  for(int b=0;b<cityNamesZero.length-1;b+=2)
            	  {
            		  if( null!=cityNamesZero[b] && (Integer.parseInt(cityNamesZero[b]) == cityNamesZeroIdSort[a]))
            		  {
            			  //System.out.println( cityNamesZero[b]+"\t"+cityNamesZero[b+1]);
            		  }
            	  }
              }
       }
       if(cityNamesOne[0] != null)
       {
    	   int ind2 = 0;
          System.out.println( "\nOne mode of transportation :");
          System.out.println( "Id\tName");
              for(int l=0;l<cityNamesOne.length-1;l+=2)
              { 
                 if(cityNamesOne[l] != null)
                  {
                	 cityNamesOneIdSort[ind2++] = Integer.parseInt(cityNamesOne[l]);
                  }
       }
              Arrays.sort(cityNamesOneIdSort);

              for(int a=0;a<cityNamesOneIdSort.length;a++)
    		  {
            	  for(int b=0;b<cityNamesOne.length-1;b+=2)
            	  {
            		  if( null!=cityNamesOne[b] && (Integer.parseInt(cityNamesOne[b]) == cityNamesOneIdSort[a]))
            		  {
            			  System.out.println( cityNamesOne[b]+"\t"+cityNamesOne[b+1]);
            		  }
            	  }
              }
       }
       if(cityNamesMoreThanOne[0] != null)
       {
    	   int ind3=0;
         System.out.println( "\nMore than one mode of transportation :");
         System.out.println( "Id\tName");
              for(int k=0;k<cityNamesMoreThanOne.length-1;k+=2)
              {
                 if(cityNamesMoreThanOne[k] != null)
                  {
                	 cityNamesMoreIdSort[ind3++] = Integer.parseInt(cityNamesMoreThanOne[k]);
                  }
              }
              Arrays.sort(cityNamesMoreIdSort);

              for(int a=0;a<cityNamesMoreIdSort.length;a++)
    		  {
            	  for(int b=0;b<cityNamesMoreThanOne.length-1;b+=2)
            	  {
            		  if( null!=cityNamesMoreThanOne[b] && (Integer.parseInt(cityNamesMoreThanOne[b]) == cityNamesMoreIdSort[a]))
            		  {
            			  System.out.println( cityNamesMoreThanOne[b]+"\t"+cityNamesMoreThanOne[b+1]);
            		  }
            	  }
              }
       }      
       }
             
       }
       
      
      
      
      
      
      
      
       
   
        
       
       
       
       
       
       
       
       
 
 
 
 