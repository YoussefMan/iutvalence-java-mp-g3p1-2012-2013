package fr.iutvalence.java.projets.Pacman;

import java.util.Arrays;


/**
 * l'emplacement (0,0) se trouve en bas à gauche.
 * la grille fait en taille XMAX et YMAX.
 * Cette grille permet de modéliser la zone de jeu, elle est remplit de 0 et de 1 représentant
 * les zones jouables ou non jouables, elle est complété grace au constructeur Zone de base.
 * @author elmanssy
 *
 */
public class ZoneDeJeux {

	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une bille
	 */
	// FIXME respecter les conventions d'écriture
	public final static int VALEURSCOREBILLE = 10;
	
	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une gomme on gérera
	 * le fait que les fontôme change d'état quand une gomme est manger dans l'état de la partie.
	 */
	// FIXME respecter les conventions d'écriture
	public final static int VALEURSCOREGOMME = 50;
	
	
 
	// FIXME respecter les conventions d'écriture
	/**
	 * On définit à 1 les endroits où les déplacements d'objets sont autorisés
	 */
	public final static int ZONEJOUABLE = 1;

	// FIXME respecter les conventions d'écriture
	/**
	 * On définit à 0 les endroits où les déplacements d'objets sont non autorisés
	 */
	public final static int ZONENONJOUABLE = 0;
	
	/**
	 * On définit à 20 la taille maximum de la grille en abscisse.
	 */
	// FIXME respecter les conventions d'écriture
	public static final int XMAX = 20;

	/** 
	 * la taille maximum de la grille en ordonnée.
	 * 	 
	 * */
	// FIXME respecter les conventions d'écriture
	public static final int YMAX = 10;

	/**
	 * Le contenu de la grille. (Chaque case peut contenir une bille et est une zone jouable ou non jouable).
	 */
	private int grille[][] ;
	
	
	/**
	 * represente l'abscisse sur la zone de jeu 
	 */
	private int x;
	
	/**
	 * represente l'ordonée sur la zone de jeu 
	 */
	private int y;
	
	/**
	 * On initialise une zone de jeux de taille XMAX en abscisse et YMAX en ordonnée
	 * avec des zones de jeux jouable et non jouable 
	 */
	public ZoneDeJeux(){
		grille = new int[XMAX][YMAX];
		x=0;
		y=0;
		
		while((this.y<YMAX)){//On rempit toute la grille de zone jouable
			
			while(this.x<XMAX){
				
				this.grille[this.x][this.y] = 1 +  VALEURSCOREBILLE;
		    	this.x ++;
			}
			
		    this.y ++;
		    }
		
		
	/*	while(this.x <XMAX){ // On remplit en zone non jouable la première ligne et la dernière
			this.grille[this.x][1] = 0;
			this.grille[this.x][YMAX] = 0; 
			this.x = this.x + 1;
		}	
		while(this.y < YMAX){ // On remplit en zone non jouable la première ligne et la dernière
			this.grille[XMAX][this.y] = 0;
			this.grille[1][this.y] = 0; 
			this.y = this.y + 1;
		}
			
			this.grille[2][2] = 0; //Zone non jouable : (2;2,2;4)
			this.grille[2][3] = 0; 
			this.grille[2][4] = 0; 
			
			this.grille[2][6] = 0; //Zone non jouable : (2;6,2;8)
			this.grille[2][7] = 0; 
			this.grille[2][8] = 0; 
			
			this.grille[4][2] = 0;//Zone non jouable : (4;2,7;2)
			this.grille[5][2] = 0;
			this.grille[6][2] = 0;
			this.grille[7][2] = 0;
			
			this.grille[13][2] = 0;//Zone non jouable : (13;2,16;2)
			this.grille[14][2] = 0;
			this.grille[15][2] = 0;
			this.grille[16][2] = 0;
			
			this.grille[18][2] = 0; //Zone non jouable : (18;2,18;4)
			this.grille[18][3] = 0; 
			this.grille[18][4] = 0; 
			
			this.grille[18][6] = 0; //Zone non jouable : (18;6,18;8)
			this.grille[18][7] = 0; 
			this.grille[18][8] = 0; 
			
			this.grille[4][8] = 0;//Zone non jouable : (4;8,7;8)
			this.grille[5][8] = 0;
			this.grille[6][8] = 0;
			this.grille[7][8] = 0;
			
			this.grille[13][8] = 0;//Zone non jouable : (13;8,16;8)
			this.grille[14][8] = 0;
			this.grille[15][8] = 0;
			this.grille[16][8] = 0;
			
			this.x = 0;
			this.y = 0;
			
			this.grille[1][1] = 0; // On met en place la valeur des gommes.
			this.grille[1][1] = 1 + VALEURSCOREGOMME;
			
			this.grille[18][1] = 0; // On met en place la valeur des gommes.
			this.grille[18][1] = 1 + VALEURSCOREGOMME;
			
			this.grille[18][9] = 0; // On met en place la valeur des gommes.
			this.grille[18][9] = 1 + VALEURSCOREGOMME;
			
			this.grille[1][8] = 0; // On met en place la valeur des gommes.
			this.grille[1][8] = 1 + VALEURSCOREGOMME;*/
			
	}

	
	public String toString() {
		this.x=0;
		this.y=0;
		String result = "Voici la zone de jeu : \n" ;
		while (this.y <= YMAX - 1){
			 result += "\n";
			while (this.x <= XMAX - 1){
				if(this.grille[this.x][this.y] == 0)
					result += "*";
				
				if(this.grille[this.x][this.y] == 11) 
					result += "o";
				if(this.grille[this.x][this.y] == 51)
					result += "0";
				this.x = this.x+1;
				
			}
			 result += "\n";	
			 this.y = this.y + 1;	
		}
	     return result;
	}
	
	
}
