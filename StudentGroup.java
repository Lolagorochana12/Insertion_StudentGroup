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
public class StudentGroup implements StudentArrayOperation extends Exception {

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
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try
		{
		for(i=0;i<len;i++)
		{
		if(students[i]==NULL)
		throw new IllegalArgumentException();
		}
		}
		catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try
		{
		if(index<=0||index>=students.length)
		throw new IllegalArgumentException();
		else
		return students[index];
		}
		
		catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try
		{
		if(index<=0||index>=students.length||student==NULL)
		throw new IllegalArgumentException();
		else
                {
		students[index]=student;
		
		}
		
		catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
try
{
if(student==NULL)
throw new IllegalArgumentException();
else
{
		students[students.length]=new Student();
		for(int i=students.length-1;i>=0;i--)
		{ if(i==0)
		  students[i]=student;
			students[i]=students[i-1];
		}
	}
}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
try
{
if(student==NULL)
throw new IllegalArgumentException();
else
{
		students[students.length]=new Student();
		students[students.length-1]=student;
	}
}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
try
{
if(index<=0||index>=students.length||student==NULL)
throw new IllegalArgumentException();
else
{
		students[students.length]=new Student();
		for(int i=students.length-1;i>=index;i--)
		{ if(i==index)
		  {
		  students[i]=student;
			break;
			}
			students[i]=students[i-1];
		}
	}
}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
try
{
if(date==NULL)
throw new IllegalArgumentException();
else
{
	int j=0;

for(int i=0;i<=students.length-1;i++)
if(students[i].getBirthDate<=date )
{
stu[j]=new Student();
j++;
}
		return stu;
	}

}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
try
{
if(firstDate==NULL|| lastDate==NULL)
throw new IllegalArgumentException();
else
{
	int j=0;

for(int i=0;i<=students.length-1;i++)
if(students[i].getBirthDate>=firstDate ||students[i].getBirthDate<=lastDate)
{
stu[j]=new Student();
j++;
}
		return stu;
	}

}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}

		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here

Calendar c = Calendar.getInstance();
        c.setTime(date);
try
{
if(date==NULL)
throw new IllegalArgumentException();
else
{
	int j=0;

for(int i=0;i<=students.length-1;i++)
if(students[i].getBirthDate>=date ||students[i].getBirthDate<=c.add(Calendar.date, days))
{
stu[j]=new Student();
j++;
}
		return stu;
	}

}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}


	

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
try
{
if(indexOfStudent==NULL)
throw new IllegalArgumentException();
else
{
	return(Period.between(students[indexOfStudent].getAvgMarks, curDate).getYears()	
	}
}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}



	

        

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
int j=0;
LocalDate curDate = LocalDate.now();
for(int i=0;i<=students.length-1;i++)
if(Period.between(students[i].getAvgMarks, curDate).getYears()==age)
{
stu[j]=new Student();
j++;
}
		return stu;
	}

	

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
int max=0;
for(int i=0;i<=students.length-1;i++)
if(students[i].getAvgMarks>max)
max=students[i].getAvgMarks;
int j=0;
for(int i=0;i<=students.length-1;i++)
if(students[i].getAvgMarks==max)
{
stu[j]=new Student();
j++;
}
		return stu;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
try
{
if(student==NULL)
throw new IllegalArgumentException();
else
{
		
		for(int i=0;i<=students.length-1;i++)
		{ if(students[i]==student&&i!=students.length-1)
		  {
		    return students[i+1];
			}
			
		}
	}
}
catch(IllegalArgumentException ie)
		{
			System.out.println(ie);
		}
	}
		
	
}
