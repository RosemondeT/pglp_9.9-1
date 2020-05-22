package CMD;

import FORME_GRAPHIQUE.Forme;
/**
 * 
 * @author SIMPORE
 *Cette commande permet d'afficher une forme donnée suivant les informations saisies par l'utilsateur
 */
public class CommandPrint implements Command {

	public Interpreteur inter;
	  public CommandPrint(Interpreteur interpreteur) {
	    this.inter=interpreteur;
	  }

	  @Override
	  public void execute() {
	    for(Forme forme : inter.Mon_dessin){
	      forme.print();
	    }
	  }
}
