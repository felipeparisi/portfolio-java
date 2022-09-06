package portfolio;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Senha extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Senha dialog = new Senha();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Senha() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Senha.class.getResource("/img/senha64.png")));
		setTitle("SENHA");
		setBounds(100, 100, 389, 216);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnGSenha = new JButton("Gerar Senha");
		btnGSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerarSenha();
			}
		});
		btnGSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGSenha.setBounds(41, 103, 110, 21);
		contentPanel.add(btnGSenha);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(195, 103, 121, 21);
		contentPanel.add(btnLimpar);

		JLabel lblNewLabel = new JLabel("Sua senha é:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(41, 61, 139, 13);
		contentPanel.add(lblNewLabel);

		txtSenha = new JTextField();
		txtSenha.setEditable(false);
		txtSenha.setBounds(162, 59, 154, 19);
		contentPanel.add(txtSenha);
		txtSenha.setColumns(10);
	}// FIM DI CONSTRUTOR

	void gerarSenha() {
		//PARAA TER OPÇÕES DE SORTEIO
		String[] caracter1 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] caracter5 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] caracter2 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] caracter6 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] caracter7 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] caracter3 = {"1","2","3","4","5","6","7","8","9","0"};
		String[] caracter8 = {"1","2","3","4","5","6","7","8","9","0"};
		String[] caracter4 = {"!","@","#","$","&",};
		//PARA REALIZAR O SORTEIO
		Random sorteio = new Random();
		int car1 = sorteio.nextInt(caracter1.length);
		int car2 = sorteio.nextInt(caracter2.length);
		int car3 = sorteio.nextInt(caracter3.length);
		int car4 = sorteio.nextInt(caracter4.length);
		int car5 = sorteio.nextInt(caracter5.length);
		int car6 = sorteio.nextInt(caracter6.length);
		int car7 = sorteio.nextInt(caracter7.length);
		int car8 = sorteio.nextInt(caracter8.length);
		
		
		
		txtSenha.setText(caracter1[car1] + caracter2[car2] + caracter6[car6] + caracter3[car3] + caracter4[car4] + caracter5[car5] + caracter7[car7] + caracter8[car8]);
		
	}
void limpar() {
	txtSenha.setText(null);
}
}// FIM DO CÓDIGO
