import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
               if(students==null)
               {
                 throw IllegalArgumentException;
}
else{

		return this.students;
}
                  
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
if(index[]<0||index[]>=student.length){
               throw IllegalArgumentException;
	}
else{
this.students.students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

		return students[index];
                   

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
this.getStudents()[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
            if(student==null)
{
throw IllegalArgumentException;
}
else{
Student[] temp = new Student[this.students.length+1];
		 temp[0] = student;
		 for(int i = 1; i < temp.length; i++)
			 temp[i] = this.students[i-1];
		 this.students = temp;
               
}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
                addLast
if(index[]<0||index[]>=student.length)
{
throw IllegalArgumentException;
}
else{
 Student[] temp = new Student[this.getStudents().length+1];
		 for(int i = 0; i < this.students.length; i++)
			 temp[i] = this.students[i];
		 temp[temp.length - 1] = student;
		 this.students = temp;
}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
if(student==null)
{
throw IllegalArgumentException;
}
else{
add("lmn",2);
}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
if(student==null)
{
throw IllegalArgumentException;
}
else{
     Student[] temp = new Student[this.students.length-1]; 
		 int c = 0;
		 for(int i = 0; i < this.students.length; i++)
			 if(i != index) temp[c++] = this.students[i];
		 this.students = temp;      
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
Student[] temp = new Student[this.students.length-1]; 
		 int c = 0;
		 for(int i = 0; i < this.students.length; i++)
			 if(this.students[i] != student) temp[c++] = this.students[i];
		 this.students = temp;

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
Student[] temp = new Student[index]; 
		 int c = 0;
		 for(int i = 0; i < index; i++)
			 temp[i] = this.students[i];
		 this.students = temp; 
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
int ind = getStudentIndex(student);
		   ArrayList<Student> temp = new ArrayList<>();
		   for(int i = 0; i < ind; i++)
			   temp.add(this.students[i]);
		   this.students = temp.toArray(new Student[temp.size()]);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
Student[] temp = new Student[this.students.length-index]; 
		 int c = 0;
		 for(int i = index; i < this.students.length; i++)
			 temp[i-index] = this.students[i];
		 this.students = temp;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
int ind = getStudentIndex(student);
		   ArrayList<Student> temp = new ArrayList<>();
		   for(int i = ind; i < this.students.length; i++)
			   temp.add(this.students[i]);
		   this.students = temp.toArray(new Student[temp.size()]);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
 for(int i = 0; i < this.students.length; i++)
		  {
			  
	          for(int j = 0; j < this.students.length-i-1; j++)
			  {
                   if(this.students[j].getId() > this.students[j+1].getId())
				   {
					   Student temp = this.students[j];
					   this.students[j] = this.students[j+1];
					   this.students[j+1] = temp;
				   }
			  }	   
		  }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		 ArrayList<Student> temp = new ArrayList<>();
		   for(Student s : this.students)
		   {
		       if(s.getBirthDate().compareTo(date) == 0)
				   temp.add(s);
		   }
		   return  temp.toArray(new Student[temp.size()]);
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		ArrayList<Student> temp = new ArrayList<>();
		   for(Student s : this.students)
		   {
		       if(s.getBirthDate().after(firstDate) && s.getBirthDate().before(lastDate))
				   temp.add(s);
		   }
		   return  temp.toArray(new Student[temp.size()]); 
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		ArrayList<Student> temp = new ArrayList<>();
		   Calendar cal = getCalendar(date);
		   cal.add(Calendar.DATE, days);
           date = cal.getTime();
		   for(Student s : this.students)
		   {
		       if(s.getBirthDate().before(date))
				   temp.add(s);
		   }
		   return  temp.toArray(new Student[temp.size()]); 
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		 Date now = new Date();
           return this.students[indexOfStudent].getBirthDate().getYear() - now.getYear();
	}

	@Override
	public Student[] getStudentsByAge(int age) {
          ArrayList<Student> temp = new ArrayList<>();
		  for(int i = 0; i < this.students.length; i++)
		  {
		      if(getCurrentAgeByDate(i) == age)
				  temp.add(this.students[i]);
		  }
          return  temp.toArray(new Student[temp.size()]);
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
	double maxavg = 0;
		  for(Student s : this.students)
			  if(s.getAvgMark() > maxavg) maxavg = s.getAvgMark();
		  ArrayList<Student> temp = new ArrayList<>();
		  for(Student s : this.students)
			  if(s.getAvgMark() == maxavg)  temp.add(s);
		  return  temp.toArray(new Student[temp.size()]);
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double maxavg = 0;
		  for(Student s : this.students)
			  if(s.getAvgMark() > maxavg) maxavg = s.getAvgMark();
		  ArrayList<Student> temp = new ArrayList<>();
		  for(Student s : this.students)
			  if(s.getAvgMark() == maxavg)  temp.add(s);
		  return  temp.toArray(new Student[temp.size()]);
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		this.bubbleSort();
		   int i;
		   for(i = 0; i < this.students.length; i++)
			   if(this.students[i].equals(student)) break;
		   return this.students[i+1];

	}

	@Override
	public void add(Student student, int index) {
         Student[] temp = new Student[this.students.length+1];
		 for(int i = 0; i < index; i++)
			 temp[i] = this.students[i];
		 temp[index] = student;
		 for(int i = index; i < this.students.length; i++)
			 temp[i+1] = this.students[i];
		 this.students = temp;
	}

	private int getStudentIndex(Student student) {
         for(int i = 0; i < this.students.length; i++)
			 if(this.students[i].equals(student)) return i;
		 return -1;
    }

	private int getDiffYears(Date first, Date last) {
            return first.getYear() - last.getYear();
	}

	private Calendar getCalendar(Date date) {
          Calendar aDay = Calendar.getInstance();
          aDay.setTime(date);
		  return aDay;
	}
}
