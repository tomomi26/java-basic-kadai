package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    Scanner scanner = new Scanner(System.in);

    public String getMyChoice(){
	    String choice;
	    while(true) {
	    	System.out.println("自分のじゃんけんの手を入力しましょう");
	    	System.out.println("グーはrockのrを入力しましょう");
	    	System.out.println("チョキはscissorsのsを入力しましょう");
	    	System.out.println("パーはpaperのpを入力しましょう");
	    	
	    	choice = scanner.nextLine();
	    	
	    	if(choice.equals("r")||
	    	   choice.equals("s")||
	    	   choice.equals("p")) {
	    		
	    		return choice;
	    	}else {
	    		System.out.println("入力が間違っています。もう一度入力してください。");
	    	}
	    }
    }
    
    public String getRandom() {
    	int random = (int)(Math.floor(Math.random()*3));
    	
    	if(random == 0) {
    		return "r";
    	}else if(random == 1) {
    		return "s";
    	}else{
    		return "p";
    	}
    }
    
    public void playGame() {
    	String myChoice = getMyChoice();
    	String computerChoice = getRandom();
    	
    	HashMap<String, String> hands = new HashMap<String, String>();
    	hands.put("r", "グー");
    	hands.put("s", "チョキ");
    	hands.put("p", "パー");
    	
    	System.out.println("自分の手は" + hands.get(myChoice) + ",対戦相手の手は" + hands.get(computerChoice));
    	
    	if(myChoice.equals(computerChoice)) {
    		System.out.println("あいこです");
    	}else if(
    			(myChoice.equals("r") && computerChoice.equals("s")) ||
    	        (myChoice.equals("s") && computerChoice.equals("p")) ||
    	        (myChoice.equals("p") && computerChoice.equals("r"))
    	){
    		System.out.println("自分の勝ちです");
    	}else {
    		System.out.println("自分の負けです");
    	}
    }

}
