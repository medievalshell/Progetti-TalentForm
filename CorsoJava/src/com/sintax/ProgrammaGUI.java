package com.sintax;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;


@SuppressWarnings("serial")
public class ProgrammaGUI extends JFrame {
    private boolean darkMode = false;
    private BankAccount account = new BankAccount();
    public ProgrammaGUI() {
    	//setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icon.png")).getImage());
        setTitle("Programma Didattico Java");
        setSize(1280, 750);
        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ---------------- TabbedPane ----------------
        JTabbedPane tabbedPane = new JTabbedPane();
        // ---------------- IMPOSTAZIONI ----------------
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        // Logo ASCII
        String logoHtml = "<html><pre>"
        		+"     _____        _____        _____        _____        _____        _____        _____        _____        _____        _____        _____        _____        _____     \n"
				+ " ___|    _|__  __|___  |__  __|__   |__  __|_    |__  __|___  |__  __|   _ |__  __|_    |__  __|_    |__  __|___  |__  __|  _  |__  __|___  |__  __|_    |__  __|_    |__  \n"
				+ "|    \\  /  | ||   ___|    || |   \\     ||    |      ||   ___|    |\\  \\  //    ||    \\      ||    |      ||   ___|    ||  |_| |    ||   ___|    ||    |      ||    |      | \n"
				+ "|     \\/   | ||   ___|    || |    \\    ||    |      ||   ___|    ||\\  \\//     ||     \\     ||    |_     | `-.`-.     ||   _  |    ||   ___|    ||    |_     ||    |_     | \n"
				+ "|__/\\__/|__|_||______|  __||______/  __||____|    __||______|  __||_\\__/    __||__|\\__\\  __||______|  __||______|  __||__| |_|  __||______|  __||______|  __||______|  __| \n"
				+ "    |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|      |_____|    \n"
				+ "                                                                                                                                                                           "
        		+ "</pre></html>";
        JLabel logoAscii = new JLabel(logoHtml);
        logoAscii.setAlignmentX(Component.CENTER_ALIGNMENT);
        settingsPanel.add(logoAscii);
        JButton darkBtn = new JButton("Dark Mode");
        darkBtn.addActionListener(e -> toggleDarkMode());
        settingsPanel.add(darkBtn);
        URL iconURL = getClass().getClassLoader().getResource("icon.png");
        if (iconURL != null) {
            ImageIcon icon1 = new ImageIcon(iconURL);
            JLabel copyrightLabel = new JLabel("© 2025 by Medievalshell", icon1, JLabel.LEFT);
            copyrightLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            settingsPanel.add(Box.createHorizontalStrut(20));
            settingsPanel.add(copyrightLabel);
        } else {
            System.out.println("Icona non trovata!");
        }
        tabbedPane.addTab("Impostazioni", settingsPanel);
        // ---------------- NUMERI ----------------
        JPanel numeriPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        JTextField numeroField = new JTextField();
        JButton absBtn = new JButton("Valore Assoluto");
        JLabel absResult = new JLabel("");
        JButton sqrtBtn = new JButton("Radice Quadrata");
        JLabel sqrtResult = new JLabel("");
        JButton roundBtn = new JButton("Arrotonda");
        JLabel roundResult = new JLabel("");
        JButton randomBtn = new JButton("Random 1-6");
        JLabel randomResult = new JLabel("");
        numeriPanel.add(new JLabel("Numero:"));
        numeriPanel.add(numeroField);
        numeriPanel.add(absBtn); numeriPanel.add(absResult);
        numeriPanel.add(sqrtBtn); numeriPanel.add(sqrtResult);
        numeriPanel.add(roundBtn); numeriPanel.add(roundResult);
        numeriPanel.add(randomBtn); numeriPanel.add(randomResult);
        absBtn.addActionListener(e -> {
            try { int n = Integer.parseInt(numeroField.getText()); absResult.setText(String.valueOf(Math.abs(n))); }
            catch(NumberFormatException ex) { absResult.setText("Errore"); }
        });
        sqrtBtn.addActionListener(e -> {
            try { double n = Double.parseDouble(numeroField.getText()); sqrtResult.setText(String.valueOf(Math.sqrt(n))); }
            catch(NumberFormatException ex) { sqrtResult.setText("Errore"); }
        });
        roundBtn.addActionListener(e -> {
            try { double n = Double.parseDouble(numeroField.getText()); roundResult.setText(String.valueOf(Math.round(n))); }
            catch(NumberFormatException ex) { roundResult.setText("Errore"); }
        });
        randomBtn.addActionListener(e -> {
            int r = new Random().nextInt(6) + 1; randomResult.setText(String.valueOf(r));
        });
        tabbedPane.addTab("Numeri", numeriPanel);
        // ---------------- ARRAY ----------------
        JPanel arrayPanel = new JPanel(new BorderLayout());
        JTextArea arrayInput = new JTextArea(5, 30);
        JTextArea arrayOutput = new JTextArea(10, 30);
        arrayOutput.setEditable(false);
        JButton mediaBtn = new JButton("Media");
        JButton maxBtn = new JButton("Massimo");
        JButton pariBtn = new JButton("Conta Pari");
        JPanel arrayBtnPanel = new JPanel();
        arrayBtnPanel.add(mediaBtn); arrayBtnPanel.add(maxBtn); arrayBtnPanel.add(pariBtn);
        arrayPanel.add(new JLabel("Inserisci numeri separati da spazi:"), BorderLayout.NORTH);
        arrayPanel.add(new JScrollPane(arrayInput), BorderLayout.CENTER);
        arrayPanel.add(arrayBtnPanel, BorderLayout.SOUTH);
        arrayPanel.add(new JScrollPane(arrayOutput), BorderLayout.EAST);
        ActionListener arrayCalc = e -> {
            try {
                String[] nums = arrayInput.getText().trim().split("\\s+");
                int[] arr = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
                if(e.getSource() == mediaBtn) arrayOutput.setText("Media: " + Arrays.stream(arr).average().orElse(0));
                if(e.getSource() == maxBtn) arrayOutput.setText("Massimo: " + Arrays.stream(arr).max().orElse(0));
                if(e.getSource() == pariBtn) arrayOutput.setText("Elementi pari: " + Arrays.stream(arr).filter(n->n%2==0).count());
            } catch(Exception ex){ arrayOutput.setText("Errore!"); }
        };
        mediaBtn.addActionListener(arrayCalc);
        maxBtn.addActionListener(arrayCalc);
        pariBtn.addActionListener(arrayCalc);
        tabbedPane.addTab("Array", arrayPanel);
        // ---------------- STRINGHE ----------------
        JPanel stringhePanel = new JPanel(new GridLayout(0,2,5,5));
        JTextField stringInput = new JTextField();
        JButton concatBtn = new JButton("Concatena '!'");
        JButton trimBtn = new JButton("Trim");
        JLabel stringResult = new JLabel("");
        stringhePanel.add(new JLabel("Stringa:")); stringhePanel.add(stringInput);
        stringhePanel.add(concatBtn); stringhePanel.add(stringResult);
        stringhePanel.add(trimBtn); stringhePanel.add(new JLabel(""));
        concatBtn.addActionListener(e -> stringResult.setText(stringInput.getText()+"!"));
        trimBtn.addActionListener(e -> stringResult.setText(stringInput.getText().trim()));
        tabbedPane.addTab("Stringhe", stringhePanel);
        // ---------------- DATE ----------------
        JPanel datePanel = new JPanel(new GridLayout(0,2,5,5));
        JButton oggiBtn = new JButton("Data di oggi");
        JLabel oggiResult = new JLabel("");
        JButton natBtn = new JButton("Età da 2000-04-15");
        JLabel natResult = new JLabel("");
        datePanel.add(oggiBtn); datePanel.add(oggiResult);
        datePanel.add(natBtn); datePanel.add(natResult);
        oggiBtn.addActionListener(e -> oggiResult.setText(LocalDate.now().toString()));
        natBtn.addActionListener(e -> {
            LocalDate birth = LocalDate.of(2000,4,15);
            natResult.setText(String.valueOf(ChronoUnit.YEARS.between(birth, LocalDate.now())));
        });
        tabbedPane.addTab("Date", datePanel);
        // ---------------- ECCEZIONI ----------------
        JPanel excPanel = new JPanel(new GridLayout(0,2,5,5));
        JTextField divField1 = new JTextField();
        JTextField divField2 = new JTextField();
        JButton divBtn = new JButton("Dividi");
        JLabel divResult = new JLabel("");
        excPanel.add(new JLabel("Numero1:")); excPanel.add(divField1);
        excPanel.add(new JLabel("Numero2:")); excPanel.add(divField2);
        excPanel.add(divBtn); excPanel.add(divResult);
        divBtn.addActionListener(e -> {
            try{
                int n1 = Integer.parseInt(divField1.getText());
                int n2 = Integer.parseInt(divField2.getText());
                divResult.setText(String.valueOf(n1/n2));
            } catch(ArithmeticException ex){ divResult.setText("Errore: divisione per zero!"); }
            catch(NumberFormatException ex){ divResult.setText("Errore: inserisci numeri!"); }
        });
        tabbedPane.addTab("Eccezioni", excPanel);
        // ---------------- BANK ACCOUNT ----------------
        JPanel bankPanel = new JPanel(new GridLayout(0,2,5,5));
        JLabel saldoLabel = new JLabel("Saldo: 0");
        JTextField depositoField = new JTextField();
        JButton depositoBtn = new JButton("Deposita");
        JTextField prelievoField = new JTextField();
        JButton prelievoBtn = new JButton("Preleva");
        JTextField canoneField = new JTextField();
        JButton canoneBtn = new JButton("Paga Canone (%)");
        bankPanel.add(new JLabel("Deposito:")); bankPanel.add(depositoField);
        bankPanel.add(depositoBtn); bankPanel.add(new JLabel(""));
        bankPanel.add(new JLabel("Prelievo:")); bankPanel.add(prelievoField);
        bankPanel.add(prelievoBtn); bankPanel.add(saldoLabel);
        bankPanel.add(new JLabel("Canone annuo (%):")); bankPanel.add(canoneField);
        bankPanel.add(canoneBtn); bankPanel.add(new JLabel(""));
        depositoBtn.addActionListener(e -> {
            try{ int val = Integer.parseInt(depositoField.getText()); account.deposit(val); saldoLabel.setText("Saldo: "+account.getBalance()); }
            catch(NumberFormatException ex){ JOptionPane.showMessageDialog(bankPanel,"Inserisci un numero valido!"); }
        });
        prelievoBtn.addActionListener(e -> {
            try{ int val = Integer.parseInt(prelievoField.getText()); account.withdraw(val); saldoLabel.setText("Saldo: "+account.getBalance()); }
            catch(NumberFormatException ex){ JOptionPane.showMessageDialog(bankPanel,"Inserisci un numero valido!"); }
        });
        canoneBtn.addActionListener(e -> {
            try{
                double percent = Double.parseDouble(canoneField.getText());
                int canone = (int)(account.getBalance()*percent/100.0);
                account.withdraw(canone);
                saldoLabel.setText("Saldo: "+account.getBalance());
                JOptionPane.showMessageDialog(bankPanel,"Pagato canone: "+canone);
            } catch(NumberFormatException ex){ JOptionPane.showMessageDialog(bankPanel,"Inserisci una percentuale valida!"); }
        });
        tabbedPane.addTab("Bank Account", bankPanel);
        // ---------------- DIPENDENTE ----------------
        JPanel dipPanel = new JPanel(new GridLayout(0,2,5,5));
        JTextField oreField = new JTextField(); JTextField pagaField = new JTextField();
        JButton calcolaBtn = new JButton("Calcola Stipendio e Versa");
        JLabel risultatoLabel = new JLabel("");
        dipPanel.add(new JLabel("Ore Lavorate:")); dipPanel.add(oreField);
        dipPanel.add(new JLabel("Retribuzione oraria:")); dipPanel.add(pagaField);
        dipPanel.add(calcolaBtn); dipPanel.add(risultatoLabel);
        calcolaBtn.addActionListener(e -> {
            try{
                int ore = Integer.parseInt(oreField.getText());
                int paga = Integer.parseInt(pagaField.getText());
                int stipendio = ore*paga;
                risultatoLabel.setText("Stipendio: "+stipendio);
                account.deposit(stipendio);
                saldoLabel.setText("Saldo: "+account.getBalance());
                tabbedPane.setSelectedComponent(bankPanel);
            } catch(NumberFormatException ex){ risultatoLabel.setText("Errore input"); }
        });
        tabbedPane.addTab("Dipendente", dipPanel);
        // ---------------- PONG ----------------
        PongPanel pongPanel = new PongPanel();
        tabbedPane.addTab("Pong", pongPanel);
        getContentPane().add(tabbedPane);
        setVisible(true);
    }
    class PongPanel extends JPanel implements ActionListener, KeyListener {
        private int p1Y = 100, p2Y = 100; 
        private int ballX = 200, ballY = 150; 
        private int ballVelX = 2, ballVelY = 2;
        private int p1Score = 0, p2Score = 0;
        private final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = 60;
        private final int BALL_SIZE = 15;
        private Timer timer;
        public PongPanel() {
            setBackground(Color.BLACK);
            setFocusable(true);
            addKeyListener(this);
            timer = new Timer(10, this);
            timer.start();
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.WHITE);
            g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
            g.fillRect(20, p1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
            g.fillRect(getWidth()-30, p2Y, PADDLE_WIDTH, PADDLE_HEIGHT);
            g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString(String.valueOf(p1Score), getWidth()/2 - 50, 30);
            g.drawString(String.valueOf(p2Score), getWidth()/2 + 30, 30);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            ballX += ballVelX;
            ballY += ballVelY;
            if(ballY <= 0 || ballY >= getHeight()-BALL_SIZE) ballVelY *= -1;
            if(ballX <= 30 && ballY+BALL_SIZE >= p1Y && ballY <= p1Y+PADDLE_HEIGHT) {
                ballVelX *= -1;
            }
            if(ballX+BALL_SIZE >= getWidth()-30 && ballY+BALL_SIZE >= p2Y && ballY <= p2Y+PADDLE_HEIGHT) {
                ballVelX *= -1;
            }
            if(ballX < 0) { p2Score++; resetBall(); }
            if(ballX > getWidth()) { p1Score++; resetBall(); }
            repaint();
        }
        private void resetBall() {
            ballX = getWidth()/2 - BALL_SIZE/2;
            ballY = getHeight()/2 - BALL_SIZE/2;
            ballVelX *= -1;
        }
        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            if(code == KeyEvent.VK_W && p1Y > 0) p1Y -= 15;
            if(code == KeyEvent.VK_S && p1Y < getHeight()-PADDLE_HEIGHT) p1Y += 15;
            if(code == KeyEvent.VK_UP && p2Y > 0) p2Y -= 15;
            if(code == KeyEvent.VK_DOWN && p2Y < getHeight()-PADDLE_HEIGHT) p2Y += 15;
        }
        @Override public void keyReleased(KeyEvent e) {}
        @Override public void keyTyped(KeyEvent e) {}
    }
    private void toggleDarkMode() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            if (!darkMode) { 
                UIManager.put("control", new Color(40, 40, 40)); 
                UIManager.put("info", new Color(60, 60, 60)); 
                UIManager.put("nimbusBase", new Color(18, 30, 49)); 
                UIManager.put("nimbusLightBackground", new Color(40, 40, 40)); 
                UIManager.put("text", new Color(230, 230, 230)); 
                UIManager.put("TabbedPane.selected", new Color(60, 60, 60));
                UIManager.put("TabbedPane.background", new Color(40, 40, 40));
                UIManager.put("TabbedPane.foreground", new Color(180, 180, 180));
                UIManager.put("TabbedPane.selectedForeground", new Color(255, 255, 255));
            } else { 
                UIManager.put("control", null);
                UIManager.put("info", null);
                UIManager.put("nimbusBase", null);
                UIManager.put("nimbusLightBackground", null);
                UIManager.put("text", null);
                UIManager.put("TabbedPane.selected", null);
                UIManager.put("TabbedPane.background", null);
                UIManager.put("TabbedPane.foreground", null);
                UIManager.put("TabbedPane.selectedForeground", null);
            } 
            SwingUtilities.updateComponentTreeUI(this); 
            darkMode = !darkMode; 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        } 
    }
    public static void main(String[] args) {
    	showSplashLogo();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.put("control", null);
            UIManager.put("info", null);
            UIManager.put("nimbusBase", null);
            UIManager.put("nimbusLightBackground", null);
            UIManager.put("text", null);
            UIManager.put("TabbedPane.selected", null);
            UIManager.put("TabbedPane.background", null);
            UIManager.put("TabbedPane.foreground", null);
            UIManager.put("TabbedPane.selectedForeground", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> new ProgrammaGUI());
    }
    private static void showSplashLogo() {
        JWindow splash = new JWindow();
        ImageIcon logo = new ImageIcon(ProgrammaGUI.class.getResource("/icon.png"));
        JLabel label = new JLabel(logo);
        splash.getContentPane().add(label);
        splash.pack();
        splash.setLocationRelativeTo(null);
        splash.setBackground(new Color(0, 0, 0, 0));
        splash.setVisible(true);
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        splash.setVisible(false);
        splash.dispose();
    }
    class BankAccount {
        private int balance = 0;
        public void deposit(int amount){ balance+=amount; }
        public void withdraw(int amount){ balance-=amount; }
        public int getBalance(){ return balance; }
    }
}