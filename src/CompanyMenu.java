import java.util.Scanner;
public class CompanyMenu {
    public static void main(Company company) {
        Scanner scan = new Scanner(System.in);
            Company app = new Company();
            Company sam = new Company();
            Company xia = new Company();

            while(true){
                System.out.println("Выберите компанию с которой вы хотите работать: ");
                System.out.println("1 - Apple");
                System.out.println("2 - Samsung");
                System.out.println("3 - Xiaomi");
                System.out.println();
                int command = scan.nextInt();
                if(command == 1){
                    AppleMenu.appleMenu(app);
                }else if(command == 2){
                    SamsungMenu.samMenu(sam);
                }else if(command == 3){
                    XiaomiMenu.xiaMenu(xia);
                }else{
                    break;
                }
            }
        }
    }

