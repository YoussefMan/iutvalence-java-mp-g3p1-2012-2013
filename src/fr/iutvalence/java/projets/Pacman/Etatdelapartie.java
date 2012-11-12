package fr.iutvalence.java.projets.Pacman;

// FIXME compléter le commentaire
/**
 * 
 * @author elmanssy
 * 
 */
// FIXME renommer la classe
public class Etatdelapartie {

	public final static int NOMBRE_DE_BILLES_INIT = 104;
	
	private static int nombredebilles;
	
	public final static int  NOMBRE_DE_GOMMES_INIT = 4;
	
	private int nombredegommes;
	
	private int score;
	

	
	public Etatdelapartie {

		ZoneDeJeux ZoneTest = new  ZoneDeJeux();
		this.nombredebilles= ZoneTest.getBilles();
		this.score = getScore(ZoneTest);
		
		
		Pacman Perso = new Pacman();
		Fantome F1 = new Fantome();
		Fantome F2 = new Fantome();
		
	}

    
  public int getScore( ZoneDeJeux ZoneTest ) {
	  int res = 0 ;
	  res = (NOMBRE_DE_BILLES_INIT - nombredebilles)* ZoneTest.VALEUR_SCORE_BILLE+( NOMBRE_DE_GOMMES_INIT - nombredegommes )* ZoneTest.VALEUR_SCORE_GOMME;
	 return res;
  }
	 
	  
	
	

	
	
	


	
	

	
	}

	
}
