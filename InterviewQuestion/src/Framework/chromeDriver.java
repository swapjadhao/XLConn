package Framework;

public class chromeDriver implements webDriver {
	
	public chromeDriver()
	{
		System.out.println("Browser Start");
	}

	@Override
	public void get(String Url) {

		System.out.println("Get Url"+Url);
		
	}

	@Override
	public void findElement(String Locator) {
		System.out.println("locating the locator"+Locator);
		
	}

	@Override
	public void Close() {
		System.out.println("Close Browser");
		
	}

	@Override
	public void quite() {
	
		System.out.println("quite Browser");
	}

}
