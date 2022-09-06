package portfolio;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class Dado extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDado;
	private JLabel lblDado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dado dialog = new Dado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dado() {
		setTitle("Jogo do dAdo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dado.class.getResource("/img/Dado64.png")));
		setBounds(100, 100, 240, 296);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lancar();
				}
			});
			btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setVerifyInputWhenFocusTarget(false);
			btnNewButton.setToolTipText("Jogar Dado");
			btnNewButton.setIcon(new ImageIcon(Dado.class.getResource("/img/Dado64.png")));
			btnNewButton.setBounds(22, 11, 64, 64);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					limpar();
				}
			});
			btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton_1.setBorderPainted(false);
			btnNewButton_1.setContentAreaFilled(false);
			btnNewButton_1.setToolTipText("borracha");
			btnNewButton_1.setIcon(new ImageIcon(Dado.class.getResource("/img/borracha 64.png")));
			btnNewButton_1.setBounds(130, 11, 64, 64);
			contentPanel.add(btnNewButton_1);
		}
		
		lblDado = new JLabel("");
		lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/Dado64.png")));
		lblDado.setBounds(55, 86, 169, 108);
		contentPanel.add(lblDado);
		
		txtDado = new JTextField();
		txtDado.setEditable(false);
		txtDado.setBounds(55, 226, 86, 20);
		contentPanel.add(txtDado);
		txtDado.setColumns(10);
	}
	void lancar() {
		Random random = new Random();
		int face = random.nextInt(6)+1;
		switch (face) {
		case 1:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face1.png")));
			break;
		case 2:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face2.png")));
			break;
		case 3:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face3.png")));
			break;
		case 4:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face4.png")));
			break;
		case 5:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face5.png")));
			break;
		case 6:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face6.png")));
			break;
			
		}
	txtDado.setText(String.valueOf(face));
	}
	void limpar() {
		txtDado.setText(null);
		lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/Dado64.png")));
	}
	
}
