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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Trim() == "" || textBox2.Text.Trim() == "" || textBox3.Text.Trim() == "")
            {
                MessageBox.Show("学生学号或姓名地址不能为空", "提示", MessageBoxButtons.OKCancel);
            }
            else {
                string StuID = textBox1.Text.Trim();
                string Name = textBox1.Text.Trim();
                string StuClass = comboBox1.Text.Trim();
                string sex = "";
                if (radioButton1.Checked)
                {
                    sex = "男";
                }
                else {
                    sex = "女";
                }
                string Birth = dateTimePicker1.Text;
                string Address = comboBox1.Text.Trim();
                string Lx = textBox3.Text.Trim();
                if (Lx.Length != 1)
                {
                    label1.Visible = true;
                    label1.BackColor = Color.Red;
                }
                else {
                   // label2.Visible = false;
                    string FSH = textBox4.Text.Trim();
                    if (FSH.Length != 1)
                    {
                       // label3.Visible = true;
                        label3.BackColor = Color.Red;
                    }
                    else {
                        //label3.Visible = false;
                        int RowIndex = dataGridView1.Rows.Add(1);
                        dataGridView1[0, RowIndex].Value = StuID;
                        dataGridView1[1, RowIndex].Value = Name;
                        dataGridView1[2, RowIndex].Value = StuClass;
                        dataGridView1[3, RowIndex].Value = sex;
                        dataGridView1[4, RowIndex].Value = Birth;
                        dataGridView1[5, RowIndex].Value = Address;
                        dataGridView1[6, RowIndex].Value = Lx;
                        dataGridView1[7, RowIndex].Value = FSH;
                        dataGridView1[8, RowIndex].Value = filepath;
                    }
                }
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (dataGridView1.Rows.Count > 0) {
                int RowIndex = dataGridView1.CurrentCell.RowIndex;
                dataGridView1.Rows.RemoveAt(RowIndex);
            }
        }
        string filepath = "";

        private void button3_Click(object sender, EventArgs e)
        {
            OpenFileDialog OFD = new OpenFileDialog();
            OFD.Title = "选择图片";
            OFD.Filter = "*.*(所有文件)|*.*";
            if (OFD.ShowDialog() == DialogResult.OK) {
                filepath = OFD.FileName;
                pictureBox1.Image = Image.FromFile(filepath);
            }
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }
    }
}
