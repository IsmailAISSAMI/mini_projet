/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author aissami
 */
public class Client {

    /* Attributs de la classe Client : 
            1-Nom      2-Prenom    3-Numéro carte fidélité
            4-Mail     5-code postal
    */
    
    private String nom,prenom,mail;
    private int numFid,codePost;
    
    Client(){
        this.nom="Anonyme";
        this.prenom="Anonyme";
        this.mail="client@mail.com";
        this.numFid=0;
        this.codePost=0;
    }
    
    Client(String ncl,String pcl,String m,int num,int post){
        this.nom=ncl;
        this.prenom=pcl;
        this.mail=m;
        
        if(num>=0 && post>=0){
            this.numFid=num;
            this.codePost=post;
        } else {
            throw new ArithmeticException("\t<!> Code postale et Numéro carte fidélité doit etre positive ");
        }
        
    }
    
}
