package chap12.Ex04;

class Diag {
    private int width;
    private int height;
    public Diag(int w, int h){
        width = w;
        height = h;
    }
    public void show(){
        System.out.println("W="+width+", H="+height);
        System.out.printf("length=%5.2f\n", dia());
    }
    public double dia(){
        return Math.sqrt(width*width+height*height);
    }
}
