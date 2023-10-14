import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

// Здравствуйте. Понимаю, что код получился с ошибками и не самый оптимальный
// Но я старался как мог

public class Clients_code {
    public static void main(String[] args) {
        Scanner scanner_string = new Scanner(System.in);
        Scanner scanner_int = new Scanner(System.in);
        Map map = new HashMap();
        Map map_filter = new HashMap();
        Map answer = new HashMap();

        Notebook notebook_1 = new Notebook();
        notebook_1.memory = randomMemory();
        notebook_1.hardDesk = randomHardDesk();
        notebook_1.OS = randomOS();
        notebook_1.color = randomColor();

        Notebook notebook_2 = new Notebook();
        notebook_2.memory = randomMemory();
        notebook_2.hardDesk = randomHardDesk();
        notebook_2.OS = randomOS();
        notebook_2.color = randomColor();

        Notebook notebook_3 = new Notebook();
        notebook_3.memory = randomMemory();
        notebook_3.hardDesk = randomHardDesk();
        notebook_3.OS = randomOS();
        notebook_3.color = randomColor();

        Notebook notebook_4 = new Notebook();
        notebook_4.memory = randomMemory();
        notebook_4.hardDesk = randomHardDesk();
        notebook_4.OS = randomOS();
        notebook_4.color = randomColor();

        Notebook notebook_5 = new Notebook();
        notebook_5.memory = randomMemory();
        notebook_5.hardDesk = randomHardDesk();
        notebook_5.OS = randomOS();
        notebook_5.color = randomColor();

        Notebook notebook_6 = new Notebook();
        notebook_6.memory = randomMemory();
        notebook_6.hardDesk = randomHardDesk();
        notebook_6.OS = randomOS();
        notebook_6.color = randomColor();

        Notebook notebook_7 = new Notebook();
        notebook_7.memory = randomMemory();
        notebook_7.hardDesk = randomHardDesk();
        notebook_7.OS = randomOS();
        notebook_7.color = randomColor();

        Notebook notebook_8 = new Notebook();
        notebook_8.memory = randomMemory();
        notebook_8.hardDesk = randomHardDesk();
        notebook_8.OS = randomOS();
        notebook_8.color = randomColor();

        Notebook notebook_9 = new Notebook();
        notebook_9.memory = randomMemory();
        notebook_9.hardDesk = randomHardDesk();
        notebook_9.OS = randomOS();
        notebook_9.color = randomColor();

        Notebook notebook_10 = new Notebook();
        notebook_10.memory = randomMemory();
        notebook_10.hardDesk = randomHardDesk();
        notebook_10.OS = randomOS();
        notebook_10.color = randomColor();

        map.put(1, notebook_1);
        map.put(2, notebook_2);
        map.put(3, notebook_3);
        map.put(4, notebook_4);
        map.put(5, notebook_5);
        map.put(6, notebook_6);
        map.put(7, notebook_7);
        map.put(8, notebook_8);
        map.put(9, notebook_9);
        map.put(10, notebook_10);
;

        System.out.println("Сгенерировали 10 ноутбуков: ");
        print(map);

        Map res = filter(map, map_filter, scanner_int, scanner_string);
        
        System.out.println("Фильтр: ");

        if((("memory: " + notebook_1.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_1.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_1.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_1.getColor()).equals(res.get(4)))){
                answer.put(1, notebook_1);
            }

        if((("memory: " + notebook_2.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_2.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_2.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_2.getColor()).equals(res.get(4)))){
                answer.put(2, notebook_2);
            }

        if((("memory: " + notebook_3.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_3.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_3.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_3.getColor()).equals(res.get(4)))){
                answer.put(3, notebook_3);
            }

        if((("memory: " + notebook_4.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_4.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_4.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_4.getColor()).equals(res.get(4)))){
                answer.put(4, notebook_4);
            }

        if((("memory: " + notebook_5.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_5.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_5.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_5.getColor()).equals(res.get(4)))){
                answer.put(5, notebook_5);
            }

        if((("memory: " + notebook_6.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_6.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_6.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_6.getColor()).equals(res.get(4)))){
                answer.put(6, notebook_6);
            }

        if((("memory: " + notebook_7.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_7.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_7.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_7.getColor()).equals(res.get(4)))){
                answer.put(7, notebook_7);
            }

        if((("memory: " + notebook_8.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_8.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_8.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_8.getColor()).equals(res.get(4)))){
                answer.put(8, notebook_8);
            }

        if((("memory: " + notebook_9.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_9.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_9.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_9.getColor()).equals(res.get(4)))){
                answer.put(9, notebook_9);
            }

        if((("memory: " + notebook_10.getMemory()).equals(res.get(1))) && 
            (("hardDesk: " + notebook_10.getHardDesk()).equals(res.get(2))) &&
            (("OS: " + notebook_10.getOS()).equals(res.get(3))) &&
            (("color: " + notebook_10.getColor()).equals(res.get(4)))){
                answer.put(10, notebook_10);
            }
        System.out.println(answer);
    }
    // -------------------------------------------------------------------------------
    static int randomMemory(){
        int[] memory = {2, 4, 8, 16};
        Random random = new Random();
        int result = random.nextInt(0, memory.length);
        return memory[result];
    }

    static int randomHardDesk(){
        int[] hardDesk = {128, 256, 512, 1024};
        Random random = new Random();
        int resultat = random.nextInt(0, hardDesk.length);
        return hardDesk[resultat];
    }
    static String randomOS(){
        String[] OS = {"Windows", "Linux", "Apple"};
        Random random = new Random();
        int result = random.nextInt(0, OS.length);
        return OS[result];
    }
    static String randomColor(){
        String[] color = {"white", "gray", "black", "pink"};
        Random random = new Random();
        int res = random.nextInt(0, color.length);
        return color[res];
    }

    static void print(Map map){
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(i + " = " + map.get(i));
        }
    }

    static void print_filter(Map map_filter){
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " = " + map_filter.get(i));
        }
    }

    static Map filter(Map map, Map map_filter, Scanner scanner_int, Scanner scanner_string){
        System.out.println("Выберите элементы фильтра: ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Жесткий диск");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - Поиск: ");
        System.out.println("Ввод: ");
        Scanner scanner = new Scanner(System.in);
        int parametr = scanner.nextInt();
        if(parametr == 1){
            System.out.println("Выберите минимальное значение ОЗУ: 2, 4, 8, 16");
            int find_memory = scanner_int.nextInt();
            map_filter.put(parametr, "memory: " + find_memory);
            return filter(map, map_filter, scanner_int, scanner_string);
        }
        else if(parametr == 2){
            System.out.println("Выберите минимальное значение Жесткого диска: 128, 256, 512, 1024");
            int find_hardDesk = scanner_int.nextInt();
            map_filter.put(parametr, "hardDesk: " + find_hardDesk);
            return filter(map, map_filter, scanner_int, scanner_string);
        }
        else if(parametr == 3){
            System.out.println("Введите Операционную систему: Windows, Linux, Apple:");
            String find_OS = scanner_string.nextLine();
            map_filter.put(parametr, "OS: " + find_OS);
            return filter(map, map_filter, scanner_int, scanner_string);
        }
        else if(parametr == 4){
            System.out.println("Введите Цвет: white, gray, black, pink:");
            String find_color = scanner_string.nextLine();
            map_filter.put(parametr, "color: " + find_color);
            return filter(map, map_filter, scanner_int, scanner_string);
        }
        else if(parametr == 5){
            return map_filter;
        }
        else{
            System.out.println("Вы ввели неверное значение");
            System.out.println("Попробуйте снова: ");
            return filter(map, map_filter, scanner_int, scanner_string);
        }
    }
}



































