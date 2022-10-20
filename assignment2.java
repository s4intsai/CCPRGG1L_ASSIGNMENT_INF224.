public class assignment2 { 

    public static void main(String[] args) throws Exception{ 

        

     // 1. Use a while loop to print your FIRST NAME three times.

        int count1 = 3; 

        

        while (count1 != 0){ 

            System.out.println("Chrisnald Xyronn"); 

            count1--; 

     } 

        

     // 2. Use a do-while loop to print your MIDDLE NAME four times. 

        int count2 = 0; 

        

        do { System.out.println("Andan"); 

              count2++; 

     }  while (count2 != 4); 

     

     // 3. Use a for loop to print your SURNAME five times. 

     for (int count3 = 5; count3 != 0; count3--){ 

         System.out.println("Bartolome"); 

     } 

     

     // 4. Create a char array that consists all of the characters of your FIRST NAME and use a for loop to print each character of your FIRST NAME. 

     char[] firstnameCharacters = { 'C', 'H', 'R', 'I', 'S', 'N', 'A', 'L', 'D', 'X','Y', 'R','O','N', 'N' }; 

     for (int count4 = 0; count4 < firstnameCharacters.length; count4++){ 

         System.out.println(firstnameCharacters[count4]);

     } 

  
        
     // 5. Use a for loop to print the char array of your FIRST NAME in REVERSE order. 


char[] firstnameReverse = { 'N', 'N', 'O', 'R', 'Y', 'X', 'D', 'L', 'A', 'N','S','I','R', 'H', 'C' }; 

     for (int count5 = 0; count5 < firstnameReverse.length; count5++){ 

         System.out.println(firstnameReverse[count5]); 
  }

  } 
}
