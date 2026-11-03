package kadai_018;

abstract class Kato_Chapter18 {
    public String familyName;
    public String givenName;
    public String address;
     
     public void commonlntroduce() {
        System.out.println("名前は" + "加藤" + this.givenName + "です");
        System.out.println("住所は東京都中野区〇×です");
        
     }
     
     public abstract void eachIntroduce();
     
     public void execIntroduce() {
    	 commonlntroduce();
    	 eachIntroduce();
     }
}
