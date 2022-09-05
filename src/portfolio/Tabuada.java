package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class Tabuada extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTabuada;
	private JTextArea txtArea;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada dialog = new Tabuada();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Tabuada() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tabuada.class.getResource("/img/multiplication.png")));
		getContentPane().setBackground(Color.WHITE);
		setTitle("Tabuada");
		setModal(true);
		setBounds(100, 100, 321, 404);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tabuada ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 26, 64, 17);
		getContentPane().add(lblNewLabel);

		txtTabuada = new JTextField();
		txtTabuada.setBounds(113, 24, 86, 20);
		getContentPane().add(txtTabuada);
		txtTabuada.setColumns(10);

		btnCalcular = new JButton("");
		btnCalcular.setDefaultCapable(false);
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.setIcon(new ImageIcon(Tabuada.class.getResource("/img/checkgreen.png")));
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		btnCalcular.setBounds(61, 85, 64, 64);
		getContentPane().add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setBorderPainted(false);
		btnLimpar.setDefaultCapable(false);
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setIcon(new ImageIcon(Tabuada.class.getResource("/img/Borrachatab.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(186, 85, 64, 64);
		getContentPane().add(btnLimpar);

		txtArea = new JTextArea();
		txtArea.setBounds(10, 171, 278, 190);
		getContentPane().add(txtArea);
		
		RestrictedTextField validar = new RestrictedTextField(txtTabuada, "0123456789");
		validar.setLimit(4);

	}// fim do construtor

	void calcular() {
		// Valida��o
		if (txtTabuada.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha com o numero da Tabuada que Voce deseja saber!");
			txtTabuada.requestFocus();
		} else {
			// variaveis + entrada

			int valor = Integer.parseInt(txtTabuada.getText());

			// processamento + saida
			for (int i = 0; i < 11; i++) {
				txtArea.append(" " + String.valueOf(valor) + " x " + String.valueOf(i) + " = "
						+ String.valueOf(valor * i) + "\n");
				// DESABILITAR O BOT�O
				btnCalcular.setEnabled(false);
			}

		}

	}

	void limpar() {
		txtTabuada.setText(null);
		txtArea.setText(null);
// HABILITAR BOT�O
		btnCalcular.setEnabled(true);
	}
}// fim do codigo
