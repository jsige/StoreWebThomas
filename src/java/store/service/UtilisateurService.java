/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import store.dao.UtilisateurDAO;
import store.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {

    /**
     * Renvoie l'util si trouve ou null si existe pas.
     * @param login
     * @param mdp
     * @return 
     */
    public Utilisateur controlerLoginMdp(String login, String mdp) {
        
        UtilisateurDAO udao = new UtilisateurDAO();
        
        Utilisateur util = udao.rechercherParLogin(login);
        
        if(util!=null && !mdp.equals(util.getMdp())){
            util =null;
        }
        
        
//        System.out.println("---------------->>>" + util);
        return util;
    }
    
    public Utilisateur creerCompte(String login, String mdp, String confMdp, String adressse) {
        
//        UtilisateurDAO udao = new UtilisateurDAO();
//        
//        Utilisateur utilACreer = new Utilisateur();
//                utilACreer.setLogin(login);
//                utilACreer.setMdp(mdp);
//                utilACreer.setAdresseLivraison(adressse);
//                utilACreer.setTypeUtil(Utilisateur.TypeUtil.CLIENT);
//                udao.creer(utilACreer);
        
        UtilisateurDAO udao = new UtilisateurDAO();
        Utilisateur util = udao.rechercherParLogin(login);
        
        if(util==null){
            if(mdp.equals(confMdp)){
                Utilisateur utilACreer = new Utilisateur();
                utilACreer.setLogin(login);
                utilACreer.setMdp(mdp);
                utilACreer.setAdresseLivraison(adressse);
                utilACreer.setTypeUtil(Utilisateur.TypeUtil.CLIENT);
                udao.creer(utilACreer);
                util = udao.rechercherParLogin(login);
            }
        }
        else{
            util = null;
        }    
        return util;
    }

   
    
}
