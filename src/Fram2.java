import javax.swing.*;
import java.awt.*;
public class Fram2 extends JFrame {
  JTextField namet2,rollnumt2,batcht2,sectiont2,gendert2,countryt2,addresst2,Qualift2;
    Fram2(){

        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        new JFrame("Information");
        setTitle("Information");
        setBounds(500, 100, 500, 550);

        // name print
        JLabel name = new JLabel("Name");
        name.setBounds(60, 0, 50, 100);
        add(name);

        namet2 = new JTextField();
        namet2.setBounds(150, 33, 200, 25);
        add(namet2);

        // rollnum print
        JLabel rollnum = new JLabel("Roll Number");
        rollnum.setBounds(60, 40, 50, 100);
        add(rollnum);

         rollnumt2 = new JTextField();
        rollnumt2.setBounds(150, 75, 200, 25);
        add(rollnumt2);

        // batch print
        JLabel batch = new JLabel("Batch");
        batch.setBounds(60, 80, 50, 100);
        add(batch);

         batcht2 = new JTextField();
        batcht2.setBounds(150, 115, 200, 25);
        add(batcht2);

        //section print
        JLabel section = new JLabel("Section");
        section.setBounds(60, 120, 50, 100);
        add(section);
        sectiont2 = new JTextField();
        sectiont2.setBounds(150, 155, 200, 25);
        add(sectiont2);

        //gender
        JLabel gender = new JLabel("Gender");
        gender.setBounds(60, 160, 50, 100);
        add(gender);

        gendert2 = new JTextField();
        gendert2.setBounds(150, 200, 200, 25);
        add(gendert2);

        //Qualification
        JLabel quali = new JLabel("Qualification");
        quali.setBounds(60, 200, 50, 100);
        add(quali);

 Qualift2 = new JTextField();
        Qualift2.setBounds(150, 240, 200, 25);
        add(Qualift2);

        // address
        JLabel address = new JLabel("Address");
        address.setBounds(60, 260, 50, 100);
        add(address);

        addresst2 = new JTextField();
        addresst2.setBounds(150, 300, 200, 25);
        add(addresst2);

        //country print
        JLabel country = new JLabel("Country");
        country.setBounds(60, 320, 50, 100);
        add(country);
         countryt2 = new JTextField();
        countryt2.setBounds(150, 355, 200, 25);
        add(countryt2);

        setVisible(true);
    }
    public static void main(String[] args) {

        new Fram2();
    }
}
