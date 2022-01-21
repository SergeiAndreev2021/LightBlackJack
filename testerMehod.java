/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petprojects.CardGames.NewBlackJack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class testerMehod {
    
    static int sumOf(ArrayList<Integer> list){
    int sum = 0;
    for (int a : list)
        sum+=a;
    return sum;
    }
    static void tester(){
    ArrayList <String> listNames = new ArrayList<>();
    ArrayList <Integer> listPoints = new ArrayList<>();
    for (int i =0; i<3;i++) {
    Card c = CardLegend.carder();
     listNames.add(c.getName());
     listPoints.add(c.getPoints());
       
    }
     System.out.println("Your cards: "+ listNames);
     int total = sumOf(listPoints);
     System.out.println("Your points: "+ total);
     if (total > 10) {
                        LooserCode.looser(total);
                        
                          }
     else{                           
     if (total == 10){WinnerCode.winnerClaim();}
        else {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you need additional card type YES or Y, if no PRESS ANY KEY ");
        String answer = sc.nextLine();
        
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                Card c3 = CardLegend.carder();
                total += c3.getPoints();

                if (total == 10) {
                    WinnerCode.winnerClaim();
                } else {
                    System.out.print("Your additional card :" + c3.getName());
                    System.out.println(", Your additional points : " + c3.getPoints());

                        if (total > 10) {
                        LooserCode.looser(total);
                          } else {
                        Totaler.totall(total);
                    }

                }

            } else {
                Totaler.totall(total);
            }
          }
        }
     
     
    }
    
}
