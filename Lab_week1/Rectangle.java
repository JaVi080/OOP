public class Rectangle{


private int length;
private int width;


//Encapsulation -->for length : 
public void setLength(int newLength){
this.length=newLength;
}

public int getLength(){
return length;
}

//Encapsulation -->for width :
public void setWidth(int newWidth){
this.width=newWidth;
}

public int getWidth(){
return width;
}

public int calArea(){
return length*width;
}

public int calParameter(){
return 2*(length+width);
}


}

