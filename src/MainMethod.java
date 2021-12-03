import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMethod implements ActionListener {

    private JButton button_Zero;
    private JButton button_One;
    private JButton button_Two;
    private JButton button_Three;
    private JButton button_Four;
    private JButton button_Five;
    private JButton button_Six;
    private JButton button_Seven;
    private JButton button_Eight;
    private JButton button_Nine;
    private JButton button_Add;
    private JButton button_Subtract;
    private JButton button_Multiply;
    private JButton button_Divide;
    private JButton button_Clear;
    private JButton button_Squared;
    private JButton button_Cubed;
    private JButton button_Equals;
    private JButton button_Modolus;
    private JButton button_Period;
    private JButton button_Negative;
    private JButton button_Fraction;
    private JButton button_Percent;
    private JButton button_SquareRoot;
    private JButton button_Sin;
    private JButton button_Cos;
    private JButton button_Tan;
    private JButton button_Log;
    private JButton button_NaturalLog;
    private JButton button_ArcSin;
    private JButton button_ArcCos;
    private JButton button_ArcTan;
    private JButton button_BaseTen;
    private JButton button_AbsVal;
    private JButton button_SinH;
    private JButton button_CosH;
    private JButton button_TanH;
    private JButton button_Exit;
    private JFrame frame;
    private GridBagConstraints gbc;
    private GridBagLayout gbl;

    public double num_One = 0;
    public double num_Two = 0;
    private JTextArea textareaResult;
    private JTextField textfieldResult;
    private String operation = "";
    public double resultVal = 0;

    public MainMethod() {

        button_Clear = new JButton("C");
        button_Seven = new JButton("7");
        button_Eight = new JButton("8");
        button_Nine = new JButton("9");
        button_Multiply = new JButton("*");
        button_Divide = new JButton("÷");
        button_Squared = new JButton("x²");
        button_Four = new JButton("4");
        button_Five = new JButton("5");
        button_Six = new JButton("6");
        button_Add = new JButton("+");
        button_Subtract = new JButton("-");
        button_Cubed = new JButton("x³");
        button_One = new JButton("1");
        button_Two = new JButton("2");
        button_Three = new JButton("3");
        button_Equals = new JButton("=");
        button_Modolus = new JButton("mod");
        button_Zero = new JButton("0");
        button_Period = new JButton(".");
        button_Negative = new JButton("±");
        button_Fraction = new JButton("1/n");
        button_Percent = new JButton("%");
        button_SquareRoot = new JButton("√");
        button_Sin = new JButton("sin");
        button_Cos = new JButton("cos");
        button_Tan = new JButton("tan");
        button_Log = new JButton("log");
        button_NaturalLog = new JButton("ln");
        button_ArcSin = new JButton("asin");
        button_ArcCos = new JButton("acos");
        button_ArcTan = new JButton("atan");
        button_BaseTen = new JButton("10^n");
        button_AbsVal = new JButton("abs");
        button_SinH = new JButton("sinh");
        button_CosH = new JButton("cosh");
        button_TanH = new JButton("tanh");
        button_Exit = new JButton("EXIT");

        JFrame frame = new JFrame("CI - Calc");
        frame.setSize(600, 600);
        frame.getContentPane().setBackground(Color.GRAY);


        gbc = new GridBagConstraints();
        gbl = new GridBagLayout();
        frame.setLayout(gbl);
        gbc.fill = gbc.HORIZONTAL;
        textfieldResult = new JTextField(1);
        textfieldResult.setBackground(Color.GREEN);
        gbc.gridwidth = 10;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(textfieldResult, gbc);

        textareaResult = new JTextArea(2, 1);
        textareaResult.setBackground(Color.GREEN);
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(textareaResult, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 5;
        gbc.gridy = 2;
        frame.add(button_Clear, gbc);
        button_Clear.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(button_Seven, gbc);
        button_Seven.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(button_Eight, gbc);
        button_Eight.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 3;
        frame.add(button_Nine, gbc);
        button_Nine.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 3;
        frame.add(button_Multiply, gbc);
        button_Multiply.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 3;
        frame.add(button_Divide, gbc);
        button_Divide.addActionListener(this);
        gbc.gridx = 5;
        gbc.gridy = 3;
        frame.add(button_Squared, gbc);
        button_Squared.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(button_Four, gbc);
        button_Four.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 4;
        frame.add(button_Five, gbc);
        button_Five.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 4;
        frame.add(button_Six, gbc);
        button_Six.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 4;
        frame.add(button_Add, gbc);
        button_Add.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 4;
        frame.add(button_Subtract, gbc);
        button_Subtract.addActionListener(this);
        gbc.gridx = 5;
        gbc.gridy = 4;
        frame.add(button_Cubed, gbc);
        button_Cubed.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 6;
        frame.add(button_One, gbc);
        button_One.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 6;
        frame.add(button_Two, gbc);
        button_Two.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 6;
        frame.add(button_Three, gbc);
        button_Three.addActionListener(this);
        gbc.gridwidth = 2;
        gbc.gridx = 3;
        gbc.gridy = 6;
        frame.add(button_Equals, gbc);
        button_Equals.addActionListener(this);
        gbc.gridwidth = 1;
        gbc.gridx = 5;
        gbc.gridy = 6;
        frame.add(button_Modolus, gbc);
        button_Modolus.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 7;
        frame.add(button_Zero, gbc);
        button_Zero.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 7;
        frame.add(button_Period, gbc);
        button_Period.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 7;
        frame.add(button_Negative, gbc);
        button_Negative.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 7;
        frame.add(button_Fraction, gbc);
        button_Fraction.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 7;
        frame.add(button_Percent, gbc);
        button_Percent.addActionListener(this);
        gbc.gridx = 5;
        gbc.gridy = 7;
        frame.add(button_SquareRoot, gbc);
        button_SquareRoot.addActionListener(this);
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 9;
        frame.add(button_Sin, gbc);
        button_Sin.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 9;
        frame.add(button_Cos, gbc);
        button_Cos.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 9;
        frame.add(button_Tan, gbc);
        button_Tan.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 9;
        frame.add(button_Log, gbc);
        button_Log.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 9;
        frame.add(button_NaturalLog, gbc);
        button_NaturalLog.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 10;
        frame.add(button_ArcSin, gbc);
        button_ArcSin.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 10;
        frame.add(button_ArcCos, gbc);
        button_ArcCos.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 10;
        frame.add(button_ArcTan, gbc);
        button_ArcTan.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 10;
        frame.add(button_BaseTen, gbc);
        button_BaseTen.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 10;
        frame.add(button_AbsVal, gbc);
        button_AbsVal.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 11;
        frame.add(button_SinH, gbc);
        button_SinH.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 11;
        frame.add(button_CosH, gbc);
        button_CosH.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 11;
        frame.add(button_TanH, gbc);
        button_TanH.addActionListener(this);
        gbc.gridwidth = 2;
        gbc.gridx = 3;
        gbc.gridy = 11;
        frame.add(button_Exit, gbc);
        button_Exit.addActionListener(this);
        gbc.gridwidth = 1;

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_Zero) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "0");
        }
        if (e.getSource() == button_One) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "1");
        }
        if (e.getSource() == button_Two) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "2");
        }
        if (e.getSource() == button_Three) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "3");

        }
        if (e.getSource() == button_Four) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "4");

        }
        if (e.getSource() == button_Five) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "5");
        }
        if (e.getSource() == button_Six) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "6");

        }
        if (e.getSource() == button_Seven) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "7");

        }
        if (e.getSource() == button_Eight) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "8");
        }
        if (e.getSource() == button_Nine) {
            String stringNum = textfieldResult.getText();
            textfieldResult.setText(stringNum + "9");
        }

        if (e.getSource() == button_Add) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "+";
            textfieldResult.setText("");
        }
        if (e.getSource() == button_Subtract) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "-";
            textfieldResult.setText("");
        }
        if (e.getSource() == button_Multiply) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "*";
            textfieldResult.setText("");
        }
        if (e.getSource() == button_Divide) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "÷";
            textfieldResult.setText("");
        }
        if (e.getSource() == button_Percent) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "%";
            textfieldResult.setText("");
        }
        if (e.getSource() == button_Modolus) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "mod";
            textfieldResult.setText("");
        }
        if (e.getSource() == button_Squared) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "x²";
        }
        if (e.getSource() == button_Cubed) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "x³";
        }
        if (e.getSource() == button_SquareRoot) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "√";
        }
        if (e.getSource() == button_BaseTen) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "10^n";
        }
        if (e.getSource() == button_AbsVal) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "abs";
        }

        if (e.getSource() == button_Negative) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "±";
        }
        if (e.getSource() == button_Fraction) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "1/n";
        }
        if (e.getSource() == button_Log) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "log";
        }
        if (e.getSource() == button_NaturalLog) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "ln";
        }
        if (e.getSource() == button_Sin) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "sin";
        }
        if (e.getSource() == button_Cos) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "cos";
        }
        if (e.getSource() == button_Tan) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "tan";
        }
        if (e.getSource() == button_ArcSin) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "asin";
        }
        if (e.getSource() == button_ArcCos) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "acos";
        }
        if (e.getSource() == button_ArcTan) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "atan";
        }
        if (e.getSource() == button_SinH) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "sinh";
        }
        if (e.getSource() == button_CosH) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "cosh";
        }
        if (e.getSource() == button_TanH) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "tanh";
        }
        if (e.getSource() == button_Clear) {
            String stringVal = textfieldResult.getText();
            num_One = Double.parseDouble(stringVal);
            operation = "C";
        }
        if (e.getSource() == button_Exit) {
            operation = "EXIT";
        }

        if (e.getSource() == button_Equals) {
            String stringOperation = textfieldResult.getText();
            num_Two = Double.parseDouble(stringOperation);

            switch (operation)
            {
                //Basic Buttons
                case "+":
                    resultVal = num_One + num_Two;
                    break;
                case "-":
                    resultVal = num_One - num_Two;
                    break;
                case "*":
                    resultVal = num_One * num_Two;
                    break;
                case "÷":
                    resultVal = num_One / num_Two;
                    break;
                case "±":
                    resultVal = num_One - num_One - num_One;
                    break;
                case "%":
                    resultVal = num_One * (num_Two / 100);
                    break;

                //Data Buttons
                case "log":
                    resultVal = Math.log10(num_One);
                    break;
                case "ln":
                    resultVal = Math.log(num_One);
                    break;
                case "mod":
                    resultVal = num_One % num_Two;
                    break;
                case "x²":
                    resultVal = Math.pow(num_One, 2.0);
                    break;
                case "√":
                    resultVal = Math.sqrt(num_One);
                    break;
                case "10^n":
                    resultVal = Math.pow(10, num_One);
                    break;
                case "abs":
                    resultVal = Math.abs(num_One);
                    break;
                case "1/n":
                    resultVal = 1 / (num_One);
                    break;

                //Trig Buttons
                case "sin":
                    resultVal = Math.sin(num_One);
                    break;
                case "cos":
                    resultVal = Math.cos(num_One);
                    break;
                case "tan":
                    resultVal = Math.tan(num_One);
                    break;
                case "asin":
                    resultVal = Math.asin(num_One);
                    break;
                case "acos":
                    resultVal = Math.acos(num_One);
                    break;
                case "atan":
                    resultVal = Math.atan(num_One);
                    break;
                case "sinh":
                    resultVal = Math.sinh(num_One);
                    break;
                case "cosh":
                    resultVal = Math.cosh(num_One);
                    break;
                case "tanh":
                    resultVal = Math.tanh(num_One);
                    break;
            }
            textareaResult.setText(String.valueOf("Operation: " + operation + "\nAnswer: " + resultVal));
        }
        //Exit Button
        if (e.getSource() == button_Exit)
        {
            System.exit(0);
        }
        //Clear Button
        if (e.getSource() == button_Clear)
        {
            num_One = 0;
            num_Two = 0;
            textfieldResult.setText("");
            textareaResult.setText("");
        }

        if (e.getSource() == button_Period)
        {
            textfieldResult.setText( textfieldResult.getText() + ".");
        }
    }

    public static void main(String[] args)
    {
        MainMethod calculator = new MainMethod();
    }
}