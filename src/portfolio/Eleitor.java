package portfolio;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Eleitor extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Eleitor dialog = new Eleitor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Create the dialog.
	 */
	public Eleitor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eleitor.class.getResource("/img/iconEleitor48.png")));
		setTitle("ELEITOR");
		setBounds(100, 100, 248, 201);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblIdade = new JLabel("Idade: ");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdade.setBounds(22, 51, 63, 14);
		contentPanel.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(105, 50, 86, 20);
		contentPanel.add(txtIdade);
		txtIdade.setColumns(10);
		
		JButton btnVerificar = new JButton("Verifica");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar();
			}
		});
		btnVerificar.setBounds(10, 97, 89, 23);
		contentPanel.add(btnVerificar);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setBounds(106, 98, 85, 21);
		contentPanel.add(btnNewButton);
		RestrictedTextField validar = new RestrictedTextField(txtIdade, "0123456789");
		validar.setLimit(3);
	}// Fim do construtor
	void verificar() {
		if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Idade!");
			txtIdade.requestFocus();
		} else {int idade;
		idade = Integer.parseInt(txtIdade.getText());
		if (idade< 16) {
			JOptionPane.showMessageDialog(null, "Proibido Votar");
		}else if (idade > 17&& idade < 71) {
			JOptionPane.showMessageDialog(null, "Obrigat�rio votar");
		}else {
			JOptionPane.showMessageDialog(null, "Voto facultativo");
		}
	}}
		
	void limpar() {
		txtIdade.setText(null);
	}
}
