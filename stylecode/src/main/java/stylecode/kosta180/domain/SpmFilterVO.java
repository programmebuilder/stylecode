package stylecode.kosta180.domain;

public class SpmFilterVO extends Criteria {
private String category;
private String[] age;
private String[] style;

public SpmFilterVO() {}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String[] getAge() {
	return age;
}

public void setAge(String[] age) {
	this.age = age;
}

public String[] getStyle() {
	return style;
}

public void setStyle(String[] style) {
	this.style = style;
}



}