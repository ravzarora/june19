package deltaDebug;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.*;


public class DemoChar extends DD {

  

  public int _test(List config)
  {
      if (config.contains("<SELECT") )
          return FAIL;
      return PASS;
  }

  public int test(List config)
  {
      System.out.println("test(" + config + ")...");
      int outcome = _test(config);

      System.out.println("test(" + config + ") = " + 
                         pretty_outcome(outcome));

      return outcome;
  }

  public static void main(String[] args) throws IOException {
      List config = new LinkedList();

     // config.add(ONE);
      //config.add(TWO);
      //config.add(THREE);
      //config.add(FOUR);
     // String s="Hello I am string, please convert me to linked list";
      FileReader fr=new FileReader("E:/thesis/simple.xml");
      
      BufferedReader br=new BufferedReader(fr);
      String s;
      while((s=br.readLine())!=null){
    	  
      StringTokenizer st = new StringTokenizer(s);
	     while (st.hasMoreTokens()) {
	        // System.out.println(st.nextToken());
	    	 config.add(st.nextToken());
	    	 
	     }
      }
      fr.close();
		
      System.out.println(config);

      DD mydd = new DemoChar();

      System.out.println("Running ddmin");    
      List c = mydd.ddmin(config);

     // System.out.println("");
      //System.out.println("Running ddiso");    
      //List ret = mydd.ddiso(new LinkedList(), config);
  }
 }
