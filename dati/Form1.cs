using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        int sum = 0;
        public void js()
        {
            sum = 0;//成¨¦绩¡§清?零¢?
            if (textBox1.Text == "2000")
            {
                sum += 30;
            }
            if (radioButton1.Checked)
            {
                sum += 10;
            }
            if (radioButton7.Checked)
            {
                sum += 10;
            }
            if (listBox1.Text == "PasswordChar")
            { sum += 10; }
            if (comboBox1.Text == "b")
            { sum += 10; }
            if (checkBox1.Checked && checkBox2.Checked && checkBox3.Checked && !checkBox4.Checked)
            {
                sum += 30;
            }

            textBox3.Text = sum.ToString();
            textBox2.Enabled = false;
            panel2.Enabled = false;
            textBox3.Enabled = false;
        }


        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            js();
            panel1.Enabled = false;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
      
        }
        int k = 0;
        private void timer1_Tick(object sender, EventArgs e)
        {
            textBox2.Text = k.ToString();
            k++;
            progressBar1.Value = k;
            if (k > 120)
            {
                js();
                timer1.Enabled = false;
                panel1.Enabled = false;
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
