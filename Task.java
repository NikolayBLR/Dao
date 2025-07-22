

public class Task {

            public static void main(String[] args) {
                HumanDao dao = new HumanDaoImpl();

                dao.create(new Human(20, "Мужской"));
                dao.create(new Human(23, "Женский"));

                System.out.println("Все люди");
                for (Human i : dao.getAll()) {
                    System.out.println(i.getAge() + ", " + i.getGender());
                }
            }
}
