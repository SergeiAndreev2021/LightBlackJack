/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petprojects.CardGames.NewBlackJack;
import java.util.Random;
public class KeyGetter {
    static int number(){
    Random d = new Random();
    return d.nextInt(5);
    }
}
