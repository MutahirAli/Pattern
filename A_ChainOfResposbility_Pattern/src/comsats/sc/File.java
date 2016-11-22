package comsats.sc;

public class File {
	private String fileName;
	private String fileType;
	private String filePath;

	public File(String name, String type, String path) {
		this.fileName = name;
		this.fileType = type;
		this.filePath = path;

	}

	public String getFileName() {
		return fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public String getFilePath() {
		return filePath;
	}
	
}
