
import java.util.*;
import java.util.Collection.*;
public class collageadmissionproject  {
    public static void main(String[] args) {
        System.out.println("**************************** ");
        System.out.println("S.M.S.S  COLLEGE OF ARTS AND SCIENCE ");
        System.out.println();
        System.out.println("COIMBATORE -64 ");
        System.out.println("**************************** ");
        maintitle mm=new maintitle();
        mm.main();

//         Admission obj=new Admission();
// depart dd=new depart();
// obj.Admission1();
//         dd.department();
    }
}
class maintitle{
    void main(){
        try{
            Thread.sleep(2000);
            System.out.println("SELECT YOUR OPTION :");
            System.out.println();
            System.out.println("1. FEES STRUCTURAL :");
            System.out.println("2. EXTRA CURRICULAR ACTIVITIES :");
            System.out.println("3. ADMISSION :");
            System.out.println("4. EXIT");
            System.out.println();
        }catch(Exception m){
            System.out.println(m.getMessage());
        }        Scanner sc = new Scanner (System.in);

        int a=sc.nextInt();
        maintitle mt=new maintitle();
        switch(a){
            case 1:
                santhoshpack sp=new santhoshpack();
                sp.mainn();
                break;
            case 2:
                try{
                    manojpack mp=new manojpack();
                    mp.manoj();break;
                }
                catch(Exception w){
                    System.out.println(w.getMessage());
                }
                break;
            case 3:
                Admission obj=new Admission();
                depart dd=new depart();
                obj.Admission1();
                dd.department();
                break;
            case 4:
                System.exit(0);
            default :
                System.out.println("PLEASE ENTER A VALIED OPTIONS");
                mt.main();
        }

    }
}
class Admission{
    static String[] name=new String[10];
    final static int mathfees=30000;
    final static int csfees=40000;
    final static int physicsfees=20000;
    final static int chemistryfees=10000;
    final static int hostelfees=10000;
    final static int busfees=10000;
    static int feesstructure;
    private static int mathstotalsheet=3;
    private static int cstotalsheet=3;
    private static int physicstotalsheet=3;
    private static int chemistrytotalsheet=3;
    static int mathavailablesheet=3;
    static int csavailablesheet=3;
    static int physicsavailablesheet=3;
    static int chemistryavailablesheet=3;

    void Admission1(){
        try{
            Thread.sleep(2000);
            System.out.println("**"+" "+"DEPARTMENTS OF OUR COLLEGE" +" "+"**");
            System.out.println(" ");
            System.out.println();
            Admission ob=new Admission();
            System.out.println("1. B.Sc MATHS"+"                           "+"AVAILABLE SEATS:"+" "+mathavailablesheet);
            System.out.println("2. B.Sc COMPUTER SCIENCE"+"                "+"AVAILABLE SEATS:"+" "+csavailablesheet);
            System.out.println("3. B.Sc PHYSICS"+"                         "+"AVAILABLE SEATS:"+" "+physicsavailablesheet);
            System.out.println("4. B.Sc CHEMISTRY"+"                       "+"AVAILABLE SEATS:"+" "+chemistryavailablesheet);
            System.out.println("5. VIEW TOTAL SEATS :");
            System.out.println("6. VIEW DEPARTMENT VISE STUDENTS LIST : ");
            System.out.println("7. CHANGE DEPARTMENT ");
            System.out.println("8. BACK : ");
            System.out.println("9. EXITS : ");

            System.out.println(" ");
        }catch(Exception q){
            System.out.println(q.getMessage());
        }}
    public void setmath(int mathstotalsheet){
        this.mathstotalsheet=mathstotalsheet;
    }
    public static int getmath(){
        return mathstotalsheet;
    }
    public void setcs(int cstotalsheet){
        this.cstotalsheet=csavailablesheet;
    }
    public static int getcs(){
        return cstotalsheet;
    }

    public void setphysics(int physicstotalsheet){
        this.physicstotalsheet=physicstotalsheet;
    }
    public static int getphysics(){
        return physicstotalsheet;
    }
    public void setchemistry(int chemistrytotalsheet){
        this.chemistrytotalsheet=chemistryavailablesheet;
    }
    public static int getchemistry(){
        return chemistrytotalsheet;
    }
    public void list(){
        depart aa=new depart();
        for(int i=0;i<3;i++)

            System.out.println(aa.name1[i]);
    }
}
class depart {
    Admission i=new Admission();
    static String name1[]=new String[Admission.getmath()];
    static String name1gender[]=new String[Admission.getmath()];
    static int name1dob[]=new int[Admission.getmath()];
    static String name1id[]=new String[Admission.getmath()];
    static String name1stay[]=new String[Admission.getmath()];
    // LinkedList li=new LinkedList();
    // li.add(name1);
    static String name2[]=new String[Admission.getcs()];
    static String name2gender[]=new String[Admission.getcs()];
    static int name2dob[]=new int[Admission.getcs()];
    static String name2id[]=new String[Admission.getcs()];
    static String name2stay[]=new String[Admission.getcs()];
    static String name3[]=new String[Admission.getphysics()];
    static String name3gender[]=new String[Admission.getphysics()];
    static int name3dob[]=new int[Admission.getphysics()];
    static String name3id[]=new String[Admission.getphysics()];
    static String name3stay[]=new String[Admission.getphysics()];
    static String name4[]=new String[Admission.getphysics()];
    static String name4gender[]=new String[Admission.getchemistry()];
    static int name4dob[]=new int[Admission.getchemistry()];
    static String name4id[]=new String[Admission.getchemistry()];
    static String name4stay[]=new String[Admission.getchemistry()];
    static int count=3;
    void department(){
        Scanner sc=new Scanner(System.in);
        System.out.println("**  SELECT YOUR OPTIONS   **");
        int depart=sc.nextInt();
        switch(depart){
            case 1:
                try{
                    Admission objj=new Admission();
                    int c=Admission.mathavailablesheet;
                    if(c==0)
                        throw new full("sorry sheets are full in this department , try to another department");
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("**  ENTER YOUR NAME   **");
                    name1[c-1] =sc1.nextLine();
                    Scanner scc1=new Scanner(System.in);
                    System.out.println("**  SELECT YOUR GENDER   **");
                    System.out.println("**  SELECT 1.MALE   2.FEMALE   **");
                    int g =scc1.nextInt();
                    if(g==1)
                        name1gender[c-1]="male";
                    else
                        name1gender[c-1]="female";
                    System.out.println("**  DATEOFBIRTH   **");
                    // System.out.println("**  SELECT 1.MALE   2.FEMALE   **");
                    name1dob[c-1] =scc1.nextInt();
                    name1id[c-1]="130194"+count;
                    System.out.println("**  SELECT 1.HOSTELLER   2.DAYSCHOLAR  3.OTHERS **");
                    int n= sc1.nextInt();
                    if(n==1){
                        name1stay[c-1]="HOSTELLER";
                        Admission.feesstructure=Admission.mathfees+Admission.hostelfees;}
                    else if(n==2){
                        name1stay[c-1]="DAYSCHOLLER";
                        Admission.feesstructure=Admission.mathfees+Admission.busfees;
                    }
                    else{
                        name1stay[c-1]="DAYSCHOLLER";
                        Admission.feesstructure=Admission.mathfees;
                    }
                    System.out.println(name1[c-1]+" "+":"+"B.Sc MATHS"+" "+"ADMISSION SUCCESSED");
                    System.out.println();
                    System.out.println("TOTAL FEES:"+" "+Admission.feesstructure);
                    System.out.println();
                    Admission.mathavailablesheet=Admission.mathavailablesheet-1;
                    --count;
                    objj.Admission1();
                }
                catch(Exception e){
                    System.err.println(e);
                }
                department();
                break;
            case 2:
                Admission objjj=new Admission();
                int d=Admission.csavailablesheet;
                try{
                    if(d==0)
                        throw new full("sorry sheets are full in this department , try to another department");
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("**  ENTER YOUR NAME   **");
                    name2[d-1] =sc2.nextLine();
                    Scanner scc2=new Scanner(System.in);
                    System.out.println("**  SELECT YOUR GENDER   **");
                    System.out.println("**  SELECT 1.MALE   2.FEMALE   **");
                    int g =scc2.nextInt();
                    if(g==1)
                        name2gender[d-1]="male";
                    else {
                        name2gender[d-1]="female";}
                    System.out.println("**  DATEOFBIRTH   **");
                    name2dob[d-1] =scc2.nextInt();
                    name2id[d-1]="130184"+count;
                    System.out.println("**  SELECT 1.HOSTELLER   2.DAYSCHOLAR   **");
                    int n= sc2.nextInt();
                    if(n==1)
                        Admission.feesstructure=Admission.csfees+Admission.hostelfees;
                    else if(n==2)
                        Admission.feesstructure=Admission.csfees+Admission.busfees;
                    else{
                        Admission.feesstructure=Admission.csfees;}
                    System.out.println(name2[d-1]+" "+":"+"B.Sc COMPUTERSCIENCE"+" "+"ADMISSION SUCCESSED");
                    System.out.println();
                    System.out.println("TOTAL FEES:"+" "+Admission.feesstructure);
                    System.out.println();
                    Admission.csavailablesheet=Admission.csavailablesheet-1;count--;
                    objjj.Admission1();
                }
                catch(Exception e){
                    System.err.println(e);
                }
                department();
                break;
            case 3:
                Admission obj3=new Admission();
                int f=Admission.physicsavailablesheet;
                try{
                    if(f==0)
                        throw new full("sorry sheets are full in this department , try to another department");
                    Scanner sc3=new Scanner(System.in);
                    System.out.println("**  ENTER YOUR NAME   **");
                    name3[f-1] =sc3.nextLine();
                    System.out.println("**  SELECT YOUR GENDER   **");
                    System.out.println("**  SELECT 1.MALE   2.FEMALE   **");
                    int g =sc3.nextInt();
                    if(g==1)
                        name3gender[f-1]="male";
                    else {
                        name3gender[f-1]="female";}
                    System.out.println("**  DATEOFBIRTH   **");
                    name3dob[f-1] =sc3.nextInt();
                    name3id[f-1]="130174"+count;
                    System.out.println("**  SELECT 1.HOSTELLER   2.DAYSCHOLAR   **");
                    int n= sc3.nextInt();
                    if(n==1)
                        Admission.feesstructure=Admission.physicsfees+Admission.hostelfees;
                    else if(n==2)
                        Admission.feesstructure=Admission.physicsfees+Admission.busfees;
                    else
                        Admission.feesstructure=Admission.physicsfees;
                    System.out.println(name3[f-1]+" "+":"+"B.Sc PHYSICS"+" "+"ADMISSION SUCCESSED");
                    System.out.println();
                    System.out.println("TOTAL FEES:"+" "+Admission.feesstructure);
                    System.out.println();
                    Admission.physicsavailablesheet=Admission.physicsavailablesheet-1;count--;
                    obj3.Admission1();
                }
                catch(Exception e){
                    System.err.println(e);
                }
                department();
                break;
            case 4:
                Admission obj4=new Admission();
                int g=Admission.chemistryavailablesheet;
                try{
                    if(g==0)
                        throw new full("sorry sheets are full in this department , try to another department");
                    Scanner sc4=new Scanner(System.in);
                    System.out.println("**  ENTER YOUR NAME   **");
                    name4[g-1] =sc4.nextLine();
                    System.out.println("**  SELECT YOUR GENDER   **");
                    System.out.println("**  SELECT 1.MALE   2.FEMALE   **");
                    int h=sc4.nextInt();
                    if(h==1)
                        name4gender[g-1]="male";
                    else {
                        name3gender[g-1]="female";}
                    System.out.println("**  DATEOFBIRTH   **");
                    name4dob[g-1] =sc4.nextInt();
                    name4id[g-1]="130174"+count;
                    System.out.println("**  SELECT 1.HOSTELLER   2.DAYSCHOLAR   **");
                    int n= sc4.nextInt();
                    if(n==1)
                        Admission.feesstructure=Admission.chemistryfees+Admission.hostelfees;
                    else if(n==2)
                        Admission.feesstructure=Admission.chemistryfees+Admission.busfees;
                    else
                        Admission.feesstructure=Admission.chemistryfees;
                    System.out.println(name4[g-1]+" "+":"+"B.Sc CHEMISTRY"+" "+"ADMISSION SUCCESSED");
                    System.out.println();
                    System.out.println("TOTAL FEES:"+" "+Admission.feesstructure);
                    System.out.println();
                    Admission.chemistryavailablesheet=Admission.chemistryavailablesheet-1;
                    obj4.Admission1();count--;
                }
                catch(Exception e){
                    System.err.println(e);
                }
                department();
                break;
            case 5:
                Admission o=new Admission();
                System.out.println("B.Sc MATHS:"+"                "+o.getmath());
                System.out.println("B.Sc COMPUTERSCIENCE:"+"      "+o.getcs());
                System.out.println("B.Sc PHYSICS:"+"              "+o.getphysics());
                System.out.println("B.Sc CHEMISTRY:"+"            "+o.getchemistry());
                o.Admission1();
                department();
                break ;
            case 6:
                System.out.println("*********ENETER WHICH DEPARTMENT LIST YOU WANT*******");
                System.out.println("1.B Sc. MATHS");
                System.out.println("2.B Sc. COMPUTERSCIENCE");
                System.out.println("3.B Sc. PHYSICS");
                System.out.println("4.B Sc. CHEMISTRY");
                Scanner list=new Scanner(System.in);
                int dd=list.nextInt();
                Admission i=new Admission();

                switch(dd){
                    case 1:
                        System.out.println("** B Sc MATHS **");
                        for(int l=i.getmath();l>0;l--){
                            if(name1[l-1]!=null){

                                System.out.println("NAME :"+" "+name1[l-1]+"        "+"GENDER :"+" "+name1gender[l-1]+"        "+"ID :"+" "+name1id[l-1]+"      "+"DOB :"+" "+name1dob[l-1]+"    ");
                            }}
                        System.out.println();
                        try{
                            Thread.sleep(3000);
                            i.Admission1();
                            department();
                        }catch(Exception w){
                            System.out.println(w.getMessage());
                        }
                        break ;
                    case 2:
                        System.out.println("** B Sc COMPUTERSCIENCE **");
                        for(int l=i.getcs();l>0;l--){
                            if(name2[l-1]!=null){

                                System.out.println("NAME :"+" "+name2[l-1]+"        "+"GENDER :"+" "+name2gender[l-1]+"        "+"ID :"+" "+name2id[l-1]+"      "+"DOB :"+" "+name2dob[l-1]+"    ");
                            }}
                        System.out.println();
                        try{
                            Thread.sleep(3000);
                            i.Admission1();
                            department();}
                        catch(Exception w){
                            System.out.println(w.getMessage());
                        }
                        break ;
                    case 3:
                        System.out.println("** B Sc PHYSICS **");
                        for(int l=i.getphysics();l>0;l--){
                            if(name3[l-1]!=null){

                                System.out.println("NAME :"+" "+name3[l-1]+"        "+"GENDER :"+" "+name3gender[l-1]+"        "+"ID :"+" "+name3id[l-1]+"      "+"DOB :"+" "+name3dob[l-1]+"    ");
                            }}
                        System.out.println();
                        try{
                            Thread.sleep(3000);
                            i.Admission1();
                            department();}
                        catch(Exception w){
                            System.out.println(w.getMessage());
                        }
                        break ;
                    case 4:
                        System.out.println("** B Sc CHEMISTRY **");
                        for(int l=i.getchemistry();l>0;l--){
                            if(name4[l-1]!=null){

                                System.out.println("NAME :"+" "+name4[l-1]+"        "+"GENDER :"+" "+name4gender[l-1]+"        "+"ID :"+" "+name4id[l-1]+"      "+"DOB :"+" "+name4dob[l-1]+"    ");
                            }}
                        System.out.println();
                        try{
                            Thread.sleep(3000);
                            i.Admission1();
                            department();}
                        catch(Exception w){
                            System.out.println(w.getMessage());
                        }
                        break ;}
            case 7:
                System.out.println("***  STILL WORKING UNDER PROCESS  ***");
// System.out.println("HOW MANY YEAR YOU STUDING IN THIS COLLEGE");
// Scanner d1=new Scanner(System.in);
// System.out.println("1.ONE YEAR"+"   "+"2.TWO YEAR"+"   "+"3.THREE YEAR");
// int n=d1.nextInt();
// if(n==1){
//         System.out.println("ENTER YOUR NAME");
// String name=d1.next();
//     System.out.println("SELECT YOUR CURRENT DEPARTMENT");System.out.println();
//     System.out.println("1.B Sc MATHS "+"   "+"2.B SC COMPUTERSCIENCE"+"   "+"3.B SC PHYSICS"+"   "+"4. B SC CHEMISTRY");
//     int depa=d1.nextInt();
// switch(depa){
//     case 1:
//      System.out.println("SELECT YOUR CHANGING DDEPARTMENT");System.out.println();
//     System.out.println("1.B SC COMPUTERSCIENCE"+"   "+"2.B SC PHYSICS"+"   "+"3.B SC CHEMISTRY");
//     int depa1=d1.nextInt();
                // switch(depa1){
//         case 1:
//         for(int w=i.getmath();w>0;w--){
//             if(name1[w]==name){
//                 Arrays.copyof(0);
//        // ++Admission.mathavailablesheet;
//        // csavailablesheet
//     }}

// }
                Admission ai=new Admission();
                ai.Admission1();
                department();
                break;
//}
// else{
//     System.out.println("SORRY YOU CON'T CHANGE YOUR DEPARTMENT");
// }
            case 8:
                maintitle mtt=new maintitle();
                mtt.main();
            case 9:
                System.out.println(" THANK YOU ");
                System.exit(0);
            default :
                System.out.println("PLEASE SELECT CORRECT OPTIONS");
                Admission id=new Admission();
                id.Admission1();
        }}
    class full extends Exception{
        full(String s){
            super(s);
        }
    }}

