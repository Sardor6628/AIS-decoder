public class ais {
	
    static String binary="";
	static String PacketType="";
	static String msg="";
	///////////////////////////
	static String messageType;
	static String messageIndicator;
	static String userId=null;
	static String navigationStatus;
	static String ROT;
	static String SOG;
	static String COG;
	static String HDG;
	static String positionAcuracy;
	static String lat;
	static String lon;
	static String timeStamp;
	static String maneuverIndicator;
	static String spare;
	static String raimFlag;
	static String radioStatus;
	static float TypeMessage;
//////////////////////////////////
	static int counter=0;
public static void aiSimple(String message) {
	binary=""; 
	msg="";
	PacketType="";
	for(int i=1; i<message.length(); i++) {
		if(message.charAt(i)==',')
			counter++;
		if (counter==0)
			PacketType=PacketType+message.charAt(i);
		if(counter==5)
			msg=msg+message.charAt(i);
		}
	String check="";
	for(int i=1; i<msg.length(); i++) {
		check+=msg.charAt(i);
	}
//	TypeMessage=call(binary, 0,6);
	msg=check;
	get_binary(msg);
	messageType=""+call(binary, 0,6);
	messageIndicator=""+call(binary, 6,2);
	userId=""+call_id(binary, 8,30);
	navigationStatus=""+call(binary, 38,4);
	ROT=""+call(binary, 42,8)/10;
	SOG=""+call(binary, 50,10)/10;
	COG=""+call(binary, 116,12)/10;
	HDG=""+call(binary, 128,9);
	positionAcuracy=""+call(binary, 60,1);
	lat=""+convertStringToDecimal(binary, 89,27)/600000;
	lon=""+convertStringToDecimal(binary, 61,28)/600000;
	timeStamp=""+call(binary, 137,6);
	maneuverIndicator=""+call(binary, 143,2);
	spare=""+call(binary, 145,3);
	raimFlag=""+call(binary, 148,1);
	radioStatus=""+call(binary, 149,19);
	counter=0;
}
public static void print(String msg){
	System.out.println(msg);	
}
public static float call(String binary, int t1, int t2 ) {
	String newM="";
	for(int i=t1; i<t1+t2; i++) {
		newM=newM+binary.charAt(i);
	}
	return Integer.parseInt(newM,2);
}
public static int call_id(String binary, int t1, int t2 ) {
	String newM="";
	for(int i=t1; i<t1+t2; i++) {
		newM=newM+binary.charAt(i);
	}
	return Integer.parseInt(newM,2);
}
public static float convertStringToDecimal(String newMsg, int t1, int t2) {

	String binary="";
	for(int i=t1; i<t1+t2; i++) {
		binary=binary+newMsg.charAt(i);
	}
		
	int decimal = 0;
    int power = 0;

    if (binary.charAt(0) == '1' ) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {

            builder.append((binary.charAt(i) == '1' ? '0' : '1'));

        }

        while (binary.length() > 0) {

            int temp = Integer
                    .parseInt(builder.charAt((binary.length()) - 1)+"");
            decimal += temp * Math.pow(2, power++);
            binary = binary.substring(0, binary.length() - 1);

        }

        decimal= (decimal + 1) * (-1);

    } else {

        while (binary.length() > 0) {
            int temp = Integer
                    .parseInt(binary.charAt((binary.length()) - 1) + "");
            decimal += temp * Math.pow(2, power++);
            binary = binary.substring(0, binary.length() - 1);
        }



    }
	return decimal;
}
public static void get_binary(String msg) {
	for(int i=0; i<msg.length(); i++) {
		binary=binary+ascii6bit(msg.charAt(i));
	}
}

public static String ascii6bit(char ch) {
String i="";
switch(ch) {
case '0': i="000000"; break;
case '1': i="000001"; break;
case '2': i="000010"; break;
case '3': i="000011"; break;
case '4': i="000100"; break;
case '5': i="000101"; break;
case '6': i="000110"; break;
case '7': i="000111"; break;
case '8': i="001000"; break;
case '9': i="001001"; break;
case ':': i="001010"; break;
case ';': i="001011"; break;
case '<': i="001100"; break;
case '=': i="001101"; break;
case '>': i="001110"; break;
case '?': i="001111"; break;
case '@': i="010000"; break;
case 'A': i="010001"; break;
case 'B': i="010010"; break;
case 'C': i="010011"; break;
case 'D': i="010100"; break;
case 'E': i="010101"; break;
case 'F': i="010110"; break;
case 'G': i="010111"; break;
case 'H': i="011000"; break;
case 'I': i="011001"; break;
case 'J': i="011010"; break;
case 'K': i="011011"; break;
case 'L': i="011100"; break;
case 'M': i="011101"; break;
case 'N': i="011110"; break;
case 'O': i="011111"; break;
case 'P': i="100000"; break;
case 'Q': i="100001"; break;
case 'R': i="100010"; break;
case 'S': i="100011"; break;
case 'T': i="100100"; break;
case 'U': i="100101"; break;
case 'V': i="100110"; break;
case 'W': i="100111"; break;
case '`': i="101000"; break;
case 'a': i="101001"; break;
case 'b': i="101010"; break;
case 'c': i="101011"; break;
case 'd': i="101100"; break;
case 'e': i="101101"; break;
case 'f': i="101110"; break;
case 'g': i="101111"; break;
case 'h': i="110000"; break;
case 'i': i="110001"; break;
case 'j': i="110010"; break;
case 'k': i="110011"; break;
case 'l': i="110100"; break;
case 'm': i="110101"; break;
case 'n': i="110110"; break;
case 'o': i="110111"; break;
case 'p': i="111000"; break;
case 'q': i="111001"; break;
case 'r': i="111010"; break;
case 's': i="111011"; break;
case 't': i="111100"; break;
case 'u': i="111101"; break;
case 'v': i="111110"; break;
case 'w': i="111111"; break;}
	return i;
}

public static String DisplayBinary() {
	String bn="";
	for(int i=0; i<binary.length(); i++) {
		if((i)%6==0&& i!=0) 
			bn+="\t";		
		bn+=binary.charAt(i);
	}
		return bn;
}
}
