package for_test;

class Ex {
	//install, copy, delete
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("No more Space!!!");
		if(!enoughMemory())
			throw new SpaceException("No more Memory!!!");
	}
	static void copyFiles() {} //Need code -> copy file
	static void deleteTempFiles() {} //Need code -> tempfile delete
	
	//install check
	static boolean enoughSpace() {
		//Need code -> Space check code
		return false;
	}
	static boolean enoughMemory() {
		//Need code -> Memory check code
		return false;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}

public class pkg1_throw_finally{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Ex.startInstall(); //Ready for program install
			Ex.copyFiles(); //Copy files
		}catch (SpaceException se) {
			System.out.println("Error message : " + se.getMessage());
			se.printStackTrace();
			System.out.println("Get more space & Retry!!!");
		}catch (MemoryException me) {
			System.out.println("Error message : " + me.getMessage());
			System.gc(); //Garbage Collection active -> memory increase
			System.out.println("Please Retry!!!");
		}finally{
			Ex.deleteTempFiles(); //Used tempfile (for program install) delete
		}
	}

}
