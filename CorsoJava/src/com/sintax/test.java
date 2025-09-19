package com.sintax;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;


enum Giorno {
	LUNEDI,
	MARTEDI,
	MERCOLEDI,
	GIOVEDI,
	VENERDI,
	SABATO,
	DOMENICA
}
enum Stagione {
	INVERNO,
	PRIMAVERA,
	ESTATE,
	AUTUNNO
}
enum Taglia {
	XS,
	S,
	M,
	L,
	XL,
}

public class test {
	public static void LOGO( ) {
		System.out.println(" ███▄ ▄███▓▓█████ ▓█████▄  ██▓▓█████ ██▒   █▓ ▄▄▄       ██▓      ██████  ██░ ██ ▓█████  ██▓     ██▓    \n"
				+ "▓██▒▀█▀ ██▒▓█   ▀ ▒██▀ ██▌▓██▒▓█   ▀▓██░   █▒▒████▄    ▓██▒    ▒██    ▒ ▓██░ ██▒▓█   ▀ ▓██▒    ▓██▒    \n"
				+ "▓██    ▓██░▒███   ░██   █▌▒██▒▒███   ▓██  █▒░▒██  ▀█▄  ▒██░    ░ ▓██▄   ▒██▀▀██░▒███   ▒██░    ▒██░    \n"
				+ "▒██    ▒██ ▒▓█  ▄ ░▓█▄   ▌░██░▒▓█  ▄  ▒██ █░░░██▄▄▄▄██ ▒██░      ▒   ██▒░▓█ ░██ ▒▓█  ▄ ▒██░    ▒██░    \n"
				+ "▒██▒   ░██▒░▒████▒░▒████▓ ░██░░▒████▒  ▒▀█░   ▓█   ▓██▒░██████▒▒██████▒▒░▓█▒░██▓░▒████▒░██████▒░██████▒\n"
				+ "░ ▒░   ░  ░░░ ▒░ ░ ▒▒▓  ▒ ░▓  ░░ ▒░ ░  ░ ▐░   ▒▒   ▓▒█░░ ▒░▓  ░▒ ▒▓▒ ▒ ░ ▒ ░░▒░▒░░ ▒░ ░░ ▒░▓  ░░ ▒░▓  ░\n"
				+ "░  ░      ░ ░ ░  ░ ░ ▒  ▒  ▒ ░ ░ ░  ░  ░ ░░    ▒   ▒▒ ░░ ░ ▒  ░░ ░▒  ░ ░ ▒ ░▒░ ░ ░ ░  ░░ ░ ▒  ░░ ░ ▒  ░\n"
				+ "░      ░      ░    ░ ░  ░  ▒ ░   ░       ░░    ░   ▒     ░ ░   ░  ░  ░   ░  ░░ ░   ░     ░ ░     ░ ░   \n"
				+ "       ░      ░  ░   ░     ░     ░  ░     ░        ░  ░    ░  ░      ░   ░  ░  ░   ░  ░    ░  ░    ░  ░\n"
				+ "                   ░                     ░                                                             ");
		
	}
	public static void LOGOR( ) {
		System.out.println("     _____        _____        _____        _____        _____        _____        _____        _____        _____        _____        _____        _____        _____     \n"
				+ " ___|    _|__  __|___  |__  __|__   |__  __|_    |__  __|___  |__  __|   _ |__  __|_    |__  __|_    |__  __|___  |__  __|  _  |__  __|___  |__  __|_    |__  __|_    |__  \n"
				+ "|    \\  /  | ||   ___|    || |   \\     ||    |      ||   ___|    |\\  \\  //    ||    \\      ||    |      ||   ___|    ||  |_| |    ||   ___|    ||    |      ||    |      | \n"
				+ "|     \\/   | ||   ___|    || |    \\    ||    |      ||   ___|    ||\\  \\//     ||     \\     ||    |_     | `-.`-.     ||   _  |    ||   ___|    ||    |_     ||    |_     | \n"
				+ "|__/\\__/|__|_||______|  __||______/  __||____|    __||______|  __||_\\__/    __||__|\\__\\  __||______|  __||______|  __||__| |_|  __||______|  __||______|  __||______|  __| \n"
				+ "    |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|    \n"
				+ "                                                                                                                                                                           ");
		
	}
    public static void main(String[] args) {
        
        // Numeri interi
        int numero1 = 10;
        int numero2 = 5;
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);

        // Somma, sottrazione, moltiplicazione, divisione
        System.out.println("Somma: " + (numero1 + numero2));
        System.out.println("Differenza: " + (numero1 - numero2));
        System.out.println("Moltiplicazione: " + (numero1 * numero2));
        System.out.println("Divisione: " + (numero1 / numero2));

        // Numeri decimali
        double decimale1 = 10.5;
        double decimale2 = 3.2;
        System.out.println("Decimale 1: " + decimale1);
        System.out.println("Decimale 2: " + decimale2);
        System.out.println("Somma decimali: " + (decimale1 + decimale2));

        // Variabili String (testo)
        String nome = "Mario";
        String cognome = "Rossi";
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);

        // Concatenazione stringhe
        System.out.println("Nome completo: " + nome + " " + cognome);

        // Booleani (vero/falso)
        boolean maggioreEta = true;
        boolean haPatente = false;
        System.out.println("Maggiore età: " + maggioreEta);
        System.out.println("Ha patente: " + haPatente);

        // Caratteri singoli
        char lettera = 'A';
        System.out.println("Lettera: " + lettera);

        // Uso delle variabili in frasi
        System.out.println("Ciao, mi chiamo " + nome + " " + cognome + " e ho " + numero1 + " anni.");
        
        // Stringa con spazi iniziali e finali
        String testoConSpazi = "   Ciao Mondo   ";
        
        // Stampa originale
        System.out.println("Stringa originale: [" + testoConSpazi + "]");
        
        // Stampa con trim()
        String testoPulito = testoConSpazi.trim();
        System.out.println("Stringa dopo trim(): [" + testoPulito + "]");
        
        // Concatenazione con concat()
        String nomeCompleto = nome.concat(" ").concat(cognome);
        System.out.println("Concatenazione con concat(): " + nomeCompleto);
        
        // Creazione di uno StringBuilder
        StringBuilder sb = new StringBuilder("Ciao");
        System.out.println("Iniziale: " + sb);

        // append -> aggiunge alla fine
        sb.append(" Mondo");
        System.out.println("Dopo append: " + sb);

        // insert -> inserisce in una posizione specifica
        sb.insert(5, " Java");
        System.out.println("Dopo insert: " + sb);

        // replace -> sostituisce parte della stringa
        sb.replace(5, 10, " Programmazione");
        System.out.println("Dopo replace: " + sb);

        // delete -> elimina caratteri da un indice a un altro
        sb.delete(5, 20);
        System.out.println("Dopo delete: " + sb);

        // reverse -> inverte tutta la stringa
        sb.reverse();
        System.out.println("Dopo reverse: " + sb);

        // length e capacity
        System.out.println("Lunghezza: " + sb.length());
        System.out.println("Capacità interna: " + sb.capacity());
        
        // Stringa normale con \n
        String normale = "Ciao\nMondo\nJava";
        System.out.println("Stringa normale:");
        System.out.println(normale);

        // Text Block (multi-linea)
        String textBlock = """
                Ciao
                Mondo
                Java
                Con Text Block
                """;

        System.out.println("\nText Block:");
        System.out.println(textBlock);

        // Possibilità di indentare senza problemi
        String html = """
                <html>
                    <body>
                        <h1>Ciao Mondo</h1>
                    </body>
                </html>
                """;

        System.out.println("\nHTML Text Block:");
        System.out.println(html);
        
        
        // Math.round -> arrotonda al numero intero più vicino
        System.out.println(2 + Math.round(6.56275));
        
        double numero = 3.6;
        long arrotondato = Math.round(numero);
        System.out.println("3.6 arrotondato = " + arrotondato);
        
        // Arrotondamento per difetto (sempre verso il basso)
        double floor1 = Math.floor(numero);
        System.out.println("Math.floor -> " + floor1);
        
        // Math.ceil -> arrotonda sempre per eccesso
        System.out.println(5 + Math.ceil(10.632548));
        double ceil1 = Math.ceil(numero);
        System.out.println("Math.ceil  -> " + ceil1);
        
        // Valore casuale tra 0.0 e 1.0
        double casuale = Math.random();
        System.out.println("numero casuale (0.0 - 1.0) " + casuale);
        
        // Genera un numero intero casuale tra 1 e 6
        int numeroCasuale = (int)(Math.random() * 6) + 1;
        System.out.println("Il numero casuale è: " + numeroCasuale);
        
        // Radice quadrata perfetta
        double radice1 = Math.sqrt(numero1);
        System.out.println("sqrt(10) = " + radice1);
        double radice2 = Math.sqrt(49);
        System.out.println("Radice quadrata di 49 = " + radice2);
        
        // Potenza con esponenti positivi
        double risultato1 = Math.pow(2, 3); 
        System.out.println("2^3 = " + risultato1);
        double risultato2 = Math.pow(2, 5); 
        System.out.println("2^5 = " + risultato2);
        
        // Math.abs -> valore assoluto
        int numeroabs1 = -15;
        int numeroabs2 = 20;
        System.out.println("Numero originale: " + numeroabs1 + " | Valore assoluto: " + Math.abs(numero1));
        System.out.println("Numero originale: " + numeroabs2 + " | Valore assoluto: " + Math.abs(numero2));
        
        //Dato il raggio r = 5, calcola l’area del cerchio.
        double raggio = 5;  // raggio
        // Area del cerchio = π * r^2
        double area = Math.PI * Math.pow(raggio, 2);
        System.out.println("Raggio: " + raggio);
        System.out.println("Area del cerchio: " + area);
        
        //Data di Oggi
        LocalDate oggi = LocalDate.now();
        System.out.println("Oggi è: " + oggi);
        
        // Creo una data: 1 gennaio 2025
        LocalDate data = LocalDate.of(2025, 1, 1);
        System.out.println("La data è: " + data);
        
        // Aggiungo 30 giorni
        LocalDate nuovaData = oggi.plusDays(30);
        System.out.println("Data tra 30 giorni: " + nuovaData);
        
        // Data del 25 dicembre 2025
        LocalDate natale = LocalDate.of(2025, 12, 25);

        // Calcolo la differenza in giorni
        long giorni = ChronoUnit.DAYS.between(oggi, natale);

        System.out.println("Oggi: " + oggi);
        System.out.println("Natale 2025: " + natale);
        System.out.println("Giorni fino al 25 dicembre 2025: " + giorni);
        
        // Data da controllare: 1 gennaio 2000
        LocalDate data1 = LocalDate.of(2000, 1, 1);


        // Calcolo la differenza in giorni
        long giorniDifferenza = ChronoUnit.DAYS.between(data1, oggi);
        if (giorniDifferenza > 0) {
            System.out.println(data1 + " è una data passata di " + giorniDifferenza + " giorni.");
        } else if (giorniDifferenza == 0) {
            System.out.println(data1 + " è oggi.");
        } else {
            System.out.println(data1 + " è una data futura di " + Math.abs(giorniDifferenza) + " giorni.");
        }
        
        // Stampo anno, mese e giorno in tre print separati
        System.out.println("Anno: " + oggi.getYear());
        System.out.println("Mese: " + oggi.getMonthValue());
        System.out.println("Giorno: " + oggi.getDayOfMonth());
        System.out.println("Anno: " + LocalDate.now().getYear());
        System.out.println("Anno: " + LocalDate.now().getMonthValue());
        System.out.println("Anno: " + LocalDate.now().getDayOfMonth());
        
        //Controlla se l’anno della data odierna è bisestile.
        
        System.out.println(oggi.isLeapYear());
        
        if (LocalDate.now().isLeapYear()) {
        	System.out.println("L' anno " + LocalDate.now().getYear() + " è bisestile");
        } else {
        	System.out.println("L' anno " + LocalDate.now().getYear() + " non è bisestile");
        }
        
        //Dalla data di nascita 2000-04-15, calcola l’età attuale.
        LocalDate Birth = LocalDate.of(1997, 11, 11);
        //Calcolo dell'età in anni
        long age = ChronoUnit.YEARS.between(Birth, oggi);
        
        System.out.println("Data di Nascita: " + Birth);
        System.out.println("Oggi: " + oggi);
        System.out.println("Età attuale " + age + " anni");
        
        boolean bisestile = oggi.isLeapYear();
        System.out.println("L'anno " + oggi.getYear() + " è bisestile? " + bisestile);
        
        LocalDate nascita = LocalDate.of(2000, 4, 15);
        Period eta = Period.between(nascita, oggi);
        System.out.println("Età: " + eta.getYears() + " anni");
        
        //controllo se un numero è positivo o negativo.
        int numerocheck = (int) (Math.random()* 101) - 50;

        if (numerocheck > 0) {
            System.out.println(numerocheck + " è positivo.");
        } else if (numerocheck < 0) {
            System.out.println(numerocheck + " è negativo.");
        } else {
            System.out.println("Il numero è zero.");
        }
        
        // Controllo pari/dispari
        if (numerocheck % 2 == 0) {
            System.out.println(numerocheck + " è pari.");
        } else {
            System.out.println(numerocheck + " è dispari.");
        }
        
        // COntrollo maggiore età
        int ageck = (int) (Math.random()* 100) + 1;
        
        if (ageck < 18) {
        	System.out.println(ageck + " è minorenne.");
        } else {
        	System.out.println(ageck + " è maggiorenne.");
        }
        
        //Dato un carattere, controlla se è una vocale o una consonante.
        Random rand = new Random();
        
        // scegli casualmente: 0 = lettera, 1 = numero
        int scelta = rand.nextInt(2); 
        char c;

        // Converto in minuscolo per semplificare i controlli
        if (scelta == 0) {
            // lettera casuale A-Z o a-z
            if (rand.nextBoolean()) {
                c = (char) ('A' + rand.nextInt(26));
            } else {
                c = (char) ('a' + rand.nextInt(26));
            }
        } else {
            // numero casuale 0-9
            c = (char) ('0' + rand.nextInt(10));
        }

        System.out.println("Carattere generato: " + c);
        
        // --- Controllo ---
        char lower = Character.toLowerCase(c);

        if (Character.isLetter(lower)) {
            if ("aeiou".indexOf(lower) != -1) {
                System.out.println(c + " è una vocale.");
            } else {
                System.out.println(c + " è una consonante.");
            }
        } else if (Character.isDigit(c)) {
            System.out.println(c + " è un numero.");
        } else {
            System.out.println(c + " non è valido (né lettera né numero).");
        }
        
        System.out.println(
        	    Character.isLetter(c) 
        	        ? ("aeiou".indexOf(Character.toLowerCase(c)) != -1 
        	            ? c + " è una vocale." 
        	            : c + " è una consonante.") 
        	        : (Character.isDigit(c) 
        	            ? c + " è un numero." 
        	            : c + " non è valido (né lettera né numero).")
        	);
        //numero check
        int numerock = +10;
        if (numerock > 0) {
        	System.out.println(numerock + " è positivo.");
        } else if  (numerock < 0) {
        	System.out.println(numerock + " è negativo.");
        } else {
        	System.out.println(" il numero è zero.");
        }
        
        System.out.println(numerock > 0 ? numerock + " è positivo"
        										: numerock < 0 ? numerock + " è negativo"
        										: "il numero è zero");
        
        //ciclo for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        //ciclo for più articolato
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            String tipo = (i % 2 == 0) ? "pari" : "dispari";
            System.out.println("Numero " + i + " è " + tipo);
            count++;
        }
        System.out.println("Totale numeri stampati: " + count);
        
        System.out.println("🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢");
        int somma = 0;
        for (int i = 1; i <= 100; i++) {
            somma += i;
        }
        System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
        
        int numerotb = 7;
        System.out.println("🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " × " + numerotb + " = " + (i * numerotb));
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Inserisci il numero della tabellina: ");
//        int numerotb1 = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " × " + numerotb1 + " = " + (i * numerotb1));
//        }
        System.out.println("🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println("🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢");
        int i = 1; 
        while (i <= 10) {
            System.out.println(i);
            i++; 
        }
        LOGO();
        int numerow = 2; 
        while (numerow <= 20) {
            System.out.println(numerow);
            numerow += 2; 
        }
        
        //Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
        int numeroip = 3456;
        int tmp = numeroip;
        int cnt = 0;
        while (tmp > 0) {
        	tmp /= 10;
        	cnt++;
        }
        System.out.println("il numero " + numeroip + " ha " + cnt + " cifre." );
        int cfr = String.valueOf(numeroip).length();
        System.out.println("il numero " + numeroip + " ha " + cfr + " cifre." );
        LOGO();
        //Scrivi un programma che calcola la somma delle cifre di un numero intero positivo. Esempio: 123 → 1 + 2 + 3 = 6.
        int numeroip1 = 123;
        int sommaip = 0;
        while (numeroip1 > 0) {
        	sommaip += numeroip1%10;
        	numeroip1/=10;
        }
        System.out.println("il risultato è " + sommaip);
        LOGO();
        //Scrivi un programma che inverte un numero intero positivo. Esempio: 1234 → 4321
        int numeroip2 = 1234; 
        int temp = numeroip2;
        int invertito = 0;
        while (temp > 0) {
            int cifra = temp % 10;
            invertito = invertito * 10 + cifra;
            temp /= 10;
        }

        System.out.println("Il numero " + numeroip2 + " invertito è " + invertito);
        LOGO();
        //Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
        int somma1 = 0;
        int numero10 = 1;

        do {
            somma1 += numero10;
            numero10++;
        } while (numero10 <= 100);

        System.out.println("La somma dei numeri da 1 a 100 è " + somma1);
        LOGO();
        //Scrivi un programma che conta quante cifre ha un numero intero positivo, ad esempio n = 12345 ha 5 cifre.
        int numeroint = 12345; 
        int tempint = numeroint;
        int contatore = 0;

        while (tempint > 0) {
            tempint /= 10; 
            contatore++; 
        }

        System.out.println("Il numero " + numeroint + " ha " + contatore + " cifre.");

        LOGO();
        //Scrivi un programma che calcola base^esponente usando do-while. Esempio: 3^4 = 81
        int base = 3; 
        int esponente = 4; 
        int risultato = 1; 
        int contatore1 = 0; 

        do {
            risultato *= base;
            contatore1++; 
        } while (contatore1 < esponente);

        System.out.println(base + " ^ " + esponente + " = " + risultato);

        LOGO();
        //Usa uno switch per stampare il giorno della settimana dato un numero da 1 a 7.
        int giorno = 3;

        switch (giorno) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Numero non valido, inserire un numero da 1 a 7.");
                break;
        }

        LOGO();
        //Usa uno switch per stampare la stagione dato un mese (es. 1 = gennaio = inverno).
        int mese = 4; 

        switch (mese) {
            case 12:
            case 1:
            case 2:
                System.out.println("Inverno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estate");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autunno");
                break;
            default:
                System.out.println("Numero mese non valido, inserire da 1 a 12.");
                break;
        }

        LOGOR();
        //Simula un menu di un ristorante (switch per scegliere tra 3 piatti).
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("=== Menu Ristorante ===");
//        System.out.println("1. Pasta al pomodoro");
//        System.out.println("2. Pizza margherita");
//        System.out.println("3. Insalata mista");
//        System.out.print("Scegli un piatto (1-3): ");
//        
//        int sceltamenu = scanner.nextInt();
//        
//        switch (sceltamenu) {
//        case 1:
//        	System.out.println("Hai scelto Pasta al pomodoro 🍝 - 12.00");
//        	break;
//        case 2:
//        	System.out.println("Hai scelto Pizza margherita 🍕 - 5.00€");
//        	break;
//        case 3:
//        	System.out.println("Hai scelto Insalata mista 🥗 - 7.00 ");
//        	break;
//        default:
//        	System.out.println("Scelta non valida, per favore scegli tra 1 e 3.");
//        	break;
//        }
//        
//        LOGOR();
//        scanner.close();
        //Simula una calcolatrice base con switch (+, -, *, /).
//        Scanner scanner1 = new Scanner(System.in);
//
//        System.out.print("Inserisci il primo numero: ");
//        double num1 = scanner1.nextDouble();
//
//        System.out.print("Inserisci il secondo numero: ");
//        double num2 = scanner1.nextDouble();
//
//        System.out.print("Scegli l'operazione (+, -, *, /): ");
//        char operazione = scanner1.next().charAt(0);
//
//        switch (operazione) {
//            case '+':
//                System.out.println("Risultato: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Risultato: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Risultato: " + (num1 * num2));
//                break;
//            case '/':
//                if (num2 != 0) {
//                    System.out.println("Risultato: " + (num1 / num2));
//                } else {
//                    System.out.println("Errore: divisione per zero!");
//                }
//                break;
//            default:
//                System.out.println("Operazione non valida. Usa solo +, -, *, /.");
//                break;
//        }
//
//        LOGOR();
//        scanner1.close();
        //Dato un codice prodotto, usa uno switch per mostrare nome e prezzo.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("=== Listino Prodotti ===");
//        System.out.println("1. Laptop");
//        System.out.println("2. Smartphone");
//        System.out.println("3. Cuffie");
//        System.out.print("Inserisci il codice prodotto (1-3): ");
//
//        int codice = scanner.nextInt();
//
//        switch (codice) {
//            case 1:
//                System.out.println("Prodotto: Laptop 💻");
//                System.out.println("Prezzo: 999.99 €");
//                break;
//            case 2:
//                System.out.println("Prodotto: Smartphone 📱");
//                System.out.println("Prezzo: 699.50 €");
//                break;
//            case 3:
//                System.out.println("Prodotto: Cuffie 🎧");
//                System.out.println("Prezzo: 149.90 €");
//                break;
//            default:
//                System.out.println("Codice non valido. Scegli tra 1, 2 o 3.");
//                break;
//        }
//
//        LOGOR();
//        scanner.close();
        
        //Scrivi un programma che usa if per verificare l'età, e switch per decidere il tipo di biglietto (es. junior, adulti, senior).
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Inserisci la tua età: ");
//        int eta1 = scanner.nextInt();
//
//        String categoria;
//
//        // IF per determinare la categoria in base all'età
//        if (eta1 < 18) {
//            categoria = "junior";
//        } else if (eta1 < 65) {
//            categoria = "adulto";
//        } else {
//            categoria = "senior";
//        }
//
//        // SWITCH per decidere il tipo di biglietto
//        switch (categoria) {
//            case "junior":
//                System.out.println("Biglietto JUNIOR 🎟️ - Prezzo: 5 €");
//                break;
//            case "adulto":
//                System.out.println("Biglietto ADULTO 🎟️ - Prezzo: 10 €");
//                break;
//            case "senior":
//                System.out.println("Biglietto SENIOR 🎟️ - Prezzo: 7 €");
//                break;
//            default:
//                System.out.println("Categoria non valida.");
//                break;
//        }
//
//        LOGOR();
//        scanner.close();
        //Usa uno switch per stampare il nome del mese e con if stampa se ha 31 o 30 giorni.
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Inserisci un numero da 1 a 12 per il mese: ");
//        int mese1 = sc.nextInt();
//
//        String nomeMese = "";
//
//        switch (mese1) {
//            case 1: nomeMese = "Gennaio"; break;
//            case 2: nomeMese = "Febbraio"; break;
//            case 3: nomeMese = "Marzo"; break;
//            case 4: nomeMese = "Aprile"; break;
//            case 5: nomeMese = "Maggio"; break;
//            case 6: nomeMese = "Giugno"; break;
//            case 7: nomeMese = "Luglio"; break;
//            case 8: nomeMese = "Agosto"; break;
//            case 9: nomeMese = "Settembre"; break;
//            case 10: nomeMese = "Ottobre"; break;
//            case 11: nomeMese = "Novembre"; break;
//            case 12: nomeMese = "Dicembre"; break;
//            default: 
//                System.out.println("Numero non valido! Inserisci da 1 a 12.");
//                sc.close();
//                LOGOR();
//                return;
//        }
//        System.out.println("Hai scelto: " + nomeMese);
//
//        // if per i giorni
//        if (mese1 == 2) {
//            System.out.println("Questo mese ha 28 o 29 giorni (anno bisestile).");
//        } else if (mese1 == 4 || mese1 == 6 || mese1 == 9 || mese1 == 11) {
//            System.out.println("Questo mese ha 30 giorni.");
//        } else {
//            System.out.println("Questo mese ha 31 giorni.");
//        }
//
//        sc.close();
//        LOGOR();
        
       //Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Inserisci un voto in lettere (A-F): ");
//        char voto = sc.next().toUpperCase().charAt(0);
//
//        int valore;
//
//        switch (voto) {
//            case 'A':
//                valore = 10;
//                break;
//            case 'B':
//                valore = 9;
//                break;
//            case 'C':
//                valore = 8;
//                break;
//            case 'D':
//                valore = 7;
//                break;
//            case 'E':
//                valore = 6;
//                break;
//            case 'F':
//                valore = 5;
//                break;
//            default:
//                System.out.println("Voto non valido!");
//                sc.close();
//                LOGOR();
//                return;
//        }
//
//        System.out.println("Il voto " + voto + " corrisponde a: " + valore);
//        sc.close();
//        LOGOR();
        
        //Dati i cateti a = 3 e b = 4, calcola l’ipotenusa usando il teorema di Pitagora.
        
        double cat1 = 3;
        
        double cat2 = 4;
        
        double ipotenusa = Math.sqrt(Math.pow(cat1, 2)) + Math.sqrt(Math.pow(cat2, 2));
        
        System.out.println(ipotenusa);
        LOGOR();
        
        //Genera due numeri casuali tra 1 e 50, poi stampa la loro differenza assoluta.
        Random rand1 = new Random();

        int num1 = rand1.nextInt(50) + 1; // 1-50
        int num2 = rand1.nextInt(50) + 1; // 1-50

        int diffAssoluta = Math.abs(num1 - num2);

        System.out.println("Primo numero: " + num1);
        System.out.println("Secondo numero: " + num2);
        System.out.println("Differenza assoluta: " + diffAssoluta);

        LOGOR();
        System.out.println("----------------------------------------------------------");
        System.out.println("Crea un array di interi e stampane ogni elemento.");
        System.out.println("----------------------------------------------------------");
        int[] arr = new  int[5];
        arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[2]);
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Calcola la somma di tutti gli elementi di un array.");
		System.out.println("----------------------------------------------------------");
        int[] arr1 = new  int[5];
        arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		int sommaarr1 = 0;
		for (int  n  :  arr1) {
			sommaarr1  += n;
		}
		System.out.println("Somma = " + sommaarr1);
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Calcola la media aritmetica degli elementi di un array.");
		System.out.println("----------------------------------------------------------");
        int[] arr2 = new  int[5];
        arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		int sommaarr2 = 0;
		for (int  n : arr2) {
			sommaarr2  += n;
		}
		double media = (double) sommaarr2/arr2.length;
		System.out.println("Somma = " + sommaarr2);
		System.out.println("----------------------------------------------------------");
		System.out.println("Numero di elementi = " + arr2.length);
		System.out.println("----------------------------------------------------------");
		System.out.println("Media = " + media);
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Trova il valore massimo in un array di interi.");
		System.out.println("----------------------------------------------------------");
		int[] arr3 = {5, 12, 7, 25, 3, 18};
		int max = arr3[0];
		for (int n : arr3) {
            if (n > max) {
                max = n;
            }
        }
		System.out.println("Il valore massimo nell'array è: " + max);
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Trova il valore massimo in un array di interi.");
		System.out.println("----------------------------------------------------------");
		int[] arr4 = {5, 12, 7, 25, 3, 18};
		int min = arr4[0];
		for (int n : arr4) {
            if (n < min) {
                min = n;
            }
        }
		System.out.println("Il valore minimo nell'array è: " + min);
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Conta il numero di elementi pari in un array.");
		System.out.println("----------------------------------------------------------");
		int[] arr5 = {5, 12, 7, 25, 3, 18};
		int countPari = 0;
		for (int n : arr5) {
            if (n % 2 == 0) {
                countPari++;
            }
        }
		System.out.println("Numero di elementi pari nell'array: " + countPari);
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Stampa gli elementi dell’array in ordine inverso.");
		System.out.println("----------------------------------------------------------");
		int[] arr6 = {5, 12, 7, 25, 3, 18};
		for (int n1 = arr6.length - 1; n1 >= 0; n1--) {
			System.out.println(arr6[n1]);
		}
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Controlla se un numero dato (es. 10) è presente nell’array.");
		System.out.println("----------------------------------------------------------");
		int[] arr7 = {5, 12, 7, 25, 3, 18};
		int daCercare = 10;
		boolean trovato = false;
		for (int n : arr7) {
			if (n == daCercare) {
				trovato = true;
				break;
			}
		}
		if (trovato) {
			System.out.println("Il numero " + daCercare + " è presente");
		} else {
			System.out.println("Il numero " + daCercare + " NON è presente");
		}
		System.out.println("----------------------------------------------------------");
		LOGOR();
		System.out.println("----------------------------------------------------------");
		System.out.println("Dato un array, stampa i numeri duplicati presenti.");
		System.out.println("----------------------------------------------------------");
		int[] arr8 = {5, 12, 7, 25, 3, 18, 12, 25};
		for (int n3 = 0; n3 < arr8.length; n3++) {
			for (int j = n3 + 1;  j < arr8.length; j++) {
				if (arr8[n3] == arr8[j]) {
					System.out.println(arr8[n3]);
					break;
				}
			}
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Crea un nuovo array con solo valori univoci.");
		System.out.println("----------------------------------------------------------");
		int[] arr9 = {5, 12, 7, 25, 3, 18, 12, 25};
		int[] univoci = new int[arr9.length];
		count = 0;
		for (int n4 = 0; n4 < arr9.length; n4++) {
			boolean presente = false;
			for(int j = 0; j < count; j++) {
				if (arr9[n4] == univoci[j]) {
					presente = true;
					break;
				}
			} if (!presente) {
				univoci[count] = arr9[n4]; 
				count++;
			}
	    } for (int i1 = 0; i1 < count; i1++) {
	    	System.out.println(univoci[i1] + " ");
	    }
	    LOGOR();
	    //System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//System.out.println("Scrivi un programma che esegue la divisione tra due numeri e cattura l’eccezione ArithmeticException se si tenta di dividere per zero.");
		//System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    //Scanner scanner = new Scanner(System.in);

        //try {
            //System.out.print("Inserisci il primo numero: ");
            //int a = scanner.nextInt();

            //System.out.print("Inserisci il secondo numero: ");
            //int b = scanner.nextInt();

            //int risultato11 = a / b; 
            //System.out.println("Risultato della divisione: " + risultato11);

        //} catch (ArithmeticException e) {
            //System.out.println("Errore: non puoi dividere per zero!");
        //}

        //scanner.close();
        //System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //LOGOR();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Crea una variabile null e gestisci NullPointerException.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		try {
            String testo = null;
            System.out.println("Lunghezza della stringa: " + testo.length()); 
        } catch (NullPointerException e) {
            System.out.println("Errore: stai tentando di usare una variabile null!");
        }
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        LOGOR();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Gestisci l’eccezione ArrayIndexOutOfBoundsException accedendo a un indice non valido in un array.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        int[] numeri = {1, 2, 3};

        try {
            System.out.println("Valore in posizione 5: " + numeri[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: indice fuori dai limiti dell'array!");
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        LOGOR();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(Giorno g : Giorno.values()) {
        	System.out.println(g);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Stagione s = Stagione.ESTATE;
        switch (s) {
		case PRIMAVERA :
			System.out.println("Non estitono più le mezze stagioni");
			break;
		case ESTATE :
			System.out.println("Fà troppo caldo");
			break;
		case AUTUNNO :
			System.out.println("Non estitono più le mezze stagioni");
			break;
		case INVERNO :
			System.out.println("Che bello l' inverno");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + s);
		}
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Che giorno ti serve");
//        String GiornoSett = scanner.nextLine();
//        try {
//			Giorno gg = Giorno.valueOf(GiornoSett);
//			if (gg == Giorno.SABATO || gg == Giorno.DOMENICA) {
//				System.out.println("Weekend");
//			} else {
//				System.out.println("Lavorativo");
//			}
//		} catch (Exception e) {
//			System.out.println("non eseiste");
//		}
//        scanner.close();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        for (Taglia t : Taglia.values()) {
        	System.out.println("Che Taglia ti serve");
        	String Taglia = scanner.nextLine();
        	System.out.println("La Taglia Selezionata è " + Taglia);
        	break;
        }
        scanner.close();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
