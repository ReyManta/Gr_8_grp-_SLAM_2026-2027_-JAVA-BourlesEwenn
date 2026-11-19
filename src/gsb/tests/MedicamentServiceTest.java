package gsb.tests;

import gsb.modele.Medicament;

public class MedicamentServiceTest {

	public static void main(String[] args) {
		Medicament unMedicament = MedicamentService.rechercherMedicament("3MYC7");
		System.out.println(unMedicament.getDepotLegal());
		System.out.println(unMedicament.getNomCommercial());
		System.out.println(unMedicament.getCompo());
		System.out.println(unMedicament.getEffets());
		System.out.println(unMedicament.getContreIndic());
		System.out.println(unMedicament.getPrixEchantillon());
		System.out.println(unMedicament.getCode());
		System.out.println(unMedicament.getLibelle());

		}

	}


