package Exception_Handling_Jan11;

public class StudentIdNotFound_Exception extends Exception{
	

		int sid;

		StudentIdNotFound_Exception()
		{		
		}

		public StudentIdNotFound_Exception(int sid) {
			this.sid = sid;
		}

		@Override
		public String toString() {
	      return "Exception :: Student id not found!!";
		}

		@Override
		public String getMessage() {
			return "Student with id "+ sid + " Not found!!";
		}
		
		
	}

