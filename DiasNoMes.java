

    public class DiasNoMes {
        public static void main(String[] args) {
            int mes = 4;
            String mesesDoAno;
            switch (mes) {
             case 1:
              mesesDoAno = "Janeiro (31)";
              break;
             case 2: 
             	mesesDoAno = "Fevereiro (28)";
             	break;
             case 3: 
             	mesesDoAno = "Marco (31)";
             	break;
             case 4: 
             	mesesDoAno = "Abril (30)";
             	break;
             case 5: 
             	mesesDoAno = "Maio (31)";
             	break;
             case 6: 
             	mesesDoAno = "Junho (30)";
             	break;
             case 7: 
             	mesesDoAno = "Julho (31)";
             	break;
             case 8: 
             	mesesDoAno = "Agosto (31)";
             	break;
             case 9: 
             	mesesDoAno = "Setembro (30)";
             	break;
             case 10: 
             	mesesDoAno = "Outubro (31)";
             	break;
             case 11: 
             	mesesDoAno = "Novembro (30)";
             	break;
             case 12: 
             	mesesDoAno = "Dezembro (31)";
             	break;
             default:
             mesesDoAno =  "Mes desconhecido";
            };
            System.out.println(mesesDoAno);
        }
    }