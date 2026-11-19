package gsb.tests;

import java.util.HashMap;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentDaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String,Medicament> unDiccoMed = new HashMap<String,Medicament>();
		unDiccoMed =	MedicamentDao.retournerDictionnaireDesMedicament();
		if (unDiccoMed.containsKey("3MYC7")){
			System.out.println(unDiccoMed.get("3MYC7").getDepotLegal());
		}

	}

}

