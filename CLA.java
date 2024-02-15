class CLA {
    public static void main(String[] args){
        System.out.println("Command-Line arguments are");

        for(String str: args) {
            System.out.println(str);
        }
    }
}