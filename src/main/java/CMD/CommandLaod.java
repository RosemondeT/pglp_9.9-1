package CMD;

import java.util.Scanner;

import FORME_GRAPHIQUE.Affichage;
import PERSISTANCE_DAO.DAOFactory;
/**
 * 
 * @author utilisateur
 *Cette commande permet 
 */
public class CommandLaod implements Command{

		public Interpreteur interpreteur;
	 	Scanner sc = new Scanner(System.in);
	  public CommandLaod(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  @Override
	  public void execute() {
	    Affichage Aff = new Affichage();
	    Aff.afficher("Voulez vous charger ?");
	    String reponseUtilisateur;
	   
	    do {
	      
	      reponseUtilisateur= sc.nextLine();
	    }while (!(reponseUtilisateur.equals("Oui"))||!(reponseUtilisateur.equals("Non")));
	    if (reponseUtilisateur.equals("Oui")) {
	      interpreteur.Mon_dessin.addAll(DAOFactory.getCercleDAO().findAll());
	    }
	    System.exit(12);
	  }
}
