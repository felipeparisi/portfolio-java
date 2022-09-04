 package portfolio;
import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Desafio extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JPanel panel_26;
	private JPanel panel_27;
	private JLabel lblNewLabel;
	private JButton btnSortear;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Desafio dialog = new Desafio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Desafio() {
		setTitle("Copa do Brasil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Desafio.class.getResource("/img/Desafio48.png")));
		setBounds(100, 100, 531, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(10, 52, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(10, 96, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(10, 127, 86, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(10, 184, 86, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(10, 215, 86, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(10, 273, 86, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(10, 304, 86, 20);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(152, 291, 86, 20);
		contentPanel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(152, 201, 86, 20);
		contentPanel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(152, 112, 86, 20);
		contentPanel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(152, 23, 86, 20);
		contentPanel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(300, 67, 86, 20);
		contentPanel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(300, 250, 86, 20);
		contentPanel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBounds(426, 156, 86, 20);
		contentPanel.add(textField_14);
		textField_14.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(116, 11, 4, 51);
		contentPanel.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(106, 11, 14, 4);
		contentPanel.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(106, 58, 14, 4);
		contentPanel.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.textHighlight);
		panel_3.setBounds(116, 34, 14, 4);
		contentPanel.add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.textHighlight);
		panel_4.setBounds(106, 143, 14, 4);
		contentPanel.add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.textHighlight);
		panel_5.setBounds(116, 96, 4, 51);
		contentPanel.add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.textHighlight);
		panel_6.setBounds(116, 119, 14, 4);
		contentPanel.add(panel_6);
		
		panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.textHighlight);
		panel_7.setBounds(106, 96, 14, 4);
		contentPanel.add(panel_7);
		
		panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.textHighlight);
		panel_8.setBounds(106, 231, 14, 4);
		contentPanel.add(panel_8);
		
		panel_9 = new JPanel();
		panel_9.setBackground(SystemColor.textHighlight);
		panel_9.setBounds(116, 184, 4, 51);
		contentPanel.add(panel_9);
		
		panel_10 = new JPanel();
		panel_10.setBackground(SystemColor.textHighlight);
		panel_10.setBounds(116, 207, 14, 4);
		contentPanel.add(panel_10);
		
		panel_11 = new JPanel();
		panel_11.setBackground(SystemColor.textHighlight);
		panel_11.setBounds(106, 184, 14, 4);
		contentPanel.add(panel_11);
		
		panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.textHighlight);
		panel_12.setBounds(106, 320, 14, 4);
		contentPanel.add(panel_12);
		
		panel_13 = new JPanel();
		panel_13.setBackground(SystemColor.textHighlight);
		panel_13.setBounds(116, 273, 4, 51);
		contentPanel.add(panel_13);
		
		panel_14 = new JPanel();
		panel_14.setBackground(SystemColor.textHighlight);
		panel_14.setBounds(116, 296, 14, 4);
		contentPanel.add(panel_14);
		
		panel_15 = new JPanel();
		panel_15.setBackground(SystemColor.textHighlight);
		panel_15.setBounds(106, 273, 14, 4);
		contentPanel.add(panel_15);
		
		panel_16 = new JPanel();
		panel_16.setBackground(SystemColor.textHighlight);
		panel_16.setBounds(269, 23, 4, 109);
		contentPanel.add(panel_16);
		
		panel_17 = new JPanel();
		panel_17.setBackground(SystemColor.textHighlight);
		panel_17.setBounds(259, 128, 14, 4);
		contentPanel.add(panel_17);
		
		panel_18 = new JPanel();
		panel_18.setBackground(SystemColor.textHighlight);
		panel_18.setBounds(259, 23, 14, 4);
		contentPanel.add(panel_18);
		
		panel_19 = new JPanel();
		panel_19.setBackground(SystemColor.textHighlight);
		panel_19.setBounds(269, 77, 14, 4);
		contentPanel.add(panel_19);
		
		panel_20 = new JPanel();
		panel_20.setBackground(SystemColor.textHighlight);
		panel_20.setBounds(258, 255, 14, 4);
		contentPanel.add(panel_20);
		
		panel_21 = new JPanel();
		panel_21.setBackground(SystemColor.textHighlight);
		panel_21.setBounds(248, 306, 14, 4);
		contentPanel.add(panel_21);
		
		panel_22 = new JPanel();
		panel_22.setBackground(SystemColor.textHighlight);
		panel_22.setBounds(258, 201, 4, 109);
		contentPanel.add(panel_22);
		
		panel_23 = new JPanel();
		panel_23.setBackground(SystemColor.textHighlight);
		panel_23.setBounds(248, 201, 14, 4);
		contentPanel.add(panel_23);
		
		panel_24 = new JPanel();
		panel_24.setBackground(SystemColor.textHighlight);
		panel_24.setBounds(402, 67, 4, 203);
		contentPanel.add(panel_24);
		
		panel_25 = new JPanel();
		panel_25.setBackground(SystemColor.textHighlight);
		panel_25.setBounds(392, 266, 14, 4);
		contentPanel.add(panel_25);
		
		panel_26 = new JPanel();
		panel_26.setBackground(SystemColor.textHighlight);
		panel_26.setBounds(392, 68, 14, 4);
		contentPanel.add(panel_26);
		
		panel_27 = new JPanel();
		panel_27.setBackground(SystemColor.textHighlight);
		panel_27.setBounds(402, 168, 14, 4);
		contentPanel.add(panel_27);
		
		lblNewLabel = new JLabel("Copa do Brasil ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(77, 382, 377, 29);
		contentPanel.add(lblNewLabel);
		
		btnSortear = new JButton("Sortear");
		btnSortear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sorteio();
			}
		});
		btnSortear.setToolTipText("Sortear");
		btnSortear.setBounds(129, 341, 89, 23);
		contentPanel.add(btnSortear);
		
		btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setBounds(259, 341, 89, 23);
		contentPanel.add(btnNewButton);
	}
	void sorteio () {
		String[] chave1 = {"Corinthians", "Guarani", "Bahia"};	
		String[] chave2 = {"Palmeiras", "Guarani", "Sport"};
		String[] chave3 = {"S�o Paulo", "gremio", "Internacional"};
		String[] chave4 = {"Santos", "Atletico PR", "Atletico MG"};
		String[] chave5 = {"Avai", "Nautico", "America MG"};
		String[] chave6 = {"RB Bragantino", "Br de Pelotas", "Ituano"};
		String[] chave7 = {"Luverdense", "Cruzeiro", "Vasco"};
		String[] chave8 = {"Chapecoense", "Flamengo", "Bota Fogo"};
		Random sorteio = new Random();
		int indiceChave1 = sorteio.nextInt(chave1.length);
		int indiceChave2 = sorteio.nextInt(chave2.length);
		int indiceChave3 = sorteio.nextInt(chave3.length);
		int indiceChave4 = sorteio.nextInt(chave4.length);
		int indiceChave5 = sorteio.nextInt(chave5.length);
		int indiceChave6 = sorteio.nextInt(chave6.length);
		int indiceChave7 = sorteio.nextInt(chave7.length);
		int indiceChave8 = sorteio.nextInt(chave8.length);
		
		textField.setText(chave1[indiceChave1]);
		textField_1.setText(chave6[indiceChave6]);
		textField_2.setText(chave5[indiceChave5]);
		textField_3.setText(chave2[indiceChave2]);
		textField_4.setText(chave3[indiceChave3]);
		textField_5.setText(chave7[indiceChave7]);
		textField_6.setText(chave4[indiceChave4]);
		textField_7.setText(chave8[indiceChave8]);
		}
		void limpar() {
			textField.setText(null);
			textField_1.setText(null);
			textField_2.setText(null);
			textField_3.setText(null);
			textField_4.setText(null);
			textField_5.setText(null);
			textField_6.setText(null);
			textField_7.setText(null);
		}
		
}//Fim do c�digo
