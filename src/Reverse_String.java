

class Reverse_String {
    public static void main(String[] args) {
        String name = "Pukar";
        String reversed = "";

        int i;

        for(i=name.length()-1;i>=0;i--){
            reversed = reversed+name.charAt(i);
        }
        System.out.println(reversed);

    }
}