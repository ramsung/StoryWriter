package beyonity.storywriter;

/**
 * Created by mohan on 9/3/17.
 */

public class trendingModel {
	int imageId;
	String name;

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





	public trendingModel(int imageId, String name) {
		this.imageId = imageId;
		this.name = name;

	}
}
