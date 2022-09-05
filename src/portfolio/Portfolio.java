package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.SwingConstants;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portfolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// Eveto ativar a janela
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
				lblStatus.setText(formatador.format(data));
			}
		});
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setBounds(100, 100, 434, 483);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("C\u00E1lculo do IMC");
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/imc.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formul�rio IMC
			TelaIMC imc = new TelaIMC();
			imc.setVisible(true);
			}
		});
		btnNewButton.setBounds(96, 26, 64, 64);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setToolTipText("Sobre o APP");
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/pc64.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no bot�o
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(344, 328, 64, 64);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Calculadora da M\u00E9dia ");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);

			}
		});
		btnNewButton_2.setBounds(10, 26, 64, 64);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setToolTipText("Convers\u00E3o da temperatura");
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/temperatura.png")));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura temperatura = new ConversaoTemperatura();
				temperatura.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(183, 26, 64, 64);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setToolTipText("C\u00E1lculo da Porcentagem ");
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/porcentagem.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoDaPorcentagem porcentagem = new CalculoDaPorcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.setBounds(271, 26, 64, 64);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setToolTipText("C\u00E1lculo do Combustivel");
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/combustivel64.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(96, 121, 64, 64);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/iconEleitor64.png")));
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setToolTipText("Eleitor");
		btnNewButton_6.setBounds(183, 121, 64, 64);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				dado.setVisible(true);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/iconDado64.png")));
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setToolTipText("Jogo do dado");
		btnNewButton_7.setBounds(271, 121, 64, 64);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setToolTipText("Calculadora de servi\u00E7o");
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/img/iconCalculadoraDeServi\u00E7o64.png")));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppSevico servico = new AppSevico();
				servico.setVisible(true);

			}
		});
		btnNewButton_8.setBounds(10, 121, 64, 64);
		contentPane.add(btnNewButton_8);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 403, 428, 41);
		contentPane.add(panel);
		panel.setLayout(null);

		lblStatus = new JLabel("New label");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(33, 0, 317, 42);
		panel.add(lblStatus);
		lblStatus.setForeground(SystemColor.text);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnJoKenPo = new JButton("");
		btnJoKenPo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJoKenPo.setContentAreaFilled(false);
		btnJoKenPo.setBorderPainted(false);
		btnJoKenPo.setIcon(new ImageIcon(Portfolio.class.getResource("/img/LogoJokenpo64.png")));
		btnJoKenPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaJogo jkp = new TelaJogo();
				jkp.setVisible(true);
			}
		});
		btnJoKenPo.setToolTipText("JoKenPo");
		btnJoKenPo.setBounds(96, 209, 64, 64);
		contentPane.add(btnJoKenPo);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setIcon(new ImageIcon(Portfolio.class.getResource("/img/Desafio64.png")));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio desafio = new Desafio ();
				desafio.setVisible(true);
			}
		});
		btnNewButton_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12.setToolTipText("Desafio");
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setBounds(96, 314, 64, 64);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setIcon(new ImageIcon(Portfolio.class.getResource("/img/senha64.png")));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Senha senha = new Senha();
				senha.setVisible(true);
			}
		});
		btnNewButton_13.setToolTipText("Gerador de Senha");
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_13.setBounds(271, 209, 64, 64);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setIcon(new ImageIcon(Portfolio.class.getResource("/img/tabuada64x64.png")));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnNewButton_10.setToolTipText("Tabuada");
		btnNewButton_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setBounds(10, 209, 64, 64);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/img/CARTA64.png")));
		btnNewButton_9.setToolTipText("Baralho");
		btnNewButton_9.setBounds(10, 314, 64, 64);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setIcon(new ImageIcon(Portfolio.class.getResource("/img/CEP64x64.png")));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CEP cep = new CEP();
				cep.setVisible(true);
			}
		});
		btnNewButton_11.setToolTipText("CEP");
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_11.setBounds(183, 209, 64, 64);
		contentPane.add(btnNewButton_11);
	}// fim do construtor
}
