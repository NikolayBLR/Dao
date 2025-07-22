import java.util.ArrayList;
import java.util.List;

public class HumanDaoImpl implements HumanDao {
    private List<Human> humans = new ArrayList<>();

    @Override
    public void create(Human human) {
        humans.add(human);
    }

    @Override
    public Human read(int age) {
        for (Human i : humans) {
            if (i.getAge() == age) return i;
        }
        return null;
    }

    @Override
    public void update(Human updatedHuman) {
        for (Human i : humans) {
            if (i.getAge() == updatedHuman.getAge()) {
                i.setGender(updatedHuman.getGender());
                return;
            }
        }
    }

    @Override
    public void delete(int age) {
        humans.removeIf(p -> p.getAge() == age);
    }

    @Override
    public List<Human> getAll() {
        return humans;
    }
}
