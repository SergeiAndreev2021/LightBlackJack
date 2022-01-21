
package petprojects.CardGames.NewBlackJack;

import java.util.HashMap;
import java.util.Map;


public class CardLegend {
    
   public static Card carder() {
         int a = KeyGetter.number();
         Card c1 = new Card(null,0);
         switch(a) {
             case 0 : c1 = new Card("Desyatka",1);
             break;
             case 1 :  c1 = new Card("Valet",2);
             break;
             case 2 : c1 = new Card("Dama",3);
             break;
             case 3 : c1 = new Card("Korol",4);
             break;
             case 4 : c1 = new Card("Tuz",5);
             break;
         }
       return c1;
       
        
    
   }
}
