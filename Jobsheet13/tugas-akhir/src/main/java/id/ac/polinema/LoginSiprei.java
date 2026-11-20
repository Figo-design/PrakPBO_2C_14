package id.ac.polinema;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import java.awt.Font;

public class LoginSiprei {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        frame.setTitle("Login - Griya Sprei");
        frame.setLocationRelativeTo(null); //di tengah layar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null); //null untuk set posisi manual

        // Judul toko
        JLabel lblJudul = new JLabel("Griya Sprei");
        lblJudul.setFont(new Font("SansSerif", Font.BOLD, 22));
        lblJudul.setBounds(30, 20, 320, 30);
        frame.add(lblJudul);

        JLabel lblSub = new JLabel("Homemade Pillow, Bolster, Sprei, Bedcover, Etc.");
        lblSub.setBounds(30, 50, 320, 20);
        frame.add(lblSub);

        // Label Email
        JLabel lblEmail = new JLabel("Email *");
        lblEmail.setFont(new Font("SansSerif", Font.BOLD, 13));
        lblEmail.setBounds(30, 90, 320, 25);
        frame.add(lblEmail);

        // Input Email
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(30, 115, 320, 30);
        frame.add(txtEmail);

        // Petunjuk di bawah Email
        JLabel lblHint = new JLabel("Masukkan alamat email yang valid");
        lblHint.setFont(new Font("SansSerif", Font.PLAIN, 11));
        lblHint.setBounds(30, 147, 320, 18);
        frame.add(lblHint);

        // Label Kata Sandi
        JLabel lblSandi = new JLabel("Kata Sandi *");
        lblSandi.setFont(new Font("SansSerif", Font.BOLD, 13));
        lblSandi.setBounds(30, 175, 320, 25);
        frame.add(lblSandi);

        // Input Kata Sandi
        JPasswordField txtSandi = new JPasswordField();
        txtSandi.setBounds(30, 200, 250, 30);
        frame.add(txtSandi);

        // Tombol lihat/sembunyikan kata sandi
        JButton btnLihat = new JButton("Lihat");
        btnLihat.setBounds(285, 200, 65, 30);
        frame.add(btnLihat);

        // Checkbox Ingat saya
        JCheckBox chkIngat = new JCheckBox("Ingat saya");
        chkIngat.setBounds(26, 240, 200, 25);
        frame.add(chkIngat);

        // Tombol Masuk
        JButton btnMasuk = new JButton("Masuk ke Akun");
        btnMasuk.setBounds(30, 285, 320, 38);
        frame.add(btnMasuk);

        // Enter = klik tombol Masuk
        frame.getRootPane().setDefaultButton(btnMasuk);

        // EVENT LIHAT KATA SANDI
        char echoAsli = txtSandi.getEchoChar();
        btnLihat.addActionListener(e -> {
            if (txtSandi.getEchoChar() == echoAsli) {
                txtSandi.setEchoChar((char) 0); //tampilkan
                btnLihat.setText("Tutup");
            } else {
                txtSandi.setEchoChar(echoAsli); //sembunyikan
                btnLihat.setText("Lihat");
            }
        });

        // EVENT MASUK
        btnMasuk.addActionListener(e -> {
            String email = txtEmail.getText().trim();
            String sandi = new String(txtSandi.getPassword());

            if (email.isEmpty() || sandi.isEmpty()) { //validator sederhana
                JOptionPane.showMessageDialog(
                    frame, "Email dan Kata Sandi harus diisi!"
                );
                return;
            }

            if (!email.contains("@") || !email.contains(".")) { //validator sederhana
                JOptionPane.showMessageDialog(
                    frame, "Masukkan alamat email yang valid!"
                );
                return;
            }

            // TODO: cek email dan kata sandi ke database (PreparedStatement)
            JOptionPane.showMessageDialog(
                frame,
                "Login berhasil: " + email,
                "Info",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        frame.setVisible(true);
    }
}