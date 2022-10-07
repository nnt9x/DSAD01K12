package day7;

public class ManagerStudent {
    private BinarySearchTree<Student> listStudent;

    public ManagerStudent(){
        listStudent = new BinarySearchTree<>();
    }

    public void insertStudent(Student student){
        listStudent.insert(student);
    }
    public Student findById(long id){
        Student item = new Student(id);
        Node<Student> node = listStudent.contain(item);
        if(node == null){
            return null;
        }
        return node.getValue();
    }
    public void updateStudent(Student student, long id){
        ///
    }
}
