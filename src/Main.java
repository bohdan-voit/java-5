import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {

        String [] [] ArrayInform = {
                {"Мурчик або Кіт лісовий", "Felis silvestris", "Schreber", "1777", "Вразливий вид, занесений до Червоної книги України.Сучасний ареал кота лісового в Україні охоплює Карпатський регіон, західне Полісся(Волинська та Рівненська області), Поділля, а також дельти Дунаю та Дністра."},
                {"Сніжок або Рись євразійська", "Lynx lynx", "Linnaeus", "1758", "Рідкісний вид, занесений до Червоної книги України.В Україні номінативна форма поширена на території Полісся —окремі р -ни Волинської, Житомирської, Київської, Рівненської, Чернігівської областей.Карпатська форма трапляється в Карпатах на території Львівської, Закарпатської, Івано -Франківської, Чернівецької областей.До XIX ст.вид був поширений в Карпатах, Поліссі, Лісостепу і Степу."},
                {"Кіт сві́йський, або кі́шка сві́йська", "Silvestris catus", "lybica", "1758", "Невеликий ссавець ряду хижих родини котових. Сучасна назва походить від латинської назви catus, що використовується для свійського кота, на відміну від дикого, який латиною називається felis." },
                {"Пес свійський", "Canis lupus familiaris","Carnivora","1758", "культигенна тварина. Термін застосовують як для домашніх, так і для бездомних тварин. Свійський пес був одним з найбільш широко застосовуваних службових та компанійських тварин протягом всієї історії людства."}
        };
        for(int i=1; i<=ArrayInform.length; i++)
            System.out.println(i+" "+ArrayInform[i-1][0]);

        System.out.println("Введіть порядкове число тварини, яку ви бажаєте подивитись, або змінити її колір");
        Scanner scanner1 = new Scanner(System.in);
        Integer inform = scanner1.nextInt();

        Animals animal1 = new Animals(ArrayInform[inform-1]);
        animal1.print("all");


        Animals cat = new Animals(ArrayInform[inform-1]);
        Home_animal dog = new Home_animal(ArrayInform[inform-3]);
        wild_animal wildcat = new wild_animal(ArrayInform[inform-1]);

        System.out.println("Натисніть Enter, абож придумайте і напишіть новий колір для тварини");
        Scanner scanner2 = new Scanner(System.in);
        String newcolor = scanner2.nextLine();
        if (newcolor.length()>0)
        {
            cat.DiferentColor(newcolor);
            cat.print();
        }

        }


}

