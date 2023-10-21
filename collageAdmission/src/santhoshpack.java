import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
    class CS{
        void s() throws Exception{
            System.out.println("***********************");
            File v=new File("C:\\Users\\ELCOT\\Downloads\\bsc.cs mp.txt");
            v.createNewFile();
            FileReader s=new FileReader(v);
            BufferedReader reader=new BufferedReader(s);
            String line=reader.readLine();
            //int a=0;
            while(line!=null){
                //a++;
                System.out.println(line);
                line=reader.readLine();
            }
            System.out.println("***********************");

        }
    }

    class Math{
        void math() throws Exception{
            System.out.println("***********************");

            File e=new File("C:\\Users\\ELCOT\\Downloads\\maths.txt");
            e.createNewFile();
            FileReader r=new FileReader(e);
            BufferedReader reader=new BufferedReader(r);
            String line=reader.readLine();
            //int a=0;
            while(line!=null){
                // a++;
                System.out.println(line);
                line=reader.readLine();
            }
            System.out.println("***********************");

        }

    }
    class CHE{
        void che() throws Exception{
            System.out.println("***********************");

            File ch=new File("C:\\Users\\ELCOT\\Downloads\\CHEMISTRY.JAVA");
            ch.createNewFile();
            FileReader e=new FileReader(ch);
            BufferedReader reader=new BufferedReader(e);
            String line=reader.readLine();
            //int a=0;
            while(line!=null){
                //a++;
                System.out.println(line);
                line=reader.readLine();
            }
            System.out.println("***********************");

        }
    }
    class PHY{
        void phy() throws Exception{
            System.out.println("***********************");

            File ph=new File("C:\\Users\\ELCOT\\Downloads\\physics.java");
            ph.createNewFile();
            FileReader p=new FileReader(ph);
            BufferedReader reader=new BufferedReader(p);
            String line=reader.readLine();
            // int a=0;
            while(line!=null){
                //a++;
                System.out.println(line);
                line=reader.readLine();
            }
            System.out.println("***********************");

        }
    }


    public class santhoshpack {
        public static void mainn() {
            try{
                Thread.sleep(2000);
                System.out.println("*****************");
                System.out.println("1 .B Sc COMPUTERSCIENCE");
                System.out.println("2 .B Sc MATHS");
                System.out.println("3 .B Sc CHEMISTRY");
                System.out.println("4 .B Sc PHYSICS");
                System.out.println("5 .BACK ");
                System.out.println("6 .EXIT ");


                System.out.println("*****************");
            }catch(Exception t){
                System.out.println(t.getMessage());
            }
            try {        Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();
                switch (a) {

                    case 1:
                        CS q = new CS();
                        try {
                            q.s();
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                        santhoshpack.mainn();
                        break;
                    case 2:
                        Math m = new Math();
                        try {
                            m.math();
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                        santhoshpack.mainn();
                        break;
                    case 3:
                        CHE Ch = new CHE();
                        try {
                            Ch.che();
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                        santhoshpack.mainn();
                        break;
                    case 4:
                        PHY Ph = new PHY();
                        try {
                            Ph.phy();
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                        santhoshpack.mainn();
                        break;
                    case 5:
                        maintitle mt=new maintitle();
                        mt.main();
                    case 6:
                        System.exit(0);;
                        break;
                    default :
                        System.out.println("PLEASE ENTER VAILD OPTIONS");
                        santhoshpack.mainn();


                }
                santhoshpack.mainn();
            }
            catch(Exception e){
                System.out.println("PLEASSE ENTER VAILD OPTIONS :");
            }
        }
    }

