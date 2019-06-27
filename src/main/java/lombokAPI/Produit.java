package lombokAPI;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


//lombok c'est une API qui permet de facilit� la t�che de d�veloppement 
//avec les notation 


@NoArgsConstructor @AllArgsConstructor
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
@Data
public class Produit {
	
	int idProduit;
	String nom;
	double prix;
	int quantite;
	
	
	
	
	
	
	
	
	
	

}
