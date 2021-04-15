package NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TempStudent {
    public String name;
    public int age;
    public TempStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
class Student{
    private String name;
    private int age;
 
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
   
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
 

public class java8features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> st = new ArrayList<>();
		st.add(new Student("Harshit", 21));
		st.add(new Student("Sourav", 22));
		st.add(new Student("Shubham", 23));
		
		/*
		ArrayList<Student> st2 = (ArrayList<Student>) st.stream().filter(stud->stud.getName().equals("Sourav")).collect(Collectors.toList());
		System.out.print(st2);
		*/
		/*
		ArrayList<Student> st2 = (ArrayList<Student>) st.stream().filter(stud->stud.getName().equals("Harshit") && stud.getAge() != 23).collect(Collectors.toList());
		System.out.print(st2);
		*/
		
		/*
		ArrayList<String> st2 = (ArrayList<String>) st.stream().map(Student::getName).filter(stud->stud.equals("Harshit")).collect(Collectors.toList());
		System.out.print(st2);
		*/
		

		ArrayList<String> st2 = (ArrayList<String>) st.stream().map(Student::getName).filter(stud->stud.equals("Harshit")).collect(Collectors.toList());
		System.out.print(st2);
		
		/*
		ArrayList<String> st2 = (ArrayList<String>) st.stream().map(Student::getName).sorted().collect(Collectors.toList());
		System.out.print(st2);
		*/
		
		/*
		st.stream().filter(stud->stud.getName().equals("Harshit")).forEach(stud->{
			if (stud.getAge() >= 21) {
				stud.setAge(stud.getAge()+10);
			}
		});
		System.out.print(st);
		*/
		
		/*
		String st2 = (String) st.stream().map(Student::getName).collect(Collectors.joining());
		System.out.print(st2+"*****");
		*/
		
		
	}

}
