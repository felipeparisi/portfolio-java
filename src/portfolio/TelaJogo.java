package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaJogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnPedra;
	private JRadioButton rdbtnPapel;
	private JRadioButton rdbtnTesoura;
	private JLabel lblPC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
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
	public TelaJogo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaJogo.class.getResource("/img/jokenpo32.png")));
		setTitle("JoKenPo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 603);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pedra.png")));
		lblNewLabel.setBounds(23, 173, 64, 64);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/papel.png")));
		lblNewLabel_1.setBounds(125, 173, 64, 64);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/tesoura.png")));
		lblNewLabel_2.setBounds(219, 173, 64, 64);
		contentPane.add(lblNewLabel_2);

		lblPC = new JLabel("");
		lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcfoda.png")));
		lblPC.setBounds(77, 385, 171, 139);
		contentPane.add(lblPC);

		rdbtnPedra = new JRadioButton("");
		buttonGroup.add(rdbtnPedra);
		rdbtnPedra.setBackground(Color.WHITE);
		rdbtnPedra.setBounds(46, 264, 30, 23);
		contentPane.add(rdbtnPedra);

		rdbtnPapel = new JRadioButton("");
		buttonGroup.add(rdbtnPapel);
		rdbtnPapel.setBackground(Color.WHITE);
		rdbtnPapel.setBounds(147, 264, 30, 23);
		contentPane.add(rdbtnPapel);

		rdbtnTesoura = new JRadioButton("");
		buttonGroup.add(rdbtnTesoura);
		rdbtnTesoura.setBackground(Color.WHITE);
		rdbtnTesoura.setBounds(241, 264, 30, 23);
		contentPane.add(rdbtnTesoura);

		JButton btnPOW = new JButton("POW");
		btnPOW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pow();
			}
		});
		btnPOW.setBounds(111, 332, 89, 23);
		contentPane.add(btnPOW);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/jokenpo22.PNG")));
		lblNewLabel_3.setBounds(0, 0, 317, 141);
		contentPane.add(lblNewLabel_3);
	}// fim do construtor

	void pow() {
		// valida��o (aten��o ao uso do NOT)
		if (!rdbtnPedra.isSelected() && !rdbtnPapel.isSelected() && !rdbtnTesoura.isSelected()) {
			JOptionPane.showMessageDialog(null, "Escolha uma opção");
		} else {
			// l�gica principal
			Random random = new Random();
			int pc = random.nextInt(3);
			// Dica para verificar o n�mero sorteado
			// System.out.println(pc);
			// Associar o n�mero sorteado a imagem
			switch (pc) {
			case 0:
				lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpedra.png")));
				break;
			case 1:
				lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpapel.png")));
				break;
			case 2:
				lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pctesoura.png")));
				break;
			}
			// Compara��es para determinar o vencedor ou empate
			if ((rdbtnPedra.isSelected() && pc == 0) || (rdbtnPapel.isSelected() && pc == 1)	|| (rdbtnTesoura.isSelected() && pc == 2)) {
				JOptionPane.showMessageDialog(null, "EMPATE");
			} else if ((rdbtnPedra.isSelected() && pc == 2) || (rdbtnPapel.isSelected() && pc == 0) || (rdbtnTesoura.isSelected() && pc == 1)) {
				JOptionPane.showMessageDialog(null, "Jogador VENCEU");
			} else {
				JOptionPane.showMessageDialog(null, "PC VENCEU");
			}
			// Limpar os campos
			lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcfoda.png")));
			buttonGroup.clearSelection();
		}
	}
}// fim do c�digo

