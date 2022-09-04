package portfolio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class CEP extends JDialog {
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;
	@SuppressWarnings("rawtypes")
	private JComboBox cboUf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CEP dialog = new CEP();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CEP() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CEP.class.getResource("/img/CEP64x64.png")));
		setTitle("CEP");
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		setBounds(100, 100, 511, 308);
		getContentPane().setLayout(null);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCep.setBounds(26, 41, 37, 13);
		getContentPane().add(lblCep);

		txtCep = new JTextField();
		txtCep.setBounds(107, 39, 96, 19);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);

		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEndereco.setBounds(26, 75, 108, 13);
		getContentPane().add(lblEndereco);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(108, 73, 369, 19);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBairro.setBounds(26, 120, 72, 13);
		getContentPane().add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setBounds(108, 118, 369, 19);
		getContentPane().add(txtBairro);
		txtBairro.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCidade.setBounds(26, 171, 56, 13);
		getContentPane().add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setBounds(107, 169, 244, 19);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);

		JLabel lblUF = new JLabel("UF:");
		lblUF.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUF.setBounds(372, 171, 45, 13);
		getContentPane().add(lblUF);

		cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
						"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		cboUf.setBounds(430, 168, 47, 21);
		getContentPane().add(cboUf);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o Cep");
					txtCep.requestFocus();
				} else {
					// Buscar Cep
					buscarCep();
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBuscar.setBounds(237, 38, 85, 21);
		getContentPane().add(btnBuscar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnLimpar.setBounds(237, 222, 85, 21);
		getContentPane().add(btnLimpar);

		RestrictedTextField validar = new RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);

	}

	private void buscarCep() {
		String logradouro = "";
		String tipoLogradouro = "";
		String resultado = null;
		String cep = txtCep.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
			SAXReader xml = new SAXReader();
			Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
			Element element = it.next();
			if (element.getQualifiedName().equals("cidade")) {
				txtCidade.setText(element.getText());
			}
			if (element.getQualifiedName().equals("bairro")) {
				txtBairro.setText(element.getText());
			}
			if (element.getQualifiedName().equals("uf")) {
				cboUf.setSelectedItem(element.getText());
			}
			if (element.getQualifiedName().equals("tipo_logradouro")) {
				tipoLogradouro = element.getText();
			}
			if (element.getQualifiedName().equals("logradouro")) {
				logradouro = element.getText();
			}
			if (element.getQualifiedName().equals("resultado")) {
				resultado = element.getText();
				if (resultado.equals("1")) {

				} else {
					JOptionPane.showMessageDialog(null, "cep não encontrado");
				}
			}
			}
			// Setar o campo endereço
			txtEndereco.setText(tipoLogradouro + logradouro);
		} catch (Exception e) {
			System.out.println(e);
		}

	}void limpar(){
		txtCep.setText(null);
		txtEndereco.setText(null);
		txtCidade.setText(null);
		txtBairro.setText(null);
		cboUf.setSelectedItem(null);
	}
}
