package edu.unicen.tallerjava.todo.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Integer id;

    private String name;

    public User() {
    }

    public User(String name) {
        this(name, 0);
    }

    public User(String name, Integer id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return this.getId().equals(other.getId()) && this.getName().equals(other.getName());
	}

	@Override
	public int hashCode() {
		int idHash = (id == null) ? 0 : id.hashCode();
		int nameHash = (name == null) ? 0 : name.hashCode();
		return 17 * idHash * nameHash;
	}
}
