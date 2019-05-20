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
public class Produit {
    
    /* Attributs de la classe Produit :
        1-Nom produit   2-Description       3-Type de produit
                                            !!seulement 4 types : aliments,médecines,
                                                appareil électroniqueet autre
        4-Prix          5-Pays d'origine    6-TVA(%)
        
        7-Nom fournisseur
    */ 
    
    /* Les méthodes de la classe
    
        boolean check_type : retourne vrai si le type de produit est dans la liste {aliments,médecines,électroniques,autre}
                             sinon elle retourne faux 
    */
    
        private String nomProd,nomFour,typeProd,origine,desc;
        private float tva,prix;
        
        Produit(){
            this.nomProd="Nom produit...";
            this.desc ="Description...";
            this.typeProd ="Autre";
            this.nomFour="Nom fournisseur...";
            this.origine ="Pays d'origine...";
            this.prix =0;
            this.tva =0;
        }
        
        Produit(String npr,String d,String tpr,String nfr,String o,float prix,float tva) throws Exception{
            this.nomProd=npr;
            this.desc =d;
            this.nomFour=nfr;
            this.origine =o;
            this.prix =prix;
            this.tva =tva;
            
            if(this.check_type(tpr)){
               this.typeProd =tpr; 
            } else throw this.TypeProduitExistePasException();
            
        }
        
        public boolean check_type(String typeProd){
            /*
                Pour éviter les erreurs d'utilisation des minuscules et majuscules
            rappel: les 4 types sont : aliments,médecines,électroniques et autre
            */
            String str=typeProd.toLowerCase();
            
            if(str=="aliments"||str=="médecines"||str=="électroniques"||str=="autre"){
               return true; 
            } else return false;
        }
        
        public void info_prod(){
            System.out.println("\t<info Produit>\n\tNom produit:\t"+this.nomProd+"\n\tDescription:\t"
            +this.desc);
            
        }

        private Exception TypeProduitExistePasException() {
            throw new UnsupportedOperationException("\t<!> Type de produit que vous avez saisis n'existe pas"
                    + "\n\tLes types des produits sont: {aliments,médecines,électroniques,autre} "); 
        }
    
}
