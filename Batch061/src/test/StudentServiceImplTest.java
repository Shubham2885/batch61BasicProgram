package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.bz.day4.studentmanagement.IStudentDoa;
import com.bz.day4.studentmanagement.IStudentService;
import com.bz.day4.studentmanagement.Student;
import com.bz.day4.studentmanagement.StudentServiceImpl;

public class StudentServiceImplTest {
	IStudentService service ;
	
	@Before
	public void setUp() {
		service	= new StudentServiceImpl();
		IStudentDoa doa = EasyMock.createMock(IStudentDoa.class);
		service.setDoa(doa);
		List<Student> students = new ArrayList<Student>();
		Student student = new Student(33,"Dummy","Dummy");
		students.add(student);
		EasyMock.expect(doa.findAllStudents()).andReturn(students);
		EasyMock.expect(doa.addNewStudent(EasyMock.anyObject())).andReturn(Integer.valueOf(6));
		EasyMock.replay(doa);
	}
	
	@Test
	public void addNewStudentTest() {
		Student student = new Student(1,"Shubham","Chavan");
		int index = service.addNewStudent(student);
		assertEquals(6, index);
	}
	
	@Test
	public void findAllStudentTest() {
		
		assertEquals(1, service.findAllStudents().size());
	}
	
//	@Test
//	public void findByIdTest() {
//		
//		Student student = service.findStudentById(33);
//		assertNotNull(student);
//		assertEquals("Dummy", student.getFname());
//	}
}
