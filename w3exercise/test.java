public class test {
        public static void main(String[] args)
        {
            String str,strr,st="DOG";
            String ch;
            for(int i=0;i<3;i++){
                ch=(String)st.charAt(i);

                if(ch.equals(" ")){
                    if(str.compareTo(strr)==0){
                        System.out.println(str);
                    }
                    str="";
                    strr="";
                }
                else{
                    str=str+ch;
                    strr=ch+strr;
                }
        }
    }
}
