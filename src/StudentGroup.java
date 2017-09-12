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
	private static len;

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		len=length;
	}

	@Override
	public Student[] getStudents() {
		Student st=null;
		String s= new String("No students");
		if(students==null)
		   throw IllegalArgumentExceprtion(s)
		else{
			return students;
		}
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		String s=new String("Illegal Arguments");
		if(index<0||index>=len)
		{throw IllegalArgumentExcetion(s);}
		// Add your implementation here
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		String s=new String("Illegal Arguments");
		if(index<0||index>=len)
		{throw IllegalArgumentExcetion(s);}
			students[index]=student;
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		String s=new String("Illegal Arguments");
		if(students==null)
		{throw IllegalArgumentExcetion(s);}
		// Add your implementation here
		for(int i=len;i>=0;i--)
			students[i+1]=students[i];
		students[0]=student;
		len++;
	}

	@Override
	public void addLast(Student student) {
		String s=new String("Illegal Arguments");
		if(students==null)
		{throw IllegalArgumentExcetion(s);}
		students[len]=student;
		// Add your implementation here
	len++;
	}

	@Override
	public void add(Student student, int index) {
		String s=new String("Illegal Arguments");
		if(index<0||index>=len)
		{throw IllegalArgumentExcetion(s);}
		for(int i=len;i>=index;i--){
			students[i+1]=students[i];
		}
		students[index]=student;
		len++;
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		String s=new String("Illegal Arguments");
		if(index<0||index>=len)
		{throw IllegalArgumentExcetion(s);}
		for(int i=index;i<len;i++)
		{
			students[i]=students[i+1];
		}
		len--;
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		int flag=0;
		for(int i=0;i<len;i--)
		{
			if(students[i]==student)
			{
				flag=1;
				break;
			}
		}
		for(int j=i;j<len;j++)
		{
			students[j]=students[j+1];
		}
		len--;
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		String s=new String("Illegal Arguments");
		if(index<0||index>=len)
		{throw IllegalArgumentExcetion(s);}
		len=index;
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		int flag=0;
		for(int i=0;i<len;i--)
		{
			if(students[i]==student)
			{
				flag=1;
				break;
			}
		}
		len=i;
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		String s=new String("Illegal Arguments");
		if(index<0||index>=len)
		{throw IllegalArgumentExcetion(s);}
		students=students[index];
		len-=index+1;
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		int flag=0;
		for(int i=0;i<len;i--)
		{
			if(students[i]==student)
			{
				flag=1;
				break;
			}
		}
		students=students[i];
		len-=i+1;
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		Student temp=null;
		for(i=0;i<len;i++)
			for(j=1;j<(n-1);j++)
			{
				if(students[j-1].id>students[j].id)
				{
					temp=students[j];
					students[j]=students[j-1];
					students[j-1]=students[j];
				}
			}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		String s=new String("Illegal Arguments");
		if(date==null)
		{throw IllegalArgumentExcetion(s);}
		int i,j=0;
		Student[] st=new Student[len];
		Student temp=null;
		for(i=0;i<len;i++)
		{
			if(students[i].birthDate<date)
				{st[j]=students[i];j++;}
			
		}
		return st;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
