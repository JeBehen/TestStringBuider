public class TestStringBuilder {
    public static void main(String[] args) {
    
        StringBuilder sb1, sb2;
        sb1 = new StringBuilder("Hello"); // overloaded constructor
        sb2 = new StringBuilder("Hello");
        
        String s1, s2;
        s1 = new String("Hello");
        s2 = new String("Hello");
        
        // expect false, StringBuilder does not implement Comparator, does not override equals()
        System.out.println("compare StringBuilders: " + sb1.equals(sb2));
        
        // expect true, String implements Comparator and overrides equals()
        System.out.println("compare Strings: " + s1.equals(s2));
        
        // convert StringBuilder to String to compare
        System.out.println("compare StringBuilders w/toString: " + 
            sb1.toString().equals(sb2.toString()));
        
        System.out.println("sb2 capacity = " + sb2.capacity());
        System.out.println("sb2 length = " + sb2.length());
        StringBuilder sb3 = sb2;
        sb2.setLength(0); // clear it
        sb2.insert(0, "World!");
        System.out.println("sb2 now equals " + sb2);
        sb2.setLength(0); // clear it again
        sb2.append("World!");
        System.out.println("sb2 now equals " + sb2);
        System.out.println("is sb2 still at the same address? " + (sb2 == sb3));
    }
}
