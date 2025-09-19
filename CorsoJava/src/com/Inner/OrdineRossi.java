package com.Inner;

public class OrdineRossi {
	private String cognomeCliente;
	private String nomeCliente;
	private Long partitaiva;
	private Long fattura;
	public OrdineRossi(String cognomeCliente, String nomeCliente, Long partitaiva, Long fattura) {
		this.cognomeCliente = cognomeCliente;
		this.nomeCliente = nomeCliente;
		this.partitaiva = partitaiva;
		this.fattura = fattura;
	}
	public class Prodotto {
		private int idProdotto;
		private int quantitàProdotto;
		private int prezzoProdotto;
		private String nomeProdotto;
		public Prodotto(int idProdotto, int quantitàProdotto, int prezzoProdotto, String nomeProdotto) {
			this.idProdotto = idProdotto;
			this.quantitàProdotto = quantitàProdotto;
			this.prezzoProdotto = prezzoProdotto;
			this.nomeProdotto = nomeProdotto;
		}
		public void StampaOrdine() {
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("DETTAGLI ORDINE: ");
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("NOME CLIENTE: " + nomeCliente + " COGNOME CLIENTE: " + cognomeCliente);
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("PARTITA IVA: " + partitaiva + " FATTURA: " + fattura + "€");
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("DETTAGLI ORDINE: ");
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("ID PRODOTTO: " + idProdotto + " NOME PRODOTTO: " + nomeProdotto);
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("QUANTITA': " + quantitàProdotto + " pz" + " PREZZO: " + prezzoProdotto + "€");
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
	}
	public static void main(String[] args) {
		OrdineRossi ordine = new OrdineRossi("Giorgio", "Rossi", 1234567890l, 1500l );
		OrdineRossi.Prodotto a = ordine.new Prodotto(123, 300, 5, "Scarpe" );
		a.StampaOrdine();
	}
}
