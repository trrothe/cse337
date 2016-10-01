/*
 *******************************************************************************
 *
 *     STUDENT: Timothy Rothe (trrothe@oakland.edu)
 *  ASSIGNMENT: Assignment #2, Part II (GIT-BeerSong) 
 *       CLASS: CSE337, 2016-Fall, MW/1530-1717/DH200, Prof. Nilesh Patel
 *  UNIVERSITY: Oakland University
 *    CREATION: 30-Sep-2016 (Friday)
 *         DUE: 30-Sep-2016@2355est (Friday)
 *  SUBMISSION: --pending--
 *
 *  (c) Copyright 2016 Timothy R.H. Rothe. All rights reserved. 
 * 
 *******************************************************************************
 * CHANGE LOG: 
 * 
 * Change #0, MadeOn:2016-Sep-30@1039, MadeBy:trrothe@oakland.edu
 * VERSION: 1.0.0.0
 * DESCRIPTION:
 *     1) Initial implementation. 
 *	   2) Implements stubbed methods (functions), i.e., functionsless methods.  
 *        That is, 
 *            public class BeerSong is empty
 *            public static void main(String[] args) is empty
 * 
 * 
 * Change #1, MadeOn:2016-Sep-30@2139, MadeBy:trrothe@oakland.edu
 * VERSION: 1.0.1.0
 * DESCRIPTION:
 *     1) Implements functionality into Ninety_Nine_Bottles_of_Beer() method.
 *        That is, 
 *            Ninety_Nine_Bottles_of_Beer() method is ready to be invoked. 
 * 
 * 
 * Change #2, MadeOn:2016-Sep-30@2202, MadeBy:trrothe@oakland.edu
 * VERSION: 1.0.2.0
 * DESCRIPTION:
 *     1) Implements functionality into main()  method.
 *        That is, 
 *            main() method is invokes Ninety_Nine_Bottles_of_Beer() method. 
 * 
 *******************************************************************************
 */
package BeerSong;

/*
********************************************************************************
* public class BeerSong
********************************************************************************
*/
public class BeerSong 
    {
    /**
     * @param args the command line arguments
     */


    
    /*
    ****************************************************************************
    * public static void Ninety_Nine_Bottles_of_Beer()
    ****************************************************************************
    */
    public static void Ninety_Nine_Bottles_of_Beer() 
        {
        // starting from 99 to 0
        // each time this method is called, 
        //     the number of bottles is decremented by 1
        // at 0 bottles, the message is "no more bottles..." 
        // -- and not "0 bottles"
            

        // holds the string message to be emitted to the user...
        String strEmitMessage; 
        
        
        // 
        // compose and emit a message...
        // 
        for (int intBottleLeft=99; intBottleLeft>0; intBottleLeft--)
            {
            // holds the integer count of bottles left, minus 1...
            String strBottlesLeftMinus1;

            
            // 
            // sensitize the message to say "no more" instead of 0(zero)...
            // 
            strBottlesLeftMinus1 = ( ((intBottleLeft-1) == 0) ? "no more" : ""+(intBottleLeft-1) );

            
            // 
            // compose the message...
            // 
            strEmitMessage = 
                      (intBottleLeft) + " bottles of beer on the wall, "
                    + (intBottleLeft) + " bottles of beer\n" 
                    + "take one down, pass it around, "
                    + strBottlesLeftMinus1 + " bottles of beer on the wall."
                    ;
            
            // 
            // emit the message...
            // 
            System.out.println(strEmitMessage);
            
            }
        
        }
        /*
        ************************************************************************
        * end public static void Ninety_Nine_Bottles_of_Beer()
        ************************************************************************
        */
    
    
    
    /*
    ****************************************************************************
    * public static void main(String[] args)
    ****************************************************************************
    */
    public static void main(String[] args) 
        {
        
        // count down the bottles of beer on the wall...
        Ninety_Nine_Bottles_of_Beer();

        }
        /*
        ************************************************************************
        * end public static void main(String[] args)
        ************************************************************************
        */

    }
    /*
    ****************************************************************************
    * public class BeerSong
    ****************************************************************************
    */
