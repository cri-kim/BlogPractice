package string;


//20m
public class Question20211214 {
    public String convertRomaNumber(String input){
        int num = Integer.parseInt(input);
        StringBuilder sb = new StringBuilder();
        if(num >= 1000){
            int cnt = num/1000;
            num %= 1000;
            sb.append("M".repeat(cnt));
        }
        if(num >= 500 ){
            int cnt = num/500;
            num %= 500;
            sb.append("D".repeat(cnt));
        }
        if(num >= 100){
            int cnt = num/100;
            num %= 100;
            sb.append("C".repeat(cnt));
        }
        if(num >= 50 ){
            int cnt = num/50;
            num %= 50;
            sb.append("L".repeat(cnt));
        }
        if(num >= 10){
            int cnt = num/10;
            num %= 10;
            sb.append("X".repeat(cnt));
        }
        if(num >= 5){
            int cnt = num/5;
            num %= 5;
            sb.append("V".repeat(cnt));
        }
        if(num > 0){
            sb.append("I".repeat(num));
        }

        return input+" == "+sb.toString();
    }

    public String get60ganzi(String year){
        String[] GAN = {"경","신","임","계","갑","을","병","정","무","기"};
        String[] JI = {"신","유","술","해","자","축","인","묘","진","사","오","미"};
        String[] JI2={"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
        String[] HANG = {"백","흑","청","적","황금"};
        //2010 경인
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(year);
        String gan = GAN[num%10];
        String ji = JI[num%12];
        String ji2 = JI2[num%12];

        sb.append(gan);
        sb.append(ji);
        sb.append("년");
        sb.append(" - ");
        if("갑을".contains(gan)){
            sb.append(HANG[2]);
        }
        else if("병정".contains(gan)){
            sb.append(HANG[3]);
        }
        else if("무기".contains(gan)){
            sb.append(HANG[4]);
        }
        else if("경신".contains(gan)){
            sb.append(HANG[0]);
        }
        else{
            sb.append(HANG[1]);
        }
        sb.append(ji2);

        return year+" : "+sb.toString();
    }

    //20m
    public int getNarcissismNumber(String input){
        int n = Integer.parseInt(input);
        int a = 0;
        int b = 0;
        int c = 0;
        int hap = 0;
        int sum = 0;
        for(int i=100;i<n;i++){
            a= i/100;
            b = i%100/10;
            c = i%10;
            hap = (a*a*a)+(b*b*b)+(c*c*c);
            if(hap == i){
                sum += hap;
            }
        }
        return sum;
    }

    //20m
    public void printLongestChain(String input){
        int num = Integer.parseInt(input);
        int finalSum = 0;
        for(int i=1;i<num+1;i++) {
            int longestChain = 0;
            int value = i;
            int chainPath = 0;
            while (value != 4) {
                chainPath++;
                if (value % 2 == 0) value /= 2;
                else value = value * 3 + 1;
                if(value > longestChain){
                    longestChain = value;
                }
            }
            if(chainPath > 100){
                finalSum += i;
                System.out.println(i +"/" + chainPath);
            }
        }
        System.out.println(finalSum);
    }

    //10m
    public void printMiddleNumber(String input){
        int num = Integer.parseInt(input);
        int sum = 0;
        for(int i=2;i<num+1;i++){
            if(isMiddleNumber(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public boolean isMiddleNumber(int num){
        int sum = 0;
        int sum2 =0;
        int i=1;
        for( i=1;i<num;i++){
            sum+=i;
        }
        i = num+1;
        while(sum > sum2){
            sum2 += i;
            i++;
        }
        return sum == sum2;
    }
}
