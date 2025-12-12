
/**
 * Write a description of class workshop6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop06
{
    public static void main(String[]args){
        //given from question 
        String[]categories= {"Fiction", "Nepali"};
        String[][]titles= new String[2][1];
        double[][] prices=new double[2][1];
        //as there is 0 column and 1 row
        titles[0][0]= "Asahamati -5";
        prices[0][0]= 745.0;
        
        titles[1][0]= "bikers cafe";
        prices[1][0]= 650.0;
         
        
    //printing using nested loop as asked from question
  for (int i = 0; i < categories.length; i++) {
      
      
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < titles[i].length; j++) {

                // checking nulls
                String title = titles[i][j];
                if (title != null) {
                    System.out.println("  Title: " + title);
                }

                double price = prices[i][j];
                System.out.printf("  Price: "+ price);
            }

            System.out.println();
        }
    }
}
