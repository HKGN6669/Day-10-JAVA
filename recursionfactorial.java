class recursionfactorial{
    int sum(int n){
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main(String[] args){
        recursionfactorial ob=new recursionfactorial();
        int res=ob.sum(10);
        System.out.println(res);
    }
}