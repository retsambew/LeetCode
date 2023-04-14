public class StringToInt {
    public int myAtoi(String s) {
        long num=0;
        boolean isNegative=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '0':
                    num=num*10+0;
                    break;
                case '1':
                    num=num*10+1;
                    break;
                case '2':
                    num=num*10+2;
                    break;
                case '3':
                    num=num*10+3;
                    break;
                case '4':
                    num=num*10+4;
                    break;
                case '5':
                    num=num*10+5;
                    break;
                case '6':
                    num=num*10+6;
                    break;
                case '7':
                    num=num*10+7;
                    break;
                case '8':
                    num=num*10+8;
                    break;
                case '9':
                    num=num*10+9;
                    break;
                case '-':
                    if(num==0)
                        isNegative=true;
                    break;
                case ' ':
                case '+':
                    break;
                default:
                    if(num==0)
                        return 0;
            }
        }
        if(isNegative)
            num*=-1;
        if(num>Integer.MAX_VALUE)
            num=Integer.MAX_VALUE;
        else if(num<Integer.MIN_VALUE)
            num=Integer.MIN_VALUE;
        return (int)num;
    }
}
