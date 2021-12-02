using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication7
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }
        int k = 0;
        private void button1_Click(object sender, EventArgs e)
        {
            k++;
            string SP = textBox1.Text.Trim();
            string JG = textBox2.Text.Trim();
            string SL = textBox3.Text.Trim();
            int RowIndex = dataGridView1.Rows.Add(1);
            dataGridView1[0, RowIndex].Value = k.ToString();
            dataGridView1[1, RowIndex].Value = SP;
            dataGridView1[2, RowIndex].Value = JG;
            dataGridView1[3, RowIndex].Value = SL;
            dataGridView1[4, RowIndex].Value = float.Parse(JG) * float.Parse(SL);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (dataGridView1.Rows.Count > 0)
            {
                int RowIndex = dataGridView1.CurrentCell.RowIndex;
                dataGridView1.Rows.RemoveAt(RowIndex);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {

        }
    }
}
