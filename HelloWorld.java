class HelloWorld {
    HelloWorld() {
        System.out.println("The Object of HelloWorld Created");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.sayHello();
        System.err.println("This line is added for ec2");
    }
}