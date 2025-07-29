public class HumanDaoImpl2  implements HumanDAO {
    private Human[] people;
    private int size;

    public void PersonDAOImpl2(int capacity) {
        people = new Human[capacity];
        size = 0;
    }

    @Override
    public void create(Human human) {
        if (size < people.length) {
            people[size++] = human;
        }
    }

    @Override
    public Human read(int gender) {
        for (int i = 0; i < size; i++) {
            if (people[i].getAge() == age) {
                return people[i];
            }
        }
        return null;
    }

    @Override
    public void update(Human human) {
        for (int i = 0; i < size; i++) {
            if (people[i].getAge() == human.getAge()) {
                people[i] = human;
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < size; i++) {
            if (people[i].getAge() == age) {
                for (int j = i; j < size - 1; j++) {
                    people[j] = people[j + 1]; // shift left
                }
                people[--size] = null;
                return;
            }
        }
    }

    @Override
    public Human[] listAll() {
        Human[] current = new Human[size];
        for (int i = 0; i < size; i++) {
            current[i] = people[i];
        }
        return current;
    }
}

}
