package chap09;
class CRational {
    public int n;
    public int d;
    public void setN(int num) {
        n=num;
    }
    public void setD(int num) {
        d=num;
    }
    public void setND(int num, int den) {
        n=num;
        d=den;
    }
    public CRational add(CRational  r)
    {
        display(this,r,'+');
        CRational obj=new CRational();
        obj.n=this.n*r.d+this.d*r.n;
        obj.d=this.d*r.d;
        return obj;
    }
    public CRational sub(CRational  r)
    {
        display(this,r,'-');
        CRational obj=new CRational();
        obj.n=this.n*r.d-this.d*r.n;
        obj.d=this.d*r.d;
        return obj;
    }
    public CRational mul(CRational  r)
    {
        display(this,r,'*');
        CRational obj=new CRational();
        obj.n=this.n*r.n;
        obj.d=this.d*r.d;
        return obj;
    }
    public CRational div(CRational r)
    {
        display(this,r,'/');
        CRational obj=new CRational();
        obj.n=this.n*r.d;
        obj.d=this.d*r.n;
        return obj;
    }
    public void display(CRational r1,CRational r2,char ch)  // 顯示分數
    {
        System.out.print("(");
        System.out.print(r1.n+"/"+r1.d);
        System.out.print(")");
        System.out.print(ch);
        System.out.print("(");
        System.out.print(r2.n+"/"+r2.d);
        System.out.print(")=");
    }
}

public class Class10b {

    public static void main(String[] args) {
        CRational aaa=new CRational();
        aaa.setN(2);
        aaa.setD(5);
        show(aaa);
        aaa.setND(6, 4);
        show(aaa);
        CRational bbb=new CRational();
        bbb.setND(1, 9);
        show(aaa.add(bbb));
        show(aaa.sub(bbb));
        show(aaa.mul(bbb));
        show(aaa.div(bbb));
    }
    public static void show(CRational obj)
    {
        System.out.println(obj.n+"/"+obj.d);
    }
}
