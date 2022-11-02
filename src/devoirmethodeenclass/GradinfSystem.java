/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirmethodeenclass;

import java.util.Scanner;
import model.Etudiant;
import model.Teacher;


/**
 *
 * @author Boris
 */
public class GradinfSystem {

   
    public static void main(String[] args) {
        // TODO code application logic here
       
      
       Etudiant[] listeEtudiants= new Etudiant[5];
        
        LireEtudiants(listeEtudiants);
        afficherTout(listeEtudiants);
           
      

          
      
        
    }

     static Etudiant[] LireEtudiants(Etudiant[] listeEtudiants) {
    Scanner r = new Scanner(System.in);
       
      int i=0;
        for(i=0;i<5;i++){
            System.out.println("Cest quoi votre nom");
            String nom= r.next();
            System.out.println("Cest quoi votre prenom");
            String prenom = r.next();
            System.out.println("Donner votre note1 :");
            double note1 =r.nextDouble();
            System.out.println("Donner votre note 2:");
            double note2=r.nextDouble();
            Etudiant etudiant =new Etudiant(nom,prenom,note1,note2);
            listeEtudiants[i]= etudiant;
          }
         
         return listeEtudiants;
    }

     static void afficherTout(Etudiant[] listeEtudiants) {
   //Mettre la couleur dans le texte pour afficher plus clean
       String ANSI_GREEN = "\u001B[32m";
       String ANSI_RED = "\u001B[31m";
       String RESET = "\033[0m";
   
       
     for(Etudiant s : listeEtudiants ){
         String grade="";
         if(((s.getNote1()+s.getNote2())/2)>60){
              grade = ANSI_GREEN+"SUCCES"+RESET;
              
         }
         else{
          grade = ANSI_RED+"ECHEC"+RESET;
     }
         System.out.println("Nom: "+s.getNoms()+" Prenom: "+s.getPrenoms()+" Grade : "+grade);
     }
    }
    
}
