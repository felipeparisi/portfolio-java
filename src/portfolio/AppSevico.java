package portfolio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

public class AppSevico extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtRemuneracao;
	private JTextField txtCusto;
	private JTextField txtCarga;
	private JTextField txtValor;
	private JTextField txtEstimativa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AppSevico dialog = new AppSevico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AppSevico() {
		setTitle("Cálculo da Hora de Serviço");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppSevico.class.getResource("/img/iconCalculadoraDeServiço48.png")));
		setBounds(100, 100, 316, 432);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remunera\u00E7\u00E3o :");
		lblNewLabel.setBounds(31, 25, 89, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblCusto = new JLabel("Custo Operacional: ");
		lblCusto.setBounds(31, 61, 114, 14);
		contentPanel.add(lblCusto);
		
		JLabel lblCarga = new JLabel("Carga Hor\u00E1ria Mensal :");
		lblCarga.setBounds(31, 98, 114, 14);
		contentPanel.add(lblCarga);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularHora();
			}
		});
		btnNewButton.setBounds(98, 142, 89, 23);
		contentPanel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Valor da Hora de Servi\u00E7o :");
		lblNewLabel_3.setBounds(31, 190, 134, 14);
		contentPanel.add(lblNewLabel_3);
		
		txtRemuneracao = new JTextField();
		txtRemuneracao.setBounds(130, 22, 139, 20);
		contentPanel.add(txtRemuneracao);
		txtRemuneracao.setColumns(10);
		
		txtCusto = new JTextField();
		txtCusto.setBounds(155, 58, 114, 20);
		contentPanel.add(txtCusto);
		txtCusto.setColumns(10);
		
		txtCarga = new JTextField();
		txtCarga.setBounds(165, 95, 104, 20);
		contentPanel.add(txtCarga);
		txtCarga.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setEditable(false);
		txtValor.setBounds(180, 187, 89, 20);
		contentPanel.add(txtValor);
		txtValor.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 215, 280, 4);
		contentPanel.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("Estimativas de Horas do Servi\u00E7o :");
		lblNewLabel_4.setBounds(10, 253, 163, 14);
		contentPanel.add(lblNewLabel_4);
		
		txtEstimativa = new JTextField();
		txtEstimativa.setBounds(183, 250, 86, 20);
		contentPanel.add(txtEstimativa);
		txtEstimativa.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularServico();
			}
		});
		btnNewButton_1.setBounds(98, 291, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				
			}
		});
		btnLimpar.setBounds(98, 349, 85, 21);
		contentPanel.add(btnLimpar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 324, 280, 4);
		contentPanel.add(panel_1);
		
		RestrictedTextField validar = new RestrictedTextField(txtEstimativa, "0123456789");
		validar.setLimit(5);
		
		RestrictedTextField validar2 = new RestrictedTextField(txtValor, "0123456789");
		validar2.setLimit(5);
		
		RestrictedTextField validar3 = new RestrictedTextField(txtCarga, "0123456789");
		validar3.setLimit(5);
		
		RestrictedTextField validar4 = new RestrictedTextField(txtCusto, "0123456789");
		validar4.setLimit(5);
		
		RestrictedTextField validar5 = new RestrictedTextField(txtRemuneracao, "0123456789");
		validar5.setLimit(5);
		
	}
	double hora;
	
	void calcularHora() {
		if (txtRemuneracao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Remuneração!");
			txtRemuneracao.requestFocus();
		} else if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Custo!");
			txtCusto.requestFocus();
		}else if (txtCarga.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Carga Horária!");
			txtCarga.requestFocus();
		}  else {//Vari�veis
			double remuneracao, custo, cargaHoraria;
			remuneracao = Double.parseDouble(txtRemuneracao.getText());
			custo = Double.parseDouble(txtCusto.getText());
			cargaHoraria = Double.parseDouble(txtCarga.getText());
			hora = ( remuneracao + 0.3 * remuneracao + custo + 0.2 * remuneracao) / cargaHoraria;
			txtValor.setText(String.valueOf(hora));}
		
		
	}
	//metodo usado para calcular o valor do servi�o
	void calcularServico() {
		if (txtEstimativa.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a estimativa!");
			txtEstimativa.requestFocus();
		} else {		
			double tempoEstimado, valor;
		
		tempoEstimado = Double.parseDouble(txtEstimativa.getText());
		valor = tempoEstimado * hora;
		JOptionPane.showMessageDialog(null, "Valoe do Servião: " + valor, "Relatório", JOptionPane.DEFAULT_OPTION);
	}

	}
	void limpar () {
		txtEstimativa.setText(null);
		txtValor.setText(null);
		txtCarga.setText(null);
		txtCusto.setText(null);
		txtRemuneracao.setText(null);
	}
}
