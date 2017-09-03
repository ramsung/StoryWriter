package beyonity.storywriter;

/**
 * Created by mohan on 9/3/17.
 */

public class catagoryModel {
	int imageId;
	String name;
	String totalStories;

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

	public String getTotalStories() {
		return totalStories;
	}

	public void setTotalStories(String totalStories) {
		this.totalStories = totalStories;
	}

	public catagoryModel(int imageId, String name, String totalStories) {
		this.imageId = imageId;
		this.name = name;
		this.totalStories = totalStories;
	}
}
