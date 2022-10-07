package day7;

public class Student implements Comparable<Student> {
    private long id;
    private String name;
    private String address;

    public Student(long id) {
        this.id = id;
    }

    public Student(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.id > o.getId()){
            return 1;
        }
        else if (this.id < o.getId()){
            return -1;
        }
        return 0;
    }
}
