import java.util.List;

public interface HumanDao {
    void create(Human human);
    Human read(int age);
    void update(Human human);
    void delete(int age);
    List<Human> getAll();
}

