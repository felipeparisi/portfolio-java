package portfolio;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

public class TelaIMC extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIMC frame = new TelaIMC();
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
	public TelaIMC() {
		setResizable(false);
		setTitle("C\u00E1lculo do IMC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIMC.class.getResource("/img/calculadora 32.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 462, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc85.png")));
		lblStatus.setBounds(10, 0, 213, 425);
		contentPane.add(lblStatus);

		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(266, 33, 77, 20);
		contentPane.add(lblNewLabel_1);

		txtPeso = new JTextField();
		txtPeso.setBounds(243, 64, 126, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(276, 95, 55, 25);
		contentPane.add(lblNewLabel_2);

		txtAltura = new JTextField();
		txtAltura.setBounds(243, 131, 126, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("C\u00E1lcular IMC");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/balan\u00E7a 64.png")));
		btnCalcular.setBounds(232, 279, 64, 64);
		contentPane.add(btnCalcular);

		JButton btnApagar = new JButton("");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnApagar.setToolTipText("Limpar C\u00E1lculo");
		btnApagar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApagar.setContentAreaFilled(false);
		btnApagar.setBorderPainted(false);
		btnApagar.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/borracha 64.png")));
		btnApagar.setBounds(329, 279, 64, 64);
		contentPane.add(btnApagar);

		JLabel lblNewLabel_3 = new JLabel("Seu IMC  \u00E9:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(243, 198, 126, 20);
		contentPane.add(lblNewLabel_3);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(243, 224, 126, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		// Uso da biblioteca Atxy2k
		RestrictedTextField validar = new RestrictedTextField(txtPeso, "0123456789.");
		validar.setLimit(4);

		RestrictedTextField validar2 = new RestrictedTextField(txtAltura, "0123456789.");
		validar2.setLimit(4);

	} // Fim do construtor
		// lblStatus.setIcon(new
		// ImageIcon(Combustivel.class.getResource("/img/icone.png"))); MUDAR IMAGEM

	/**
	 * M�todo para c�lcular o IMC
	 * 
	 */
	void calcular() {
		// validar
		if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Peso!");
			txtPeso.requestFocus();
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Altura!");
			txtAltura.requestFocus();
		} else {
			// L�gica Principal
			// vari�veis
			double peso, altura, imc;

			// Formatador de casas decimais
			DecimalFormat formatador = new DecimalFormat("#0.00");

			// Entrada
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());

			// Processamento
			imc = peso / (altura * altura);

			// Saida
			txtResultado.setText(String.valueOf(formatador.format(imc)));
			// STATUS
			if (imc < 17) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc1.png")));
			} else if (imc < 18.5) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc2.png")));
			} else if (imc < 25) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc3.png")));
			} else if (imc < 30) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc4.png")));
			} else if (imc < 35) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc5.png")));
			} else if (imc < 40) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc6.png")));
			} else {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc7.png")));
			}

		}

	}

	/**
	 * M�todo usado para limpar os campos
	 * 
	 */
	void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtResultado.setText(null);
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc.png")));
		txtPeso.requestFocus();
	}

}// Fim do c�digo.
