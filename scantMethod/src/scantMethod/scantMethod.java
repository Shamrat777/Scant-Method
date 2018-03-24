
package scantMethod;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Shamrat
 */
public class scantMethod {
 DecimalFormat df = new DecimalFormat("#.##");
    
    
    double function(double x){
    double value=Double.parseDouble(df.format((Math.pow(x,4))-x-10));
    return value;
    }
   
    double xi(double upper, double fOFxl, double lower, double fOFxu){
    double calculate=Double.parseDouble(df.format(upper-((fOFxu*(upper-lower))/(fOFxu-fOFxl)))) ;
    return calculate;
    }
    
    double errorCount(double xrValue, double upper){
    double error=((((xrValue-upper)/xrValue))*100);
    return error;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
      scantMethod object=new scantMethod();
      
      Scanner sc=new Scanner(System.in);
      
      DecimalFormat df = new DecimalFormat("#.##");
      
        double upper;
        double lower;
        int iterationRange;
        double xi;
        double fOFxlower;
        double fOFxupper;
        int i;
        double errorCount;
        System.out.println("Enter Your Upper Value");
        upper=sc.nextDouble();
        
        System.out.println("Enter Your Lower Value");
        lower=sc.nextDouble();
        
        System.out.println("Enter The Limit Of Iteration You Want to Find");
        iterationRange=sc.nextInt(); 
//        fOFxupper=object.function(upper);
//        System.out.println("f(xu): "+df.format(fOFxupper));
//        
//        fOFxlower=object.function(lower);
//        System.out.println("f(xl): "+df.format(fOFxlower));
       
       
        for(i=1; i<=iterationRange ; i++){
            
        fOFxupper=object.function(upper);
        //System.out.println("f(xu): "+df.format(fOFxupper));
        
        fOFxlower=object.function(lower);
        //System.out.println("f(xl): "+df.format(fOFxlower));
        
        xi=object.xi(upper,fOFxlower,lower,fOFxupper);
        System.out.println("X"+(i+1)+":" +df.format(xi));
        errorCount=Double.parseDouble(df.format(object.errorCount(xi,upper)));
        System.out.println("Error : "+Math.abs(errorCount)+"%");
       
        lower=upper;
        upper=xi;
           
       
      
       
      
       
       }
     
   
    }
    
    
}
