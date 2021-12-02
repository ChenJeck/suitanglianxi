using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace WindowsFormsApplication10
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            CheckForIllegalCrossThreadCalls = false;
        }
        Thread[] OT = new Thread[7];
        private void button1_Click(object sender, EventArgs e)
        {
            button1.Enabled = false;
            Class1 C1 = new Class1(label5,11111);
            OT[0] = new Thread(new ThreadStart(C1.HongQ));
            Class1 C2 = new Class1(label6, 11111);
            OT[1] = new Thread(new ThreadStart(C2.HongQ));
            Class1 C3 = new Class1(label7, 11111);
            OT[2] = new Thread(new ThreadStart(C3.HongQ));
            Class1 C4 = new Class1(label8, 11111);
            OT[3] = new Thread(new ThreadStart(C4.HongQ));
            Class1 C5 = new Class1(label9, 11111);
            OT[4] = new Thread(new ThreadStart(C5.HongQ));
            Class1 C6 = new Class1(label10, 11111);
            OT[5] = new Thread(new ThreadStart(C6.HongQ));
            Class1 C7 = new Class1(label11, 11111);
            OT[6] = new Thread(new ThreadStart(C7.LanQ));
            for (int i = 0; i < 7; i++)
            {
                OT[i].Start();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            button2.Enabled = false;
            for (int i = 0; i < 7; i++)
            {
                OT[i].Abort();
            }
            label2.Text = label5.Text + " " + label6.Text + " " + label7.Text + " " + label8.Text + " " + label9.Text + " " + label10.Text + " " + label11.Text;
            label3.Text = label11.Text;
            label2.Left = label2.Left + label3.Width;
            label2.Height = label3.Height;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
