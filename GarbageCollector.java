class Demo{
    public void finalize(){
        System.out.println("Object Destroyed");
    }
    public static void main(String[] args){
        Demo d=new Demo();
        d=null;
        System.gc();
    }
}

class Demo1{
    public static void main(String[] args){
        Runtime r=Runtime.getRuntime();
        System.out.println("Total Memory: "+r.totalMemory());
        System.out.println("FreeMemory (Start): "+r.freeMemory());
        for(int i=1;i<20000;i++){
            String str=new String("Objects"+i);
            if(i%5000==0){
                System.out.println("Loop: "+i);
                System.out.println("FreeMemory: "+r.freeMemory()); 
            }
        }
        System.out.println("FreeMemory Before Gc: "+r.freeMemory());
        System.gc();
        System.out.println("FreeMemory After Gc: "+r.freeMemory());
    }
}