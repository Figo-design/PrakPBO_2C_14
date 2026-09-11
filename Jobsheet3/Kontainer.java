package Jobsheet3;

public class Kontainer {
	private String nomorResi;
	private String namaPemilik;
	private double kapasitasMaksimal;
	private double beratMuatanSaatIni;

	public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
		this.nomorResi = nomorResi;
		this.namaPemilik = namaPemilik;
		this.kapasitasMaksimal = kapasitasMaksimal;
		this.beratMuatanSaatIni = 0.0;
	}

	public String getNomorRequest() {
		return nomorResi;
	}

	public String getNamaPemilik() {
		return namaPemilik;
	}

	public double getKapasitasMaksimal() {
		return kapasitasMaksimal;
	}

	public double getBeratMuatanSaatIni() {
		return beratMuatanSaatIni;
	}

	public void tambahMuatan(int berat) {
		if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
			beratMuatanSaatIni += berat;
		} else {
			System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer!");
		}
	}

	public void turunkanMuatan(int berat) {
		if (berat >= 0 && berat <= beratMuatanSaatIni * 0.5) {
			beratMuatanSaatIni -= berat;
		} else if (berat > beratMuatanSaatIni * 0.5) {
			System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
		} else {
			System.out.println("Maaf, berat muatan yang diturunkan melebihi muatan saat ini!");
		}
	}
}
