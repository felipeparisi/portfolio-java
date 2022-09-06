package portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.Toolkit;

public class Media extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtDisciplina;
	private JTextField txtNotaUm;
	private JTextField txtNotaDois;
	private JTextField txtNotaTres;
	private JTextField txtNotaQuatro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media dialog = new Media();
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
	public Media() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Media.class.getResource("/img/calculadora48.png")));
		setTitle("Calculo da M\u00E9dia");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(41, 34, 46, 14);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(80, 31, 298, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Disciplina");
		lblNewLabel_1.setBounds(41, 71, 74, 14);
		getContentPane().add(lblNewLabel_1);

		txtDisciplina = new JTextField();
		txtDisciplina.setBounds(102, 68, 276, 20);
		getContentPane().add(txtDisciplina);
		txtDisciplina.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Nota 1\u00BA B:");
		lblNewLabel_2.setBounds(41, 106, 61, 14);
		getContentPane().add(lblNewLabel_2);

		txtNotaUm = new JTextField();
		txtNotaUm.setBounds(112, 103, 86, 20);
		getContentPane().add(txtNotaUm);
		txtNotaUm.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Nota 2\u00BA B:");
		lblNewLabel_3.setBounds(222, 106, 60, 14);
		getContentPane().add(lblNewLabel_3);

		txtNotaDois = new JTextField();
		txtNotaDois.setBounds(292, 103, 86, 20);
		getContentPane().add(txtNotaDois);
		txtNotaDois.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Nota 3\u00BA B:");
		lblNewLabel_4.setBounds(41, 145, 61, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Nota 4\u00BA B:");
		lblNewLabel_5.setBounds(222, 145, 60, 14);
		getContentPane().add(lblNewLabel_5);

		txtNotaTres = new JTextField();
		txtNotaTres.setBounds(112, 142, 86, 20);
		getContentPane().add(txtNotaTres);
		txtNotaTres.setColumns(10);

		txtNotaQuatro = new JTextField();
		txtNotaQuatro.setBounds(292, 142, 86, 20);
		getContentPane().add(txtNotaQuatro);
		txtNotaQuatro.setColumns(10);

		JButton btnNewButton_1 = new JButton("Calcular ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton_1.setBounds(102, 195, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_2.setBounds(292, 196, 85, 21);
		getContentPane().add(btnNewButton_2);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(177, 206, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		RestrictedTextField validar = new RestrictedTextField(txtNome);
		validar.setLimit(25);
		validar.setOnlyText(true);
		validar.setAcceptSpace(true);
		RestrictedTextField validar1 = new RestrictedTextField(txtDisciplina);
		validar1.setLimit(25);
		validar1.setOnlyText(true);
		validar1.setAcceptSpace(true);
		RestrictedTextField validar2 = new RestrictedTextField(txtNotaUm, "0123456789");
		validar2.setLimit(2);
		RestrictedTextField validar3 = new RestrictedTextField(txtNotaDois, "0123456789");
		validar3.setLimit(2);
		RestrictedTextField validar4 = new RestrictedTextField(txtNotaTres, "0123456789");
		validar4.setLimit(2);	
		RestrictedTextField validar5 = new RestrictedTextField(txtNotaQuatro, "0123456789");
		validar5.setLimit(2);
		
	}

	void calcular() {
		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Nome!");
			txtNome.requestFocus();
		} else if (txtDisciplina.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Disciplina!");
			txtDisciplina.requestFocus();
		} else if (txtNotaUm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o A primeira nota!");
			txtNotaUm.requestFocus();
		} else if (txtNotaDois.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o A segunda nota!");
			txtNotaDois.requestFocus();
		} else if (txtNotaTres.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o A Terceira nota!");
			txtNotaTres.requestFocus();
		} else if (txtNotaQuatro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o A quarta nota!");
			txtNotaQuatro.requestFocus();
		} else {

			// Variaveis
			String nome, disciplina;
			double bi1, bi2, bi3, bi4, media;
			// entrada
			nome = txtNome.getText();
			disciplina = txtDisciplina.getText();
			bi1 = Double.parseDouble(txtNotaUm.getText());
			bi2 = Double.parseDouble(txtNotaDois.getText());
			bi3 = Double.parseDouble(txtNotaTres.getText());
			bi4 = Double.parseDouble(txtNotaQuatro.getText());
			// Procesamento
			media = (bi1 + bi2 + bi3 + bi4) / 4;
			// Saida
			JOptionPane.showMessageDialog(null,
					"Nome: " + nome + "\n" + "Disciplina: " + disciplina + "\n" + "Bi 1º: " + bi1 + "\n" + "Bi 2º: "
							+ bi2 + "\n" + "Bi 3º: " + bi3 + "\n" + "Bi 4º: " + bi4 + "\n" + "Média: " + media,
					"Media do Aluno", JOptionPane.DEFAULT_OPTION);
		}
	}
void limpar() {
	txtNotaQuatro.setText(null);
	txtNotaTres.setText(null);
	txtNotaDois.setText(null);
	txtNotaUm.setText(null);
	txtDisciplina.setText(null);
	txtNome.setText(null);
}
}
