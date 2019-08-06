public class Factory {
    public Os creatOs(){
        String name = "Mac";
        if(name.equals("Windows 7")){
            return new Windows();
        }else if(name.equals("Mac")){
            return new Mac();
        }else if(name.equals("Linux")){
            return new Linux();
        }return  null;
    }
}
