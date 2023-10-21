import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


    class     sportss{
        public void dis() throws Exception {

            Scanner aa=new Scanner(System.in);
            System.out.println("      "+"Extension Activity");
            System.out.println("  "+"1--SPORT");
            System.out.println("  "+"2--nss");
            System.out.println("  "+"3--ncc");
            System.out.println("  "+"4--Fine art");
            System.out.println("  "+"5--back");
            System.out.println("  "+"6--exit");

            System.out.print("Enter to number to choose it");
            int a1=aa.nextInt();
            switch(a1) {
                case 1:
//			student.see1();
//			image.sad();
                    File f1=new File("C:\\Users\\ELCOT\\Downloads\\well.txt");
                    f1.createNewFile();
                    FileReader fileres=new FileReader(f1);
                    BufferedReader rereads=new BufferedReader(fileres);
                    String linesss =rereads.readLine();
                    int linecount=-1;
                    while(linesss!=null) {
                        linecount++;
                        System.out.println(linesss);
                        linesss=rereads.readLine();
                    }
                    try{
                        Thread.sleep(2000);
                        sportss ss=new sportss();
                        ss.dis();}
                    catch(Exception k){
                        System.out.println(k.getMessage());
                    }			break;
                case 2:
                    File f2=new File("C:\\Users\\ELCOT\\Downloads\\wells (1).txt");
                    f2.createNewFile();
                    FileReader fileress=new FileReader(f2);
                    BufferedReader rereadss=new BufferedReader(fileress);
                    String linessss =rereadss.readLine();
                    int linecounts=0;
                    while(linessss!=null) {
                        linecounts++;
                        System.out.println(linessss);
                        linessss=rereadss.readLine();
                    }try{
                    Thread.sleep(2000);
                    sportss ss=new sportss();
                    ss.dis();}
                catch(Exception k){
                    System.out.println(k.getMessage());
                }
                    break;
                case 3:
                    File f3=new File("C:\\Users\\ELCOT\\Downloads\\done (1).txt");
                    f3.createNewFile();
                    FileReader fileresss=new FileReader(f3);
                    BufferedReader rereadsss=new BufferedReader(fileresss);
                    String lines =rereadsss.readLine();
                    int linecountssss=0;
                    while(lines!=null) {
                        linecountssss++;
                        System.out.println(lines);
                        lines=rereadsss.readLine();
                    }try{
                    Thread.sleep(2000);
                    sportss ss=new sportss();
                    ss.dis();}
                catch(Exception k){
                    System.out.println(k.getMessage());
                }
                    break;
                case 4:
                    File f5=new File("C:\\Users\\ELCOT\\Downloads\\support1.txt");
                    f5.createNewFile();

                    FileReader fileressss=new FileReader(f5);
                    BufferedReader rereadssss=new BufferedReader(fileressss);
                    String linesssss =rereadssss.readLine();
                    int linecountsssss=0;
                    while(linesssss!=null) {
                        linecountsssss++;
                        System.out.println(linesssss);
                        linesssss=rereadssss.readLine();
                    }try{
                    Thread.sleep(2000);
                    sportss ss=new sportss();
                    ss.dis();}
                catch(Exception k){
                    System.out.println(k.getMessage());
                }
                    break;
                case 6:
                    System.exit(0);
                case 5:
                    maintitle mm=new maintitle();
                    mm.main();
                    break;
                default :
                    System.out.println("ENTER VAILD OPTIONS");
                    sportss ss=new sportss();
                    ss.dis();
            }
        }
    }



    class manojpack {
        void manoj() throws Exception{
            sportss ob=new sportss();
            ob.dis();

        }
    }

