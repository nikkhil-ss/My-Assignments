package basicDSA;

class armstrong {
        public boolean check(int num) {
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int n = temp % 10;
            sum += (n*n*n);
            temp=temp/10;
        }
        if(sum == num)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        armstrong obj = new armstrong();
        int num = 371;
        if(obj.check(num))
            System.out.println(num+" is an Armstrong number.");
        else
            System.out.println(num+" is not an Armstrong number.");
    }
}
