//class abstract
//inheritance
//enapsolution
//overriding
//overloading

abstract class peminjaman {
    void denda(){}
    void pengembalian(){}
}

class PBO extends peminjaman{
    @Override
    void denda(){}
    void pengembalian(){}
}

class Parent{
    public int x;
    void print(String tipeAnggota, int bayar){
        System.out.println("sudah bayar");
    }

    void print(String tipeAnggota){
        System.out.println("mahasiswa");
    }

    void print(){
        System.out.println("Saya Bobby");
    }
}

class A extends Parent{
    @Override
    void print(){
        System.out.println("print A");
    }

    void test(){
        print();
        x = 10;
    }
}

class B extends A{
    void test2(){
        print();
    }
}

public class coba extends Parent{

    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("mahasiswa");

        A a = new A();
        a.print();
    }
}