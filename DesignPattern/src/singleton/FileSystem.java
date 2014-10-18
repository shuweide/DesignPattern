package singleton;

public class FileSystem {
	
	private static FileSystem mFileSystem = null;
	
	protected FileSystem(){};
	
	public static FileSystem getInstance(){
		
		if (null == mFileSystem) {
			mFileSystem = new FileSystem();
		}
		
		return mFileSystem;
		
	}
}
