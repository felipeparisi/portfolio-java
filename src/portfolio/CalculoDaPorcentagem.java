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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class CalculoDaPorcentagem extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtVar1;
	private JTextField txtVar2;
	private JTextField txtResultado;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtCusto;
	private JLabel lblNewLabel_4;
	private JTextField txtLucro;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	private JTextField txtVenda;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtSub;
	private JLabel lblNewLabel_8;
	private JTextField txtDesconto;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_2;
	private JTextField txtTotal;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CalculoDaPorcentagem dialog = new CalculoDaPorcentagem();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CalculoDaPorcentagem() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoDaPorcentagem.class.getResource("/img/porcentagem48.png")));
		setTitle("Calculo da Porcentagem");
		setBounds(100, 100, 450, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Porcentagem de  ");
			lblNewLabel.setBounds(67, 41, 115, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txtVar1 = new JTextField();
			txtVar1.setBounds(10, 38, 47, 20);
			contentPanel.add(txtVar1);
			txtVar1.setColumns(10);
		}
		{
			txtVar2 = new JTextField();
			txtVar2.setBounds(174, 38, 47, 20);
			contentPanel.add(txtVar2);
			txtVar2.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Calcular");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcular();
				}
			});
			btnNewButton.setBounds(244, 37, 84, 23);
			contentPanel.add(btnNewButton);
		}
		{
			txtResultado = new JTextField();
			txtResultado.setBounds(338, 38, 86, 20);
			txtResultado.setEditable(false);
			contentPanel.add(txtResultado);
			txtResultado.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Calcular porcentagem:");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(120, 13, 164, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Custo e Venda:");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setBounds(133, 71, 131, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Custo:");
			lblNewLabel_3.setBounds(10, 124, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txtCusto = new JTextField();
			txtCusto.setBounds(50, 121, 46, 20);
			contentPanel.add(txtCusto);
			txtCusto.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Lucro:");
			lblNewLabel_4.setBounds(106, 124, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			txtLucro = new JTextField();
			txtLucro.setBounds(143, 121, 47, 20);
			contentPanel.add(txtLucro);
			txtLucro.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(200, 124, 26, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			btnNewButton_1 = new JButton("Venda");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcular2();
				}
			});
			btnNewButton_1.setBounds(223, 120, 75, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			txtVenda = new JTextField();
			txtVenda.setEditable(false);
			txtVenda.setBounds(319, 121, 105, 20);
			contentPanel.add(txtVenda);
			txtVenda.setColumns(10);
		}
		{
			lblNewLabel_6 = new JLabel("C\u00E1lculo de Desconto :");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_6.setBounds(120, 165, 164, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			lblNewLabel_7 = new JLabel("Sub total:");
			lblNewLabel_7.setBounds(10, 221, 68, 14);
			contentPanel.add(lblNewLabel_7);
		}
		{
			txtSub = new JTextField();
			txtSub.setBounds(74, 218, 47, 20);
			contentPanel.add(txtSub);
			txtSub.setColumns(10);
		}
		{
			lblNewLabel_8 = new JLabel("Desconto:");
			lblNewLabel_8.setBounds(131, 221, 59, 14);
			contentPanel.add(lblNewLabel_8);
		}
		{
			txtDesconto = new JTextField();
			txtDesconto.setBounds(195, 218, 46, 20);
			contentPanel.add(txtDesconto);
			txtDesconto.setColumns(10);
		}
		{
			lblNewLabel_9 = new JLabel("%");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(238, 221, 26, 14);
			contentPanel.add(lblNewLabel_9);
		}
		{
			btnNewButton_2 = new JButton("Total");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcular3();
				}
			});
			btnNewButton_2.setBounds(274, 217, 68, 23);
			contentPanel.add(btnNewButton_2);
		}
		{
			txtTotal = new JTextField();
			txtTotal.setEditable(false);
			txtTotal.setBounds(357, 218, 67, 20);
			contentPanel.add(txtTotal);
			txtTotal.setColumns(10);
		}
		{
			btnNewButton_3 = new JButton("Limpar");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					limpar();
				}
			});
			btnNewButton_3.setBounds(161, 254, 85, 21);
			contentPanel.add(btnNewButton_3);
		}
		
		RestrictedTextField validar = new RestrictedTextField(txtSub, "0123456789");
		validar.setLimit(5);
		RestrictedTextField validar1 = new RestrictedTextField(txtDesconto, "0123456789");
		validar1.setLimit(5);
		
		RestrictedTextField validar4 = new RestrictedTextField(txtLucro, "0123456789");
		validar4.setLimit(5);
		RestrictedTextField validar5 = new RestrictedTextField(txtCusto, "0123456789");
		validar5.setLimit(5);
		
		RestrictedTextField validar7 = new RestrictedTextField(txtVar1, "0123456789");
		validar7.setLimit(5);
		RestrictedTextField validar8 = new RestrictedTextField(txtVar2, "0123456789");
		validar8.setLimit(5);
		
		
		}// Fim do construtor 
	// metodo porcentagem
	void calcular() {
		
		if (txtVar1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a primeira porcentagem");
		}else if (txtVar2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o valor do produto");
		}else {
			//Variaveis 
			double var1,var2,resultado;
			// entrada
			var1 = Double.parseDouble(txtVar1.getText());
			var2 = Double.parseDouble(txtVar2.getText());
			//processamento
			resultado = (var1 * var2) /100;
			//saida 
			txtResultado.setText(String.valueOf(resultado));
		}
		
		}
	// metodo custo & lucro 
	void calcular2() {
		
		if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o custo do produto");
		}else if (txtLucro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Lucro desejado");
		}else {
			//Variaveis
			double custo,lucro,venda;
			//entrada
			custo = Double.parseDouble(txtCusto.getText());
			lucro = Double.parseDouble(txtLucro.getText());
			//Prcessamento
			venda = (custo * lucro ) / 100 + custo;
			//Saida
			txtVenda.setText(String.valueOf(venda));
		}
		
	}
	// metodo desconto
	void calcular3() {
		if (txtSub.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Sub-Total");
		}else if (txtDesconto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Desconto");
		}else {
			//Variaveis 
			double subTotal,desconto,total;
			//Entrada
			subTotal = Double.parseDouble(txtSub.getText());
			desconto = Double.parseDouble(txtDesconto.getText());
			//Processamento
			total = subTotal - (subTotal * desconto / 100 );
			//Saida
			txtTotal.setText(String.valueOf(total));
		}
		
	}
	void limpar() {
		txtSub.setText(null);
		txtDesconto.setText(null);
		txtTotal.setText(null);
		txtVenda.setText(null);
		txtLucro.setText(null);
		txtCusto.setText(null);
		txtResultado.setText(null);
		txtVar1.setText(null);
		txtVar2.setText(null);
	}
	
} // Fim
