package br.univel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroClientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtCep;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtTelefone;
	private JTextField txtCelular;
	private JButton btnSalvar;


	Cliente c = new Cliente();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClientes frame = new CadastroClientes();
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
	public CadastroClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("Id: ");
		lblId.setBounds(10, 11, 21, 14);
		contentPane.add(lblId);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 33, 49, 14);
		contentPane.add(lblNome);

		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 114, 49, 14);
		contentPane.add(lblEndereco);

		JLabel lblNumero = new JLabel("N\u00B0:");
		lblNumero.setBounds(365, 114, 21, 14);
		contentPane.add(lblNumero);

		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(10, 139, 69, 14);
		contentPane.add(lblComplemento);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(308, 86, 46, 14);
		contentPane.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(160, 86, 46, 14);
		contentPane.add(lblCidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 83, 46, 14);
		contentPane.add(lblEstado);

		JLabel lblCep = new JLabel("cep:");
		lblCep.setBounds(10, 58, 46, 14);
		contentPane.add(lblCep);

		JLabel lbltelefone = new JLabel("Telefone:");
		lbltelefone.setBounds(10, 164, 46, 14);
		contentPane.add(lbltelefone);

		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 189, 46, 14);
		contentPane.add(lblCelular);

		txtId = new JTextField();
		txtId.setBounds(69, 8, 86, 20);
		contentPane.add(txtId);
		txtNome = new JTextField();
		txtNome.setBounds(69, 30, 215, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(62, 111, 293, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtNumero = new JTextField();
		txtNumero.setBounds(383, 111, 69, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);

		txtComplemento = new JTextField();
		txtComplemento.setBounds(83, 136, 369, 20);
		contentPane.add(txtComplemento);
		txtComplemento.setColumns(10);

		txtCep = new JTextField();
		txtCep.setBounds(69, 55, 118, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		txtEstado = new JTextField();
		txtEstado.setBounds(52, 80, 98, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(200, 83, 98, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setBounds(344, 83, 108, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(62, 161, 118, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtCelular = new JTextField();
		txtCelular.setBounds(62, 189, 118, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);

		btnSalvar = new JButton("Salvar");

		btnSalvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				c.setId(Integer.parseInt(txtId.getText()));
//				c.setNome(txtNome.getText());
//				c.setCep(txtCep.getText());
//				c.setEstado(txtEstado.getText());
//				c.setCidade(txtCidade.getText());
//				c.setBairro(txtBairro.getText());
//				c.setEndereco(txtEndereco.getText());
//				c.setNumero(Integer.parseInt(txtNumero.getText()));
//				c.setComplemento(txtComplemento.getText());
//				c.setTelefone(txtTelefone.getText());
//				c.setCelular(txtCelular.getText());

				


				JOptionPane.showMessageDialog(null, c.getId());

			}
		});
		btnSalvar.setBounds(344, 185, 91, 23);
		contentPane.add(btnSalvar);
	}

}