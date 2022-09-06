package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ConversaoTemperatura extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtF;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoTemperatura dialog = new ConversaoTemperatura();
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
	public ConversaoTemperatura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConversaoTemperatura.class.getResource("/img/temperatura48.png")));
		setTitle("Convers\u00E3o da temperatura");
		setBounds(100, 100, 449, 192);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fahrenheit:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(24, 32, 99, 14);
		getContentPane().add(lblNewLabel);
		
		txtF = new JTextField();
		txtF.setBounds(115, 31, 86, 20);
		getContentPane().add(txtF);
		txtF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(24, 87, 63, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(115, 86, 86, 20);
		getContentPane().add(txtC);
		txtC.setColumns(10);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				converter();
			}
		});
		btnNewButton.setBounds(244, 32, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(244, 86, 89, 21);
		getContentPane().add(btnNewButton_1);

		RestrictedTextField validar = new RestrictedTextField(txtF, "0123456789.");
		validar.setLimit(3);
		
	}// fim do construtor
	
	void converter() {
		if (txtF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Temperatura");
			txtF.requestFocus();
		
		} else {//variaveis
			double c,f;
			//entrada
			f = Double.parseDouble(txtF.getText());
			//Procesamento
			 c = (5 *(f - 32)) / 9;
			 c = Math.round(c * 100.0) / 100.0;
			// Saida 
			 // A linha a baixo exibe o conteudo da variavel C na caixa de texto (� necessario converter para String)
			txtC.setText(String.valueOf(c));}
		
	}
void limpar() {
	txtC.setText(null);
	txtF.setText(null);
}
}
