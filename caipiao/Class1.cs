using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace WindowsFormsApplication10
{
    class Class1
    {
        public Label lab1;
        public int speed;
        public Class1(Label Lab1, int Speed) {
            lab1 = Lab1;
            speed = Speed;
        }
        public void HongQ() {
            Random rd = new Random(speed);
            while (true) {
                lab1.Text = rd.Next(0, 37).ToString();
                Thread.Sleep(100);
            }

        }
        public void LanQ()
        {
            Random rd = new Random(speed);
            while (true)
            {
                lab1.Text = rd.Next(0, 16).ToString();
                Thread.Sleep(100);
            }

        }
    }
}
