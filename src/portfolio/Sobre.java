package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Cursor;

public class Sobre extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
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
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/pc.png")));
		setTitle("Sobre");
		setBounds(100, 100, 520, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Portifolipo desenvolvido durante as aulas de l\u00F3gica de programa\u00E7\u00E3o do Senac Tatuape");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 31, 506, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Criado pelo aluno: Felipe Parisi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(149, 56, 212, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("    @Felipe_UFP");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(194, 91, 129, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Felipe Parisi");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_5.setBounds(234, 116, 110, 14);
		getContentPane().add(lblNewLabel_5);
		
		JButton btnInstagram = new JButton("");
		btnInstagram.setToolTipText("Instagram");
		btnInstagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInstagram.setContentAreaFilled(false);
		btnInstagram.setBorderPainted(false);
		btnInstagram.setIcon(new ImageIcon(Sobre.class.getResource("/img/instagram 24.png")));
		btnInstagram.setBounds(191, 91, 24, 24);
		getContentPane().add(btnInstagram);
		
		JButton btnLink = new JButton("");
		btnLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLink.setToolTipText("Linkedln");
		btnLink.setBorderPainted(false);
		btnLink.setContentAreaFilled(false);
		btnLink.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkdin24.png")));
		btnLink.setBounds(191, 114, 24, 24);
		getContentPane().add(btnLink);
		
		JButton btnGithub = new JButton("");
		btnGithub.setToolTipText("GitHub");
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setContentAreaFilled(false);
		btnGithub.setBorderPainted(false);
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github24.png")));
		btnGithub.setBounds(191, 134, 24, 24);
		getContentPane().add(btnGithub);
		
		JLabel lblNewLabel_5_1 = new JLabel("felipeparisi");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_5_1.setBounds(234, 140, 110, 14);
		getContentPane().add(lblNewLabel_5_1);

	}
}
