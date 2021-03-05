class  Problem1{
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "122";
        String res;
        int value = Integer.parseInt(num1) + Integer.parseInt(num2);
        res= String.valueOf(value);

        System.out.println("Sum of two non-Negative String number is: "+ res);
        
        
        
        //Vaibhav
        Vaibhav sumOfString = new Vaibhav("345", "789");
		System.out.println(sumOfString.sum());
    }


}

class Vaibhav {
	String str1 = new String();
	String str2 = new String();

	Vaibhav(String string1, String string2) {
		this.str1 = string1;
		this.str2 = string2;
	}

	int sum() {
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
		return sum;
	}

}
